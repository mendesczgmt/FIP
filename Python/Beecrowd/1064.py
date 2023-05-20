#Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

cont = 0
positivo = 0
soma = 0
media = 0
while not cont == 6:
  x = float(input(''))
  if x >0:
    positivo += 1
    soma += x
    
  cont += 1
  
media = soma / positivo
print(f'{positivo} valores positivos')
print(f'{media:.1f}')