#Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

i = int(input())

#ano
anos = i//365
i = i%365
print(f'{anos} ano(s)')

#mês
mêses = i //30
i = i%30
print(f'{mêses} mes(es)')

#dias
print(f'{i} dia(s)')