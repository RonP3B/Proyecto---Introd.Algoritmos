package ventanas;

//Importaciones
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class VentanaTabla extends javax.swing.JDialog {
    
    //Parametros que recibe el constructor
    /**
     * Creates new form VentanaCapturado_Primo
     * @param parent
     * @param modal
     * @param contenido
     */
    //Constructor de la clase
    public VentanaTabla(java.awt.Frame parent, boolean modal, String contenido) {
        super(parent, modal);
        
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
        
        //Colocación del contenido
        Label_Tabla.setText(contenido);
    }

    //Metodo para inicializar componentes que será llamado en el contructor de la clase
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        Label_Tabla = new javax.swing.JLabel();
        Btn_CapturarValor = new javax.swing.JButton();
        Label_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabla de Multiplicar");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        Label_Titulo.setForeground(new java.awt.Color(88, 48, 135));
        Label_Titulo.setText("Tabla de Multiplicar");
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Label_Tabla.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Label_Tabla.setForeground(new java.awt.Color(88, 48, 135));
        Label_Tabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Tabla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Label_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 340, -1));

        Btn_CapturarValor.setBackground(new java.awt.Color(52, 112, 90));
        Btn_CapturarValor.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Btn_CapturarValor.setForeground(new java.awt.Color(88, 48, 135));
        Btn_CapturarValor.setText(" Volver al menú principal");
        Btn_CapturarValor.setBorder(null);
        Btn_CapturarValor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_CapturarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CapturarValorActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_CapturarValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 320, 35));
        getContentPane().add(Label_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    //Evento que cierra esta ventana
    private void Btn_CapturarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CapturarValorActionPerformed
        //Metodo para cerrar la ventana sin finalizar el programa
        dispose();
    }//GEN-LAST:event_Btn_CapturarValorActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Crea y muestra el formulario
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaTabla dialog = new VentanaTabla(new javax.swing.JFrame(), true, "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CapturarValor;
    private javax.swing.JLabel Label_Fondo;
    private javax.swing.JLabel Label_Tabla;
    private javax.swing.JLabel Label_Titulo;
    // End of variables declaration//GEN-END:variables
}
