import tkinter as tk
from tkinter import *
from tkinter import messagebox
from tkinter import ttk

class DogApp:
    def __init__(self, master):
        self.master = master
        master.title("U7 GUI - Dog App")
    
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
            
root = Tk()
my_gui = DogApp(root)
root.mainloop()
