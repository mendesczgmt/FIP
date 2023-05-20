#Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

pares = 0
for x in range(5):
    num = int(input())
    if num%2 ==0:
        pares += 1

print(f'{pares} valores pares')