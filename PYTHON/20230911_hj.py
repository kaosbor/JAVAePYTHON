# -*- coding: utf-8 -*-
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