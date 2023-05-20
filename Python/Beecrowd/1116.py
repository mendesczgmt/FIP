#Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

limite = int(input())
for c in range (limite):
    x, y = map(int, input().split())
    if y == 0:
        print("divisao impossivel")
    else: 
        divide = x/y
        print(f'{divide:.1f}')