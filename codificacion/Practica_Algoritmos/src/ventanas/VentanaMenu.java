package ventanas;

//Importaciones
import clases.Metodos;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaMenu extends javax.swing.JFrame {
    //Objeto de la clase Metodos
    Metodos objMetodos = new Metodos();

    //Constructor
    public VentanaMenu() {
        //Llamado del metodo donde se inicializaron y estilizaron los componentes
        initComponents();

        //Obtención de la imagen
        ImageIcon fondo = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));

        //Adaptación del tamaño de la imagen al mismo tamaño de la etiqueta
        Icon fondoIcon = new ImageIcon(fondo.getImage().getScaledInstance(
                Label_Fondo.getWidth(),
                Label_Fondo.getHeight(),
                Image.SCALE_SMOOTH
        ));

        //Colocación de la imagen adaptada en la etiqueta
        Label_Fondo.setIcon(fondoIcon);

        //Colocación del valor inicial de la casilla
        Label_NumCasilla.setText(Integer.toString(objMetodos.variableGlobal));
    }

    //Sobreescribir el metodo que permite cambiar el icono de la ventana
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logoITLA.png"));
        return retValue;
    }

    //Metodo para inicializar componentes que será llamado en el contructor de la clase
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Label_Titulo = new javax.swing.JLabel();
        Label_TituloCasilla = new javax.swing.JLabel();
        Btn_CapturarValor = new javax.swing.JButton();
        Btn_Tabla = new javax.swing.JButton();
        Btn_Primo = new javax.swing.JButton();
        Btn_Matriz = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Panel_Casilla = new javax.swing.JPanel();
        Label_NumCasilla = new javax.swing.JLabel();
        jLabel_linea = new javax.swing.JLabel();
        Label_Fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica_Algoritmos - Grupo#2");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        Label_Titulo.setForeground(new java.awt.Color(88, 48, 135));
        Label_Titulo.setText("Menú Principal");
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        Label_TituloCasilla.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Label_TituloCasilla.setForeground(new java.awt.Color(88, 48, 135));
        Label_TituloCasilla.setText("Número Capturado:");
        getContentPane().add(Label_TituloCasilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Btn_CapturarValor.setBackground(new java.awt.Color(52, 112, 90));
        Btn_CapturarValor.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Btn_CapturarValor.setForeground(new java.awt.Color(88, 48, 135));
        Btn_CapturarValor.setText(" 1 - Capturar Valor");
        Btn_CapturarValor.setBorder(null);
        Btn_CapturarValor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_CapturarValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_CapturarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CapturarValorActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_CapturarValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 320, 35));

        Btn_Tabla.setBackground(new java.awt.Color(52, 112, 90));
        Btn_Tabla.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Btn_Tabla.setForeground(new java.awt.Color(88, 48, 135));
        Btn_Tabla.setText(" 2 - Generar Tabla de Multiplicar");
        Btn_Tabla.setBorder(null);
        Btn_Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Tabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TablaActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, 35));

        Btn_Primo.setBackground(new java.awt.Color(52, 112, 90));
        Btn_Primo.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Btn_Primo.setForeground(new java.awt.Color(88, 48, 135));
        Btn_Primo.setText(" 3 - Determinar Si es Primo o No Primo");
        Btn_Primo.setBorder(null);
        Btn_Primo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Primo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Primo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PrimoActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Primo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 320, 35));

        Btn_Matriz.setBackground(new java.awt.Color(52, 112, 90));
        Btn_Matriz.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Btn_Matriz.setForeground(new java.awt.Color(88, 48, 135));
        Btn_Matriz.setText(" 4 - Generar Matriz 4x4");
        Btn_Matriz.setBorder(null);
        Btn_Matriz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Matriz.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MatrizActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Matriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 320, 35));

        Btn_Salir.setBackground(new java.awt.Color(52, 112, 90));
        Btn_Salir.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Btn_Salir.setForeground(new java.awt.Color(88, 48, 135));
        Btn_Salir.setText(" 5 - Salir del Programa");
        Btn_Salir.setBorder(null);
        Btn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 320, 35));

        Panel_Casilla.setBackground(new java.awt.Color(52, 133, 108));
        Panel_Casilla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Label_NumCasilla.setBackground(new java.awt.Color(255, 255, 255));
        Label_NumCasilla.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Label_NumCasilla.setForeground(new java.awt.Color(88, 48, 135));
        Label_NumCasilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Panel_CasillaLayout = new javax.swing.GroupLayout(Panel_Casilla);
        Panel_Casilla.setLayout(Panel_CasillaLayout);
        Panel_CasillaLayout.setHorizontalGroup(
            Panel_CasillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CasillaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_NumCasilla, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_CasillaLayout.setVerticalGroup(
            Panel_CasillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_NumCasilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(Panel_Casilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel_linea.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel_linea.setForeground(new java.awt.Color(88, 48, 135));
        jLabel_linea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_linea.setText("___________");
        jLabel_linea.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel_linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 58, -1, 10));
        getContentPane().add(Label_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Evento que captura un valor entero y lo guarda en la casilla
    private void Btn_CapturarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CapturarValorActionPerformed
        //Metodo para capturar un valor
        objMetodos.capturarValor();

        //Colocación del valor de la variableGlobal de la clase Metodos en la casilla
        Label_NumCasilla.setText(Integer.toString(objMetodos.variableGlobal));

        //Creacion del mensaje que aparecerá en la ventana
        String msj = "Usted ha ingresado el número " + objMetodos.variableGlobal;

        //Creación de un objeto de la clase VentanaCapturado_Primo
        VentanaCapturado_Primo objVCP = new VentanaCapturado_Primo(this, true, msj, "Número capturado");

        //Metodo para que aparezca la ventana de dicha clase
        objVCP.setVisible(true);
    }//GEN-LAST:event_Btn_CapturarValorActionPerformed

    //Evento que genera una ventana con la tabla de multiplicar del número capturado
    private void Btn_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TablaActionPerformed
        //Obtención de la tabla de multiplicar del valor de la variableGlobal de la clase Metodos
        String tabla = objMetodos.ProcedimientoTablaMultiplicar(objMetodos.variableGlobal);

        //Creación de un objeto de la clase VentanaTable
        VentanaTabla objVT = new VentanaTabla(this, true, tabla);

        //Metodo para que aparezca la ventana de dicha clase
        objVT.setVisible(true);
    }//GEN-LAST:event_Btn_TablaActionPerformed

    //Evento que genera una ventana que dice si el número capturado es primo o no
    private void Btn_PrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PrimoActionPerformed
        //Obtención de la evaluacion primo del valor de la variableGlobal de la clase Metodos
        String esPrimo = objMetodos.ProcedimientoMostrarEvaluacionPrimo(objMetodos.variableGlobal);
        
        //Creación de un objeto de la clase VentanaCapturado_Primo
        VentanaCapturado_Primo objVCP = new VentanaCapturado_Primo(this, true, esPrimo, "Comprobación primo");
        
        //Metodo para que aparezca la ventana de dicha clase
        objVCP.setVisible(true);
    }//GEN-LAST:event_Btn_PrimoActionPerformed

    //Evento que genera una ventana con una matriz 4x4 con su diagonales principal y secundaria
    private void Btn_MatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MatrizActionPerformed
        //Obtención de la matriz y los valores de sus diagonales
        String matrizGenerada = objMetodos.ProcedimientoDiagonalesMatriz();
        
        /*Si matrizGenerada es diferente de null se mostrará la ventana con la matriz 
        y sus diagonales, si el usuario no eligió ninguna opcion en la petición de como
        se generarían los valores(presiono cancelar) matrizGenerada sera igual a null y no 
        se mostrará nada.
        */
        if (matrizGenerada != null) {
            VentanaMatriz objVM = new VentanaMatriz(this, true, matrizGenerada);
            objVM.setVisible(true);
        }
    }//GEN-LAST:event_Btn_MatrizActionPerformed

    //Evento para finalizar el programa si el usuario asi lo desea
    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        //Peticion al usuario sobre si desea finalizar el programa
        int opcionElegida = JOptionPane.showConfirmDialog(
                null,
                "¿Estas seguro que deseas finalizar el programa?",
                "Aviso", JOptionPane.YES_NO_CANCEL_OPTION
        );

        /*Si el usuario eligio que si desea finalizar el programa, opcionElegida será
        igual a 0, si es así entra a la condición, se le mostrará una ventana con el mensaje
        Fin del Programa, luego de cerrar dicha ventana el programa finalizará
         */
        if (opcionElegida == 0) {
            //Creación de un objeto de la clase VentanaCapturado_Primo
            VentanaCapturado_Primo objVCP = new VentanaCapturado_Primo(
                    this, true, "Fin del Programa.", "Mensaje"
            );
            
            //Metodo para mostrar la ventana de dicha clase
            objVCP.setVisible(true);
            
            //Metodo para cerrar la ventana
            System.exit(0);
        }
    }//GEN-LAST:event_Btn_SalirActionPerformed

    //Metodo main de la clase
    public static void main(String args[]) {
        //Colocacion del look and feel (Apariencia de la ventana y sus componentes)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Crea y muestra el formulario
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CapturarValor;
    private javax.swing.JButton Btn_Matriz;
    private javax.swing.JButton Btn_Primo;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JButton Btn_Tabla;
    private javax.swing.JLabel Label_Fondo;
    private javax.swing.JLabel Label_NumCasilla;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JLabel Label_TituloCasilla;
    private javax.swing.JPanel Panel_Casilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_linea;
    // End of variables declaration//GEN-END:variables
}
