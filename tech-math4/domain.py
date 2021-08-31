from sympy import *
from fractions import *

x = symbols('x')
f = Function('f')
f = input('type function: ')
fp = diff(f)
sol = solve(f, x)
sol_p = solve(fp, x)
print(f"f(x)={f},f'(x)={fp}")
#print(f"x1={sol[0]},x2={sol[1]},x'={sol_p}")
print(f'{len(sol)}')
psol = {}
limits_at_edges = {}
df = solveset(f, x, domain=S.Reals)

for i in range(1,( len(sol) + 1)):                     # Prints out every item in sol[] after aplying .evalf()
    psol["x" + str(i) ] = sol[i - 1].evalf()
for i in range(1, len(sol) + 1):
    limits_at_edges[f'limit x -> x{i} f(x)'] = limit(f, x, sol[i - 1])

print(f'Solution:{sol}')
print(f'Processes solution:{psol}')
print(f'Derivative solution:{sol_p}')
print(limits_at_edges)
print(f'Domain:{df}')
pprint(f, use_unicode=True)
