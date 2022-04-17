
package proyecto2;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jdk.nashorn.internal.ir.BreakNode;

public class GuiClass extends javax.swing.JFrame 
{
    logicClass logic = new logicClass();
    ButtonGroup botonera = new ButtonGroup();
    

    public GuiClass() 
    {
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
        ex.printStackTrace(); 
}
        initComponents();
        
        this.modelos();
        
        botonera.add(rButAccion);
        botonera.add(rButComedia);
        botonera.add(rButDrama);
        botonera.add(rButInfantiles);
        botonera.add(rButTerror);
        
    }
    
    public void modelos()
    {
        
        int size = (logic.size()+1);
        jList1.removeAll();


        this.jList1.setModel(logic.modelo());

        jList1.updateUI();
        jLabel3.setText(String.valueOf(size));
        jLabel4.setText(String.valueOf(logic.getInversion()));
        jLabel3.updateUI();
        jLabel4.updateUI();
            
        
        
        
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelForm = new javax.swing.JPanel();
        jTextName = new javax.swing.JTextField();
        jBorraLlista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        rButDrama = new javax.swing.JRadioButton();
        rButTerror = new javax.swing.JRadioButton();
        rButComedia = new javax.swing.JRadioButton();
        rButAccion = new javax.swing.JRadioButton();
        rButInfantiles = new javax.swing.JRadioButton();
        jTextDuracion = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButBorraElemento = new javax.swing.JButton();
        jButDetalle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSeparator3 = new javax.swing.JSeparator();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema");
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName("Cinema"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanelForm.setBorder(new javax.swing.border.MatteBorder(null));
        jPanelForm.setForeground(new java.awt.Color(204, 204, 255));

        jTextName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextName.setDoubleBuffered(true);

        jBorraLlista.setText("Borra lista");
        jBorraLlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorraLlistaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de la película:");
        jLabel1.setDoubleBuffered(true);

        jSeparator1.setBackground(java.awt.SystemColor.activeCaption);
        jSeparator1.setForeground(java.awt.SystemColor.activeCaption);
        jSeparator1.setToolTipText("");
        jSeparator1.setDoubleBuffered(true);

        jSeparator2.setBackground(java.awt.SystemColor.activeCaption);
        jSeparator2.setForeground(java.awt.SystemColor.activeCaption);
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setDoubleBuffered(true);

        rButDrama.setText("Drama");
        rButDrama.setDoubleBuffered(true);
        rButDrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButDramaActionPerformed(evt);
            }
        });

        rButTerror.setText("Terror");
        rButTerror.setDoubleBuffered(true);
        rButTerror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButTerrorActionPerformed(evt);
            }
        });

        rButComedia.setText("Comedia");
        rButComedia.setDoubleBuffered(true);
        rButComedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButComediaActionPerformed(evt);
            }
        });

        rButAccion.setText("Acción");
        rButAccion.setDoubleBuffered(true);

        rButInfantiles.setText("Infantiles");
        rButInfantiles.setDoubleBuffered(true);

        jTextDuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextDuracion.setDoubleBuffered(true);
        jTextDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDuracionActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar Película");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButBorraElemento.setText("Borrar elemento");
        jButBorraElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButBorraElementoActionPerformed(evt);
            }
        });

        jButDetalle.setText("Mostrar detalles");
        jButDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDetalleActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel3");

        jLabel5.setText("Inversión total:");

        jLabel6.setText("Cantidad de peliculas en lista:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jScrollPane2.setViewportView(jList1);

        jSeparator3.setBackground(java.awt.SystemColor.activeCaption);
        jSeparator3.setForeground(java.awt.SystemColor.activeCaption);
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setDoubleBuffered(true);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setForeground(new java.awt.Color(222, 222, 222));
        label1.setText("Duración de la pelicula");

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFormLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFormLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rButInfantiles)
                                            .addComponent(rButComedia)
                                            .addComponent(rButTerror))
                                        .addGap(98, 98, 98)
                                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rButAccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rButDrama, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextDuracion)
                                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                    .addGroup(jPanelFormLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBorraLlista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButBorraElemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFormLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                                .addComponent(rButComedia)
                                                .addGap(26, 26, 26)
                                                .addComponent(rButTerror)
                                                .addGap(26, 26, 26)
                                                .addComponent(rButInfantiles))
                                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(rButDrama)
                                                .addGap(30, 30, 30)
                                                .addComponent(rButAccion))))
                                    .addGroup(jPanelFormLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                                .addComponent(jTextDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jButton5)))))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator3))
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButDetalle)
                        .addGap(18, 18, 18)
                        .addComponent(jBorraLlista)
                        .addGap(18, 18, 18)
                        .addComponent(jButBorraElemento)
                        .addGap(111, 111, 111))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 803, 603);
    }// </editor-fold>//GEN-END:initComponents

    private void rButTerrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButTerrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rButTerrorActionPerformed

    private void rButComediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButComediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rButComediaActionPerformed

    private void rButDramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButDramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rButDramaActionPerformed

    private void jButBorraElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButBorraElementoActionPerformed
       
        if(jList1.getSelectedIndex()== -1)
        {
            JOptionPane.showMessageDialog(null, "No hay ningun elemento seleccionado");
        }else
        {
            logic.pop(jList1.getSelectedIndex());
        }
       
       this.modelos();
    }//GEN-LAST:event_jButBorraElementoActionPerformed

    private void jTextDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDuracionActionPerformed

    private void jBorraLlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorraLlistaActionPerformed
        logic.borraTodo();
        this.modelos();
        
    }//GEN-LAST:event_jBorraLlistaActionPerformed

    private void jButDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDetalleActionPerformed
        logic.showDetalle(jList1.getSelectedIndex());
    }//GEN-LAST:event_jButDetalleActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String nombre = jTextName.getText(); // estabelce el nombre de la pelicula
        
        // estabelce el genero de la pelicula
        String genero ="";
        if(rButAccion.isSelected()){
            genero = rButAccion.getText();
        }else{
            if(rButComedia.isSelected()){
                genero = rButComedia.getText();
            }else{
                if(rButDrama.isSelected()){
                    genero = rButDrama.getText();
                }else{
                    if(rButInfantiles.isSelected()){
                        genero = rButInfantiles.getText();
                    }else{
                        if(rButTerror.isSelected()){
                            genero = rButInfantiles.getText();
                        }
                    }
                }
            }
        }
        
        //establece la duracion de la pelicula
        int duracion = 0;
        try
        {
            if(Integer.parseInt(this.jTextDuracion.getText()) < 60 ||Integer.parseInt(this.jTextDuracion.getText()) > 300)
            {
                JOptionPane.showMessageDialog(null,"Solo se permiten numeros enteros del 60 al 300");
                this.jTextDuracion.setText("");
            }else
            {
                 duracion= Integer.parseInt(this.jTextDuracion.getText());
            }
            
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Solo se permiten numeros enteros del 60 al 300");
            this.jTextDuracion.setText("");
        }
        
        if( genero == "" || nombre == "" || duracion == 0)
        {
            JOptionPane.showMessageDialog(null,"Faltan datos para poder agregar su pelicula");
        }else{
            logic.add(nombre, genero, duracion);
            this.jTextDuracion.setText("");
            this.jTextName.setText("");
            rButComedia.setSelected(true);
            this.modelos();
        }
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBorraLlista;
    private javax.swing.JButton jButBorraElemento;
    private javax.swing.JButton jButDetalle;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextDuracion;
    private javax.swing.JTextField jTextName;
    private java.awt.Label label1;
    private javax.swing.JRadioButton rButAccion;
    private javax.swing.JRadioButton rButComedia;
    private javax.swing.JRadioButton rButDrama;
    private javax.swing.JRadioButton rButInfantiles;
    private javax.swing.JRadioButton rButTerror;
    // End of variables declaration//GEN-END:variables
}
