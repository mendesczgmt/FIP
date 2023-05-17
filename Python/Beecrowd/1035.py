#Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

def valores():
    if b > c and d > a and (c + d) > (a + b) and c > 0 and d > 0: 
        print ('Valores aceitos')
    else:
        print ('Valores nao aceitos')


(a, b, c, d) = input().split()
a = int(a)
b = int (b)
c = int(c)
d = int (d)
valores()
