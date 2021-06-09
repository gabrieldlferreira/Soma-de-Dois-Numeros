import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {

        String primeiroNumero;
        String segundoNumero;
        int n1, n2, soma;

        primeiroNumero = JOptionPane.showInputDialog("Infome o 1º numero");
        segundoNumero = JOptionPane.showInputDialog("Infome o 2º numero");

        n1 = Integer.parseInt(primeiroNumero);
        n2 = Integer.parseInt(segundoNumero);

        soma = n1+n2;
        JOptionPane.showMessageDialog(null, "O resultado é " + soma);
    }

}
