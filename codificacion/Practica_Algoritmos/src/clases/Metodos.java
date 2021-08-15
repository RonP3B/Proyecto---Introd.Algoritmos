package clases;

//Importaciones
import java.util.Random;
import javax.swing.JOptionPane;

public class Metodos {

    //variable global
    public int variableGlobal = 0;
    
    //Instancia de la clase Prevencion
    Prevencion objPrev = new Prevencion();
    
    //Función para capturar un número entero y guardarlo en "variableGlobal"
    public void capturarValor() {
        variableGlobal = objPrev.capturarSoloEntero("Ingresa un número entero:");
    }

    public String ProcedimientoTablaMultiplicar(int num) {
        //Declaración e inicialización de variables
        String tabla = "";

        //Creación de la "tabla de multiplicar"
        for (int i = 1; i <= 12; i++) {
            tabla += num + " x " + i + " = " + (num * i) + "<br>";
        }

        return "<html>" + tabla + "</html>";
    }

    public String ProcedimientoMostrarEvaluacionPrimo(int num) {
        //Declaración e inicialización de variables
        boolean esPrimo = true;

        //Si el valor recibido por parametro es menor a 2 no puede ser primo 
        if (num < 2) {
            esPrimo = false;
        } else {
            //Obtención de la raiz cuadrada exacta del valor recibido por parametro
            int raizCuadrada = (int) Math.sqrt(num);

            //Verificación de los divisores
            for (int i = raizCuadrada; i >= 2; i--) {
                //Si la condición se cumple, el número no es primo y finaliza el ciclo
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        //Si es primo se retorna la respuesta que lo afirma y finaliza la función
        if (esPrimo) {
            return "El número " + num + " es primo";
        }
        
        return "El número " + num + " no es primo";
    }

    public String ProcedimientoDiagonalesMatriz() {
        //Declaración e inicialización de variables
        int[][] matriz = new int[4][4];
        int fila = 0, columna = 0;
        String diagPrincipal = "Valores de la diagonal principal:<br>",
                matrizStr = "", diagSecundaria = "Valores de la diagonal secundaria:<br>";

        //Petición al usuario de como desea que los valores de la matriz se generen
        Object opcionElegida = JOptionPane.showInputDialog(
                null,
                "¿Cómo desea generar los valores de la matriz?",
                "Generación de los valores de la matriz",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Aleatoriamente", "Manualmente"},
                "Aleatoriamente");

        /* Si el usuario no eligió ninguna opción en la petición, entonces
         opcionElegida será igual a null, si ese es el caso retornamos null
         para finalizar la función 
         */
        if (opcionElegida == null) {
            return null;
        }

        //Generación de los valores de la matriz
        if (opcionElegida.equals("Aleatoriamente")) {
            //Objeto de la clase Random
            Random numAletorio = new Random();

            //Llenado de la matriz con valores aleatorios
            for (fila = 0; fila < 4; fila++) {
                for (columna = 0; columna < 4; columna++) {
                    //Generación de número aleatorio del 1 al 100 
                    matriz[fila][columna] = numAletorio.nextInt(99) + 1;

                    //capturación del valor de la posición actual
                    matrizStr += "[" + matriz[fila][columna] + "] ";
                }
                //Salto de linea para representar la siguiente fila de la matriz
                matrizStr += "<br>";
            }
        } else {
            //Llenado la matriz con valores ingresados por el usuario
            for (fila = 0; fila < 4; fila++) {
                for (columna = 0; columna < 4; columna++) {
                    //Petición e ingresado del valor
                    matriz[fila][columna] = objPrev.capturarSoloEntero("Ingresa el valor perteneciente a la fila#" + (fila + 1)
                            + " en la columna#" + (columna + 1));

                    //capturación del valor de la posición actual
                    matrizStr += "[" + matriz[fila][columna] + "] ";
                }
                //Salto de linea para representar la siguiente fila de la matriz
                matrizStr += "<br>";
            }
        }

        //Reajuste de apuntadores
        fila = 0;
        columna = 0;

        //Capturacion de los valores de la diagonal principal
        while (fila < 4) {
            diagPrincipal += "[" + matriz[fila++][columna++] + "]";
        }

        //Reajuste de apuntadores
        fila = 0;
        columna = 3;
        
        //Capturacion de los valores de la diagonal secundaria
        while (fila < 4) {
            diagSecundaria += "[" + matriz[fila++][columna--] + "]";
        }
        
        return "<html>" + matrizStr + "<br>" + diagPrincipal + "<br>" + diagSecundaria + "</html>";
    }
}
