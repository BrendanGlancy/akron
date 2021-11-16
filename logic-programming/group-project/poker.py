from scores import *
import inquirer
from functools import lru_cache as cache
import pandas as pd
from IPython import get_ipython;   
import itertools
from statistics import mean
from numba import jit, vectorize
import timeit
import numpy as np
from itertools import permutations
from numpy import vectorize
import random
import pyfiglet


# TODO, add pre-flop 2 card hand
# TODO, make more game like 



def start_game():
    result = pyfiglet.figlet_format("PyPoker")
    print(result)


def pre_flop(): # Pre-Flop prompt
    pass


def flop_prompt(): # Flop prompt
    pass


def multi_choice():
    while True:
        questions = [inquirer.Checkbox(
            'Choose',
            message="Choose how you would like to play",
            choices=['Random Hand','Choose Your Own'],
        )]
        answers = inquirer.prompt(questions)['Choose']
        break
    return answers

def show_hand():
# show the hand
    print("_________________________________")
    print("         Your Hand")
    print(flop)
    print("_________________________________")


@jit(nopython=True)
def common(a,b):
    common=[]
    l1 = [i for i in a]
    l2 = [i for i in b]
    common = len([i for i in l1 if i in l2])
    return common

@jit(nopython=True)
def numba_4():
    results = []
    len1 = c4.shape[0]
    len2 = combi.shape[0]
    for i in range(len1):
        for j in range(len2):
            if common(c4[i],combi[j]) == 4:
                results.append(combi[j])
    return results

@jit(nopython=True)
def numba_3():
    results = []
    len1 = c3.shape[0]
    len2 = combi.shape[0]
    for i in range(len1):
        for j in range(len2):
            if common(c3[i],combi[j]) == 4:
                results.append(combi[j])
    return results

@cache(maxsize=None)
def opti_3():
    values= numba_3()
    return [score_hand(i) for i in values]

@cache(maxsize=None)
def opti_4():
    values= numba_4()
    return [score_hand(i) for i in values]

def expected_value(hand,combi):
    if len(hand) == 5:
        maxi = score_hand(hand)
        mean= np.mean(opti_3() + opti_4())
    elif len(hand) == 6:
        maxi = max([score_hand(i) for i in combinations(hand,5)])
        mean = np.mean(opti_4())
    elif len(hand) == 7:
        maxi = max([score_hand(i) for i in combinations(hand,5)])
        mean= maxi    
    values = [maxi,mean]
    return values
  
def should_call(players,percentile,pot,price):
    pwin = (percentile/100)**players
    ev = pwin*pot
    if ev <= 0:
        print('you should fold')
    if ev > 0:
        print('You should bet as long as it is less than %s $' % ev)
    print('The expected value betting %s is %s $' % (price,ev-price))
    return pwin*100

start_game()


"""
 Pre-Flop
"""

preflop = []


# Multiple choice prompt
answers_pre = multi_choice()
if answers_pre != 'Choose Your Own':
    for i in range(2):
        j = random.randint(0,53)
        flop.append(deck[j])


# if the user chooses to pick their own cards
if len(flop) == 0:
    # Prompt the user what they're about to enter
    print('Enter you card in the format suit value, this is for your flop so it will be 5 cards')
    print('For Example S9 would be the 9 of spades')
    for i in range(0,2):
        flop.append(str(input('enter card: ')))

print("** Hole Cards **")
show_hand()


c4 = combinations(flop,4)
c3 = combinations(flop,3)
flopscore = expected_value(flop,combi)
current = df.loc[df['value'] >= flopscore[0]].index[0]/2598960*100
future  = df.loc[df['value'] >= flopscore[1]].index[1]/2598960*100
print('My current value is  %s and the average expected value is %s' % (current,future))
players = float(input('enter number of players: '))
pot = float(input('enter pot value: '))
price = float(input('enter value of your bet: '))
if current > future:
    should_call(players,current,pot,price)
else:
    should_call(players,future,pot,price)


"""
 Flop
"""
# this cannot be in a method or it breaks the whole thing due to scope
flop = []


# Multiple choice prompt
answers = multi_choice()
if answers != 'Choose Your Own':
    for i in range(5):
        j = random.randint(0,53)
        flop.append(deck[j])


# if the user chooses to pick their own cards
if len(flop) == 0:
    # Prompt the user what they're about to enter
    print('Enter you card in the format suit value, this is for your flop so it will be 5 cards')
    print('For Example S9 would be the 9 of spades')
    for i in range(0,5):
        flop.append(str(input('enter card: ')))

show_hand()


c4 = combinations(flop,4)
c3 = combinations(flop,3)
flopscore = expected_value(flop,combi)
current = df.loc[df['value'] >= flopscore[0]].index[0]/2598960*100
future  = df.loc[df['value'] >= flopscore[1]].index[1]/2598960*100
print('My current value is  %s and the average expected value is %s' % (current,future))
players = float(input('enter number of players: '))
pot = float(input('enter pot value: '))
price = float(input('enter value of your bet: '))
if current > future:
    should_call(players,current,pot,price)
else:
    should_call(players,future,pot,price)

"""
 Turn
"""

turn = []

# Multiple choice prompt
answers_turn = multi_choice
if answers_turn != 'Choose Your Own':
    for i in range(1):
        j = random.randint(0,53)
        turn.append(deck[j])


if len(turn) < 1:
    turn.append(str(input('enter card: '))) 
flop.append(turn[0]) 
# show the hand
show_hand()

c4 = np.array([sorted(i) for i in combinations(flop,4)])
combiturn = expected_value(flop,combi)
current = df.loc[df['value'] >= combiturn[0]].index[0]/2598960*100
future  = df.loc[df['value'] >= combiturn[1]].index[0]/2598960*100
print('My current value is %s and the average future value is %s' % (current,future))

players = float(input('enter number of players: ')) 
pot = float(input('enter pot value: ')) 
price = float(input('enter value of your bet: ')) 
if  current > future:
    should_call(players,current,pot,price)
else: 
    should_call(players,future,pot,price)

"""
 River
"""

river = []
river.append(str(input('enter card: ')))
flop.append(river[0])
combiriver = expected_value(flop,combi)
current = df.loc[df['value'] >= combiriver[0]].index[0]/2598960*100
print('My final value is %s' % current)
players = float(input('enter number of players: '))
pot = float(input('enter pot value: '))
price = float(input('enter value of your bet: '))
should_call(players,current, pot,price)

