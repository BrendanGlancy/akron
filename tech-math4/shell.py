import math
import matplotlib.pyplot as plt
import numpy as np
from sympy import *


""" 
- abs is abosolute value
- use np.sqrt instead of math.sqrt
"""


x = np.arange(0., 5., 0.2)
import matplotlib.pyplot as plt
plt.plot(x, np.piecewise(x, [x  == 2, x != 2], [0, 1]))

# show the plot
plt.show()
