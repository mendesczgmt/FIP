#Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

ti=int(input())

#horas
horas = ti//3600
ti = ti%3600

#minutos
minutos = ti//60
ti = ti%60

print(f'{horas}:{minutos}:{ti:}')