#Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

def media():
    valores = input().split()
    N1, N2, N3, N4 = valores

    N1 = float(N1)
    N2 = float(N2)
    N3 = float(N3)
    N4 = float(N4)

    nota_exame = 0.0
    media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10

    print(f'Media: {media:.1f}')

    if(media >= 7.0):
        print('Aluno aprovado.')

    if(media < 5.0):
        print('Aluno reprovado.')

    if(media >= 5.0 and media <= 6.9):
        print('Aluno em exame.')
        nota_exame = float(input())
        print(f'Nota do exame: {nota_exame}')
        media1 = (media + nota_exame)/2
    
        if(media1 >= 5.0):
            print('Aluno aprovado.')
        else:
            print('Aluno reprovado.')
        print(f'Media final: {media1:.1f}')

media()