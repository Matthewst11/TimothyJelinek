from pymongo import MongoClient
import pymongo

CONNECTION_STRING = "mongodb://m001-student:br2dley@cluster0-shard-00-00.6pslf.mongodb.net:27017,cluster0-shard-00-01.6pslf.mongodb.net:27017,cluster0-shard-00-02.6pslf.mongodb.net:27017/?ssl=true&ssl_cert_reqs=CERT_NONE&replicaSet=atlas-4c1evl-shard-0&authSource=admin&retryWrites=true&w=majority"

client = MongoClient(CONNECTION_STRING)
print("Getting the database instance")
db = client['python_test']
print("Creating a collection")

coll = db['dogs']
print("Inserting document into collection")

doc1 = {"name":  "Snoopy", "age" : "5"}
coll.insert_one(doc1)
print("document inserted data...")

print(coll.find_one()) # This will only print one record

doc2 = {"name" : "Tim", "age" : "23"}
coll.insert_one(doc2)
print("document inserted data...")

print(coll.find_one()) # This will only print one record

# Find all documents.
ret = coll.find()
print()

print('+-+-+-+-+-+-+-+-+-+-+-+-+-+-')

# Display documents from collection.
for record in ret:
    # Check if the document has a name field
    if 'name' in record:
        # Print out the name and age.
        print(record['name'] + ', ' + record['age'])
    else:
        print('Name field not found')