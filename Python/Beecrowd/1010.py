#Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

linha = input().split()
c1 = int(linha[0])
n1 = int(linha [1])
v1 = float(linha [2])
linha2 = input().split()
c2 = int(linha2[0])
n2 = int(linha2[1])
v2 = float(linha2[2])
vt = (n1*v1) + (n2*v2)
print('VALOR A PAGAR: R$ {:.2f}'.format(vt))
