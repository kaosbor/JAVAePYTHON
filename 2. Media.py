# DEFINIMOS (def) uma FUNÇÃO (calcular_media) que recebe três parâmetros. Na FUNÇÃO, calculamos a média e armazenamos na variável media e depois retornamos o valor da média.
def calcular_media(num1, num2, num3): 
    media = (num1 + num2 + num3) / 3
    return media

num1 = float(input("Digite o 1º número: ")); #Digite um nr com a função input() com a função FLOAT() para converter em nr de ponto flutuante.
num2 = float(input("Digite o 2º número: ")); #Digite um nr usando a função input() com a função FLOAT() para converter a entrada em números de ponto flutuante.
num3 = float(input("Digite o 3º número: ")); #Digite um nr usando a função input() com a função FLOAT() para converter a entrada em números de ponto flutuante.

media = calcular_media(num1, num2, num3) # Chamamos a função CALCULAR_MEDIA os argumentos, sendo o resultado armazenado na variável media.
# print("A média dos números" , num1 , "+" , num2 , "+" , num3 , "é",media,".") # Imprimi a média dos valores utilizando a função PRINT().
print(f"A média dos números {num1} + {num2} + {num3} é {media:.2f}.")
print("A média dos números {} + {} + {} é {:.2f}.".format(num1, num2, num3, media))