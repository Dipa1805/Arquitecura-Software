/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RegistrodeAlumnois;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author diego
 */
public class alumno extends javax.swing.JFrame {

  
   
    public alumno() {
        initComponents();
        this.setTitle("Registro de Alumnos");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jNombre = new javax.swing.JLabel();
        jFecha = new javax.swing.JLabel();
        jCodigo = new javax.swing.JLabel();
        jTelefono = new javax.swing.JLabel();
        jCarrera = new javax.swing.JLabel();
        jSemestre = new javax.swing.JLabel();
        jTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jComboBoxCarrera = new javax.swing.JComboBox<>();
        jComboBoxSemestre = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        Calendario = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo", "Fecha", "Telefono", "Carrera", "Semestre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistro);
        if (tblRegistro.getColumnModel().getColumnCount() > 0) {
            tblRegistro.getColumnModel().getColumn(0).setResizable(false);
            tblRegistro.getColumnModel().getColumn(1).setResizable(false);
            tblRegistro.getColumnModel().getColumn(2).setResizable(false);
            tblRegistro.getColumnModel().getColumn(3).setResizable(false);
            tblRegistro.getColumnModel().getColumn(4).setResizable(false);
            tblRegistro.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 720, 230));

        jNombre.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jNombre.setText("Nombre");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jFecha.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jFecha.setText("Fecha");
        getContentPane().add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jCodigo.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jCodigo.setText("Codigo ");
        getContentPane().add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jTelefono.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jTelefono.setText("Telefono");
        getContentPane().add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jCarrera.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jCarrera.setText(" Carrera ");
        getContentPane().add(jCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jSemestre.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jSemestre.setText("Semestre");
        getContentPane().add(jSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jTitulo.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jTitulo.setText("REGISTRO DE ALUMNOS");
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 160, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 160, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 160, -1));

        jComboBoxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería", "Ciencias de la Salud", "Derecho", "Educación", "Ciencias Económicas y Administrativas" }));
        getContentPane().add(jComboBoxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, -1));

        jComboBoxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1er Semestre", "2do Semestre", "3er Semestre", "4to Semestre", "5to Semestre", "6to Semestre", "7mo Semestre", "8vo Semestre", "9no Semestre", "10mo Semestre" }));
        getContentPane().add(jComboBoxSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 110, 30));

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, 30));
        getContentPane().add(Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 180, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Obtener los valores de los campos de texto y combo box
    String nombre = txtNombre.getText();

// Obtener la fecha desde JDateChooser
Date fechaSeleccionada = Calendario.getDate();
String fecha = "";  // Inicia la variable de fecha vacía
if (fechaSeleccionada != null) {
    // Convertir la fecha a String utilizando SimpleDateFormat
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // Formato de fecha
    fecha = sdf.format(fechaSeleccionada);
}

String codigoEstudiante = txtCodigo.getText();
String telefono = txtTelefono.getText();
String carrera = jComboBoxCarrera.getSelectedItem().toString();
String semestre = jComboBoxSemestre.getSelectedItem().toString();


    // Crear un nuevo objeto Registro con los datos ingresados
    Alumnos nuevoRegistro = new Alumnos(nombre, fecha, codigoEstudiante, carrera, semestre, telefono);

    // Agregar el nuevo registro a la tabla
    DefaultTableModel model = (DefaultTableModel) tblRegistro.getModel();
    model.addRow(new Object[]{codigoEstudiante, nombre, fecha, carrera, semestre, telefono});

    // Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Registro agregado con éxito");

    // Limpiar los campos de texto después de agregar
txtNombre.setText("");
Calendario.setDate(null);  
txtCodigo.setText("");
txtTelefono.setText("");
jComboBoxCarrera.setSelectedIndex(0);
jComboBoxSemestre.setSelectedIndex(0);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // Obtener la fila seleccionada
    int selectedRow = tblRegistro.getSelectedRow();

    if (selectedRow != -1) {
        // Eliminar la fila seleccionada del modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tblRegistro.getModel();
        model.removeRow(selectedRow);

        // Mostrar mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Registro borrado con éxito");
    } else {
        // Si no hay fila seleccionada, mostrar mensaje de error
        JOptionPane.showMessageDialog(this, "Por favor selecciona un registro para borrar.");
    }
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Calendario;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jCarrera;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JComboBox<String> jComboBoxCarrera;
    private javax.swing.JComboBox<String> jComboBoxSemestre;
    private javax.swing.JLabel jFecha;
    private javax.swing.JLabel jNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSemestre;
    private javax.swing.JLabel jTelefono;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
