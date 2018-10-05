/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;


public class Simulacion extends javax.swing.JFrame {

    
    public Simulacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        campo_rut = new javax.swing.JTextField();
        botonsimular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campo_paterno = new javax.swing.JTextField();
        campo_materno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        combotelefono = new javax.swing.JComboBox<>();
        campo_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboregion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        combocomuna = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campovalorpropiedad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        campoaportecontado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campomontodelfinanciamiento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        campoporcentajedelfinanciamiento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        comboplazo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        combotasa = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        combotipodepropiedad = new javax.swing.JComboBox<>();
        labelestado = new javax.swing.JLabel();
        comboestadodepropiedad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simula tu crédito Hipotecario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campo_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_rutActionPerformed(evt);
            }
        });
        getContentPane().add(campo_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 242, -1));

        botonsimular.setText("Simular");
        botonsimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsimularActionPerformed(evt);
            }
        });
        getContentPane().add(botonsimular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, 299, 50));

        jLabel1.setText("Datos de Contacto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, 60));

        jLabel2.setText("RUT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 82, 20));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 82, -1));

        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(campo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 242, -1));

        jLabel4.setText("Apellido Parterno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel5.setText("Apellido Materno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));
        getContentPane().add(campo_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 240, -1));
        getContentPane().add(campo_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 236, -1));

        jLabel6.setText("E-mail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 102, -1));
        getContentPane().add(campo_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 238, -1));

        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        combotelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "02", "05", "06", "07", "08", "09", "32", "33", "34", "35", "41", "42", "43", "45", "51", "52", "53", "55", "57", "58", "61", "63", "64", "65", "67", "71", "72", "73", "75" }));
        combotelefono.setSelectedIndex(1);
        getContentPane().add(combotelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 41, -1));

        campo_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(campo_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 236, -1));

        jLabel8.setText("Región");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        comboregion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboregion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboregionActionPerformed(evt);
            }
        });
        getContentPane().add(comboregion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 287, -1));

        jLabel9.setText("Comuna");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        combocomuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combocomuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocomunaActionPerformed(evt);
            }
        });
        getContentPane().add(combocomuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 287, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 867, 10));

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 730, -1, -1));

        jLabel11.setText("Datos de la vivienda");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));
        getContentPane().add(campovalorpropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 280, 20));

        jLabel12.setText("Valor Propiedad (UF)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 110, -1));

        jLabel13.setText("Aporte Contado o Pie (UF)");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 130, -1));
        getContentPane().add(campoaportecontado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 280, -1));

        jLabel14.setText("Monto del Financiamiento (UF)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));
        getContentPane().add(campomontodelfinanciamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 280, -1));

        jLabel15.setText("Porcentaje de Financiamiento (%)");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));
        getContentPane().add(campoporcentajedelfinanciamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 280, -1));

        jLabel16.setText("Plazo del Crédito (Años)");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        comboplazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(comboplazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        jLabel17.setText("Tasa");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        combotasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tasa Fija", "Tasa Mixta" }));
        getContentPane().add(combotasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 120, -1));

        jLabel18.setText("Tipo de propiedad");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, -1));

        combotipodepropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Departamento" }));
        getContentPane().add(combotipodepropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 120, -1));

        labelestado.setText("Estado de Propiedad");
        getContentPane().add(labelestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, -1, -1));

        comboestadodepropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nueva", "Usada" }));
        getContentPane().add(comboestadodepropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonsimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsimularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonsimularActionPerformed

    private void campo_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_rutActionPerformed

    private void campo_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_telefonoActionPerformed

    private void comboregionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboregionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboregionActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void combocomunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocomunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocomunaActionPerformed

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
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonsimular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_materno;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_paterno;
    private javax.swing.JTextField campo_rut;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JTextField campoaportecontado;
    private javax.swing.JTextField campomontodelfinanciamiento;
    private javax.swing.JTextField campoporcentajedelfinanciamiento;
    private javax.swing.JTextField campovalorpropiedad;
    private javax.swing.JComboBox<String> combocomuna;
    private javax.swing.JComboBox<String> comboestadodepropiedad;
    private javax.swing.JComboBox<String> comboplazo;
    private javax.swing.JComboBox<String> comboregion;
    private javax.swing.JComboBox<String> combotasa;
    private javax.swing.JComboBox<String> combotelefono;
    private javax.swing.JComboBox<String> combotipodepropiedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelestado;
    // End of variables declaration//GEN-END:variables
}
