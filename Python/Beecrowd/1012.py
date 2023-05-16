#Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
#a) a área do triângulo retângulo que tem A por base e C por altura.
#b) a área do círculo de raio C. (pi = 3.14159)
#c) a área do trapézio que tem A e B por bases e C por altura.
#d) a área do quadrado que tem lado B.
#e) a área do retângulo que tem lados A e B.

a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

 #área do triângulo
at = (a*c)/2

 #circulo
ac = 3.14159*(c**2)

 #trapézio
atr =( (a+b)*c) /2

 #quadrado
aq = b**2

 #retângulo
ar = a*b

print(f'TRIANGULO: {at:.3f}')
print(f'CIRCULO: {ac:.3f}')
print(f'TRAPEZIO: {atr:.3f}')
print(f'QUADRADO: {aq:.3f}')
print(f'RETANGULO: {ar:.3f}')
