#mprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)

if a > b and a >c:
    num = a
elif b > a and b > c:
    num = b
else:
    num = c
    
print(f'{num} eh o maior')