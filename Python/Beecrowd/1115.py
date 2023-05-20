#Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

x = y = 1
while x !=0 or y !=0:
    x, y = map(int, input().split())
    if x > 0:
        if y > 0:
            print('primeiro')
        elif y < 0:
            print('quarto')
    elif x < 0:
        if y > 0:
            print('segundo')
        elif y < 0:
            print('terceiro')