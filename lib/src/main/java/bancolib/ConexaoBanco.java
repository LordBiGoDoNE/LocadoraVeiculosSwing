package bancolib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static Connection conn;
    
    public static void initDB(String HOST, String PORTA, String BANCO, String USUARIO, String SENHA) {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://" + HOST + ":" + PORTA + "/" + BANCO, USUARIO, SENHA);
        } catch (SQLException ex) {
            throw new RuntimeException("Não foi possivel estabelecer uma conexao com o Banco de Dados!", ex);
        }
    }

    public static Connection getConexao() {
        return conn;
    }

}
