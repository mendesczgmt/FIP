#Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

pares = impar = positivo = negativo = 0

for x in range(5):
    num = int(input())
    if num%2 ==0:
        pares += 1
    else:
        impar += 1
    if num > 0:
        positivo += 1
    elif num < 0:
        negativo += 1

print(f'{pares} valor(es) par(es)')
print(f'{impar} valor(es) impar(es)')
print(f'{positivo} valor(es) positivo(s)')
print(f'{negativo} valor(es) negativo(s)')