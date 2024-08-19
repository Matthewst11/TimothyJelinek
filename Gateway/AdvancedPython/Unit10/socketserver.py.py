import socket

#define the server's IP address and port
server_ip = '127.0.0.1'
server_port = 54321

#create a socket object
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

#bind the socket to the server IP address and port
server_socket.bind((server_ip, server_port))

#listen for incoming connections
server_socket.listen(1)


#accept a client connection
client_socket, client_address = server_socket.accept()

print("****************************************************************")
print("***You have connected to the Super Duper Secret NSA database***")
print("***                 Authorized Users Only                   ***")
print("****************************************************************")
print("Enter password for access...")

#define the list of valid passwords
valid_passwords = ["password"]

#loop to receive data from the client
while True:
    #receive data from the client
    data = client_socket.recv(1024).decode('utf-8')
    
    if not data:
        #if no data received, the client has closed the connection
        print("Client closed the connection.")
        break
    
    print(f"Data received from client: {data}")
    
    #check if the received data is a valid password
    if data in valid_passwords:
        print("Access granted!")
        #send a response to the client
        client_socket.send("Accepted".encode())
        break
    else:
        print("Access denied!")
        #send a response to the client
        client_socket.send("Not Accepted".encode())

#close the client socket
client_socket.close()

#close the server socket
server_socket.close()
