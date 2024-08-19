import sqlite3

DB_FILE = 'unit4.db'

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
