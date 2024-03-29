package br.com.fernandoalmeida.model.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fernandoalmeida.model.dao.OrdenacaoDAO;
import br.com.fernandoalmeida.model.dao.PassosDAO;
import br.com.fernandoalmeida.model.vo.Ordenacao;
import br.com.fernandoalmeida.model.vo.Passos;

/**
 * 
 * @author Fernando Almeida
 * @see Classe que contem o método de ordenação (bubble sort)
 *
 */

public class OrdenacaoBO {

    /**
     * Metodo responsavel em fazer a ordenacao pelo algorito BubbleSort (metodo bolha)
     * @param Int numero
     * @return Ordenacao
     */
    public Ordenacao bubbleSort(int numero) {
        try {
            //Transforma em String para fazer as trocas consideranco caracter por caracter
            //Converto o numero do tipo Int para String e depois gero um array de chars.
            char[] digitos = String.valueOf(numero).toCharArray();
            //Nosso 'balde' intermediario entre as trocas, variavel auxiliar.
            char aux;
            //Outra auxiliar que serve para armazenar o numero antes da modificacao para
            //se criar o 'Passo'
            char[] antes;
            //Variavel que sera incrementada a cada troca para contar quantas trocas houve
            int qtdeTrocas = 0;
            //Vetor de passos para descrever todo o processo
            List<Passos> passos = new ArrayList<Passos>();
            //Variavel que marca determina se houve trocas, usada para
            //interromper o processo quando ja nao houver mais numeros a serem
            //ordenados
            boolean continua=true;

            //Sera percorrido todos os numeros de acordo com o tamanho da sequencia
            for (int i = 0; i < digitos.length; i++) {
                if (!continua){ //Verificando se foram feitas trocas no ultimo ciclo, se nao foram, indica que ja esta ordenado
                    break; //Interrompe o algoritmo    
                }
                //Descrevendo o passo
                passos.add(new Passos(null, null, "Inicio da verificacao numero ".concat(String.valueOf(i)).concat("\n------------\n")));
                continua=false;
                //Percorrendo cada numero com o seu proximo
                for (int j = 0; j < digitos.length - 1; j++) {
                    if (digitos[j] > digitos[j + 1]) {
                        //Esse numero eh maior que o proximo, troca!
                        antes = new String(digitos).toCharArray();
                        aux = digitos[j];
                        digitos[j] = digitos[j + 1];
                        digitos[j + 1] = aux;
                        //Incrementando a quantidade de trocas
                        qtdeTrocas++;
                        //Descrevendo o passo                    
                        passos.add(new Passos(new String(antes), new String(digitos), "Trocou-se o digito ".concat(String.valueOf(digitos[j+1])).concat(" pelo ").concat(String.valueOf(digitos[j]))));
                        continua=true;
                    } else {
                        passos.add(new Passos(new String(digitos), new String(digitos), "Nao houve troca pois o numero ".concat(String.valueOf(digitos[j])).concat(" ja eh menor/igual que ").concat(String.valueOf(digitos[j + 1]))));
                    }
                }
            }
            
            //Persiste os resultados
            Ordenacao ordenacao = new Ordenacao(numero, new String(digitos), qtdeTrocas);
            new OrdenacaoDAO().salvar(ordenacao);
            new PassosDAO().salvarPassos(passos);
            //Retorno um objeto da classe Ordenacao informando os resultados.
            return ordenacao;

        } catch (Exception ex) {
            ex.printStackTrace();
            return  null;
        }
    }
}
