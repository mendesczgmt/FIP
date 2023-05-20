#Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

positivo = 0
for x in range(6):
    x = float(input())
    if x > 0:
        positivo += 1
print(f'{positivo} valores positivos')
    