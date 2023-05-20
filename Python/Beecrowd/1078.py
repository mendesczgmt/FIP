#Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
#1 x N = N      2 x N = 2N        ...       10 x N = 10N

x = int(input())
for c in range (10):
        c += 1
        print(f'{c} x {x} = {c*x}')