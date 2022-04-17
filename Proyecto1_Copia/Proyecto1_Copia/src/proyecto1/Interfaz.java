
package proyecto1;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class Interfaz extends javax.swing.JFrame 
{
    generaMatriz matriz; 
            
    public Interfaz() 
    {   
        matriz = new generaMatriz();
        initComponents();
        
        
        matriz.generaAleatorios();
        this.instanciaMatriz(); 
    }
    
    public void instanciaMatriz()
    {        
        for(int count=0; count < matriz.numeros.length; count++)
        {
            
            if(lista.getItemCount() < matriz.numeros.length)
            {
                lista.add(String.valueOf(matriz.numeros[count]), count);
                lista.setVisible(false);
            }
        }
        lista.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new java.awt.Panel();
        lista = new java.awt.List();
        btnNuevaMatriz = new java.awt.Button();
        btnMetBurbuja = new java.awt.Button();
        btnMetShell1 = new java.awt.Button();
        btnMetQSort1 = new java.awt.Button();
        indicador0 = new java.awt.Label();
        guiaVisual2 = new java.awt.Label();
        guiaVisual3 = new java.awt.Label();
        indicador1 = new java.awt.Label();
        indicador2 = new java.awt.Label();
        btnMatrizOriginal = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filtros de ordenación");
        setResizable(false);

        contenido.setBackground(new java.awt.Color(0, 153, 204));
        contenido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        btnNuevaMatriz.setBackground(java.awt.SystemColor.activeCaption);
        btnNuevaMatriz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaMatriz.setLabel("Generar nueva Matriz");
        btnNuevaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMatrizActionPerformed(evt);
            }
        });

        btnMetBurbuja.setActionCommand("button 2");
        btnMetBurbuja.setBackground(java.awt.SystemColor.activeCaption);
        btnMetBurbuja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMetBurbuja.setLabel("Ordenar con metodo Burbuja");
        btnMetBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetBurbujaActionPerformed(evt);
            }
        });

        btnMetShell1.setActionCommand("button 2");
        btnMetShell1.setBackground(java.awt.SystemColor.activeCaption);
        btnMetShell1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMetShell1.setLabel("Ordenar con metodo Shell");
        btnMetShell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetShell1ActionPerformed(evt);
            }
        });

        btnMetQSort1.setActionCommand("button 2");
        btnMetQSort1.setBackground(java.awt.SystemColor.activeCaption);
        btnMetQSort1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMetQSort1.setLabel("Ordenar con metodo QuickSort");
        btnMetQSort1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetQSort1ActionPerformed(evt);
            }
        });

        indicador0.setAlignment(java.awt.Label.CENTER);
        indicador0.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        indicador0.setForeground(new java.awt.Color(255, 0, 51));
        indicador0.setText(String.valueOf(matriz.marcaTotal));

        guiaVisual2.setAlignment(java.awt.Label.CENTER);
        guiaVisual2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guiaVisual2.setText("Metodos de Sorting");

        guiaVisual3.setAlignment(java.awt.Label.CENTER);
        guiaVisual3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guiaVisual3.setText("Tiempos de espera");

        indicador1.setAlignment(java.awt.Label.CENTER);
        indicador1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        indicador1.setForeground(new java.awt.Color(255, 0, 51));
        indicador1.setText(String.valueOf(matriz.marcaTotal));

        indicador2.setAlignment(java.awt.Label.CENTER);
        indicador2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        indicador2.setForeground(new java.awt.Color(255, 0, 51));
        indicador2.setText(String.valueOf(matriz.marcaTotal));

        btnMatrizOriginal.setBackground(java.awt.SystemColor.activeCaption);
        btnMatrizOriginal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMatrizOriginal.setLabel("¡Quiero probar otro metodo en esta misma matriz!");
        btnMatrizOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizOriginalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMetQSort1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMetBurbuja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMetShell1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guiaVisual2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indicador0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(indicador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guiaVisual3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indicador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevaMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMatrizOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guiaVisual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guiaVisual3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMetBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                                .addComponent(indicador0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnMetQSort1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(indicador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnMetShell1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(indicador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnNuevaMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMatrizOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        btnNuevaMatriz.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaActionPerformed

    private void btnNuevaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMatrizActionPerformed

        lista.removeAll();
        matriz.generaAleatorios();
        this.instanciaMatriz();
        
        indicador0.setText("0");
        indicador1.setText("0");
        indicador2.setText("0");

    }//GEN-LAST:event_btnNuevaMatrizActionPerformed

    private void btnMetBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetBurbujaActionPerformed
        lista.removeAll();
        matriz.opcionOrdena(0);
        matriz.getOrdenada();
        this.instanciaMatriz();
        
        indicador0.setText(String.format("%.9f s", matriz.marcaTotal));
        matriz.marcaTotal = 0;
    }//GEN-LAST:event_btnMetBurbujaActionPerformed

    private void btnMetShell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetShell1ActionPerformed
        lista.removeAll();
        matriz.opcionOrdena(1);
        matriz.getOrdenada();
        this.instanciaMatriz();
        
        indicador2.setText(String.format("%.9f s", matriz.marcaTotal));
        matriz.marcaTotal = 0;
    }//GEN-LAST:event_btnMetShell1ActionPerformed

    private void btnMetQSort1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetQSort1ActionPerformed
        lista.removeAll();
        matriz.opcionOrdena(2);
        matriz.getOrdenada();
        this.instanciaMatriz();
        
        indicador1.setText(String.format("%.9f s", matriz.marcaTotal));
        matriz.marcaTotal = 0;
    }//GEN-LAST:event_btnMetQSort1ActionPerformed

    private void btnMatrizOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizOriginalActionPerformed
        lista.removeAll();
        matriz.getOriginal();
        this.instanciaMatriz();
    }//GEN-LAST:event_btnMatrizOriginalActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnMatrizOriginal;
    private java.awt.Button btnMetBurbuja;
    private java.awt.Button btnMetQSort1;
    private java.awt.Button btnMetShell1;
    private java.awt.Button btnNuevaMatriz;
    private java.awt.Panel contenido;
    private java.awt.Label guiaVisual2;
    private java.awt.Label guiaVisual3;
    private java.awt.Label indicador0;
    private java.awt.Label indicador1;
    private java.awt.Label indicador2;
    public java.awt.List lista;
    // End of variables declaration//GEN-END:variables
}
