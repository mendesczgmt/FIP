#Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

horas = input().split()
a, b = horas
a = int(a)
b = int(b)
hora_mínima = 1
hora_máxima = 24

def calculos():
    if a == b:
        print('O JOGO DUROU 24 HORA(S)')
    else:
        if b < a:
            soma = (hora_máxima - a) + b
            print(f'O JOGO DUROU {soma} HORA(S)')
        else:
            subtração = (a - b) * -1
            print(f'O JOGO DUROU {subtração} HORA(S)')

calculos()