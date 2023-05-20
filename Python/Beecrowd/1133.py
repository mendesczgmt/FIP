#Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

x = int(input())
y = int(input())
if x > y:
    maior = x
    menor = y
else:
    maior = y
    menor = x
for c in range(menor, maior - 1):
    c += 1
    if c%5 == 2 or c%5 == 3:
        print(c)