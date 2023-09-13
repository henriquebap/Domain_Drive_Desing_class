package MVCDAO1309;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    private Connection conexao;

    public UsuarioDAO(Connection conexao){
        this.conexao = conexao;
    }

    public void inserir(Usuario usuario)throws SQLException{
        PreparedStatement ps = conexao.prepareStatement("INSERT into <tb_user> VALUES(?,?)");
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getEmail());
        ps.execute();
    }

    //atualizar()
    //deletar()
    //listarTodos()
    //ListarPorID()
    //fecharConexao()
}
