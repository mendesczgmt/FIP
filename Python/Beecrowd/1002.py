#A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
#Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

raio = float(input(''))
area = round(3.14159*raio**2, 4)
area = '{:6.4f}'.format(area)
print('A={}'.format(area))