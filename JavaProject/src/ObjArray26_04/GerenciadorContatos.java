package ObjArray2_04;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class GerenciadorContatos{

    private Contato[] agenda;
    public GerenciadorContatos(int tamanho){
        agenda = new Contato[tamanho];
    }

    public void criarAgenda(){
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i < agenda.length; i++){
            System.out.println("Nome: ");
            String nome = input.next();
            System.out.println("Telefone: ");
            String telefone = input.next();
        }
    }
}