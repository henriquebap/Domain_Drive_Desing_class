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
        usuarioDAO.inserir(new Usuario(0, "Henrique", "henriquebaptista2003@gmail.com"));
    }
}
