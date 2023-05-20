#Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.	
#I=1 J=60
#I=4 J=55
#I=7 J=50
#...
#I=? J=0

i = 1
j = 60
while j >= 0:
    print(f'I={i} J={j}')
    i += 3
    j -= 5  