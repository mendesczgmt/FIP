#imprima o nome do animal correspondente à entrada fornecida.

primeira = input()
segunda = input()
terceira = input()

def passos():
    if (primeira=='vertebrado'):
        if segunda=='ave':
            if terceira =='carnivoro':
                print('aguia')
            elif terceira =='onivoro':
                print('pomba')
        elif segunda=='mamifero':
            if terceira=='onivoro':
                print('homem')
            elif terceira=='herbivoro':
                print('vaca')
    elif primeira=='invertebrado':
        if segunda=='inseto' :
            if terceira=='hematofago':
                print('pulga')
            elif terceira=='herbivoro':
                print('lagarta')
        elif segunda== 'anelideo':
            if terceira=='hematofago':
                print('sanguessuga')
            elif terceira=='onivoro':
                print('minhoca')

passos()