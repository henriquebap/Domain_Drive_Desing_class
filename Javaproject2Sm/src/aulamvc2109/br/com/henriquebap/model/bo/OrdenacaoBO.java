package aulamvc2109.br.com.henriquebap.model.bo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


import aulamvc2109.br.com.henriquebap.model.dao.OrdenacaoDAO;
import aulamvc2109.br.com.henriquebap.model.dao.PassosDAO;
import aulamvc2109.br.com.henriquebap.model.vo.Ordenacao;
import aulamvc2109.br.com.henriquebap.model.vo.Passos;

/**
 * @author henriquebap
 * @see Classe contem o metodo de ordenacao (Bubble Sort)
 * 
 * 
 */


public class OrdenacaoBO {
    /**
     * Transformar o numeo em Strin para realizar a troca, consideranndo carectere
     * por caratere
     * 
     * - Criar um array de char para facilitar a manipulacao dos dados
     * @throws FileNotFoundException
     * 
     * 
     */

    public Ordenacao bubbleSort(int numero) throws FileNotFoundException{
        char[] digitos = String.valueOf(numero).toCharArray();

        /*Variavel auxiliar (aux) para armazenar o numero
         * antes de realizar a troca
         */

        char aux;
        char[] antes;
        int qtdeTrocas = 0;

        /**
         * Lista que ira conter todo o processo de ordenacao
         * 
         */

        List<Passos> passos = new ArrayList<Passos>();
        

        /**
         * Variavel de controle se houve troca
         * 
         */
        boolean continua = true;

        /**
         * Percorrer a lisa de acordo com o tamanho dela
         */
        
        
        for(int i=0; i <digitos.length; i++){
            /*
             * Verifica se foram feitas trocas no ulimo ciclo
             */
            if(!continua){
                break;
            }
            //Descreve o processo(passos)
            passos.add(new Passos(null, null, "Inicio da verificacao do numero"
                    .concat(String.valueOf(i))
                    .concat("\n--------------\n")));

            continua = false;

            //Percorrer a lista, verificando o proximo elemento

            for(int j=0; j<digitos.length -1;j++){
                if(digitos[j] > digitos[j+1]){
                    //Sendo maior, realizar a troca
                    antes = new String(digitos).toCharArray();
                    aux = digitos[j];
                    digitos[j]= digitos[j +1 ];
                    digitos[j+1] = aux;

                    qtdeTrocas++;
                    passos.add(new Passos(new String(antes), new String(digitos), "Trocou o digito"
                    .concat(String.valueOf(digitos[j+1]))
                    .concat("Trocado Pelo"
                    .concat(String.valueOf(digitos[j])))));


                    continua = true;
                }else{
                    passos.add(new Passos(new String(digitos), new String(digitos),
                    "Nao houve troca, pois o numero".concat(String.valueOf(digitos[j+1]))
                    .concat("é maior ou igual a um numero")
                    .concat(String.valueOf(digitos[j]))));
                }
            }
        }
        /*
         * Persiste os resultados no arquivo
         */
        Ordenacao ordenacao = new Ordenacao(numero, new String(digitos), qtdeTrocas);
        new OrdenacaoDAO().salvar(ordenacao);
        new PassosDAO().salvarPassos(passos);

        //retorna um objeto da classe Ordenacao
        //INformando os resultados

        return ordenacao;

    }
}
