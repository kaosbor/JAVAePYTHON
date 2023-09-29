"""
URL configuration for projeto1_Python project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/4.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""


from django.urls import path        # Arq. 02, pág. 22 
from aplicativoPy import views      # Arq. 02, pág. 22 (relaciona abaixo) 
from . import views                 # Arq. 02, pág. 22
from django.contrib import admin    # Arq. 02, pág. 23


urlpatterns = [
    path('admin/', admin.site.urls),
    path('produtos/', views.lista_produtos, name='lista_produtos'), 
    path('criar_pedido/', views.criar_pedido, name='criar_pedidos'),
    
    # Adicionando a rota para a raiz
    path('', views.lista_produtos, name='lista_produtos'),
    path('inserir_produto/', views.criar_produto, name='inserir_produto'),
    path('inserir_categoria/', views.inserir_categoria, name='inserir_categoria'),
]