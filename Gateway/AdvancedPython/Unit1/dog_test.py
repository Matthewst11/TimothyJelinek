from dog import Dog

#create dog object
myDog = Dog();

#get dog information
print("******* Dog Rescue ******* \n")
print("Rescue Dog Information: \n")
print("------------------------")
dogName = input("Dog name: ")
dogBreed = input("Breed: ")

#set dog's name and breed
myDog.addDogName(dogName)
myDog.addDogBreed(dogBreed)

#display dog info
print("\nName           Breed ")
print("---------------------")
print(myDog.getDogName(), "      ", myDog.getDogBreed())

#clear dog's information
myDog.clear()