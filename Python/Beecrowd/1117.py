#Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

cont = 0
soma = 0
media = 0
while cont < 2:
    nota = float(input())
    if nota < 0 or nota > 10:
        print('nota invalida')
    else:
        cont += 1
        soma += nota

media = soma / 2
print(f'media = {media:.2f}')