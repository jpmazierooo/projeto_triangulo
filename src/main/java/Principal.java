import javax.swing.JOptionPane;

/**
 *     
 * @author João Pedro Maziero
 */
public class Principal {

    public static void main(String[] args) {
        //Variáveis
        double base, altura, area;
        //Entrada
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        area = (base * altura)/2.0;
        JOptionPane.showMessageDialog(null,"A área é " + area);
    }
}
