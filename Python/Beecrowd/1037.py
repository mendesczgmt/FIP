#Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
#O símbolo ( representa "maior que". Por exemplo:
#[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
#(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

import os
os.system('cls')

#intervalo
a = ('[0,25]')
b = ('(25,50]')
c = ('(50,75]')
d = ('(75,100]')

num = float(input())

def intervalos():
    if num >= 0 and num <= 25:
        print(f'Intervalo {a}')
    elif num > 25 and num <= 50:
        print(f'Intervalo {b}')
    elif num > 50 and num <= 75:
        print(f'Intervalo {c}')
    elif num > 75 and num <= 100:
         print(f'Intervalo {d}')
    else:
        print('Fora de intervalo')

  



intervalos()