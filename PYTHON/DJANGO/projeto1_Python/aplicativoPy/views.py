from django.shortcuts import render
#from django.http import HttpResponse

# Create your views here.

from .models import Produto

def lista_produtos(request):
    produtos = Produto.objects.all()
    return render(request, 'aplicativoPy/lista_produtos.html', {'produtos': produtos})
