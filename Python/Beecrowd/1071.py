#Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

x = int(input())
y = int(input())
soma = 0

for c in range (y+1, x):
    if c %2==1:
        soma += c

print(soma)
