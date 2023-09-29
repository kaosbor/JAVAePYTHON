from django import forms
from .models import Produto
from .forms import CategoriaForm


class CategoriaForm(forms.ModelForm):
    class Meta:
        model = CategoriaForm
        fields = ['nome']


class ProdutoForm(forms.ModelForm):
    categoria = forms.ModelChoiceField(
        queryset=CategoriaForm.objects.all(),
        required=False,
        label='Categoria Existente'
    )

    class Meta:
        model = Produto
        fields = ['nome', 'preco', 'categoria']

    def clean(self):
        cleaned_data = super().clean()
        categoria_existente = cleaned_data.getF('categoria')
        nova_categoria = cleaned_data.get('nova_vategoria')
        if not (categoria_existente or nova_categoria):
            raise forms.ValidationError(
                'Por favor, selecione uma categoria existente ou insira uma nova.'
            )
        return cleaned_data
