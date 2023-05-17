#Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
#Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

def calcular():
    x, dia = input().split()
    dia = int(dia)
    h1,m1,s1 = map(int, input().split(':'))
    t1 = s1 + m1*60 + h1 *60*60 + dia*24*60*60

    x, dia1 = input().split()
    dia1 = int(dia1)
    h2,m2,s2 = map(int, input().split(':'))
    t2 = s2 + m2*60 + h2*60*60 +dia1*24*60*60

    dif = t2 - t1
    d = dif//(24*60*60)
    dif = dif%(24*60*60)

    h = dif//(60*60)
    dif = dif%(60*60)

    m = dif//(60)
    dif = dif%(60)

    s = dif

    print(f'{d} dia(s)')
    print(f'{h} hora(s)')
    print(f'{m} minuto(s)')
    print(f'{s} segundo(s)')

calcular()