package MVCDAO1309;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection conexao;

    public UsuarioDAO(Connection conexao){
        this.conexao = conexao;
    }

    public void fecharConexao(){
        try{
            conexao.close();
            System.out.println("Conexao Fechada");
        }catch(SQLException e){
            System.err.println("Nao foi possivel fechar a conexao! " + e.getMessage());
            e.printStackTrace();
        }
        
    }

    public void inserir(Usuario usuario)throws SQLException{
        PreparedStatement statement = conexao.prepareStatement("INSERT into tb_usario VALUES(?,?)");
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getEmail());
        statement.execute();
    }

    public void atualizar(Usuario usuario){
        try {
            PreparedStatement ps = conexao.prepareStatement("UPDATE tb_usuario SET first_name = ?, email = ?" + "WHERE person_id = ?");
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setInt(3, usuario.getId());
            ps.execute();
            System.out.println("Usuario alterado com sucesso");
        } catch (SQLException e) {
            System.err.println("Nao foi possivel alterar o usuario" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void deletar(int id){
        try {
            PreparedStatement ps = conexao.prepareStatement("DELETE FROM tb_usuario " + "WHERE id = ?");
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Usuario Removido com sucesso!!");
        } catch (SQLException e) {
            System.err.println("Nao foi possivel remover o usuario! " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Usuario> listarTodos(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM tb_usuario");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(0);
                String nome = rs.getString(1);
                String email = rs.getString(2);
                usuarios.add(new Usuario(id, nome, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Usuario ListarPorID(int id){
        Usuario usuario = null;
        try {
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM tb_usuario WHERE id = ? ");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String nome = rs.getString(1);
                String email = rs.getString(2);
                usuario = new Usuario(id, nome, email);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return usuario;
    }
    //ListarPorID()
}
