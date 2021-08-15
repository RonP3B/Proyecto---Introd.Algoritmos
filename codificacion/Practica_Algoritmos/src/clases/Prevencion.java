package clases;

//Importaciones
import javax.swing.JOptionPane;

public class Prevencion {

    public int capturarSoloEntero(String msj) {
        //Declaración e inicialización de variables
        int valorIngresado = 0;
        boolean condicion = true;

        while (condicion) {
            try {
                valorIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, msj));
                condicion = false;
            } catch (NumberFormatException ex) {
                if (ex.getMessage().equals("null")) {
                    /*si el valor que se capturo es null, el usuario presionó
                    cancelar, por lo tanto terminamos el ciclo
                     */
                    condicion = false;
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Solo se pueden ingresar números enteros, intente de nuevo.",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        }

        return valorIngresado;
    }
}
