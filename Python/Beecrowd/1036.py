#Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

import os
os.system('cls')

#entrada
(a,b,c) = input().split()
a = float(a)
b = float(b)
c = float(c)

#calculos
def bhask():

    delta= b**2 - 4*a*c
    delta = float(delta)
    if delta < 0 or a == 0:
        print('Impossivel calcular')
    else:
        delta=(b**2) - 4*a*c
        delta = float(delta)
        raiz = float(delta) ** 0.5
        x1 = (-b + raiz) / (2*a)
        x2 = (-b - raiz) / (2*a)
        print(f'R1 = {x1:.5f}')
        print(f'R2 = {x2:.5f}')

bhask()