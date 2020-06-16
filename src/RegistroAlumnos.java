
import java.awt.Color;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class RegistroAlumnos extends javax.swing.JFrame {
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass=("");
    private static final String url=("jdbc:mysql://localhost:3306/proyecto-bd");


    public RegistroAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#00bfff"));
        this.setTitle("Control de tutorias");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        grupoEstadoCivil = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEdadA = new javax.swing.JTextField();
        txtNombreA = new javax.swing.JTextField();
        chkMasculino = new javax.swing.JCheckBox();
        chkFemenino = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboDias = new javax.swing.JComboBox();
        comboMeses = new javax.swing.JComboBox();
        comboAnios = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chkSoltero = new javax.swing.JCheckBox();
        chkCasado = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtlista = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcontrolEscolar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setText("Registro de alumnos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del alumno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Edad:");

        grupoSexo.add(chkMasculino);
        chkMasculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkMasculino.setText("Masculino");

        grupoSexo.add(chkFemenino);
        chkFemenino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkFemenino.setText("Femenino");
        chkFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFemeninoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento:");

        comboDias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboDias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboMeses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboMeses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre ", "Octubre", "Noviembre", "Diciembre" }));
        comboMeses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMesesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboMesesMousePressed(evt);
            }
        });
        comboMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesesActionPerformed(evt);
            }
        });

        comboAnios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboAnios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        comboAnios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAniosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Dirección:");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtColonia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Colonia:");

        txtCodigoPostal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPostalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Codigo Postal:");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Telefono:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("EMAIL:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Estado Civil:");

        grupoEstadoCivil.add(chkSoltero);
        chkSoltero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSoltero.setText("Soltero/a");
        chkSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSolteroActionPerformed(evt);
            }
        });

        grupoEstadoCivil.add(chkCasado);
        chkCasado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkCasado.setText("Casado/a");
        chkCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCasadoActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar Alumno");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("No. de lista:");

        txtlista.setText(" ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("NO. Control Escolar:");

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setText("cambiar de usuario");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201)
                                .addComponent(jLabel11)
                                .addGap(27, 27, 27)
                                .addComponent(chkSoltero)
                                .addGap(18, 18, 18)
                                .addComponent(chkCasado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(46, 46, 46)
                                        .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboAnios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkMasculino))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEdadA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkFemenino)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcontrolEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtlista, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtEdadA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtcontrolEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAnios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMasculino)
                    .addComponent(chkFemenino)
                    .addComponent(jLabel4)
                    .addComponent(comboDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(chkSoltero)
                    .addComponent(chkCasado))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(jLabel12)
                    .addComponent(txtlista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkFemeninoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColoniaActionPerformed

    private void txtCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPostalActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void chkCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCasadoActionPerformed

    private void chkSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSolteroActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      String mensaje = "";
      String mensaje2="";
        if(chkMasculino.isSelected()){
            mensaje="masculino";
        }else if(chkFemenino.isSelected()){
            mensaje="Femenino";
        
        
        }
        if(chkSoltero.isSelected()) {
            mensaje2="casado";
        }
        else{
            mensaje2="soltero";
        }
        try {
        //Conexion a la base de datos
        Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
        //query a ejecutar
        PreparedStatement pps = conn.prepareStatement("insert into alumnos (noDeLista, nombre, edad, nacimiento, sexo,direccion,colonia,cp,edoCivil,telefono,email,controlEscolar) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        //remplazo de variables y metodos getters 
        pps.setString(1,txtlista.getText().trim());
        pps.setString(2,txtNombreA.getText().trim());
        pps.setString(3,txtEdadA.getText().trim());
        pps.setString(4,comboDias.getSelectedItem()+"/"+comboMeses.getSelectedItem()+"/"+comboAnios.getSelectedItem().toString());
        pps.setString(5,mensaje);
        pps.setString(6,txtDireccion.getText().trim());
        pps.setString(7,txtColonia.getText().trim());
        pps.setString(8,txtCodigoPostal.getText().trim());
        pps.setString(9,mensaje2);
        pps.setString(10,txtTelefono.getText().trim());
        pps.setString(11,txtEmail.getText().trim());
        pps.setString(12,txtcontrolEscolar.getText().trim());
        pps.executeUpdate();
        //borrado de los datos
        txtlista.setText(" ");
        txtNombreA.setText("");
        txtEdadA.setText("");
        txtDireccion.setText("");
        txtColonia.setText("");
        txtCodigoPostal.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtcontrolEscolar.setText("");
       
        JOptionPane.showMessageDialog(null,"datos registrados en la base de datos");
    } catch (java.sql.SQLException ex) {
JOptionPane.showMessageDialog(null, "Datos incorrectos/Faltantes:\n"+ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void comboMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesesActionPerformed
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        if(comboMeses.getSelectedItem().equals("Enero")){
        for(int n=1;n!=32;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Febrero")){
            for(int n=1;n!=30;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Marzo")){
            for(int n=1;n!=32;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Abril")){
            for(int n=1;n!=31;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Mayo")){
            for(int n=1;n!=32;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Junio")){
            for(int n=1;n!=31;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Julio")){
            for(int n=1;n!=32;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Agosto")){
            for(int n=1;n!=32;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Septiembre")){
            for(int n=1;n!=31;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Octubre")){
            for(int n=1;n!=32;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Noviembre")){
            for(int n=1;n!=31;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }else if(comboMeses.getSelectedItem().equals("Diciembre")){
            for(int n=1;n!=32;n++){
            modelo.addElement(""+n);
            }
        comboDias.setModel(modelo);
        }
    }//GEN-LAST:event_comboMesesActionPerformed

    private void comboMesesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMesesMousePressed
        
    }//GEN-LAST:event_comboMesesMousePressed

    private void comboMesesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMesesMouseClicked

    }//GEN-LAST:event_comboMesesMouseClicked

    private void comboAniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAniosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAniosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ControlUsuarios nF=new ControlUsuarios();
        nF.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // TODO add your handling code here:
       Inicio nF=new Inicio();
        nF.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
String mensaje = "";
      String mensaje2="";
        if(chkMasculino.isSelected()){
            mensaje="masculino";
        }else if(chkFemenino.isSelected()){
            mensaje="Femenino";
        
        
        }
        if(chkSoltero.isSelected()) {
            mensaje2="casado";
        }
        else{
            mensaje2="soltero";
        }
        try {
        //Conexion a la base de datos
        Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
        //query a ejecutar
        PreparedStatement pps = conn.prepareStatement("update alumnos set nombre = ?, edad = ?, nacimiento = ?, sexo = ?,direccion = ?,colonia = ?,cp = ?,edoCivil = ?,telefono = ?,email = ?,controlEscolar = ? where noDeLista = "+txtlista.getText().trim());
        //remplazo de variables y metodos getters 
        
        pps.setString(1,txtNombreA.getText().trim());
        pps.setString(2,txtEdadA.getText().trim());
        pps.setString(3,comboDias.getSelectedItem()+"/"+comboMeses.getSelectedItem()+"/"+comboAnios.getSelectedItem().toString());
        pps.setString(4,mensaje);
        pps.setString(5,txtDireccion.getText().trim());
        pps.setString(6,txtColonia.getText().trim());
        pps.setString(7,txtCodigoPostal.getText().trim());
        pps.setString(8,mensaje2);
        pps.setString(9,txtTelefono.getText().trim());
        pps.setString(10,txtEmail.getText().trim());
        pps.setString(11,txtcontrolEscolar.getText().trim());
        pps.executeUpdate();
        //borrado de los datos
        txtlista.setText(" ");
        txtNombreA.setText("");
        txtEdadA.setText("");
        txtDireccion.setText("");
        txtColonia.setText("");
        txtCodigoPostal.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtcontrolEscolar.setText("");
       
        JOptionPane.showMessageDialog(null,"datos modificados exitosamente");
    } catch (java.sql.SQLException ex) {
JOptionPane.showMessageDialog(null, "La modificacion fallo; Datos incorrectos/Faltantes:\n"+ex);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new RegistroAlumnos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chkCasado;
    private javax.swing.JCheckBox chkFemenino;
    private javax.swing.JCheckBox chkMasculino;
    private javax.swing.JCheckBox chkSoltero;
    private javax.swing.JComboBox comboAnios;
    private javax.swing.JComboBox comboDias;
    private javax.swing.JComboBox comboMeses;
    private javax.swing.ButtonGroup grupoEstadoCivil;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdadA;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreA;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcontrolEscolar;
    private javax.swing.JTextField txtlista;
    // End of variables declaration//GEN-END:variables
}
