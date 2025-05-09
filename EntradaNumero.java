import javax.swing.JOptionPane;
public class EntradaNumero{
    public static void main (String[] args){
            String numero1 = JOptionPane.showInputDialog("ingresa tu numero1");
             String numero2 = JOptionPane.showInputDialog("ingresa tu numero2");
             int numeroEntero1 = Integer.parseInt(numero1);
             int numeroEntero2 = Integer.parseInt(numero2);
            System.out.println(numeroEntero1 +numeroEntero2);
            
            
    }
}
