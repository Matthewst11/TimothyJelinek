class Letter:
   header = "Dear "
   footer = "\nSincerely, \n\n"
   text = ""
   
   def getText(self):
       return self.header + self.text + self.footer
    
   
   def __init__(self,letterFrom,letterTo):
        self.header += letterTo + ":\n\n"
        self.footer += letterFrom + "\n"
        
        
   def addLine(self,line):
        self.text+= line + "\n"
    