# -*- coding: utf-8 -*-
'''
print("\nOlá mundo!")

print("\n>>> Exemplo 00: IF e ELSE <<<")

idade = 10
if idade >= 18:
    print("Você é " + '"maior"' + " de idade.")
else:
    print("Você é " + '"menor"' + " de idade.")

print("\n>>> Exemplo 01: Iterando sobre uma lista <<<")

frutas = ["maçã", "banana", "laranja"]
for fruta in frutas:
    print(fruta)
    
print("\n>>> Exemplo 02: Iterando em um intervalo numérico <<<")

for i in range(1, 6):
    print(i)

print("\n>>> Exemplo 03: loop WHILE <<<")

contador = 0
while contador < 5:
    print(contador)
    contador +=1

print("\n>>> Exemplo 04: Declaração de valores <<<")

idade = 245
altura = 1.75
saldo  = -100.75

print("\n>>> Exemplo 05: >>> Exemplos de listas <<<")

numeros = [1,2,3,4,5]
nomes = ["Leandro","Maria","João"]
valores = [10, 3.14, "Qualquer texto", True]

for imprimiaNr in numeros:
    print(imprimiaNr)
    
print("\n>>> Exemplo 06: Dicionários <<<") # Seria um array que utiliza as posições para imprimir os valores
pessoa = {"nome": "João", "idade": 25, "altura": 1.75}
produto = {"nome": "Camiseta", "preco": 29.99, "estoque": 100}

print("\n>>> Exemplo 07: Entrada e saída de dados <<<") 
nome = "João"
idade = 25
# Abaxio usar como teste
print("Nome:" + pessoa["nome"]) # retorna a linha inteira
dicionario = dict(pessoa)
print(dicionario)

print("\n>>> Exemplo 08: Input <<<")
nome = input("Digite seu nome: ")
print("Olá, " + nome + "!")

print("\n>>> Exemplo 09: Conversão de tipos <<<")
anos = int(input("Digite sua idade: "))
altura = float(input("Digite sua altura em metros: "))
print("Minha idade é:", anos, "anos")
print("Minha altura é: ", altura)

    print("\n>>> Exercícios 18/09/2023 - 5, página  <<<")

    print("\n>>> Exemplo 10: Formatação de saída <<<")
    nome = "Maria"
    idade = 30
    print("Nome: {}, Idade: {}".format(nome, idade)) # Usando a função fomat ()
    print(f"Nome: {nome}, Idade: {idade}") # Usando f-string (Python 3.6+)
'''

print("\n>>> Exemplo 11: Funções <<<")
    # def é uma palavra-chave reservada para função
    # Cria a função abaixo, mas ela ainda não foi chamada
def saudacao(nome): # recebe argumento nome e concatena com ver slide
    mensagem = "Olá, " + nome + "!"
    return mensagem
    # Chama a função
nome_usuario = input("Digite seu nome: ")
resultado = saudacao(nome_usuario)
print(resultado)

'''
    print("\n>>> Exemplo 12: Métodos <<<")
    frase = "Python é uma linguagem de programação."
    numero_caracteres = frase.count("a")
    print(numero_caracteres)
    numero_caracteres = frase.count("ã")
    print(numero_caracteres)

    quantidade = len

    print("\n>>> Exemplo 13: Listas, tuplas e dicionários <<<")
    print("\n>>> LISTAS - são definidas por [] e os são separados por vírgulas <<<")

    frutas = ["maçã", "banana", "laranja"]

    primeira_fruta = frutas[1] # Acessa a primeira fruta (maçã)
    print(primeira_fruta)

    frutas[1] = "uva" # Modifica o segundo elemento para "uva"
    segunda_fruta = frutas[1]
    print(segunda_fruta)

    frutas[:] = "abacaxi", "limão", "melância"
    frutas.append("morango")
    print(f"Lista de frutas: {frutas}")

    print("\n>>> TUPLAS <<<")
    coordenadas = (10, 20)
    x = coordenadas[0] # Acessa o prieiro elemtno (10)
    print(x)
    y = coordenadas[1] # Acessa o prieiro elemtno (10)
    print(y)
    print(f"A coordenada de X é {x} e a coordenada de Y é {y}.")

    print("\n>>> DICIONÁRIOS <<<")
    
    print("\n>>> Dicionários 1 <<<")
    pessoa = {"nome": "João", "idade": 25, "altura": 1.75}
    nome_nome = pessoa["nome"] 
    print (nome_nome)

    print("\n>>> Dicionários 2 <<<")
    # Dicionário  - Chave - Valor
    pessoa["profissao"] = "Engenheiro" # Dicionário - adicionado um novo par chave-valor
    pessoa["idade"] = 26 # Modifica o valor associado à chave "idade"

    altura_pessoa = pessoa["altura"] 
    print (altura_pessoa) # A chave "altura" foi removida, então tentar acessá-la causará um erro

    # del pessoa["altura"] # Remove o par chave-valor associado à chave "altura"

    print ("****************************")
    nome_pessoa = pessoa["nome"]
    nome_pessoa = "MARCOS"  
    print (nome_pessoa)
    print ("****************************")
    idade_pessoa = pessoa["idade"] 
    nome_pessoa = 150
    print (nome_pessoa)
    print ("****************************")
    profissao_pessoa = pessoa["profissao"] 
    print (profissao_pessoa)
    print ("****************************")
    altura_pessoa = pessoa["altura"] 
    print (altura_pessoa) # A chave "altura" foi removida, então tentar acessá-la causará um erro
'''
print("\n>>> PROGRAMAÇÃO ORIENTADA A OBJETOS <<<")
    
print("\n>>> POLIMORFISMO <<<")
class Cachorro: # Classe cachorro

        def __init__(self, nome, idade): # Define os métodos de nome INIT
            self.nome = nome # Parecido com o this 
            self.idade = idade # Parecido com o this
        
        def latir(self):
            print(self.nome, "faz au au au au e possui",  self.idade, "anos de idade.")
            
        def andar(self):
            print(self.nome, "faz xixi no 1º poste e possui",  self.idade, "anos de idade.")
            print(f"{self.nome} faz xixi no 2º poste e possui {self.idade} anos de idade.")
        
    # Criando objetos da CLASSE Cachorro
cachorro1 = Cachorro("Max", 3)
cachorro2 = Cachorro("Bella", 5)

 # Chamando o MÉTODOS dos OBJETOS
cachorro1.latir()
cachorro2.andar()