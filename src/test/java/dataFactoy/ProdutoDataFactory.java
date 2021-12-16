package dataFactoy;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComValorIgualA(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("PS1000");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("azivis");
        cores.add("dourado");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Nada");
        componente.setComponenteQuantidade(2);

        componentes.add(componente);

        produto.setComponentes(componentes);

        return produto;
    }
}
