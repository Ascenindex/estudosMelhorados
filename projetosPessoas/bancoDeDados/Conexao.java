import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

     public Connection conecta() {
          Connection conn = null;
     
          try {
               // Carregar o driver JDBC
               Class.forName("com.mysql.cj.jdbc.Driver");
               
               String url = "jdbc:mysql://localhost:3306/bancoTeste?user=root&password=neorothos2303";
               conn = DriverManager.getConnection(url);
               System.out.println("Conexão estabelecida com sucesso!");
          } catch (ClassNotFoundException e) {
               System.out.println("Driver não encontrado: " + e.getMessage());
          } catch (SQLException erro) {
               System.out.println("Erro ao conectar ao banco de dados: " + erro.getMessage());
          }

          return conn;
     }

     public static void main(String[] args) {
          Conexao conexao = new Conexao();
          Connection conn = conexao.conecta();

          if (conn != null) {
               System.out.println("Conexão foi bem-sucedida.");
          } else {
               System.out.println("Falha na conexão.");
          }
     }
}
