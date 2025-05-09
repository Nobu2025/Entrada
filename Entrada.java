import javax.swing.JOptionPane;
public class Entrada{
    public static void main (String[] args){
            String nombreUsuario = JOptionPane.showInputDialog("ingresa tu nombre");
             String apellidoUsuario = JOptionPane.showInputDialog("ingresa tu apellido");
            System.out.println("Tu nombre es: "+ nombreUsuario + " "+ apellidoUsuario);
            
            
    }
}
