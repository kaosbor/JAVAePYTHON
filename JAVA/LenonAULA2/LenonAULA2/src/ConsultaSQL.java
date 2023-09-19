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

                System.out.print(String.format("ID: %-10s ", id));
                System.out.print(String.format("Nome: %-10s ", nome));
                System.out.print(String.format("Idade: %-10s ", idade));
                System.out.print(String.format("Raça: %-10s ", raca));
                System.out.print(String.format("Tipo de Animal: %-10s%n", tipoAnimal));

                System.out.println();

            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar animais: " + e.getMessage());
        }
    }
}
