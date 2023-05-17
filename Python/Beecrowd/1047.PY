#Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

hi, mi, hf, mf = map(int, input().split())

mi += hi*60
mf += hf*60


dif = mf - mi

if dif <= 0:
    dif += 24*60
    

h = dif//(60)
m = dif%60

print(f'O JOGO DUROU {h} HORA(S) E {m} MINUTO(S)')