import numpy as np
from sklearn.datasets import load_iris
from sklearn.datasets import load_boston
from matplotlib import pyplot as plt

# Solving for vector B using Python when n is equal to 3, vector a is 0, 1, or 4, and vector b holds the cude of integers 0 to n, and is equal to 0, 1, or 8
def pythonsum(n):
    a = list(range(n))
    b = list(range(n))
    c = []

    for i in range(len(a)):
        a[i] = i ** 2
        b[i] = 1 ** 3
        c.append(a[i] + b[i])

    return c

n = 3
result = pythonsum(n)
print("Python Result: ", result)

# Solving for vector B using numpy when n is equal to 3, vector a is 0, 1, or 4, and vector b holds the cude of integers 0 to n, and is equal to 0, 1, or 8
def numpysum(n):
    a = np.arange(n) ** 2
    b = np.arange(n) ** 3
    c = a + b
    return c

n = 3
result = numpysum(n)
print("NumPy Result: ", result)

# Load the iris database, print description of the dataset, and plotting column 1 as x and column 2 as column 5
iris = load_iris()
print(iris.DESCR)
plt.scatter(iris.data[:, 1], iris.data[:, 5])
plt.show()