#Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

x = int(input())
quadrado = 0
for c in range (2, x+2):
    if c%2 == 0:
        quadrado = c**2
        print(f'{c}^2 = {quadrado}') 
        c + 2 
