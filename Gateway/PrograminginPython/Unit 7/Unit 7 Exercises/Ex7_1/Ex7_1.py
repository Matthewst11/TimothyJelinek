# -*- coding: utf-8 -*-
"""
Created on Wed Nov 10 12:15:05 2021

@author: Tim
"""
FILENAME = "hello.txt"
MESSAGE = "Hello, World!"

outf = open(FILENAME, "w")
outf.write(MESSAGE + "\n")
outf.close()

inf = open(FILENAME, "r")
message = inf.readline()
inf.close()
print("the file contained: ", message)
