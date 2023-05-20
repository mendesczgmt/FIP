#Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
#Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações

limite = int(input(''))
cont = 0
dentro = 0
fora = 0

while cont < limite:
    x = int(input())
    cont += 1
    if x >= 10 and x <= 20:
        dentro +=1
    else:
        fora += 1

print (f'{dentro} in')
print (f'{fora} out')

