import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bdintel";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void criarTabela() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS bdintel (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "proces VARCHAR(100)," +
                    "sisOper VARCHAR(100)," +
                    "computers VARCHAR(100)," +
                    ")";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabela 'bdintel' criada com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void inserirDados(Sistema sistema) {
        criarTabela();

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    PreparedStatement stmt = conn.prepareStatement("INSERT INTO bdintel(proces, sisOper, computers) VALUES (?, ?, ?)")) {

            stmt.setString(1, sistema.proces);
            stmt.setString(2, sistema.sisOper);
            stmt.setString(3, sistema.computers);
            stmt.executeUpdate();
            System.out.println("Dados do aparelho inseridos no banco de dados.");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir no banco de dados: " + e.getMessage());
        }
    }
}
