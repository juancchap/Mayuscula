package mayuscula;

import javax.swing.JOptionPane;

public class Mayuscula {

    public static void main(String[] args) {
        //declaracion de variable
        char letra;
        //le pedimos al usuario que nos diguite una letra
        letra = JOptionPane.showInputDialog("Digita una letra").charAt(0);
        //EN caso de que sea maysucula
        if (Character.isUpperCase(letra)) 
        {
            JOptionPane.showMessageDialog(null, "La letra es Mayuscula: ");
        } 
        else 
            // CASO DE QUE SEA MINUSCULA
        {
            JOptionPane.showMessageDialog(null,"La letra no es  Minuscula: ");
        }
        
        
    }

}
