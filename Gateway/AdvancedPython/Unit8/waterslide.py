import threading
import random

class Dog(threading.Thread):
    def __init__(self, name):
        threading.Thread.__init__(self)
        self.name = name
        self.slides = 0
    
    def run(self):
        num_slides = random.randint(1, 4000)
        for i in range(num_slides):
            self.waterSlide()
    
    def waterSlide(self):
        self.slides += 1
        print(f"{self.name} slid down the water slide!")
    
dog1 = Dog("Stewert")
dog2 = Dog("Scooby")
dog3 = Dog("Snoopy")

dog1.start()
dog2.start()
dog3.start()

dog1.join()
dog2.join()
dog3.join()

print(f"{dog1.name} slid down {dog1.slides} water slides.")
print(f"{dog2.name} slid down {dog2.slides} water slides.")
print(f"{dog3.name} slid down {dog3.slides} water slides.")
