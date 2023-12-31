import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* Autor: RB Date: 14/09/2023 Senai: Desenvolvimento de Sistemas

Atividade: Você é um talentoso programador que trabalha na renomada empresa de tecnologia, a Intel. Como parte da equipe de desenvolvimento, você foi designado para criar um sistema de cadastro para processadores, sistemas operacionais e computadores. Esse sistema permitirá à Intel manter um registro organizado de seus produtos e melhorar a eficiência na gestão interna.
1. **Entendendo os Requisitos:**
   Antes de iniciar o desenvolvimento, é crucial entender os requisitos detalhadamente. Converse com os gestores e obtenha informações claras sobre quais dados precisam ser armazenados para cada tipo de produto (processadores, sistemas operacionais e computadores).

2. **Hierarquia de Classes:**
   Considere a criação de uma hierarquia de classes para representar os diferentes tipos de produtos. Pode ser útil criar uma classe base "Produto" e então subclasses para cada tipo específico.

3. **Cadastro e Armazenamento:**
   Utilize conceitos de banco de dados para armazenar as informações. Considere a estrutura de tabelas e relações necessárias para cada tipo de produto. Lembre-se de implementar funções para inserir novos produtos no banco de dados.

4. **Interface do Usuário:**
   Desenvolva uma interface de usuário intuitiva para que os funcionários da Intel possam facilmente cadastrar novos produtos. Pense em formas de validar os dados inseridos e fornecer feedback ao usuário.

5. **Consulta e Listagem:**
   Implemente funcionalidades para listar os produtos cadastrados, permitindo filtrar por tipo, buscar por nome, etc. Isso ajudará a Intel a encontrar rapidamente as informações necessárias.
*/
public class EnterpriseIntel { // Declaração da classe principal "EnterpriseIntel"
    public static void main(String[] args) { // Declaração da classe principal "EnterpriseIntel"
        // Criar um objeto da classe Menu
        Menu menu = new Menu(); // Cria uma instância da classe "Menu" chamada "menu"
        menu.MenuEmpresa(); // Chama o método "MenuEmpresa()" no objeto "menu" relacionado à empresa.
        BancoDeDados main = new BancoDeDados();  // Cria uma instância da classe "BancoDeDados" chamada "main"
        main.main(args); // Chama o método "main" no objeto "main" da classe "BancoDeDados" e passa os argumentos da linha de comando "args".
    }
}

// Criar uma classe de menu
class Menu extends Produtos { // Esta classe "Menu" herda características da classe "Produtos"
    // Declarar os atributos
    /*
     * Declaração de variáveis
     * protected String nome;
     * protected String tipo; // Podendo ser processador, sistema operacional ou
     * computador
     * protected String marca; // Intel
     * protected String modelo; // i5 9400F, Windows 10, computador gamer
     * protected String processador; // i5 9400F
     * protected String sistemaOperacional; // Windows 10
     * protected String Computadores; // Computador gamer
     */
    
    // protected String: a variável é visível dentro da própria classe onde foi declarada e também é visível em todas as subclasses dessa classe, independentemente do pacote ao qual pertençam. Neste exemplo, a variável "nome de cada um" é declarada como protected na classe Veiculo. Isso significa que qualquer classe que herde de Produtos terá acesso direto à variável, independentemente de estar no mesmo pacote ou não.

    // class Processadores extends Produtos
    protected String nomeProcessador;
    protected String marcaProcessador; // Intel
    protected String modeloProcessador; // i5 9400F
    protected String socketProcessador; // LGA 1151
    protected String frequenciaProcessador; // 2.9 GHz
    protected String coresProcessador; // 6
    protected String threadsProcessador; // 6
    protected String TDPProcessador; // 65 W
    protected String precoProcessador; // R$ 1.000,00 }

    // class SistemaOperacional extends Produtos
    protected String nomeSistemaOperacional;
    protected String marcaSistemaOperacional; // Intel
    protected String modeloSistemaOperacional; // Windows 10
    protected String anoLancamentoSistemaOperacional; // 2015
    protected String precoSistemaOperacional; // R$ 1.000,00

