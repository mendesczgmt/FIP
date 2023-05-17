#Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.

salario = float(input())

def calcular():
    if salario > 0 and salario <= 400:
        ajuste1 = salario / 100 * 15
        ns1 = salario + ajuste1
        print (f'Novo salario: {ns1:.2f}')
        print (f'Reajuste ganho: {ajuste1:.2f}')
        print  ('Em percentual: 15 %')
    elif salario > 400 and salario <= 800:
        ajuste1 = salario / 100 * 12
        ns1 = salario + ajuste1
        print (f'Novo salario: {ns1:.2f}')
        print (f'Reajuste ganho: {ajuste1:.2f}')
        print  ('Em percentual: 12 %')
    elif salario > 800 and salario <= 1200.00:
        ajuste1 = salario / 100 * 10
        ns1 = salario + ajuste1
        print (f'Novo salario: {ns1:.2f}')
        print (f'Reajuste ganho: {ajuste1:.2f}')
        print  ('Em percentual: 10 %')
    elif salario > 1200 and salario <= 2000.00:
        ajuste1 = salario / 100 * 7
        ns1 = salario + ajuste1
        print (f'Novo salario: {ns1:.2f}')
        print (f'Reajuste ganho: {ajuste1:.2f}')
        print  ('Em percentual: 7 %')
    elif salario > 2000.00:
        ajuste1 = salario / 100 * 4
        ns1 = salario + ajuste1
        print (f'Novo salario: {ns1:.2f}')
        print (f'Reajuste ganho: {ajuste1:.2f}')
        print  ('Em percentual: 4 %')

