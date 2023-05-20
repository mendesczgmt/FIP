#Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

aux = 0
maior = 0
menor = 0

cond = True
while cond:
        x, y = map(int, input().split())
   
        if(x <= 0 or y <= 0):
                break

        maior = x if x > y else y
        menor = y if y < x else x
   
        if maior > menor :
                aux = maior
                maior = menor
                menor = aux
               
        soma = 0
       
        while maior <= menor :
         print(maior, end=' ')
         soma += maior
         maior+=1