    // class Computador extends Produtos
    protected String nomeComputador;
    protected String marcaComputador; // Intel
    protected String modeloComputador; // Computador gamer
    protected String processadorComputador; // i5 9400F
    protected String sistemaOperacionalComputador; // Windows 10
    protected String precoComputador; // R$ 1.000,00

    public void MenuEmpresa() { // Declara método "MenuEmpresa()", que será chamado para exibir um menu de opções da empresa.
        Scanner in = new Scanner(System.in); // Cria um objeto da classe Scanner chamado "in" para ler entrada do teclado.
        PrintStream out = System.out; // Cria um objeto da classe PrintStream chamado "out" usado para imprimir no console.
        boolean sair = false; // Declara variável booleana "sair" usada para controlar a saída do menu (definida como "falsa").
        BancoDeDados bancoDeDados = new BancoDeDados(); // Cria uma única instância do BancoDeDados, criando um objeto chamado "bancoDeDados" que pode ser usado para acessar métodos e dados relacionados ao banco de dados.

        while (!sair) { // Entra em um loop enquanto a variável "sair" for falsa.
            out.println("Bem-vindo ao sistema da Intel."); // Imprime mensagem no console.
            out.println("Escolha uma opção:"); // Imprime mensagem no console.
            out.println("1. Cadastrar produto"); // Imprime mensagem no console.
            out.println("2. Listar produtos"); // Imprime mensagem no console.
            out.println("3. Sair"); // Imprime mensagem no console.
            out.print("Digite aqui sua opção: "); // Imprime mensagem no console.
            int opcao = in.nextInt(); // Lê um número inteiro da entrada do usuário e armazena-o na variável "opcao".

            switch (opcao) {
                
                case 1:
                    out.println("\033[H\033[2J"); // Limpa console. "\033[H" topo da tela e "\033[2J" limpa console.
                    out.println("Escolha o tipo de produto:"); // Imprime mensagem no console.
                    out.println("1. Processador"); // Imprime mensagem no console.
                    out.println("2. Sistema Operacional"); // Imprime mensagem no console.
                    out.println("3. Computador"); // Imprime mensagem no console.
                    out.print("Digite aqui e escolha o tipo do produto: "); // Imprime mensagem no console.
                    int selectCad = in.nextInt(); // Lê um número inteiro da entrada do usuário e armazena-o na variável "selectCad" para determinar qual ação o usuário deseja realizar.
                    
                    switch (selectCad) { // Inicia um bloco switch que avalia o valor da variável "selectCad".
                        
                    case 1: // Se o valor de "selectCad" for igual a 1, executa o seguinte bloco de código abaixo:
                        out.println("\033[H\033[2J"); // Limpa console.
                        Produtos cadastroProcessador = new Produtos(); // Cria instância da classe "Produtos" chamada "cadastroProcessador".
                        cadastroProcessador.cadastrarProduto(selectCad); // Chama método "cadastrarProduto" no objeto "cadastroProcessador" e passa o valor de "selectCad".
                        break; // Sai do bloco switch após a execução bem-sucedida deste caso.
                        
                    case 2: // Se o valor de "selectCad" for igual a 2, executa o seguinte bloco de código abaixo:
                        out.println("\033[H\033[2J"); // Limpa console.
                        Produtos cadastroSistemaOperacional = new Produtos(); // Cria instância da classe "Produtos" chamada "cadastroSistemaOperacional".
                        cadastroSistemaOperacional.cadastrarProduto(selectCad); // Chama método "cadastrarProduto" no objeto "cadastroSistemaOperacional" e passa o valor de "selectCad".
                        break; // Sai do bloco switch após a execução bem-sucedida deste caso.
                        
                    case 3: // Se o valor de "selectCad" for igual a 3, executa o seguinte bloco de código abaixo:
                            out.println("\033[H\033[2J"); // Limpa console.
                            Produtos cadastroComputador = new Produtos();
                            cadastroComputador.cadastrarProduto(selectCad);
                            break; // Sai do bloco switch após a execução bem-sucedida deste caso.
                        
                    default:
                            out.println("\033[H\033[2J");  // Limpa console.
                            out.println("Opção inválida"); // Imprime mensagem no console se opção diferente de 1, 2 ou 3.
                            break; // Sai do bloco switch após a execução bem-sucedida deste caso.
                    }
                    break; // Sai do bloco switch após a execução bem-sucedida deste caso.
                
                    case 2:
                        out.println("\033[H\033[2J"); // Limpa console. "\033[H" topo da tela e "\033[2J" limpa console.
                        out.println("Escolha o tipo de produto:"); // Imprime mensagem no console.
                        out.println("1. Processador"); // Imprime mensagem no console.
                        out.println("2. Sistema Operacional"); // Imprime mensagem no console.
                        out.println("3. Computador"); // Imprime mensagem no console.
                        out.print("Digite aqui sua escolha de produto a listar: "); // Imprime mensagem no console.
                        int selectList = in.nextInt(); // Lê um número inteiro da entrada do usuário e armazena-o na variável "selectList" para determinar qual ação o usuário deseja realizar.
                    
                    switch (selectList) { // Inicia um bloco switch que avalia o valor da variável "selectList".
                        case 1:
                            out.println("\033[H\033[2J"); // Limpa console.
                            out.println("Processadores:"); // Imprime mensagem no console.
                            bancoDeDados.listarProcessadores(); // Chama o método "listarProcessadores()" no objeto "bancoDeDados" para listar os processadores.
                            out.println("\nDeseja voltar ao menu principal?"); // Imprime mensagem no console.
                            out.println("1. Sim"); // Imprime mensagem no console.
                            out.println("2. Não"); // Imprime mensagem no console.
                            out.print("Digite 1 (Sim) e 2 (Não): "); // Imprime mensagem no console.
                            int selectMenu = in.nextInt(); // Lê um número inteiro da entrada do usuário e armazena-o na variável "selectMenu".
                            
                            switch (selectMenu) { // Inicia um bloco switch que avalia o valor da variável "selectMenu".
                                
                                case 1: // Se o valor for = 1, executa o seguinte bloco de código "break" e não faz nada, volta ao menu principal
                                    break; // Sai do bloco switch após a execução bem-sucedida deste caso.
                                
                                case 2: // Se o valor de "selectMenu" for igual a 2, executa o seguinte bloco de código:
                                    sair = true; // Define a variável "sair" como verdadeira, indicando que o programa deve ser encerrado.
                                    out.println("Programa finalizado. Obrigado por utilizar o sistema da Intel."); // Imprime mensagem no console.
                                    break; // Sai do bloco switch após a execução bem-sucedida deste caso.
                                    
                                default: // Se o valor de "selectMenu" for não corresponder a nenhum dos casos anteriores, executa o seguinte bloco de código:
                                    out.println("Opção inválida"); // Imprime mensagem no console.
                                    break; // Sai do bloco switch após a execução bem-sucedida deste caso.
                            } // Fim do bloco switch. Sai do bloco switch que avaliou o valor de "selectMenu".
                            break; // Sai do loop while que envolve este switch e, portanto, encerra o programa. 
                        
                        case 2:
                            out.println("\033[H\033[2J"); // Limpa console.
                            out.println("Sistemas Operacionais:"); // Imprime mensagem no console.
                            bancoDeDados.listarSistemasOperacionais();
                            out.println("Deseja voltar ao menu principal?"); // Imprime mensagem no console.
                            out.println("1. Sim"); // Imprime mensagem no console.
                            out.println("2. Não"); // Imprime mensagem no console.
                            int selectMenu2 = in.nextInt();
                            switch (selectMenu2) {
                                case 1:
                                    // Não faz nada, volta ao menu principal
                                    break;
                                case 2:
                                    sair = true;
                                    out.println("\033[H\033[2J");

                                    out.println("Programa finalizado. Obrigado por utilizar o sistema da Intel.");
                                    break;
                                default:
                                    out.println("Opção inválida");
                                    break;
                            }
                            break;
                        case 3:
                            out.println("\033[H\033[2J");
                            out.println("Computadores:");
                            bancoDeDados.listarComputadores();
                            out.println("Deseja voltar ao menu principal?");
                            out.println("1. Sim");
                            out.println("2. Não");
                            int selectMenu3 = in.nextInt();
                            switch (selectMenu3) {
                                case 1:
                                    // Não faz nada, volta ao menu principal
                                    break;
                                case 2:
                                    sair = true;
                                    out.println("\033[H\033[2J");

                                    out.println("Programa finalizado. Obrigado por utilizar o sistema da Intel.");
                                    break;
                                default:
                                    out.println("Opção inválida");
                                    break;
                            }
                            break;
                        default:
                            out.println("Opção inválida");
                            break;
                    }
                    break;
                case 3:
                    sair = true;
                    out.println("\033[H\033[2J");
                    out.println("Programa finalizado. Obrigado por utilizar o sistema da Intel.");
                    break;
                default:
                    out.println("Opção inválida");
                    break;
            }
        }
        in.close();
    }
}

