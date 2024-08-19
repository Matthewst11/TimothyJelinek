from dog_breed import getDogBreed

#ask for dog's name then return dog's name and randomly chosen breed
breed = getDogBreed()
print('---------------------')
print('\nDog Breed Check\n')
print('---------------------')
name = input('Enter dog name: ')
print(f'{name} is a {breed}.\n')

