package JAVA1;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Daniel {

    public static void main(String[] args) { // método - main é palavra reservada
        JFrame janela = new JFrame();
        JLabel ronaldo = new JLabel();
        janela.setSize(500, 500);
        janela.setVisible(true);
        janela.setTitle("Ronaldo");
        ronaldo.setText("Jhalin Habbei");
        janela.add(ronaldo);
        ronaldo.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

