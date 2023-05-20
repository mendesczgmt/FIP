#Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.

limite = int(input())
for c in range (limite):
    c = int(input())
    if c == 0:
        print('NULL')
    
    else:
        if c > 0:
            if c%2 == 0 :
                print(f'EVEN POSITIVE')
            elif c%2 !=0:
                print(f'ODD POSITIVE')
        else:
            if c%2 == 0 :
                print(f'EVEN NEGATIVE')
            elif c%2 !=0:
                print(f'ODD NEGATIVE')
            
       