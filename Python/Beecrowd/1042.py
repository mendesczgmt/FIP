#Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

a,b,c=input().split()

a = int(a)
b = int(b)
c = int(c)

def org():
    if a > b and a > c and b > c:
        x = a
        y = b  
        z = c
    if a > b and a > c and b < c:
        x = a
        y = c  
        z = b  
        
    if b > a and b > c and a > c:
        x = b
        y = a  
        z = c
    if b > a and b > c and a < c:
        x = b
        y = c  
        z = a

    if c > a and c > b and a > b:
        x = c
        y = a
        z = b
    if c > a and c > b and a < b:
        x = c
        y = b
        z = a
    print(z)
    print(y)
    print(x)
    print('')
    print(a)
    print(b)
    print(c)

org()

