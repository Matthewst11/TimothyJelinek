salary = int(input("Enter a salary: "))

if salary <= 50000 :
    newSalary = salary * 0.01
elif salary < 75000 :
    newSalary = salary * 0.02
elif salary < 100000 :
    newSalary = salary * 0.03
elif salary < 250000 :
    newSalary = salary * 0.04
elif salary < 500000 :
    newSalary = salary * 0.05
elif 500000 <= salary :
    newSalary = salary * 0.06


print(newSalary)
