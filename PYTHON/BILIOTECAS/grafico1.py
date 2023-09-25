import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

# Dados fictícios de vendas de produtos
dados = {
    'Produto': ['A', 'B', 'C', 'D', 'E'],
    'Vendas_2019': [100, 150, 80, 200, 120],
    'Vendas_2020': [120, 100, 110, 180, 90]
}
    
# Criando um DataFrame a partir dos dados
df = pd.DataFrame(dados)

# Calcular a diferença percentual das vendas entr 2019 e 2020
df['Diff_Pct'] = (df['Vendas_2020'] - df['Vendas_2019']) / df['Vendas_2019'] * 100

# Gerar um gráfico de barras para comparar as vendas de produtos em 2019 e 2020
plt.figure(figsize=(8,5))
plt.bar(df['Produto'], df['Vendas_2019'], label='Vendas_2020')
plt.bar(df['Produto'], df['Vendas_2020'], label='Vendas_2019')
plt.xlabel('Produto')
plt.ylabel('Vendas')
plt.title('Comparação de Vendas de Produtos em 2019 e 2020')
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
