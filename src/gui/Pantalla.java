package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import procesos.Calculos;
import procesos.Constantes;
import procesos.Distribucion;
import procesos.EstructuraResultados;
import procesos.Simulacion;
import procesos.ManejoArchivos;

public class Pantalla extends javax.swing.JFrame {
    private ManejoArchivos archivos = new ManejoArchivos();
    public Pantalla() {
        initComponents();
        validarDatos();
        this.jPanel2.setVisible(false);
        this.setTitle("Simulacion de inventario");
        Border blackline = BorderFactory.createTitledBorder("Oxígenos de Oriente");
        jPanel1.setBorder(blackline);
        this.setLocationRelativeTo(null);
    }
    
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
    }
    
    //esta clase permite validar que el usuario ingrese numeros validos
    private class IntegerListener extends KeyAdapter {
         public void keyPressed(KeyEvent ke) {
            char c = ke.getKeyChar();
            if (Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE) {
               ((JTextField)ke.getSource()).setEditable(true);
            } else {
               ((JTextField)ke.getSource()).setEditable(false);
               JOptionPane.showMessageDialog(null, "La entrada debe ser un numero entero!","ERROR",JOptionPane.WARNING_MESSAGE);
            }
         }
    }
    
    //esta clase permite validar que el usuario ingrese costos validos
    private class DecimalListener extends KeyAdapter {
         public void keyPressed(KeyEvent ke) {
            char c = ke.getKeyChar();
            if (Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD) {
               ((JTextField)ke.getSource()).setEditable(true);
            } else {
               ((JTextField)ke.getSource()).setEditable(false);
               JOptionPane.showMessageDialog(null, "La entrada debe ser un numero!","ERROR",JOptionPane.WARNING_MESSAGE);
            }
         }
    }
    
    private void validarDatos() {
        //Oyentes de teclas para validar cada entrada numerica
        cantTiempo_JText.addKeyListener(new IntegerListener());
        costoCompra_JText.addKeyListener(new DecimalListener());
        costoConEspera_JText.addKeyListener(new DecimalListener());
        costoInv_JText.addKeyListener(new DecimalListener());
        costoOrden_JText.addKeyListener(new DecimalListener());
        costoSinEspera_JText.addKeyListener(new DecimalListener());
        demanda_JText.addKeyListener(new IntegerListener());
        entrega_JText.addKeyListener(new IntegerListener());
        espera_JText.addKeyListener(new IntegerListener());
        inventarioInicial_JText.addKeyListener(new IntegerListener());
        probDemanda_JText.addKeyListener(new DecimalListener());
        probEntrega_JText.addKeyListener(new DecimalListener());
        probEspera_JText.addKeyListener(new DecimalListener());     
       
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
        espera_JText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        probEspera_JText = new javax.swing.JTextField();
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
        iniciarSimulacion_JButton = new javax.swing.JButton();
        uniTiempo_JCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Antenna");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Position/Direction "));

        jLabel1.setText("Unidad de tiempo:");

        jLabel2.setText("Cantidad de tiempo:");

        cantTiempo_JText.setText("1440");
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

        demanda_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demanda_JTextActionPerformed(evt);
            }
        });

        jLabel12.setText("Probabilidad (%):");

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

        entrega_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrega_JTextActionPerformed(evt);
            }
        });

        jLabel16.setText("Probabilidad (%):");

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

        espera_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espera_JTextActionPerformed(evt);
            }
        });

        jLabel18.setText("Probabilidad (%):");

        probEspera_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probEspera_JTextActionPerformed(evt);
            }
        });

        agregarEspera_JButton.setText("Agregar");
        agregarEspera_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEspera_JButtonActionPerformed(evt);
            }
        });

        jLabel19.setText("Costo de inventario ($/unidad/año):");

        costoInv_JText.setText("40");
        costoInv_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoInv_JTextActionPerformed(evt);
            }
        });

        costoCompra_JText.setText("400");
        costoCompra_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoCompra_JTextActionPerformed(evt);
            }
        });

        jLabel20.setText("Costo de compra ($/unidad):");

        jLabel21.setText("Costo por orden ($/orden):");

        costoOrden_JText.setText("50");
        costoOrden_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoOrden_JTextActionPerformed(evt);
            }
        });

        jLabel22.setText("Costo de faltante con espera ($/unidad):");

        costoConEspera_JText.setText("41.6");
        costoConEspera_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoConEspera_JTextActionPerformed(evt);
            }
        });

        jLabel23.setText("Costo de faltante sin espera ($/unidad):");

        costoSinEspera_JText.setText("161.6");
        costoSinEspera_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoSinEspera_JTextActionPerformed(evt);
            }
        });

        jLabel24.setText("Inventario inicial (unidades):");

        inventarioInicial_JText.setText("50");
        inventarioInicial_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioInicial_JTextActionPerformed(evt);
            }
        });

        iniciarSimulacion_JButton.setText("Iniciar Simulacion");
        iniciarSimulacion_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSimulacion_JButtonActionPerformed(evt);
            }
        });

        uniTiempo_JCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dias", "Semanas", "Meses", "Bimestres", "Trimestres" }));
        uniTiempo_JCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniTiempo_JComboActionPerformed(evt);
            }
        });

        jButton1.setText("Leer Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel2)
                                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(uniTiempo_JCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(cantTiempo_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel15)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(entrega_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jLabel16)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(probEntrega_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(agregarEntrega_JButton)))
                        .add(187, 187, 187))
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
                                                .add(espera_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(jLabel18)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(probEspera_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                        .add(18, 18, 18)
                                        .add(agregarEspera_JButton)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 248, Short.MAX_VALUE)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(iniciarSimulacion_JButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .add(14, 14, 14))))
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
                            .add(agregarDemanda_JButton)
                            .add(jLabel12)
                            .add(probDemanda_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(demanda_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel11))
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
                            .add(espera_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(agregarEspera_JButton)
                            .add(jLabel18)
                            .add(probEspera_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel19)
                            .add(costoInv_JText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                        .add(0, 115, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jButton1)
                        .add(18, 18, 18)
                        .add(iniciarSimulacion_JButton)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));
        jPanel1.getAccessibleContext().setAccessibleName("Position");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados:"));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(830, 500));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Dia", "Inventario inicial", "Demanda", "Inventario Final", "Inv. Promedio", "Faltantes", "Orden", "T. Entrega", "T. Espera"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Q =");

        jLabel4.setText("R =");

        jLabel5.setText("q");

        jLabel6.setText("r");

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Resultados del mejor caso:");

        jLabel8.setText("Costo de Inventario:");

        jLabel9.setText("resultado");

        jLabel10.setText("Costo de Ordenes:");

        jLabel13.setText("Costo total de faltantes:");

        jLabel14.setText("Costo de Compra:");

        jLabel25.setText("Costo Total:");

        jLabel26.setText("resultado");

        jLabel27.setText("resultado");

        jLabel28.setText("resultado");

        jLabel29.setText("resultado");

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel30.setText("Costo faltantes con espera: ");

        jLabel31.setText("resultado");

        jLabel32.setText("Costo faltantes sin espera:");

        jLabel33.setText("resultado");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel5)
                        .add(46, 46, 46)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel6))
                    .add(jLabel7)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel32)
                            .add(jLabel30)
                            .add(jLabel13))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel29)
                            .add(jLabel31)
                            .add(jLabel33))))
                .add(57, 57, 57)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel27))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel14)
                                .add(18, 18, 18)
                                .add(jLabel26)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jButton2))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel8)
                            .add(jLabel10))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel28)
                            .add(jLabel9))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 286, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 27, Short.MAX_VALUE)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel5)
                    .add(jLabel6)
                    .add(jLabel4)
                    .add(jLabel10)
                    .add(jLabel28))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel30)
                    .add(jLabel31)
                    .add(jLabel8)
                    .add(jLabel9))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton2)
                            .add(jButton3))
                        .add(36, 36, 36))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel33)
                                    .add(jLabel14)
                                    .add(jLabel26))
                                .add(12, 12, 12))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                .add(jLabel32)
                                .add(18, 18, 18)))
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel13)
                            .add(jLabel29)
                            .add(jLabel25, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel27))
                        .add(24, 24, 24))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

        getAccessibleContext().setAccessibleName("Simulación de inventario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantTiempo_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantTiempo_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantTiempo_JTextActionPerformed

    private void mostrarTabla_JCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTabla_JCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarTabla_JCheckActionPerformed

    private void demanda_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demanda_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demanda_JTextActionPerformed

    private void probDemanda_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probDemanda_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probDemanda_JTextActionPerformed
    
    //al agregar la demanda validar su probabilidad correcta
    private void agregarDemanda_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDemanda_JButtonActionPerformed
        double valor = Double.parseDouble(probDemanda_JText.getText());
        if (valor > 100 || valor <= 0) {
            JOptionPane.showMessageDialog(null, "La probabilidad debe ser entre 1 y 100!","ERROR",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int demanda = Integer.parseInt(demanda_JText.getText());
        Constantes.demandas.add(new Distribucion(demanda, valor));
        
        demanda_JText.setText("");
        probDemanda_JText.setText("");
    }//GEN-LAST:event_agregarDemanda_JButtonActionPerformed

    private void entrega_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrega_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrega_JTextActionPerformed

    private void probEntrega_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probEntrega_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probEntrega_JTextActionPerformed

    private void agregarEntrega_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEntrega_JButtonActionPerformed
        double valor = Double.parseDouble(probEntrega_JText.getText());
        if (valor > 100 || valor <= 0) {
            JOptionPane.showMessageDialog(null, "La probabilidad debe ser entre 1 y 100!","ERROR",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int entrega = Integer.parseInt(entrega_JText.getText());
        Constantes.entregas.add(new Distribucion(entrega, valor));
        
        entrega_JText.setText("");
        probEntrega_JText.setText("");
    }//GEN-LAST:event_agregarEntrega_JButtonActionPerformed

    private void espera_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espera_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espera_JTextActionPerformed

    private void probEspera_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probEspera_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probEspera_JTextActionPerformed

    private void agregarEspera_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEspera_JButtonActionPerformed
        double valor = Double.parseDouble(probEspera_JText.getText());
        if (valor > 100 || valor <= 0) {
            JOptionPane.showMessageDialog(null, "La probabilidad debe ser entre 1 y 100!","ERROR",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int espera = Integer.parseInt(espera_JText.getText());
        Constantes.esperas.add(new Distribucion(espera, valor));
        
        espera_JText.setText("");
        probEspera_JText.setText("");
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

    private void iniciarSimulacion_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSimulacion_JButtonActionPerformed
        
        Constantes.inventarioInicial = Integer.parseInt(inventarioInicial_JText.getText());
        Constantes.costoCompra = Double.parseDouble(costoCompra_JText.getText());
        Constantes.costoInventario = Double.parseDouble(costoInv_JText.getText());
        Constantes.costoOrden = Double.parseDouble(costoOrden_JText.getText());
        Constantes.costoCompra = Double.parseDouble(costoCompra_JText.getText());
        Constantes.costoFaltanteConEspera = Double.parseDouble(costoConEspera_JText.getText());
        Constantes.costoFaltanteSinEspera = Double.parseDouble(costoSinEspera_JText.getText());
        Constantes.numeroDias = Integer.parseInt(cantTiempo_JText.getText());
        
        DecimalFormat formato = new DecimalFormat("#,###,###.##");
        
        String uniTiempo = uniTiempo_JCombo.getSelectedItem().toString();
        Constantes.unidadTiempo = uniTiempo;
        
        //inciar con valores de prueba a las distribuciones
        //Constantes.insertarDatosPruebaOxigeno();
        Calculos.calcularProbAcumulada();
        
        System.out.println("demandas: ");
        System.out.println(Constantes.demandas);
        
        System.out.println("entregas:");
        System.out.println(Constantes.entregas);
        
        System.out.println("esperas:");
        System.out.println(Constantes.esperas);
        
        //Asumiendo que los valores se ingresaron ordenados de menor a mayor
        int demandaMin = Constantes.demandas.get(0).getValor();
        int demandaMax = Constantes.demandas.get(Constantes.demandas.size()-1).getValor();
        double entregaMin = Constantes.entregas.get(0).getValor();
        double entregaMax = Constantes.entregas.get(Constantes.entregas.size()-1).getValor();;
        int qMin = 0;
        int qMax = 0;
        int rMin = 0;
        int rMax = 0;
       
        //transormar las demandas a sus equivalentes anuales
        if (uniTiempo.equals("Dias")) {
            demandaMin *= 360;
            demandaMax *= 360;
            entregaMin /= 360.0;
            entregaMax /= 360.0;
        } else if (uniTiempo.equals("Semanas")) {
            demandaMin *= 52;
            demandaMax *= 52;
            entregaMin /= 52.0;
            entregaMax /= 52.0;
        } else if (uniTiempo.equals("Meses")) {
            demandaMin *= 12;
            demandaMax *= 12;
            entregaMin /= 12.0;
            entregaMax /= 12.0;
        } else if (uniTiempo.equals("Bimestres")) {
            demandaMin *= 6;
            demandaMax *= 6;
            entregaMin /= 6.0;
            entregaMax /= 6.0;
        } else if (uniTiempo.equals("Trimestres")) {
            demandaMin *= 4;
            demandaMax *= 4;
            entregaMin /= 4.0;
            entregaMax /= 4.0;
        }
        
        //Q minima calculada con la demanda minima, costo de escasez maximo y sin tiempo de espera
        qMin = Calculos.calcularQ(demandaMin, Constantes.costoOrden, Constantes.costoInventario, Constantes.costoFaltanteSinEspera);
        qMin = qMin == 0 ? 1 : qMin;
        
        //Q maxima calculada con la demanda maxima, costo de escasez minimo y con tiempo de espera
        qMax = Calculos.calcularQ(demandaMax, Constantes.costoOrden, Constantes.costoInventario, Constantes.costoFaltanteConEspera);
        
        //R minimo calculado con la demanda minima y el tiempo de entrega minimo
        rMin = Calculos.calcularR(demandaMin, entregaMin, qMin);
        rMin = 10;
        
        //R maximo calculado con la demanda maxima y el tiempo de entrega maximo
        rMax = Calculos.calcularR(demandaMax, entregaMax, qMax);
        rMax = qMax-1;
        
        System.out.println("demanda min "+demandaMin + " demandaMax "+demandaMax);
        System.out.println("entrega min "+entregaMin + " entregaMax "+entregaMax);
        
        System.out.println("qmin "+qMin+" qmax "+qMax);
        System.out.println("rmin "+rMin+" rmax "+rMax);
        
        if(!this.mostrarTabla_JCheck.isSelected()){
            DefaultTableModel modelo = new DefaultTableModel(new String [] {"", "", "", "", ""},0);
            jTable1.setModel(modelo);
            EstructuraResultados aux3;
            int j = 0; 
            //ciclo de todas las simulaciones posibles
            for (int q = qMin; q <= qMax; q++) {
                for (int r = rMin; r <= rMax && r < q; r++) {
                    new Simulacion(q, r); 
                    modelo.addRow(new Object[]{"Q:", q, "R:", r});
                    aux3 = Constantes.resultados.get(j);
                    modelo.addRow(new Object[]{ "COSTOS:"});
                    modelo.addRow(new Object[]{"Inventario:", "Orden:", "Compra:", "Faltante:","Total:"});
                    modelo.addRow(new Object[]{
                    formato.format(aux3.getCostoInventario()), 
                    formato.format(aux3.getCostoOrden()), 
                    formato.format(aux3.getCostoCompra()), 
                    formato.format(aux3.getCostoFaltante()), 
                    formato.format(aux3.getCostoTotal())
                    });
                    modelo.addRow(new Object[]{""});
                    j++;
                }
            }
        }else{
            Simulacion prueba = new Simulacion();
            DefaultTableModel modelo = new DefaultTableModel(new String [] {"Dia", "Inventario inicial", "Demanda", "Inventario Final", "Inv. Promedio", "Faltantes", "Orden", "T. Entrega", "T. Espera"},0);
            jTable1.setModel(modelo);
            String [][] tabla = null;
            EstructuraResultados aux3;
            int j = 0; 
            //ciclo de todas las simulaciones posibles
            for (int q = qMin; q <= qMax; q++) {
                for (int r = rMin; r <= rMax && r < q; r++) {
                    tabla = prueba.simulacionFinal(q, r);
                    modelo.addRow(new Object[]{"Q:", q, "R:", r});
                    for(int i = 1; i <= Constantes.numeroDias; i++){
                        modelo.addRow(tabla[i-1]);
                    }
                    aux3 = Constantes.resultados.get(j);
                    modelo.addRow(new Object[]{ "COSTOS:"});
                    modelo.addRow(new Object[]{"Inventario:", "Orden:", "Compra:", "Faltante:","Total:"});
                    modelo.addRow(new Object[]{
                        formato.format(aux3.getCostoInventario()), 
                        formato.format(aux3.getCostoOrden()), 
                        formato.format(aux3.getCostoCompra()), 
                        formato.format(aux3.getCostoFaltante()), 
                        formato.format(aux3.getCostoTotal())
                    });
                   modelo.addRow(new Object[]{""});
                   j++;
                }
            }
        }
                
        //determinar la mejor simulacion e imprimir su resultado
        EstructuraResultados aux = Calculos.determinarMejorCaso();        
        this.jPanel1.setVisible(false);
        this.jLabel5.setText(String.valueOf(aux.getQ()));
        this.jLabel6.setText(String.valueOf(aux.getR()));
        this.jLabel9.setText(String.valueOf(formato.format(aux.getCostoInventario())));
        this.jLabel28.setText(String.valueOf(formato.format(aux.getCostoOrden())));
        this.jLabel26.setText(String.valueOf(formato.format(aux.getCostoCompra())));
        this.jLabel29.setText(String.valueOf(formato.format(aux.getCostoFaltante())));
        this.jLabel27.setText(String.valueOf(formato.format(aux.getCostoTotal())));
        this.jLabel31.setText(String.valueOf(formato.format(aux.getFaltantesConEspera())));
        this.jLabel33.setText(String.valueOf(formato.format(aux.getFaltantesSinEspera())));
        this.jPanel2.setVisible(true);
    }//GEN-LAST:event_iniciarSimulacion_JButtonActionPerformed

    private void uniTiempo_JComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniTiempo_JComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniTiempo_JComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i;
        ArrayList<String> aux = new ArrayList<String>();
        ArrayList<String> demanda = new ArrayList<String>();
        ArrayList<String> tEntrega = new ArrayList<String>();
        ArrayList<String> tEspera = new ArrayList<String>();
        aux = archivos.leerArchivo();
        this.cantTiempo_JText.setText(aux.get(1));
        this.costoInv_JText.setText(aux.get(4));
        this.costoCompra_JText.setText(aux.get(6));
        this.costoOrden_JText.setText(aux.get(8));
        this.costoConEspera_JText.setText(aux.get(10));
        this.costoSinEspera_JText.setText(aux.get(12));
        this.inventarioInicial_JText.setText(aux.get(14));
        i = 17;
        while(!aux.get(i).equalsIgnoreCase("tiempos de entrega")){
            demanda.add(aux.get(i));
            i++;
        }i++;
        while(!aux.get(i).equalsIgnoreCase("tiempos de espera")){
            tEntrega.add(aux.get(i));
            i++;
        }i++;
        while(!aux.get(i).equalsIgnoreCase("fin")){
            tEspera.add(aux.get(i));
            i++;
        }
        for(i = 0; i < demanda.size(); i++){
            Constantes.demandas.add(new Distribucion(Integer.parseInt(demanda.get(i)), Float.parseFloat(demanda.get(++i))));
           
        }
        for(i = 0; i < tEntrega.size()-1; i++){
            Constantes.entregas.add(new Distribucion(Integer.parseInt(tEntrega.get(i)), Float.parseFloat(tEntrega.get(++i))));
        }
        for(i = 0; i < tEspera.size()-1; i++){
            Constantes.esperas.add(new Distribucion(Integer.parseInt(tEspera.get(i)), Float.parseFloat(tEspera.get(++i))));
        }
        this.demanda_JText.setText("");
        this.probDemanda_JText.setText("");
        this.entrega_JText.setText("");
        this.probEntrega_JText.setText("");
        this.espera_JText.setText("");
        this.probEspera_JText.setText("");
        JOptionPane.showMessageDialog(null, "Archivo leido satisfactoriamente");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jPanel2.setVisible(false);
        this.jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.archivos.escribirArchivo();
       System.out.println("Done");
    }//GEN-LAST:event_jButton3ActionPerformed
         
    
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
    private javax.swing.JTextField espera_JText;
    private javax.swing.JButton iniciarSimulacion_JButton;
    private javax.swing.JTextField inventarioInicial_JText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox mostrarTabla_JCheck;
    private javax.swing.JTextField probDemanda_JText;
    private javax.swing.JTextField probEntrega_JText;
    private javax.swing.JTextField probEspera_JText;
    private javax.swing.JComboBox<String> uniTiempo_JCombo;
    // End of variables declaration//GEN-END:variables
    
}
