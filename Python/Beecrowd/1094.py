#Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
#Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

limite = int(input())
cobaia = 0
coelho = rato = sapo = 0
p_rato = p_coelho = p_sapos = 0
for c in range (limite):
    qnt, cob = input().split()
    qnt = int(qnt)
    cobaia += qnt
    if cob == 'C':
        coelho += qnt
    if cob == 'R':
        rato += qnt
    if cob == 'S':
        sapo += qnt
    
p_rato = ((rato / cobaia) * 100)
p_sapos = ((sapo / cobaia) * 100)
p_coelho = ((coelho / cobaia) * 100)
print(f'Total: {cobaia} cobaias')
print(f'Total de coelhos: {coelho}')
print(f'Total de ratos: {rato}')
print(f'Total de sapos: {sapo}')
print(f'Percentual de coelhos: {p_coelho:.2f} %')
print(f'Percentual de ratos: {p_rato:.2f} %')
print(f'Percentual de sapos: {p_sapos:.2f} %')