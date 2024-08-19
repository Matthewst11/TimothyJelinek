#import the xml.sax module
import xml.sax

#create a class CDHandler which inherits from xml.sax.ContentHandler
class CDHandler(xml.sax.ContentHandler):
    def __init__(self):
        self.current_data = ""
        self.title = ""
        self.artist = ""
        self.country = ""
        self.company = ""
        self.price = ""
        self.year = ""
#called when parser is at start of an element
    def startElement(self, tag, attributes):
        self.current_data = tag
        
#called when parser is at end of an element
    def endElement(self, tag):
#check which element is being closed and print value
        if self.current_data == "TITLE":
            print("Title:", self.title)
        #elif self.current_data == "ARTIST":
            #print("Artist:", self.artist)
        #elif self.current_data == "COUNTRY":
            #print("Country:", self.country)
        #elif self.current_data == "COMPANY":
            #print("Company:", self.company)
        #elif self.current_data == "PRICE":
            #print("Price:", self.price)
        elif self.current_data == "YEAR":
            print("Year:", self.year) 
#reset current data to empty string
        self.current_data = ""
        
#called when parser encounters character data inside element
    def characters(self, content):
#check which element is being parsed
        if self.current_data == "TITLE":
            self.title = content
        #elif self.current_data == "ARTIST":
            #self.artist = content
        #elif self.current_data == "COUNTRY":
            #self.country = content
        #elif self.current_data == "COMPANY":
            #self.company = content
        #elif self.current_data == "PRICE":
            #self.price = content
        elif self.current_data == "YEAR":
            self.year = content

#create an instance of the CDHandler Class
handler = CDHandler()
#parse the XML file using xml.sax.parse()
xml.sax.parse("cd_catalog.xml", handler)
