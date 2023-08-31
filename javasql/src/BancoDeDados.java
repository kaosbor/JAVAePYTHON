import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;

public class BancoDeDados {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/animais";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void criarTabela() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement()) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS animais (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "idade INT," +
                    "raca VARCHAR(100)," +
                    "tipo_animal VARCHAR(50)" +
                    ")";
            stmt.executeUpdate(createTableSQL);
            System.out.println("-----------------------------");
            System.out.println("Tabela 'animais' criada com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void inserirAnimal(Animal animal) {
        criarTabela();

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn
                        .prepareStatement("INSERT INTO animais(nome, idade, raca, tipo_animal) VALUES (?, ?, ?, ?)")) {

            stmt.setString(1, animal.nome);
            stmt.setInt(2, animal.idade);
            stmt.setString(3, animal.raca);
            stmt.setString(4, animal.getTipoAnimal());

            stmt.executeUpdate();
            System.out.println("-----------------------------");
            System.out.println("Animal inserido no banco de dados.");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir no banco de dados: " + e.getMessage());
        }
    }

    // Inícia a Inserção de ShowTables
    public static void showTables() {

        public BancoDeDados(BancoDeDados tabelas) {
            this.metaData = tabelas;
        }

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet tables = metaData.getTables(null, null, null, new String[]{"TABLE"});
            
            System.out.println("-----------------------------");
            System.out.println("Tabelas existentes no banco de dados:");
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println(tableName);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar tabelas: " + e.getMessage());
        }
    } // Termina a inserção de ShowTables

}