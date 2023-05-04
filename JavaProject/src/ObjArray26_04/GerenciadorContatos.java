package ObjArray26_04;

import java.util.Scanner;

public class GerenciadorContatos{

    private Contato[] agenda;
    public GerenciadorContatos(int tamanho){
        agenda = new Contato[tamanho];
    }

    public Contato[] criarAgenda(){
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i < agenda.length; i++){
            System.out.println("Nome: ");
            String nome = input.next();
            System.out.println("Telefone: ");
            String telefone = input.next();

            //criando Contato
            Contato c = new Contato(nome, telefone);
            agenda[i] = c;
        }
        return agenda;
    }
    public void mostraConato(){
        for(int i=0; i<agenda.length; i++){
            System.out.println("Nome: " + agenda[i].getName());
            System.out.println("Telefone: " + agenda[i].getTelefone());
            
        }
    }
}