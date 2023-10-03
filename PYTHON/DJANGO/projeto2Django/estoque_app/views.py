# views.py

# views.py

from django.shortcuts import render, get_object_or_404, redirect
from .models import ItemEstoque
from .forms import ItemEstoqueForm
from django.http import HttpResponse


def index(request):
    return HttpResponse("Abri a página! - TESTE")


def lista_estoque(request):
    estoque = ItemEstoque.objects.all()
    return render(request, 'estoque_app/lista_estoque.html', {'estoque': estoque})


def adicionar_item(request):
    if request.method == 'POST':
        form = ItemEstoqueForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('lista_estoque')
    else:
        form = ItemEstoqueForm()
    return render(request, 'estoque_app/adicionar_item.html', {'form': form})

# erro


def detalhes_item(request, id):
    itemd = get_object_or_404(ItemEstoque, pk=id)
    return render(request, 'estoque_app/detalhes_item.html', {'item': itemd})


def editar_item(request, id):
    item = get_object_or_404(ItemEstoque, pk=id)

    if request.method == 'POST':
        form = ItemEstoqueForm(request.POST, instance=item)
        if form.is_valid():
            form.save()
            return redirect('detalhes_item', id=id)
    else:
        form = ItemEstoqueForm(instance=item)

    return render(request, 'estoque_app/editar_item.html', {'form': form, 'item': item})


def confirmar_exclusao_item(request, id):
    item = get_object_or_404(ItemEstoque, pk=id)
    if request.method == 'POST':
        item.delete()
        return redirect('lista_estoque')
    return render(request, 'estoque_app/confirmar_exclusao_item.html', {'item': item})


# código view.py anterior do aplicativoPy
'''
from django.shortcuts import render, redirect
from .forms import PedidoForm, ProdutoForm, CategoriaForm
from .models import Produto, Categoria

def lista_produtos(request):
    produtos = Produto.objects.all()
    categorias = Categoria.objects.all()
    produto_form = ProdutoForm(request.POST or None)
    categoria_form = CategoriaForm(request.POST or None)
    if request.method == 'POST':
        if produto_form.is_valid():
            produto_form.save()
            return redirect('lista_produtos')
    return render(request, 'aplicativoPy/lista_produtos.html', {'produtos': produtos, 'categorias': categorias, 'produto_form': produto_form, 'categoria_form': categoria_form})


def criar_pedido(request):
    form = PedidoForm(request.POST or None)

    if request.method == 'POST':
        if form.is_valid():
            form.save()
            return redirect('lista_produtos')
    return render(request, 'aplicativoPy/criar_pedido.html', {'form': form})


def criar_produto(request):
    if request.method == 'POST':
        form = ProdutoForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('lista_produtos')
    return redirect('lista_produtos')


def inserir_categoria(request):
    form = CategoriaForm(request.POST or None)
    if request.method == 'POST':
        if form.is_valid():
            form.save()
            # Substitua pelo nome da view de listagem de produtos
            return redirect('lista_produtos')
    return render(request, 'aplicativoPy/inserir_categoria.html', {'form': form})
'''
