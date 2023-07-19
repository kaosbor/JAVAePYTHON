print("Calculadora em PYTHON");

# 0. ChatGPT - Calcular a média de três números: 

def calcular_media(num1, num2, num3): 
    media = (num1 + num2 + num3) / 3
    return media

num1 = float(input("Digite o 1º número: "));
num2 = float(input("Digite o 2º número: "));
num3 = float(input("Digite o 3º número: "));

media = calcular_media(num1, num2, num3)
print(f"A média dos números {num1} + {num2} + {num3} é {media:.2f}.")
print("A média dos números {} + {} + {} é {:.2f}.".format(num1, num2, num3, media))

print("***********************************")

# 1. Calcular a média de três números: 

numero1 = 10.5
numero2 = 8.2
numero3 = 6.7 
media = (numero1 + numero2 + numero3) / 3
print("A média é:", media)

# 2. Verificar se um número é PAR ou ÍMPAR:
    
numero4 = 8

if numero4 % 2 == 0:
    print("O número é PAR.")
else:
    print("O número é ÍMPAR.")

#  3. Verificar se um ano é bissexto:

ano = 2024

ehBissexto = (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0)

if ehBissexto:
    print("O ano é bissexto.")
else:
    print("O ano não é bissexto.")
    
# 4. Calcular o fatorial de um número:

numero = 5
fatorial = 1

for i in range(1, numero + 1):
    fatorial *= i # simples (5*4*3*2*1) ou correto em loop ((4+1)(3+1)(2+1)(1+1)(1)))

print("O fatorial do número",numero,"é:",fatorial,".")

# 5. Verificar se um número é primo:

numero = 2
ehPrimo = True

for i in range(2, numero):
    if numero % i == 0:
        ehPrimo = False
        break

if ehPrimo:
    print("O número", numero, "é PRIMO.")
else:
    print("O número", numero, "não é PRIMO.")