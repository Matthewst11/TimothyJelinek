import random

#create list of dog breeds for randomizer to choose from
def getDogBreed():
    breeds = ['Labrador Retriever', 'German Shepherd', 'Bulldog', 'Golden Retriever', 'Beagle', 'Poodle']
    return random.choice(breeds)

