
import java.awt.Color;
import javax.swing.JOptionPane;

public class ControlUsuarios extends javax.swing.JFrame {
    public static final String driver="com.mysql.jdbc.Driver";
    public static final String user="root";
    public static final String pass=("");
    public static final String url=("jdbc:mysql://localhost:3306/proyecto-bd");

    public ControlUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#66ffcc"));
        jPanel1.setBackground(Color.decode("#66ffcc"));
        this.setTitle("Inicio / Control de tutorias");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jpassContrasea = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Porfavor, Ingrese como usuario autorizado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnIngresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5)))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpassContrasea)
                    .addComponent(txtUsuario)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassContrasea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addComponent(btnIngresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       //Es la variable donde se almacena la clave del usuario
        char clave[]=jpassContrasea.getPassword();
        
        String clavedef=new String(clave);
        
       //Es el control de acceso, donde si usuario y contraseña coinciden con lo escrito se abrira el inicio
        if(txtUsuario.getText().equals("Tutor") && clavedef.equals("tutorias123")) { 
            this.dispose();
            JOptionPane.showMessageDialog(null,"Bienvenido\n  "+"Has Ingresado satisfactoriamente al sistema  "+ "  Mensaje de bienvenida  "+JOptionPane.INFORMATION_MESSAGE);
            
            Inicio formformulario1 = new Inicio();
            formformulario1.setVisible(true);
        }
        else if(txtUsuario.getText().equals("alumno") && clavedef.equals("alumno123")) { 
            this.dispose();
            JOptionPane.showMessageDialog(null,"Bienvenido\n  "+"Has Ingresado satisfactoriamente al sistema  "+ "  Mensaje de bienvenida  "+JOptionPane.INFORMATION_MESSAGE);
            
            inicioUsuario formformulario1 = new inicioUsuario();
            formformulario1.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"+"Porfavor ingrese un usuario y/o contraseña correctos  "+"  Acceso denegado "+JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlUsuarios().setVisible(true);
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpassContrasea;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
