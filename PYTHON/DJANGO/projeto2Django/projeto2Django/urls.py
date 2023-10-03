"""
URL configuration for projeto2Django project.

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

# código urls.py anterior do projeto1Dango

'''
from django.contrib import admin
from django.urls import path

urlpatterns = [
    path('admin/', admin.site.urls),
]
'''

# urls.py
# Adicione outras URLs conforme necessário para outras funcionalidades

from django.urls import path
from estoque_app import views 

urlpatterns = [
    
    path('', views.index, name = 'index'),
    
    path('estoque/', views.lista_estoque, name='lista_estoque'),
    
    path('estoque/adicionar/', views.adicionar_item, name='adicionar_item'),
    
    path('estoque/<int:id>/detalhes/', views.detalhes_item, name='detalhes_item'),
    
    path('estoque/<int:id>/editar/', views.editar_item, name='editar_item'),
    
    path('estoque/<int:id>/excluir/', views.confirmar_exclusao_item, name='confirmar_exclusao_item'),

]