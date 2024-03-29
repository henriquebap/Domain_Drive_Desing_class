package MVCDAO1309;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {
    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private static final String USER = Credenciais.user;
    private static final String PWD = Credenciais.pwd;

    public static Connection obterConexao() throws SQLException{
        return DriverManager.getConnection(URL, USER, PWD);
    }
}
