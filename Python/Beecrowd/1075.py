#Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

n = int(input())
cont = 0
y = 1
while cont < 10001:
    if y%n == 2:
        print(y)
    y += 1
    cont += 1
