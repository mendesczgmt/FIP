#Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

x = int(input())
cont = 0

while cont < 6:
    if x%2 == 0:
        x += 1
    else:
        print(x)
        x += 2
        cont += 1