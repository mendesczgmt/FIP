#Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.

ddd = int(input())
def ddds():
    if ddd in [11, 61, 71, 21, 32, 19, 27, 31]:
        if ddd == 61: 
            print('Brasilia')
        if ddd == 71:
            print('Salvador')
        if ddd == 11:
            print('Sao Paulo')
        if ddd == 21:
            print('Rio de Janeiro')
        if ddd == 32:
            print('Juiz de Fora')
        if ddd == 19:
            print('Campinas')
        if ddd == 27:
            print('Vitoria')
        if ddd == 31:
            print('Belo Horizonte')
    

    else:
        print('DDD nao cadastrado')


ddds()