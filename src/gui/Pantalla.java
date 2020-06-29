package gui;

import java.util.Arrays;
import procesos.Tiempos;

public class Pantalla extends javax.swing.JFrame {
    
    public Pantalla() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cantTiempo_JText = new javax.swing.JTextField();
        mostrarTabla_JCheck = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        uniTiempo_JCombo = new javax.swing.JComboBox();
        demanda_JText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        probDemanda_JText = new javax.swing.JTextField();
        agregarDemanda_JButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        entrega_JText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        probEntrega_JText = new javax.swing.JTextField();
        agregarEntrega_JButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        entrega_JText1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        probEntrega_JText1 = new javax.swing.JTextField();
        agregarEspera_JButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        costoInv_JText = new javax.swing.JTextField();
        costoCompra_JText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        costoOrden_JText = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        costoConEspera_JText = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        costoSinEspera_JText = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        inventarioInicial_JText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Antenna");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Position/Direction "));

        jLabel1.setText("Unidad de tiempo:");

        jLabel2.setText("Cantidad de tiempo:");

        cantTiempo_JText.setText("360");
        cantTiempo_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantTiempo_JTextActionPerformed(evt);
            }
        });

        mostrarTabla_JCheck.setText("Mostrar tabla de eventos");
        mostrarTabla_JCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        mostrarTabla_JCheck.setMargin(new java.awt.Insets(0, 0, 0, 0));
        mostrarTabla_JCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTabla_JCheckActionPerformed(evt);
            }
        });

        jLabel11.setText("Demanda:");

        uniTiempo_JCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dias", "Semanas", "Meses", "Bimestres", "Trimestres" }));
        uniTiempo_JCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniTiempo_JComboActionPerformed(evt);
            }
        });

        demanda_JText.setText("10");
        demanda_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demanda_JTextActionPerformed(evt);
            }
        });

        jLabel12.setText("Probabilidad (%):");

        probDemanda_JText.setText("10");
        probDemanda_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probDemanda_JTextActionPerformed(evt);
            }
        });

        agregarDemanda_JButton.setText("Agregar");
        agregarDemanda_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDemanda_JButtonActionPerformed(evt);
            }
        });

        jLabel15.setText("Tiempo de entrega:");

        entrega_JText.setText("10");
        entrega_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrega_JTextActionPerformed(evt);
            }
        });

        jLabel16.setText("Probabilidad (%):");

        probEntrega_JText.setText("10");
        probEntrega_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probEntrega_JTextActionPerformed(evt);
            }
        });

        agregarEntrega_JButton.setText("Agregar");
        agregarEntrega_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEntrega_JButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("Tiempo de espera:");

        entrega_JText1.setText("10");
        entrega_JText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrega_JText1ActionPerformed(evt);
            }
        });

        jLabel18.setText("Probabilidad (%):");

        probEntrega_JText1.setText("10");
        probEntrega_JText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probEntrega_JText1ActionPerformed(evt);
            }
        });

        agregarEspera_JButton.setText("Agregar");
        agregarEspera_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEspera_JButtonActionPerformed(evt);
            }
        });

        jLabel19.setText("Costo de inventario ($/unidad/año):");

        costoInv_JText.setText("10");
        costoInv_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoInv_JTextActionPerformed(evt);
            }
        });

        costoCompra_JText.setText("10");
        costoCompra_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoCompra_JTextActionPerformed(evt);
            }
        });

        jLabel20.setText("Costo de compra ($/unidad):");

        jLabel21.setText("Costo por orden ($/orden):");

        costoOrden_JText.setText("10");
        costoOrden_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoOrden_JTextActionPerformed(evt);
            }
        });

        jLabel22.setText("Costo de faltante con espera ($/unidad):");

        costoConEspera_JText.setText("10");
        costoConEspera_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoConEspera_JTextActionPerformed(evt);
            }
        });

        jLabel23.setText("Costo de faltante sin espera ($/unidad):");

        costoSinEspera_JText.setText("10");
        costoSinEspera_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoSinEspera_JTextActionPerformed(evt);
            }
        });

        jLabel24.setText("Inventario inicial (unidades):");

        inventarioInicial_JText.setText("10");
        inventarioInicial_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioInicial_JTextActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar Simulacion");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(uniTiempo_JCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cantTiempo_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel15)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(entrega_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel16)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(probEntrega_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(agregarEntrega_JButton))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(273, 273, 273)
                                .add(mostrarTabla_JCheck))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jLabel11)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(demanda_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jLabel12)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(probDemanda_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(agregarDemanda_JButton))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel20)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(costoCompra_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel19)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(costoInv_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel21)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(costoOrden_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel22)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(costoConEspera_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel23)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(costoSinEspera_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel24)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(inventarioInicial_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel17)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(entrega_JText1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(jLabel18)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(probEntrega_JText1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                        .add(18, 18, 18)
                                        .add(agregarEspera_JButton)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 42, Short.MAX_VALUE)
                                .add(jButton1)))))
                .add(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel1)
                                    .add(uniTiempo_JCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel2)
                                    .add(cantTiempo_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(14, 14, 14)
                                .add(mostrarTabla_JCheck)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11)
                            .add(agregarDemanda_JButton)
                            .add(jLabel12)
                            .add(probDemanda_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(demanda_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(entrega_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(agregarEntrega_JButton)
                            .add(jLabel16)
                            .add(probEntrega_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel15))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel17)
                            .add(entrega_JText1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(agregarEspera_JButton)
                            .add(jLabel18)
                            .add(probEntrega_JText1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel19)
                            .add(costoInv_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel20)
                            .add(costoCompra_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel21)
                            .add(costoOrden_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel22)
                            .add(costoConEspera_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel23)
                            .add(costoSinEspera_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel24)
                            .add(inventarioInicial_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 8, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jButton1)))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Position");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantTiempo_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantTiempo_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantTiempo_JTextActionPerformed

    private void mostrarTabla_JCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTabla_JCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarTabla_JCheckActionPerformed

    private void uniTiempo_JComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniTiempo_JComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniTiempo_JComboActionPerformed

    private void demanda_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demanda_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demanda_JTextActionPerformed

    private void probDemanda_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probDemanda_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probDemanda_JTextActionPerformed

    private void agregarDemanda_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDemanda_JButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarDemanda_JButtonActionPerformed

    private void entrega_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrega_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrega_JTextActionPerformed

    private void probEntrega_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probEntrega_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probEntrega_JTextActionPerformed

    private void agregarEntrega_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEntrega_JButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarEntrega_JButtonActionPerformed

    private void entrega_JText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrega_JText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrega_JText1ActionPerformed

    private void probEntrega_JText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probEntrega_JText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probEntrega_JText1ActionPerformed

    private void agregarEspera_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEspera_JButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarEspera_JButtonActionPerformed

    private void costoInv_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoInv_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoInv_JTextActionPerformed

    private void costoCompra_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoCompra_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoCompra_JTextActionPerformed

    private void costoOrden_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoOrden_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoOrden_JTextActionPerformed

    private void costoConEspera_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoConEspera_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoConEspera_JTextActionPerformed

    private void costoSinEspera_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoSinEspera_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoSinEspera_JTextActionPerformed

    private void inventarioInicial_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioInicial_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventarioInicial_JTextActionPerformed
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
        
        System.out.println("demandas: ");
        System.out.println(Tiempos.demandas);
        
        System.out.println("entregas:");
        System.out.println(Tiempos.entregas);
        
        System.out.println("esperas:");
        System.out.println(Tiempos.esperas);
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarDemanda_JButton;
    private javax.swing.JButton agregarEntrega_JButton;
    private javax.swing.JButton agregarEspera_JButton;
    private javax.swing.JTextField cantTiempo_JText;
    private javax.swing.JTextField costoCompra_JText;
    private javax.swing.JTextField costoConEspera_JText;
    private javax.swing.JTextField costoInv_JText;
    private javax.swing.JTextField costoOrden_JText;
    private javax.swing.JTextField costoSinEspera_JText;
    private javax.swing.JTextField demanda_JText;
    private javax.swing.JTextField entrega_JText;
    private javax.swing.JTextField entrega_JText1;
    private javax.swing.JTextField inventarioInicial_JText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox mostrarTabla_JCheck;
    private javax.swing.JTextField probDemanda_JText;
    private javax.swing.JTextField probEntrega_JText;
    private javax.swing.JTextField probEntrega_JText1;
    private javax.swing.JComboBox uniTiempo_JCombo;
    // End of variables declaration//GEN-END:variables
    
}
