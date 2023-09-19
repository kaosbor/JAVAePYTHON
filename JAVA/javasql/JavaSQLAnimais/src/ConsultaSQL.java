import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaSQL {   
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/animais";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void ConsultaSQL() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM animais");
             ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");
                String raca = resultSet.getString("raca");
                String tipoAnimal = resultSet.getString("tipo_animal");

                System.out.print("ID: " + id + "-");
                System.out.print("Nome: " + nome + "-");
                System.out.print("Idade: " + idade + "-");
                System.out.print("Raça: " + raca + "-");
                System.out.print("Tipo de Animal: " + tipoAnimal);
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar animais: " + e.getMessage());
        }
    }
}
