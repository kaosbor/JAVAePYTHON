# views.py

from django.shortcuts import render, get_object_or_404, redirect
from .models import ItemEstoque
from .forms import ItemEstoqueForm

# Estoque INDEX
def index(request):
    return render(request, 'estoque_app/index.html')

# Lista estoque
def lista_estoque(request):
    estoque = ItemEstoque.objects.all()
    return render(request, 'estoque_app/lista_estoque.html', {'estoque': estoque})

# Adicionar item
def adicionar_item(request):
    if request.method == 'POST':
        form = ItemEstoqueForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('lista_estoque')
    else:
        form = ItemEstoqueForm()
    return render(request, 'estoque_app/adicionar_item.html', {'form': form})

# Detalhar itens
def detalhes_item(request, id):
    item = get_object_or_404(ItemEstoque, id=id)
    return render(request, 'estoque_app/detalhes_item.html', {'item': item})

# Editar itens
def editar_item(request, id):
    item = get_object_or_404(ItemEstoque, id=id)
    if request.method == 'POST':
        form = ItemEstoqueForm(request.POST, instance=item)
        if form.is_valid():
            form.save()
            return redirect('lista_estoque')
    else:
        form = ItemEstoqueForm(instance=item)
    return render(request, 'estoque_app/editar_item.html', {'form': form})

'''
def editar_item(request):
    id = request.GET.get('id')
    return render(request, 'sua_template_de_edicao.html', {'id': id})
'''

# Excluir estoque itens
def excluir_item(request, id):
    item = get_object_or_404(ItemEstoque, id=id)
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
