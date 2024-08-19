class Dog:
   
   def __init__(self):
        self.dogName = ""
        self.dogBreed = ""
        
   def getDogName(self):
       return self.dogName
   
   def getDogBreed(self):
       return self.dogBreed
   
   def addDogName(self, dogName):
        self.dogName = dogName
        
   def addDogBreed(self, dogBreed):
        self.dogBreed = dogBreed
        
   def clear(self):
        self.dogName = ""
        self.dogBreed = ""