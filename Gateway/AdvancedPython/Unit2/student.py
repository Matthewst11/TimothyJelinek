class Student:
    student_total = 0
    
    print("Classes")
        
    def __init__(self, id, fname, lname, program):
        self.id = id
        self.fname = fname
        self.lname = lname
        self.program = program
        Student.student_total += 1

    def display(self):
        print("-----------------")
        print("ID:   ", self.id)
        print("First Name:   ", self.fname)
        print("Last Name:   ", self.lname)
        print("Program:   ", self.program)
                 
#create two student objects
student1 = Student(12, "Bob", "Furtz", "Science of Furtz")
student2 = Student(26, "Susie", "Snowflake", "Winter Snowflake Designs")
        
#call the display method on each object
student1.display()
student2.display()
        
print("-----------------")
print("Student total:   ", Student.student_total)

print("Student.__name__:", Student.__name__)
print("Student.__module__:",Student.__module__)
print("Student.__dict__:",Student.__dict__)
print("Student.__bases__:",Student.__bases__)
print("Student.__doc__:",Student.__doc__)
