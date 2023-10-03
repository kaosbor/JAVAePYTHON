from django.db import models

class ItemEstoque(models.Model):
    nome = models.CharField(max_length=150)
    descricao = models.TextField()
    quantidade_disponivel = models.PositiveIntegerField()

    def __str__(self):
        return self.nome

# código models.py anterior do aplicativoPy

'''
class Categoria(models.Model):
    nome = models.CharField(max_length=100)

    def __str__(self):
        return self.nome

class Pedido(models.Model):
    nome_cliente = models.CharField(max_length=100)
    produto = models.ForeignKey(Produto, on_delete=models.CASCADE)
    quantidade = models.PositiveIntegerField()

    def __str__(self):
        return f'{self.nome_cliente} - {self.produto.nome}'
'''