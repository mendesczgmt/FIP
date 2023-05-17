# arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

import os
os.system('cls')

cdg, qnt = input().split()
cdg = int(cdg)
qnt = int(qnt)
valor = 0


if cdg == 1:
    valor = 4.00
elif cdg == 2:
    valor = 4.50
elif cdg == 3:
    valor =5.00
elif cdg == 4:
    valor = 2.00 
elif cdg == 5:
    valor = 1.50

def calculo():

    total = valor * qnt
    total = float (total)
    print(f'Total: R$ {total:.2f}')


calculo()