class Produtos extends EnterpriseIntel {
    // Declaração de variáveis
    protected String nome;
    protected String tipo; // Podendo ser processador, sistema operacional ou computador
    protected String marca; // Intel
    protected String modelo; // i5 9400F, Windows 10, computador gamer
    protected String processador; // i5 9400F
    protected String sistemaOperacional; // Windows 10
    protected String Computadores; // Computador gamer

    // Métodos
    public void cadastrarProduto(Integer escolha) {
        switch (escolha) {
            case 1:
                Processadores processador = new Processadores();
                // Chamar o método cadastrarProcessador da instância criada
                processador.cadastrarProcessador();
                BancoDeDados.inserirProcessador();
                break;
            case 2:
                SistemasOperacionais sistemaOperacional = new SistemasOperacionais();
                // Chamar o método cadastrarSistemaOperacional da instância criada
                sistemaOperacional.cadastrarSistemaOperacional();
                BancoDeDados.inserirSistemaOperacional();
                break;
            case 3:
                Computadores computador = new Computadores();
                // Chamar o método cadastrarComputador da instância criada
                computador.cadastrarComputador();
                BancoDeDados.inserirComputador();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void listarProdutos() {
        BancoDeDados.listarProcessadores();
        // Listar produtos
    }

    public void buscarProduto() {
        // Buscar produto
    }
}

// Criar uma classe para processadores
class Processadores extends Produtos {
    // Declaração de variáveis
    protected static String nome;
    protected static String marca; // Intel
    protected String modelo; // i5 9400F
    protected static String socket; // LGA 1151
    protected static String frequencia; // 2.9 GHz
    protected static String cores; // 6
    protected static String threads; // 6
    protected static String TDP; // 65 W
    protected static String preco; // R$ 1.000,00
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;

    public void DadosProcessadores(Scanner in, PrintStream out) {
        out.print("Digite o nome do processador: ");
        in.next();
        nome = in.nextLine();

        out.print("Digite a marca do processador: ");
        marca = in.nextLine();

        out.print("Digite o modelo do processador: ");
        modelo = in.nextLine();

        out.print("Digite o socket do processador: ");
        socket = in.nextLine();

        out.print("Digite a frequência do processador: ");
        frequencia = in.nextLine();

        out.print("Digite a quantidade de cores do processador: ");
        cores = in.nextLine();

        out.print("Digite a quantidade de threads do processador: ");
        threads = in.nextLine();

        out.print("Digite o TDP do processador: ");
        TDP = in.nextLine();

        out.print("Digite o preço do processador: ");
        preco = in.nextLine();
    }

    // Métodos
    public void cadastrarProcessador() {
        DadosProcessadores(in, out);
        // Cadastrar processador
    }

    public String getProcessadores() {
        return modelo;
    }
}

// Criar uma classe para sistemas operacionais
class SistemasOperacionais extends Produtos {
    // Declaração de variáveis
    protected String nome;
    protected static String marca; // Intel
    protected static String modelo; // Windows 10 22H2
    protected static String anoLancamento; // 2015
    protected static String preco; // R$ 1.000,00
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;

    public void DadosSistemasOperacionais(Scanner in, PrintStream out) {
        out.println("Digite o nome do sistema operacional: ");
        nome = in.nextLine();

        out.print("Digite a marca do sistema operacional: ");
        marca = in.nextLine();

        out.print("Digite o modelo do sistema operacional: ");
        modelo = in.nextLine();

        out.print("Digite o ano de lançamento do sistema operacional: ");
        anoLancamento = in.nextLine();

        out.print("Digite o preço do sistema operacional: ");
        preco = in.nextLine();
    }

    // Métodos
    public void cadastrarSistemaOperacional() {
        DadosSistemasOperacionais(in, out);
        // Cadastrar sistema operacional
    }

    public String getSistemasOperacionais() {
        return nome;
    }
}

// Criar uma classe para computadores
class Computadores extends Produtos {
    // Declaração de variáveis
    protected static String nome;
    protected static String marca; // Intel
    protected static String modelo; // Computador gamer
    protected String processador; // i5 9400F
    protected String sistemaOperacional; // Windows 10
    protected static String preco; // R$ 1.000,00
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;

    public void DadosComputadores(Scanner in, PrintStream out) {
        out.println("Digite o nome do computador: ");
        nome = in.nextLine();

        out.print("Digite a marca do computador: ");
        marca = in.nextLine();

        out.print("Digite o modelo do computador: ");
        modelo = in.nextLine();
        Processadores processadorObj = new Processadores();
        processadorObj.cadastrarProcessador(); // Preencha os dados do processador aqui
        processador = processadorObj.modelo; // Atribua o modelo do processador à variável

        SistemasOperacionais sistemaOperacionalObj = new SistemasOperacionais();
        sistemaOperacionalObj.cadastrarSistemaOperacional(); // Preencha os dados do sistema operacional aqui
        sistemaOperacional = sistemaOperacionalObj.nome; // Atribua o nome do sistema operacional à variável

        out.print("Digite o preço do computador: ");
        preco = in.nextLine();
    }

    // Métodos
    public void cadastrarComputador() {
        DadosComputadores(in, out);
        // Cadastrar computador
    }

    public void listarComputadores() {
        // Listar computadores
    }

    public void buscarComputador() {
        // Buscar computador
    }

    public static String getComputadores() {
        return nome;
    }
}

// Criar uma classe para o Banco de Dados
class BancoDeDados {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Intel";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_NAME = "Intel";
    PrintStream out = System.out;

    public void main(String[] args) {
        BancoDeDados.CriarBD();
        BancoDeDados.criarTabelas();
    }

    public static void CriarBD() {
        PrintStream out = System.out;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            out.println("Driver não encontrado: " + e.getMessage());
        }

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                Statement stmtCreate = conn.createStatement()) {

            // Cria o banco de dados "animais" se ele não existir
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME + "\r\n" + //
                    "    DEFAULT CHARACTER SET = 'utf8mb4';";
            stmtCreate.executeUpdate(createDatabaseSQL);

            // Desativar o check de foreign key
            String disableChecksSQL = "SET FOREIGN_KEY_CHECKS = 0;";
            stmtCreate.executeUpdate(disableChecksSQL);
        } catch (SQLException e) {
            out.println("Erro ao criar banco de dados: " + e.getMessage());
        }
    }

