#Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

n = int(input())
ht = int(input())
se = float(input())
se = round(se,2)
salario = ht*se

print('NUMBER = {}'.format(n))
print('SALARY = U$ {:.2f}'.format(salario))