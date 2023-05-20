#Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
#I=1 J=7
#I=1 J=6
#I=1 J=5
#I=3 J=7
#I=3 J=6
#I=3 J=5
#...
#I=9 J=7
#I=9 J=6
#I=9 J=5

import os
os.system('cls')

i = 1
j = 7
cont = 1

while i < 10:
    while j >= 5:
        print(f'I={i} J={j}')
        j -= 1
    i += 2
    j = 7
   