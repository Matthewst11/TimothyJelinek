import tkinter as tk
from tkinter import *
from tkinter import messagebox
from tkinter import ttk
import math
import unittest
import sqlite3

class FinalApp:
    def __init__(self, master):
        self.master = master
        master.title("Final App")
        self.numbersToSquareRoot = [16, 25, 49, 81]
    
    
        #create menu
        menubar = tk.Menu(master)
        filemenu = tk.Menu(menubar, tearoff=0)
        filemenu.add_command(label="Clear", command=self.clear_fields)
        filemenu.add_separator()
        filemenu.add_command(label="Quit", command=master.quit)
        menubar.add_cascade(label="File", menu=filemenu)
        helpmenu = tk.Menu(menubar, tearoff=0)
        helpmenu.add_command(label="About", command=self.show_about)
        menubar.add_cascade(label="Help", menu=helpmenu)
        master.config(menu=menubar)
    
        #create dog name label and entry widget
        dog_label = tk.Label(master, text="Dog Name:")
        dog_label.grid(row=0, column=0)
        self.dog_entry = tk.Entry(master)
        self.dog_entry.grid(row=0, column=1)
    
        #create breed label and combobox
        breed_label = tk.Label(master, text="Breed:")
        breed_label.grid(row=1, column=0)
        self.breed_combo = ttk.Combobox(master, values=["Labrador Retriever", "German Shepherd", "Golden Retriever", "Bulldog", "Beagle"])
        self.breed_combo.grid(row=1, column=1)
    
        #create display button
        display_button = tk.Button(master, text="Display", command=self.show_message)
        display_button.grid(row=2, column=1, sticky=W)
        
        #create quit button
        quit_button = tk.Button(master, text="Quit", command=master.quit)
        quit_button.grid(row=2, column=2, sticky=E)
        
        #create calculate button
        calculate_button = tk.Button(master, text="Calculate Square Root", command=lambda: self.calculate_square_root())
        calculate_button.grid(row=3, column=0, columnspan=2)
     
    def clear_fields(self):
        self.dog_entry.delete(0, tk.END)
        self.breed_combo.set("")
        
    def show_message(self):
        dog_name = self.dog_entry.get()
        breed = self.breed_combo.get()
        messagebox.showinfo("Dog Info", f"Dog Name: {dog_name}\nBreed: {breed}")
        
   

    def show_about(self):
        messagebox.showinfo("About", "U7 GUI Applications")
        
        
    def display_dog_info(self):
        #get dog name and breeds
        dog_name = self.dog_name_entry.get()
        breed = self.breed_combo.get()
            
        #show message box with dog info
        messagebox.showinfo("Dog Info", f"Dog Name: {dog_name}\nBreed: {breed}")
        
    def calculate_square_root(self):
        
        #define the numbers list
        numbers = [16, 25, 49, 81]
        
        #use map() function to apply lambda function to each element in the list
        squaredNumbers = list(map(lambda x: math.sqrt(x), numbers))
    
        #in the console print the original and squared lists
        print("Original list:   ", numbers)
        print("Square root of the list using map():   \n", squaredNumbers)
    
        #show message boxes with original list and squared list
        messagebox.showinfo("Original list:   ", numbers)
        messagebox.showinfo("Square Root", f"Square root of the list is {squaredNumbers}")

class TestStringMath(unittest.TestCase):
    
    def test_string_equality(self):
        name = 'slarty' * 3
        name2 = 'slartyslartyslarty'
        self.assertEqual(name, name2)
        
    def test_floor(self):
        y = math.floor(1.4)
        self.assertEqual(y, 1)
            
    def test_exponent(self):
        x = pow(4, 3)
        self.assertEqual(x, 64)
            
if __name__ == '__main__':
    unittest.main()

DB_FILE = 'final.db'

def main():
    conn = sqlite3.connect(DB_FILE)
    createTable(conn)
    insertData(conn)
    displayData(conn)
    updateVetCosts(conn)
    displayData(conn)
    conn.close()

print("Table Created Successfully")

def createTable(conn):
    cursor = conn.cursor()
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS dog (
            id INTEGER UNIQUE PRIMARY KEY,
            name TEXT,
            age INTEGER,
            breed CHAR(50),
            vet_costs REAL
        )
    """)
    conn.commit()

def insertData(conn):
    cursor = conn.cursor()
    cursor.execute("INSERT INTO dog (name, age, breed, vet_costs) VALUES ('Snoopy', 3, 'Beagle', 125.0)")
    cursor.execute("INSERT INTO dog (name, age, breed, vet_costs) VALUES ('Josh', 4, 'GSP', 155.0)")      
    cursor.execute("INSERT INTO dog (name, age, breed, vet_costs) VALUES ('Brooke', 7, 'GSP', 75.0)")
    
    conn.commit()
    
print("Records Created Successfully")  

def displayData(conn):
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM dog")
    rows = cursor.fetchall()
    for row in rows:
        print(row)

def updateVetCosts(conn):
    cursor = conn.cursor()
    cursor.execute("UPDATE dog SET vet_costs = 200 WHERE NAME='Snoopy'")
    conn.commit()

if __name__ == '__main__':
    main()
            
root = Tk()
my_gui = FinalApp(root)
root.mainloop()