    public static void criarTabelas() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                Statement stmt = conn.createStatement()) {

            String TabelaProcessadores = "CREATE TABLE IF NOT EXISTS Processadores (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "marca VARCHAR(100)," +
                    "modelo VARCHAR(100) UNIQUE," +
                    "socket VARCHAR(100)," +
                    "frequencia VARCHAR(100)," +
                    "cores VARCHAR(100)," +
                    "threads VARCHAR(100)," +
                    "TDP VARCHAR(100)," +
                    "preco VARCHAR(100)" +
                    ")";
            stmt.executeUpdate(TabelaProcessadores);

        } catch (SQLException e) {
            Processadores processador = new Processadores();
            out.printf("Erro ao criar tabela '%s'.", processador.getProcessadores(), e.getMessage());
        }

        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                Statement stmt = conn.createStatement()) {

            String TabelaSistemasOperacionais = "CREATE TABLE IF NOT EXISTS SistemasOperacionais (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100) UNIQUE," +
                    "marca VARCHAR(100)," +
                    "modelo VARCHAR(100)," +
                    "anoLancamento VARCHAR(100)," +
                    "preco VARCHAR(100)" +
                    ")";
            stmt.executeUpdate(TabelaSistemasOperacionais);

        } catch (SQLException e) {
            SistemasOperacionais sistemaOperacional = new SistemasOperacionais();
            out.printf("\nErro ao criar tabela '%s'.", sistemaOperacional.getSistemasOperacionais(), e.getMessage());
        }

        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                Statement stmt = conn.createStatement()) {

            String TabelaComputadores = "CREATE TABLE IF NOT EXISTS Computadores (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "marca VARCHAR(100)," +
                    "modelo VARCHAR(100)," +
                    "processador VARCHAR(100)," +
                    "sistemaOperacional VARCHAR(100)," +
                    "preco VARCHAR(100)," +
                    "foreign key (processador) references Processadores(modelo)," +
                    "foreign key (sistemaOperacional) references SistemasOperacionais(nome)" +
                    ")";
            stmt.executeUpdate(TabelaComputadores);

        } catch (SQLException e) {
            out.printf("\nErro ao criar tabela '%s'.", Computadores.getComputadores(), e.getMessage());
        }
    }

    public static void inserirProcessador() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO Processadores(nome, marca, modelo, socket, frequencia, cores, threads, TDP, preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            Processadores processador = new Processadores();
            stmt.setString(1, Processadores.nome);
            stmt.setString(2, Processadores.marca);
            stmt.setString(3, processador.modelo);
            stmt.setString(4, Processadores.socket);
            stmt.setString(5, Processadores.frequencia);
            stmt.setString(6, Processadores.cores);
            stmt.setString(7, Processadores.threads);
            stmt.setString(8, Processadores.TDP);
            stmt.setString(9, Processadores.preco);
            stmt.executeUpdate();

            out.println("\033[H\033[2J");
            out.println("Processador cadastrado com sucesso.");

        } catch (SQLException e) {
            Processadores processador = new Processadores();
            out.printf("Erro ao inserir dados na tabela '%s'.", processador.getProcessadores(), e.getMessage());
        }
    }

    public static void inserirSistemaOperacional() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO SistemasOperacionais(nome, marca, modelo, anoLancamento, preco) VALUES (?, ?, ?, ?, ?)")) {

            SistemasOperacionais sistemaOperacional = new SistemasOperacionais();
            stmt.setString(1, sistemaOperacional.nome);
            stmt.setString(2, SistemasOperacionais.marca);
            stmt.setString(3, SistemasOperacionais.modelo);
            stmt.setString(4, SistemasOperacionais.anoLancamento);
            stmt.setString(5, SistemasOperacionais.preco);
            stmt.executeUpdate();

            out.println("\033[H\033[2J");
            out.println("Sistema Operacional cadastrado com sucesso.");

        } catch (SQLException e) {
            SistemasOperacionais sistemaOperacional = new SistemasOperacionais();
            out.printf("Erro ao inserir dados na tabela '%s'.", sistemaOperacional.getSistemasOperacionais(),
                    e.getMessage());
        }
    }

    public static void inserirComputador() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO Computadores(nome, marca, modelo, processador, sistemaOperacional, preco) VALUES (?, ?, ?, ?, ?, ?)")) {

            Processadores processador = new Processadores();
            SistemasOperacionais sistemaOperacional = new SistemasOperacionais();
            stmt.setString(1, Computadores.nome);
            stmt.setString(2, Computadores.marca);
            stmt.setString(3, Computadores.modelo);
            stmt.setString(4, processador.modelo);
            stmt.setString(5, sistemaOperacional.nome);
            stmt.setString(6, Computadores.preco);
            stmt.executeUpdate();

            out.println("\033[H\033[2J");
            out.println("Computador cadastrado com sucesso.");

        } catch (SQLException e) {
            out.printf("Erro ao inserir dados na tabela '%s'.", Computadores.getComputadores(), e.getMessage());
        }
    }

    // Criar um método para listar os processadores
    public static void listarProcessadores() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Processadores");
                ResultSet resultados = stmt.executeQuery()) {

            if (!resultados.next()) {
                out.println("Não há processadores cadastrados.");
            } else {
                // Existem registros na tabela, você pode processá-los aqui
                do {
                    int id = resultados.getInt("id");
                    String nome = resultados.getString("nome");
                    String marca = resultados.getString("marca");
                    String modelo = resultados.getString("modelo");
                    String socket = resultados.getString("socket");
                    String frequencia = resultados.getString("frequencia");
                    String cores = resultados.getString("cores");
                    String threads = resultados.getString("threads");
                    String TDP = resultados.getString("TDP");
                    String preco = resultados.getString("preco");

                    // Faça o que precisa com os dados aqui
                    out.print("ID: " + id + " ");
                    out.print("Nome: " + nome + " ");
                    out.print("Marca: " + marca + " ");
                    out.print("Modelo: " + modelo + " ");
                    out.print("Socket: " + socket + " ");
                    out.print("Frequência: " + frequencia + " ");
                    out.print("Cores: " + cores + " ");
                    out.print("Threads: " + threads + " ");
                    out.print("TDP: " + TDP + " ");
                    out.print("Preço: " + preco + " ");
                    out.println();
                } while (resultados.next());
            }
        } catch (

        SQLException e) {
            Processadores processador = new Processadores();
            out.printf("Erro ao listar dados da tabela '%s'.\n", processador.getProcessadores(), e.getMessage());
        }
    }

    // Criar um método para listar os sistemas operacionais
    public static void listarSistemasOperacionais() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM SistemasOperacionais");
                ResultSet resultados = stmt.executeQuery()) {

            if (!resultados.next()) {
                out.println("Não há sistemas operacionais cadastrados.");
            } else {
                // Existem registros na tabela, você pode processá-los aqui
                do {
                    int id = resultados.getInt("id");
                    String nome = resultados.getString("nome");
                    String marca = resultados.getString("marca");
                    String modelo = resultados.getString("modelo");
                    String anoLancamento = resultados.getString("anoLancamento");
                    String preco = resultados.getString("preco");

                    // Faça o que precisa com os dados aqui
                    out.println("ID: " + id);
                    out.println("Nome: " + nome);
                    out.println("Marca: " + marca);
                    out.println("Modelo: " + modelo);
                    out.println("Ano de lançamento: " + anoLancamento);
                    out.println("Preço: " + preco);
                    out.println();

                } while (resultados.next());
            }

        }

        catch (SQLException e) {
            SistemasOperacionais sistemaOperacional = new SistemasOperacionais();
            out.printf("Erro ao listar dados da tabela '%s'.\n", sistemaOperacional.getSistemasOperacionais(),
                    e.getMessage());
        }
    }

    // Criar um método para listar os computadores
    public static void listarComputadores() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Computadores");
                ResultSet resultados = stmt.executeQuery()) {

            if (!resultados.next()) {
                out.println("Não há computadores cadastrados.");
            } else {
                // Existem registros na tabela, você pode processá-los aqui
                do {
                    int id = resultados.getInt("id");
                    String nome = resultados.getString("nome");
                    String marca = resultados.getString("marca");
                    String modelo = resultados.getString("modelo");
                    String processador = resultados.getString("processador");
                    String sistemaOperacional = resultados.getString("sistemaOperacional");
                    String preco = resultados.getString("preco");

                    // Faça o que precisa com os dados aqui
                    out.println("ID: " + id);
                    out.println("Nome: " + nome);
                    out.println("Marca: " + marca);
                    out.println("Modelo: " + modelo);
                    out.println("Processador: " + processador);
                    out.println("Sistema Operacional: " + sistemaOperacional);
                    out.println("Preço: " + preco);
                    out.println();

                } while (resultados.next());
            }

        } catch (

        SQLException e) {
            out.printf("Erro ao listar dados da tabela '%s'.\n", Computadores.getComputadores(), e.getMessage());
        }
    }
}