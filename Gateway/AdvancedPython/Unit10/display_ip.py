import socket

#get the IP address of the local host
local_host = socket.gethostbyname(socket.gethostname())
print("Local Host IP address: " + local_host)

#get the IP address of Microsoft Web Server
microsoft_web_server = socket.gethostbyname("www.microsoft.com")
print("Microsoft Web Server IP address: " + microsoft_web_server)

#get the IP address of Gateway Web Server
gateway_web_server = socket.gethostbyname("www.gtc.edu")
print("Gateway Web Server IP address: " + gateway_web_server)

