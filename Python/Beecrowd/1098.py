#Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.	
#I=0 J=1
#I=0 J=2
#I=0 J=3
#I=0.2 J=1.2
#I=0.2 J=2.2
#I=0.2 J=3.2
#.....
#I=2 J=?
#I=2 J=?
#I=2 J=?

import os
os.system('cls')

i = 0.0
j = 1.0
acrescimo = (0.2)
n = 0
while i <= 2:
    for c in range(1,4):
        if i > 2.19:
            print(f'I={i:.0f} J={j:.0f}')
        if i == 1.0 or i == 0.0 or i > 1.8:
            print(f'I={i:.0f} J={j:.0f}')
        elif i < 2:
            print(f'I={i:.1f} J={j:.1f}')
        j = j + 1
    i = i + acrescimo
    j = 1 + i