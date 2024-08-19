import threading
import math

class SquareThread(threading.Thread):
    def __init__(self, num):
        threading.Thread.__init__(self)
        self.num = num

    def run(self):
        result = square(self.num)
        print(f"{self.num} squared = {result}", end = '\n')

class CubeThread(threading.Thread):
    def __init__(self, num):
        threading.Thread.__init__(self)
        self.num = num

    def run(self):
        result = cube(self.num)
        print(f"{self.num} cubed = {result}", end = '\n')

class SqrtThread(threading.Thread):
    def __init__(self, num):
        threading.Thread.__init__(self)
        self.num = num

    def run(self):
        result = sqrt(self.num)
        print(f"Square root of {self.num} = {result}", end = '\n')

def square(num):
    return num ** 2

def cube(num):
    return num ** 3

def sqrt(num):
    return math.sqrt(num)

if __name__ == '__main__':
    print("Start threads...")
    t1 = SquareThread(4)
    t2 = CubeThread(4)
    t3 = SqrtThread(256)
    
    t1.start()
    print("Start squared thread")
    t2.start()
    print("Start cubed thread")
    t3.start()
    print("Start square root thread")

    t1.join()
    t2.join()
    t3.join()
    print("All threads completed")
