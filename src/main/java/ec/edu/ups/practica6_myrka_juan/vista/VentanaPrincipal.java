/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.practica6_myrka_juan.vista;

import ec.edu.ups.practica6_myrka_juan.controlador.ControladorPersona;
import ec.edu.ups.practica6_myrka_juan.dao.PersonaDAO;
import ec.edu.ups.practica6_myrka_juan.idao.IPersonaDAO;



/**
 *
 * @author Myrka
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    //ventana personal
    private VentanaCrearDirectorio ventanaCrearDirectorio;
    private VentanaEliminarDirectorio ventanaEliminarDirectorio;
    private VentanaRenombrarDirectorio ventanaRenombrarDirectorio;
    
    //controlador
   private ControladorPersona controladorPersona;
/*
    //DAO
    private IPersonaDAO personaDAO;
    */

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
      /*  personaDAO = new PersonaDAO();
        
        */
        controladorPersona = new controladorPersona(personaDAO);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        ListarDirectorio = new javax.swing.JButton();
        ListarArchivoOculto = new javax.swing.JButton();
        ListarDirectorioOculto = new javax.swing.JButton();
        MostrarInformacion = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTextField2 = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        GestionarDirectorio = new javax.swing.JMenu();
        CrearDirectorio = new javax.swing.JMenuItem();
        EliminarDirectorio = new javax.swing.JMenuItem();
        RenombrarDirectorio = new javax.swing.JMenuItem();
        SALIR = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 102, 255));
        desktopPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestionar Directorio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        ListarDirectorio.setText("Listar Directorios");
        ListarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarDirectorioActionPerformed(evt);
            }
        });
        desktopPane.add(ListarDirectorio);
        ListarDirectorio.setBounds(80, 100, 130, 30);

        ListarArchivoOculto.setText("Listar Archivos Ocultos");
        desktopPane.add(ListarArchivoOculto);
        ListarArchivoOculto.setBounds(310, 100, 151, 22);

        ListarDirectorioOculto.setText("Listar Directorios Ocultos");
        desktopPane.add(ListarDirectorioOculto);
        ListarDirectorioOculto.setBounds(540, 100, 180, 22);

        MostrarInformacion.setText("Mostrar informacion");
        MostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInformacionActionPerformed(evt);
            }
        });
        desktopPane.add(MostrarInformacion);
        MostrarInformacion.setBounds(170, 340, 139, 22);

        jTextField1.setText("Ruta");
        desktopPane.add(jTextField1);
        jTextField1.setBounds(210, 60, 64, 22);

        jScrollPane1.setViewportView(jTree1);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(60, 150, 330, 170);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        desktopPane.add(jTextField2);
        jTextField2.setBounds(300, 60, 220, 22);

        GestionarDirectorio.setMnemonic('f');
        GestionarDirectorio.setText("Gestionar Directorio");
        GestionarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarDirectorioActionPerformed(evt);
            }
        });

        CrearDirectorio.setMnemonic('o');
        CrearDirectorio.setText("Crear");
        CrearDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearDirectorioActionPerformed(evt);
            }
        });
        GestionarDirectorio.add(CrearDirectorio);

        EliminarDirectorio.setMnemonic('x');
        EliminarDirectorio.setText("Eliminar");
        EliminarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDirectorioActionPerformed(evt);
            }
        });
        GestionarDirectorio.add(EliminarDirectorio);

        RenombrarDirectorio.setMnemonic('a');
        RenombrarDirectorio.setText("Renombrar");
        RenombrarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenombrarDirectorioActionPerformed(evt);
            }
        });
        GestionarDirectorio.add(RenombrarDirectorio);

        SALIR.setText("Salir");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        GestionarDirectorio.add(SALIR);

        menuBar.add(GestionarDirectorio);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RenombrarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenombrarDirectorioActionPerformed
        // TODO add your handling code here:
        if (ventanaRenombrarDirectorio == null) {
            ventanaRenombrarDirectorio = new VentanaRenombrarDirectorio(controladorPersona);
            desktopPane.add(ventanaRenombrarDirectorio);
        }
        
        ventanaRenombrarDirectorio.setVisible(true);
        
    }//GEN-LAST:event_RenombrarDirectorioActionPerformed

    private void CrearDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearDirectorioActionPerformed
        // TODO add your handling code here:
        if (ventanaCrearDirectorio == null) {
            ventanaCrearDirectorio = new VentanaCrearDirectorio(controladorPersona);
            desktopPane.add(ventanaCrearDirectorio);

        }
        ventanaCrearDirectorio.setVisible(true);
        
    }//GEN-LAST:event_CrearDirectorioActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    private void GestionarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarDirectorioActionPerformed
        /*if (ventanaCrearPersona == null) {
            ventanaCrearPersona = new VentanaCrearDirectorio(controladorPersona);
            desktopPane.add(ventanaCrearPersona);

        }
        ventanaCrearPersona.setVisible(true);*/
    }//GEN-LAST:event_GestionarDirectorioActionPerformed

    private void EliminarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDirectorioActionPerformed
        // TODO add your handling code here:
         if (ventanaEliminarDirectorio == null) {
            ventanaEliminarDirectorio = new VentanaEliminarDirectorio(controladorPersona);
            desktopPane.add(ventanaEliminarDirectorio);
        }
        
        ventanaEliminarDirectorio.setVisible(true);
    }//GEN-LAST:event_EliminarDirectorioActionPerformed

    private void MostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarInformacionActionPerformed

    private void ListarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarDirectorioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ListarDirectorioActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CrearDirectorio;
    private javax.swing.JMenuItem EliminarDirectorio;
    private javax.swing.JMenu GestionarDirectorio;
    private javax.swing.JButton ListarArchivoOculto;
    private javax.swing.JButton ListarDirectorio;
    private javax.swing.JButton ListarDirectorioOculto;
    private javax.swing.JButton MostrarInformacion;
    private javax.swing.JMenuItem RenombrarDirectorio;
    private javax.swing.JMenuItem SALIR;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
