/* Estudo de Caso: Sistema de Cadastro para a Intel
Enunciado: você é um talentoso programador que trabalha na renomada empresa de tecnologia, a Intel. Como parte da equipe de desenvolvimento, você foi designado para criar um sistema de cadastro para processadores, sistemas operacionais e computadores. Esse sistema permitirá à Intel manter um registro organizado de seus produtos e melhorar a eficiência na gestão interna. */

public class Sistema {
    String proces;
    String sisOper;
    String computers;

    public cadastro (String proces, String sisOper, String computers) {
        this.proces = proces;
        this.sisOper = sisOper;
        this.computers = computers;
    }

    public void exibirInfo() {
        System.out.println("Processador: " + proces);
        System.out.println("Sistema operacional: " + sisOper);
        System.out.println("Computador: " + computers);
    }

    /* public String getTipoAnimal() {
        return "Animal";
    } 
    */
}

