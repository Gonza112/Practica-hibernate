/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.Gestor;
import controlador.GestorEspecialidadesyServicios;
import controlador.GestorGenerico;
import controlador.GestorTecnico;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.DatosContacto;
import modelo.Especialidad;
import modelo.Tecnico;
import modelo.TecnicoEspecialidad;

/**
 *
 * @author gonza
 */
public class TecnicoVista extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form TecnicoVista
     */
    public TecnicoVista() {
        initComponents();
        generarTabla();
        ListaEspecialidades();
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
        jtelefono = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        restado = new javax.swing.JRadioButton();
        NuevoTecnico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttecnico = new javax.swing.JTable();
        BuscarPorApellido = new javax.swing.JButton();
        ListarTecnico = new javax.swing.JButton();
        BajaTecnico = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cespecialidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlegajo = new javax.swing.JTextField();
        AsignarEspecialidad = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Apellido");

        jLabel2.setText("Nombre");

        jLabel3.setText("Estado");

        jLabel4.setText("Celular");

        jLabel5.setText("Telefono");

        jLabel6.setText("Email");

        japellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japellidoActionPerformed(evt);
            }
        });

        restado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restadoActionPerformed(evt);
            }
        });

        NuevoTecnico.setText("Nuevo");
        NuevoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoTecnicoActionPerformed(evt);
            }
        });

        ttecnico.setModel(new javax.swing.table.DefaultTableModel(
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
        ttecnico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttecnicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ttecnico);

        BuscarPorApellido.setText("Buscar");
        BuscarPorApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPorApellidoActionPerformed(evt);
            }
        });

        ListarTecnico.setText("Listar Tecnico");
        ListarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTecnicoActionPerformed(evt);
            }
        });

        BajaTecnico.setText("Dar de Baja");
        BajaTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaTecnicoActionPerformed(evt);
            }
        });

        jLabel7.setText("Asignar Especialidad");

        jLabel8.setText("Agregar Tecnico");

        cespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cespecialidadActionPerformed(evt);
            }
        });

        jLabel9.setText("Especialidades");

        jLabel10.setText("Ingresar legajo del tecnico");

        AsignarEspecialidad.setText("Asignar");
        AsignarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarEspecialidadActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(restado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                            .addComponent(japellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcelular, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(37, 37, 37)
                                        .addComponent(BuscarPorApellido)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(AsignarEspecialidad)
                                        .addGap(93, 93, 93))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(jemail))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(226, 226, 226))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(NuevoTecnico)
                        .addGap(38, 38, 38)
                        .addComponent(Modificar)
                        .addGap(97, 97, 97)
                        .addComponent(ListarTecnico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(BajaTecnico)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(japellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BuscarPorApellido)
                    .addComponent(cespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jlegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AsignarEspecialidad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(restado)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevoTecnico)
                    .addComponent(ListarTecnico)
                    .addComponent(Modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BajaTecnico)
                .addGap(174, 174, 174))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void japellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_japellidoActionPerformed

    private void NuevoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoTecnicoActionPerformed
        try {
            Tecnico tecnico = new Tecnico();
            DatosContacto dContactos = new DatosContacto();
            GestorGenerico gestort = new GestorGenerico();
            
            String apellido = japellido.getText();
            String nombre = jnombre.getText();
            String estado = restado.isSelected() ? "activo" : "inactivo";
            long celular = Long.parseLong(jcelular.getText());
            long telefono = Long.parseLong(jtelefono.getText());
            String email = jemail.getText();
            int legajo = (int)(Math.random()*100000+1);
            
            
            tecnico.setApellido(apellido);
            tecnico.setNombre(nombre);
            tecnico.setEstado(estado);
            tecnico.setLegajo(legajo);
            dContactos.setCelular(celular);
            dContactos.setTelefono(telefono);
            dContactos.setEmail(email);
            tecnico.setDatosContacto(dContactos);
            gestort.guardar(tecnico);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos");
        }
    }//GEN-LAST:event_NuevoTecnicoActionPerformed

    private void BajaTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaTecnicoActionPerformed
        GestorTecnico gTecnico = new GestorTecnico();
        DatosContacto dcontacto = new DatosContacto();
        GestorGenerico gGenerico = new GestorGenerico();
        int selec =  ttecnico.getSelectedRow();
         
           if (selec != -1) {
            try {
                long idT = (long) ttecnico.getValueAt(selec, 0);
                int legajo = (int) ttecnico.getValueAt(selec, 1);
                String apellido = (String) ttecnico.getValueAt(selec, 2);
                String nombre= (String) ttecnico.getValueAt(selec, 3);
                long celular = (long) ttecnico.getValueAt(selec, 4);
                long telefono = (long)ttecnico.getValueAt(selec, 5);
                String email = (String) ttecnico.getValueAt(selec, 6);
                
                
                Tecnico tecnico = gGenerico.BuscarXLegajo(legajo);
                long idC = tecnico.getDatosContacto().getId();
                
                dcontacto.setId(idC);
                dcontacto.setCelular(celular);
                dcontacto.setTelefono(telefono);
                dcontacto.setEmail(email);
                
                
                tecnico.setLegajo(legajo);
                tecnico.setApellido(apellido);
                tecnico.setNombre(nombre);
                tecnico.setEstado("inactivo");
                tecnico.setDatosContacto(dcontacto);
                gTecnico.modificarTecnico(tecnico);
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null,"Error al cargar datos");
               ex.printStackTrace();
            }
                
               } 
         
    }//GEN-LAST:event_BajaTecnicoActionPerformed

    private void BuscarPorApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPorApellidoActionPerformed
      GestorTecnico gtecnico = new GestorTecnico();
        
      String apellido = japellido.getText();
        try {
            Tecnico tecnico =  gtecnico.listarTecnicoPorApellido(apellido);
                if (tecnico != null) {
                modelo.addRow(new Object[]{tecnico.getId(),tecnico.getLegajo(),tecnico.getApellido(),tecnico.getNombre(),
                tecnico.getDatosContacto().getCelular(),
                tecnico.getDatosContacto().getTelefono(),tecnico.getDatosContacto().getEmail(),tecnico.getEstado()});
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Error");
        }
      
    }//GEN-LAST:event_BuscarPorApellidoActionPerformed

    private void ListarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTecnicoActionPerformed
        
        
        try {
            GestorTecnico gtecnico = new GestorTecnico();
            GestorGenerico gGenerico = new GestorGenerico();
            List<Tecnico> tecn = gGenerico.listar(Tecnico.class);
            
            for(Tecnico tecnico : tecn){
            modelo.addRow(new Object[]{ tecnico.getId(),tecnico.getLegajo(),tecnico.getApellido(),tecnico.getNombre(),
                tecnico.getDatosContacto().getCelular(), tecnico.getDatosContacto().getTelefono(),
                 tecnico.getDatosContacto().getEmail(), tecnico.getEstado()
            });
            }
            
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"Error al ingresar la lista");
        }
            
        
    }//GEN-LAST:event_ListarTecnicoActionPerformed

    private void restadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restadoActionPerformed

    private void AsignarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarEspecialidadActionPerformed

          GestorGenerico gGenerico = new GestorGenerico();
        
        try {
          
            String especial = cespecialidad.getItemAt(cespecialidad.getSelectedIndex());
            int legajo = Integer.parseInt(jlegajo.getText());
            
            Tecnico tec = (Tecnico) gGenerico.buscarObjetoPorAtributo(Tecnico.class, "legajo", legajo);
            Especialidad especialidad = (Especialidad) gGenerico.buscarObjetoPorAtributo(Especialidad.class, "denominacion", especial);
            
            
            tec.addEspecialidad(especialidad);
            gGenerico.guardar(tec);
             
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error al cargar datos");
          ex.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_AsignarEspecialidadActionPerformed

    private void ttecnicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttecnicoMouseClicked
      int selec = ttecnico.getSelectedRow();

        if (selec != -1) {
            String apellido = (String) ttecnico.getValueAt(selec, 2);
            String nombre = (String)    ttecnico.getValueAt(selec, 3);
            long celular = (long) ttecnico.getValueAt(selec, 4);
            long telefono = (long) ttecnico.getValueAt(selec, 5);
            String email = (String) ttecnico.getValueAt(selec, 6);
            String Estado = (String) ttecnico.getValueAt(selec, 7);
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
    }//GEN-LAST:event_ttecnicoMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        GestorTecnico gTecnico = new GestorTecnico();
        DatosContacto dcontacto = new DatosContacto();
        GestorGenerico gGenerico = new GestorGenerico();
        int selec = ttecnico.getSelectedRow();

        if (selec != -1) {
            try {
                long idT = (long) ttecnico.getValueAt(selec, 0);
                int legajo = (int) ttecnico.getValueAt(selec, 1);
                String apellido = japellido.getText();
                String nombre = jnombre.getText();
                String estado = restado.isSelected() ? "activo" : "inactivo";
                long celular = Long.parseLong(jcelular.getText());
                long telefono = Long.parseLong(jtelefono.getText());
                String email = jemail.getText();

                Tecnico tecnico = gGenerico.BuscarXLegajo(legajo);
                long idC = tecnico.getDatosContacto().getId();

                dcontacto.setId(idC);
                dcontacto.setCelular(celular);
                dcontacto.setTelefono(telefono);
                dcontacto.setEmail(email);

                tecnico.setLegajo(legajo);
                tecnico.setApellido(apellido);
                tecnico.setNombre(nombre);
                tecnico.setEstado(estado);
                tecnico.setDatosContacto(dcontacto);
                gTecnico.modificarTecnico(tecnico);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar datos");
                ex.printStackTrace();
            }
                
               } 
    }//GEN-LAST:event_ModificarActionPerformed

    private void cespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cespecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cespecialidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsignarEspecialidad;
    private javax.swing.JButton BajaTecnico;
    private javax.swing.JButton BuscarPorApellido;
    private javax.swing.JButton ListarTecnico;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton NuevoTecnico;
    private javax.swing.JComboBox<String> cespecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField japellido;
    private javax.swing.JTextField jcelular;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jlegajo;
    private javax.swing.JTextField jnombre;
    private javax.swing.JTextField jtelefono;
    private javax.swing.JRadioButton restado;
    private javax.swing.JTable ttecnico;
    // End of variables declaration//GEN-END:variables



    public void generarTabla(){
        modelo.addColumn("id");
        modelo.addColumn("Legajo");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Celular");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Estado");
        
        ttecnico.setModel(modelo);
    }
         public void ListaEspecialidades(){
            GestorEspecialidadesyServicios gServicio = new GestorEspecialidadesyServicios();
            GestorGenerico gGenerico = new GestorGenerico();
            
         try {
           
            List<Especialidad> especialidad = gGenerico.listar(Especialidad.class);
            for ( Especialidad espec : especialidad){
                cespecialidad.addItem(espec.getDenominacion());
             } 
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"Erro al cargar la lista");
        }
       
       
   }     
        
}