print("\n>>> EXERCÍCIOS 01 - PYTHON - 18/09/2023 <<<")

''' Exercício 1: escreva um programa que solicite ao usuário que digite seu nome e exiba uma mensagem de boas-vindas.
print("\n>>> 1.1 Solicite seu nome <<<")
nome = (input("Como você se chama, digite na frente: ")) 
print(f"Eu me chamo {nome}.")

Exercício 2: Modifique o programa anterior para solicitar ao usuário que digite sua idade e, em seguida, exiba uma mensagem personalizada com o nome e a idade.
print("\n>>> 1.2 Solicite e retorne nome e idade <<<")
nome = "João"
idade = int (input("Qual sua idade: ")) 
print(f"Eu tenho {idade} anos de idade e me chamo {nome}.")
'''

''' Exercício 3: crie uma função chamada soma que receba dois números como parâmetros e retorne a soma desses números.'''
print("\n>>> 1.3 Dois números e some <<<")
print("\n>>> 1.3.1 Primeira forma: dois números e some <<<")
# Define a função cálculo SOMA
def soma (primeiroNR, segundoNr):
    return primeiroNR + segundoNr
    
# Chama a função
primeiroNR = float(input("Digite o 1º número: "))
print(f" O primeiro numero é {primeiroNR}.")

segundoNR = float(input("Digite o 2º número: "))
print(f"O segundo numero é {segundoNR}.")

somar = soma(primeiroNR, segundoNR)
print(f"A soma de {primeiroNR} mais {segundoNR} é igual a {somar}.")

# ********************
print("\n>>> 1.3.2 Segunda forma: dois números e some <<<")
def Soma (num1, num2):
    return num1 + num2
    
# Chama a função
Soma  = soma(10, 50)
print(f"A soma de 10 + 50 é = a {Soma}.")

''' Exercício 4:
Implemente uma função chamada `fatorial` que receba um número inteiro como parâmetro e retorne o fatorial desse número.

Exercício 5:
Crie uma classe chamada `Calculadora` que tenha dois métodos: `soma` e `multiplicacao`. O método `soma` deve receber dois números como parâmetros e retornar a soma, enquanto o método `multiplicacao` deve receber dois números como parâmetros e retornar o resultado da multiplicação.

'''