#Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

import os
os.system('cls')

cont = 0
maior = 0
posição = 0

while cont < 100:
    x = int(input())
    cont += 1
    if x > maior:
        maior = x
        posição = cont
    

print(maior)
print(posição)