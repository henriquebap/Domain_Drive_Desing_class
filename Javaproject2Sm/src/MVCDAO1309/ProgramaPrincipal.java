package MVCDAO1309;

import java.sql.Connection;
import java.sql.SQLException;

public class ProgramaPrincipal {
    public static void main(String[] args) throws SQLException {
        
        //Obtem uma conexao com o Banco
        Connection conexao = null;
        try {
            conexao = ConexaoBancoDados.obterConexao();
            System.out.println("Conectando ao banco");
        } catch (SQLException e) {
            System.err.println("Erro ao obter uma conexao com o Banco de Dados" + e.getMessage());
            e.printStackTrace();
            return;
        }

        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
        Usuario novoUsuario = new Usuario(0, "Henrique", "henriquebaptista2003@gmail.com"));

        try {
            usuarioDAO.inserir(novoUsuario);
            System.out.println("Usuario inserido com sucesso");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir o usuario" + e.getMessage());
        }

        usuarioDAO.ListarPorID(0);
        //funcoes do usuario DAO aqui
        
    }
}
