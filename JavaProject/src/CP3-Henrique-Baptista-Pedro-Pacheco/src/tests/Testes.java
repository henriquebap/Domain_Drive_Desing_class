package tests;

import java.util.ArrayList;

import classes.CatalogoProdutos;
import classes.Comanda;
import classes.ItemComanda;
import classes.Produto;

public class Testes {
    public static void main(String[] args) {

        // DUPLA -> Henrique Baptista - RM 97796 | Pedro Pacheco - RM 98043 

        // 1- PRODUTO:

        // Criando Produto
        Produto celular = new Produto(1, "Faz chamadas", 150.50f);
        Produto computador = new Produto(2, "Usa a internet", 250.90f);

        // Chamando metodo que printa o Produto
        celular.printarProduto();
        computador.printarProduto();

        // 2- ItemComanda

        // Criando ItemComanda que tem 3 Produtos celular
        ItemComanda itemCelular = new ItemComanda(celular, 3);
        ItemComanda itemComputador = new ItemComanda(computador, 4);

        // Usando metodo Calcular Preço, salvando em var, e printando.
        float precoCelulares = itemCelular.calcularPreco();
        System.out.println(precoCelulares);

        float precoComputadores = itemComputador.calcularPreco();
        System.out.println(precoComputadores);

        // Printando item comanda
        itemCelular.printarItemComanda();
        itemComputador.printarItemComanda();
        
        // 3- COMANDA

        // Criando Lista de ItensComanda
        ArrayList<ItemComanda> itensComanda = new ArrayList<>();
        itensComanda.add(itemCelular);
        itensComanda.add(itemComputador);

        // Criando comanda com lista de itensComanda
        Comanda comanda = new Comanda(itensComanda);
        
        // Criando novo Item para passa pro metodo registrar do comanda
        Produto teclado = new Produto(3, "Ele escreve nas coisas", 50.40f);
        ItemComanda itemTeclado = new ItemComanda(teclado, 6);

        // Adicionando novo item em comanda ja criada
        comanda.registrarItem(itemTeclado);

        // Salvando valor total da comanda numa variavel, e imprimindo
        float precoComanda = comanda.calcularValorTotal();
        System.out.println(precoComanda);
        
        // Printando itens comanda
        comanda.printarItens();
        
        // 4- CATALOGO PRODUTOS

        // Criando lista de produtos para passar pro Construtor do Catalogo
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(celular);
        produtos.add(computador);

        // Criando Catalogo de Produtos usando a lista de produtos criada
        CatalogoProdutos catalogo = new CatalogoProdutos(produtos);
        
        // Adicionando um novo produto a partir do metodo
        catalogo.cadastrarProduto(teclado);

        // Busando produto por seu Codigo
        Produto produtoBuscado = catalogo.buscarProduto(1);
        produtoBuscado.printarProduto();

        // Printando os produtos do catalogo
        catalogo.imprimirDados();
    }
}
