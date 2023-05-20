#Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

limite = int(input())
cont = 0
soma = 0
while cont < limite:
    a, b = map(int,input().split())
    if a > b:
        x = a
        y = b
    else:
        x = b
        y = a
    while y < x:
        y += 1
        if y < x and y%2 != 0:
            soma += y
    print(f'{int(soma)}')
    soma = 0
    cont += 1