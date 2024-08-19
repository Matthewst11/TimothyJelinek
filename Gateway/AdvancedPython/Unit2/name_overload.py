class OverloadName:
    def fullName(self, first_name, last_name, middle_name=None):
        if middle_name:
            return f"{first_name} {middle_name} {last_name}"
        else:
            return f"{first_name} {last_name}"
        
#create an object of the OverloadName class
nameExample = OverloadName()

#call fullName method with first_name, last_name, and middle_name if applicable
print("3 parameters")
print("Full Name:  ", (nameExample.fullName("Suzie", "SnowFlake", "Cold")))
print()
print("2 parameters")
print("Full Name:  ", (nameExample.fullName("Bob", "Furtz")))
