# import os # Biblioteca
# os.system('cls') # Comando limpar o terminal
print("\n>>> EXERCÍCIOS 01 - PYTHON - 18/09/2023 <<<")

# Exercício 1: escreva um programa que solicite ao usuário que digite seu nome e exiba uma mensagem de boas-vindas.
print("\n>>> 1.1 Solicite seu nome <<<")
nome0 = (input("Como você se chama, digite na frente: ")) 
print(f"Eu me chamo {nome0}.")

# Exercício 2: Modifique o programa anterior para solicitar ao usuário que digite sua idade e, em seguida, exiba uma mensagem personalizada com o nome e a idade.
print("\n>>> 1.2 Solicita nome e idade <<<")
print("\n>>> 1.2.1 Primeira forma: Nome e idade <<<")
nome1 = (input("Nome: ")) 
idade1 = int (input("Idade: ")) 
print(f"Eu tenho {idade1} anos de idade e me chamo {nome1}.")

print("\n>>> 1.2.1 Segunda forma: Nome (predefinido) e idade <<<")
nome2 = "João"
idade2 = int (input("Qual sua idade: "))
print(f"Eu tenho {idade2} anos de idade e me chamo {nome2}.")

# Exercício 3: crie uma função chamada soma que receba dois números como parâmetros e retorne a soma desses números.
print("\n>>> 1.3 Escreva dois números e some <<<")

print("\n>>> 1.3.1 Primeira forma: dois números e some <<<")
def soma (num1, num2):
    return num1 + num2
# Chama a função
Soma  = soma(10, 50)
print(f"A soma de: 10 + 50 = {Soma}.")

print("\n>>> 1.3.2 Segunda forma: dois números e some <<<")
def soma (primeiroNR, segundoNr): # Define a FUNÇÃO CÁLCULO SOMA
    return primeiroNR + segundoNr
primeiroNR = float(input("Digite o 1º número: ")) # A partir daqui CHAMA a FUNÇÃO
print(f"O primeiro numero é {primeiroNR}.")
segundoNR = float(input("Digite o 2º número: "))
print(f"O segundo numero é {segundoNR}.")
somar = soma(primeiroNR, segundoNR)
print(f"A soma de {primeiroNR} mais {segundoNR} é igual a {somar}.")

# Exercício 4: Implemente uma função chamada `fatorial` que receba um número inteiro como parâmetro e retorne o fatorial desse número. '''
# O fatorial de um número é o produto de todos os inteiros positivos de 1 até esse número.
print("\n>>> 1.4 Retorne FATORIAL <<<")

def fatorial(n): # A linha def fatorial(n): define uma função chamada fatorial que aceita um parâmetro n (número inteiro). 
    # if = se
    
    if n < 0: # A condição if n < 0 verifica se o valor da variável "n" é menor do que zero e retorna se for verdadeira uma mensagem de erro apropriada.
        return "não foi calculado, pois não é possível calcular o fatorial de um número negativo" # A declaração return "Não é possível calcular o fatorial de um número negativo" é usada para retornar uma mensagem de erro como resultado da função, quando se verificou número negativo.
    # elif = else if = senão se
    
    elif n == 0 or n == 1: # A função está tratando os casos em que a variável "n" é 0 ou 1, retornando 1 como resultado, pois o fatorial nestes casos é sempre 1.
        return 1 # A declaração é usada para retornar o valor 1 como resultado da função.
    
    else: # else = mais -> palavra-chave, é a parte do código que é executada quando todas as condições anteriores no bloco condicional não são satisfeitas.
        resultado = 1 # Declaração return 1 usada para retornar o valor 1 como resultado da função, quando "n" é 0 ou 1, retorna 1, pois o fatorial é = a 1.
    
        for i in range(2, n + 1): # Cria um loop "for" (enquanto) que itera por valores de "i" começando em 2 até "n" (inclusive). Isso significa que o loop executará um bloco de código para cada valor de "i" de 2 até "n", incluindo "n".
            resultado *= i # É uma expressão que multiplica o valor atual da variável "resultado" pelo valor de "i" e, em seguida, armazena o resultado de volta na variável "resultado", iterando e multiplica o resultado acumulado pelo próximo número na sequência.
        # O fatorial de um número é o produto de todos os inteiros positivos de 1 até esse número.
        # 1 * 1 = 1 ! 1 * 2 = 2 ! 2 * 3 = 6 ! 6 * 4 = 24 ! 24 * 5 = 120 ! 120 * 6 = 720 ! 720 * 7 = 5040
        return resultado # Instrução -> para encerrar a execução de uma função e retornar o valor da variável "resultado" como resultado da função. Isso significa que o valor contido em "resultado" será retornado como o resultado da função quando a função for chamada.

numero = int (input("Número e ser fatoriado: ")) # Esta atribuição está definindo a variável "numero" com o valor 1, ou seja, está armazenando o número 1 na variável chamada "numero".

resultado = fatorial(numero) # Este objeto chama a função "fatorial" e calcula o fatorial do número armazenado em "numero" e armazena o resultado na variável "resultado".

resultado2 = 1
for i in range(2, numero + 1):
    cont = resultado2
    resultado2 *= i
    print(f"{cont} * {i} = {resultado2}")

print(f"O fatorial de {numero} = {resultado}.") # Imprime a mensagem formatada no terminal, com as variáveis "numero" e "resultado".
print(f"O fatorial de {numero} = {resultado2}.")  # Imprime a mensagem formatada no terminal, com as variáveis "numero" e "resultado2".

# Exercício 5: Crie uma classe chamada `Calculadora` que tenha dois métodos: `soma` e `multiplicacao`. O método `soma` deve receber dois números como parâmetros e retornar a soma, enquanto o método `multiplicacao` deve receber dois números como parâmetros e retornar o resultado da multiplicação.
print("\n>>> 1.5 CALCULADORA <<<")




