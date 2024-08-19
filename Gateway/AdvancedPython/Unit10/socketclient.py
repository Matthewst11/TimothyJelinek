import socket

#define the server's IP address and port
server_ip = '127.0.0.1'
server_port = 54321

#create a socket object
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

#connect to the server
client_socket.connect((server_ip, server_port))

#define the list of passwords to send to the server
passwords = ["secret", "slarty", "password", "done"]

#send passwords to the server
for password in passwords:
    print(f"Sending '{password}' to server...")
    client_socket.send(password.encode())
    response = client_socket.recv(1024).decode('utf-8')
    if response == "Accepted":
        break

#close the client socket
client_socket.close()
