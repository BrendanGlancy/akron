import codecs

"""
1096770097
1952395366
1600270708
1601398833
1716808014
1734291511
960049251
1681089078

Convert each value to binary then to hex then to ascii
"""


def main():
    # define nums
    nums = [1096770097, 1952395366, 1600270708, 1601398833, 1716808014, 1734291511, 960049251, 1681089078]


    for i in range(8):
        nums[i] = bin(nums[i])[2:]
        nums[i] = hex(int(nums[i], 2))[2:]
        nums[i] = codecs.decode(nums[i], 'hex')
        nums[i] = nums[i].decode('utf-8')
        print(nums[i], end='')

if __name__ == '__main__':
    main()
