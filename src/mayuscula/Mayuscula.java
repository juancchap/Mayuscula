package mayuscula;

import javax.swing.JOptionPane;

public class Mayuscula {

    public static void main(String[] args) {
        //declaracion de variable
        char letra;
        //le pedimos al usuario que nos diguite una letra
        letra = JOptionPane.showInputDialog("Digita una letra").charAt(0);
        
        if (Character.isUpperCase(letra)) 
        {

        } else 
        {

        }
    }

}
