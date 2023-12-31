/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.GestorGenerico;
import controlador.GestorOperador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DatosContacto;
import modelo.OperadorMesaAyuda;
import modelo.Tecnico;

/**
 *
 * @author gonza
 */
public class OperadorVista extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form OperadorVista
     */
    public OperadorVista() {
        initComponents();
        listaOperador();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        japellido = new javax.swing.JTextField();
        jnombre = new javax.swing.JTextField();
        jcelular = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jtelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        restado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        toperador = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Nuevo Operador");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nombre");

        jLabel4.setText("Celular");

        jLabel5.setText("Telefono");

        jLabel6.setText("Email");

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado");

        toperador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        toperador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toperadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(toperador);

        jButton2.setText("Lista de operadores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jButton3.setText("Dar de baja");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(restado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1)
                                            .addComponent(japellido)
                                            .addComponent(jnombre)
                                            .addComponent(jemail, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(jtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(jcelular))
                                        .addGap(18, 18, 18)
                                        .addComponent(Buscar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton1)
                                .addGap(71, 71, 71)
                                .addComponent(Modificar)))
                        .addGap(0, 365, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(japellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restado)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            OperadorMesaAyuda operador = new OperadorMesaAyuda();
            DatosContacto dContactos = new DatosContacto();
            GestorGenerico gestort = new GestorGenerico();

            String apellido = japellido.getText();
            String nombre = jnombre.getText();
            String estado = restado.isSelected() ? "activo" : "inactivo";
            long celular = Long.parseLong(jcelular.getText());
            long telefono = Long.parseLong(jtelefono.getText());
            String email = jemail.getText();
            int legajo = (int) (Math.random() * 100000 + 1);

            operador.setApellido(apellido);
            operador.setNombre(nombre);
            operador.setEstado(estado);
            operador.setLegajo(legajo);
            dContactos.setCelular(celular);
            dContactos.setTelefono(telefono);
            dContactos.setEmail(email);
            operador.setDatosContacto(dContactos);
            gestort.guardar(operador);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        DatosContacto dcontacto = new DatosContacto ();
        GestorGenerico gGenerico = new GestorGenerico();
       GestorOperador gOperador = new GestorOperador(); 
        
        int selec =  toperador.getSelectedRow();
         
           if (selec != -1) {
            try {
                long idO = (long) toperador.getValueAt(selec, 0);
                int legajo = (int) toperador.getValueAt(selec, 1);
                 String apellido = japellido.getText();
                 String nombre = jnombre.getText();
                 String estado = restado.isSelected() ? "activo" : "inactivo";
                 long celular = Long.parseLong(jcelular.getText());
                 long telefono = Long.parseLong(jtelefono.getText());
                 String email = jemail.getText();
            
            
                OperadorMesaAyuda operador = (OperadorMesaAyuda) gGenerico.buscarObjetoPorAtributo(OperadorMesaAyuda.class, "legajo", legajo);
                long id = operador.getDatosContacto().getId();
                
                dcontacto.setId(id);
                dcontacto.setCelular(celular);
                dcontacto.setTelefono(telefono);
                dcontacto.setEmail(email);
                
                
                operador.setLegajo(legajo);
                operador.setApellido(apellido);
                operador.setNombre(nombre);
                operador.setEstado(estado);
                operador.setDatosContacto(dcontacto);
                gOperador.modificarOperador(operador);
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null,"Error al cargar datos");
               ex.printStackTrace();
            }
            }
    }//GEN-LAST:event_ModificarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        GestorGenerico gGenerico = new GestorGenerico();
        String apell = japellido.getText();
        try {
            List<OperadorMesaAyuda> operador1 = gGenerico.buscarPorAtributo1(OperadorMesaAyuda.class, "apellido", apell);
            for (OperadorMesaAyuda operador : operador1) {
                if (operador != null) {
                    modelo.addRow(new Object[]{operador.getId(), operador.getLegajo(), operador.getEstado(), operador.getApellido(),
                        operador.getNombre(), operador.getDatosContacto().getCelular(), operador.getDatosContacto().getTelefono(),
                        operador.getDatosContacto().getEmail()});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista");

        }
    }//GEN-LAST:event_BuscarActionPerformed
//  try { 
//            OperadorMesaAyuda operador = gOperador.listarTecnicoPorApellido(apellido);
//            if(operador != null){
//                modelo.addRow(new Object[]{ operador.getId(),operador.getLegajo(),operador.getEstado(),operador.getApellido(),
//                    operador.getNombre(),operador.getDatosContacto().getCelular(),operador.getDatosContacto().getTelefono(),
//                    operador.getDatosContacto().getEmail()});
//            }} catch (Exception ex) {
//           JOptionPane.showMessageDialog(null, "Error al cargar la lista");

    private void toperadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toperadorMouseClicked
        int selec = toperador.getSelectedRow();

        if (selec != -1) {
            String Estado = (String) toperador.getValueAt(selec, 2);
            String apellido = (String) toperador.getValueAt(selec, 3);
            String nombre = (String) toperador.getValueAt(selec, 4);
            long celular = (long) toperador.getValueAt(selec, 5);
            long telefono = (long) toperador.getValueAt(selec, 6);
            String email = (String) toperador.getValueAt(selec, 7);

            japellido.setText(apellido);
            jnombre.setText(nombre);
            jcelular.setText(celular + "");
            jtelefono.setText(telefono + "");
            jemail.setText(email);

            if (Estado.equals("activo")) {
                restado.setSelected(true);
            } else {
                restado.setSelected(false);
            }

        }
    }//GEN-LAST:event_toperadorMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarTabla();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DatosContacto dcontacto = new DatosContacto();
        GestorGenerico gGenerico = new GestorGenerico();

        GestorOperador gOperador = new GestorOperador();
        int selec = toperador.getSelectedRow();

        if (selec != -1) {
            try {
                long idT = (long) toperador.getValueAt(selec, 0);
                int legajo = (int) toperador.getValueAt(selec, 1);
                String apellido = (String) toperador.getValueAt(selec, 3);
                String nombre = (String) toperador.getValueAt(selec, 4);
                long celular = (long) toperador.getValueAt(selec, 5);
                long telefono = (long) toperador.getValueAt(selec, 6);
                String email = (String) toperador.getValueAt(selec, 7);

                OperadorMesaAyuda operador = (OperadorMesaAyuda) gGenerico.buscarObjetoPorAtributo(OperadorMesaAyuda.class, "legajo", legajo);
                long idO = operador.getDatosContacto().getId();

                dcontacto.setId(idO);
                dcontacto.setCelular(celular);
                dcontacto.setTelefono(telefono);
                dcontacto.setEmail(email);

                operador.setLegajo(legajo);
                operador.setApellido(apellido);
                operador.setNombre(nombre);
                operador.setEstado("inactivo");
                operador.setDatosContacto(dcontacto);
                gOperador.modificarOperador(operador);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar datos");
                ex.printStackTrace();
            }
            cargarTabla();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField japellido;
    private javax.swing.JTextField jcelular;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jnombre;
    private javax.swing.JTextField jtelefono;
    private javax.swing.JRadioButton restado;
    private javax.swing.JTable toperador;
    // End of variables declaration//GEN-END:variables

    public void listaOperador() {
        modelo.addColumn("id");
        modelo.addColumn("Legajo");
        modelo.addColumn("Estado");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Celuar");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        toperador.setModel(modelo);
    }

    public void cargarTabla() {
        GestorGenerico gGenerico = new GestorGenerico();
        toperador.removeAll();
        try {

            List<OperadorMesaAyuda> oper = gGenerico.listar(OperadorMesaAyuda.class);
            for (OperadorMesaAyuda operador : oper) {
                modelo.addRow(new Object[]{operador.getId(), operador.getLegajo(), operador.getEstado(), operador.getApellido(),
                    operador.getNombre(), operador.getDatosContacto().getCelular(), operador.getDatosContacto().getTelefono(),
                    operador.getDatosContacto().getEmail()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla");
        }

    }
}
