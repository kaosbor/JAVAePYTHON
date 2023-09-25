import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

# Dados fictícios de vendas de produtos
dados = {
    'Produto': ['Anel', 'Bola', 'Cruz', 'Dado', 'Elefante'],
    'Vendas_2019': [100, 150, 80, 200, 120],
    'Vendas_2020': [120, 100, 110, 180, 90]
}
    
# Criando um DataFrame a partir dos dados
df = pd.DataFrame(dados)

# Calcular a diferença percentual das vendas entr 2019 e 2020
df['Diff_Pct'] = (df['Vendas_2020'] - df['Vendas_2019']) / df['Vendas_2019'] * 100

# Gerar um gráfico de barras para comparar as vendas de produtos em 2019 e 2020
plt.figure(figsize=(8,5))
bar_width = 0.35
index = range(len(df['Produto']))

plt.bar(index, df['Vendas_2019'], bar_width, label='Vendas_2019')
plt.bar([i + bar_width for i in index], df['Vendas_2020'], bar_width, label='Vendas_2020')

plt.xlabel('Produto')
plt.ylabel('Vendas')
plt.title('Comparação de Vendas de Produtos em 2019 e 2020')

for i, v in enumerate(df['Vendas_2019']): # Loop que itera sobre os valores da coluna 'Vendas_2019' usando a função enumerate, sendo i o índice do valor na coluna e v é o próprio valor.
    plt.text(i, v, str(v), ha='center', va='bottom') # Uso da função text do matplotlib para adicionar texto ao gráfico, e permite que você insira texto em posições específicas do gráfico.

for i, v in enumerate(df['Vendas_2020']):
    plt.text(i + bar_width, v, str(v), ha='center', va='bottom')

plt.xticks([i + bar_width/2 for i in index], df['Produto'], rotation=0, weight='bold')

plt.legend()
plt.show()

# Gerar um gráfico de linha para visualizar a diferença percentual nas vendas
plt.figure(figsize=(8,5))
plt.plot(df['Produto'], df['Diff_Pct'], marker='o')
plt.xlabel('Produto')
plt.xlabel('Diferença percentual nas vendas')
plt.title('Diferença percentual das vendas entr 2019 e 2020')
plt.grid(True)
plt.show()