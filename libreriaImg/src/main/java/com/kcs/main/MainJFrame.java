/*
 * Click nbfs://nbho    @Override
    public int getWidth(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getHeight(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ImageProducer getSource() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
st/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kcs.main;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author ciclot
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
    }

    // Variables
    int banco = 0;

    DefaultListModel<String> modeloLista = new DefaultListModel<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kgrPrincipal = new keeptoo.KGradientPanel();
        jSplitPaneBotones = new javax.swing.JSplitPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelLista = new javax.swing.JPanel();
        jScrollPaneLista = new javax.swing.JScrollPane();
        jListImg = new javax.swing.JList<>();
        jPanelImg = new javax.swing.JPanel();
        jLabelImg = new javax.swing.JLabel();
        jMenuBarImg = new javax.swing.JMenuBar();
        jMenuBancos = new javax.swing.JMenu();
        jMenuItemB1 = new javax.swing.JMenuItem();
        jMenuItemB2 = new javax.swing.JMenuItem();
        jMenuItemB3 = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 610));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 610));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        kgrPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kgrPrincipal.setkEndColor(new java.awt.Color(255, 255, 0));
        kgrPrincipal.setkGradientFocus(1000);
        kgrPrincipal.setkStartColor(new java.awt.Color(255, 51, 255));

        jSplitPaneBotones.setDividerLocation(275);
        jSplitPaneBotones.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("↑");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickNext(evt);
            }
        });
        jSplitPaneBotones.setTopComponent(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("↓");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAnterior(evt);
            }
        });
        jSplitPaneBotones.setRightComponent(jButton2);

        jPanelLista.setBackground(new java.awt.Color(150, 150, 150));
        jPanelLista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanelLista.setLayout(new java.awt.GridLayout(1, 0));

        jListImg.setBackground(new java.awt.Color(150, 150, 150));
        jListImg.setBorder(null);
        jListImg.setForeground(new java.awt.Color(255, 255, 255));
        jListImg.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                cambioElementoLista(evt);
            }
        });
        jScrollPaneLista.setViewportView(jListImg);

        jPanelLista.add(jScrollPaneLista);

        jPanelImg.setBackground(new java.awt.Color(150, 150, 150));
        jPanelImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanelImg.setLayout(new java.awt.GridLayout(1, 1));

        jLabelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelImg.add(jLabelImg);

        javax.swing.GroupLayout kgrPrincipalLayout = new javax.swing.GroupLayout(kgrPrincipal);
        kgrPrincipal.setLayout(kgrPrincipalLayout);
        kgrPrincipalLayout.setHorizontalGroup(
            kgrPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrPrincipalLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSplitPaneBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        kgrPrincipalLayout.setVerticalGroup(
            kgrPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kgrPrincipalLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(kgrPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSplitPaneBotones)
                    .addComponent(jPanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addComponent(jPanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(kgrPrincipal);

        jMenuBarImg.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBarImg.setBorder(null);
        jMenuBarImg.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBarImg.setToolTipText("");
        jMenuBarImg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBarImg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menuArrastre(evt);
            }
        });

        jMenuBancos.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBancos.setBorder(null);
        jMenuBancos.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBancos.setText("Carpetas");

        jMenuItemB1.setText("Banco1");
        jMenuItemB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancoClick1(evt);
            }
        });
        jMenuBancos.add(jMenuItemB1);

        jMenuItemB2.setText("Banco2");
        jMenuItemB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancoClick2(evt);
            }
        });
        jMenuBancos.add(jMenuItemB2);

        jMenuItemB3.setText("Banco3");
        jMenuItemB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancoClick3(evt);
            }
        });
        jMenuBancos.add(jMenuItemB3);

        jMenuBarImg.add(jMenuBancos);

        jMenuEditar.setText("Edición");
        jMenuBarImg.add(jMenuEditar);

        setJMenuBar(jMenuBarImg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArrastre(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArrastre

    }//GEN-LAST:event_menuArrastre

    private void bancoClick1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancoClick1
        banco = 1;
        DefaultListModel<String> modeloLista = obtenerModeloLista(1);
        jListImg.setModel(modeloLista);
        jListImg.setSelectedIndex(0);
    }//GEN-LAST:event_bancoClick1

    private void bancoClick2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancoClick2
        banco = 2;
        DefaultListModel<String> modeloLista = obtenerModeloLista(2);
        jListImg.setModel(modeloLista);
        jListImg.setSelectedIndex(0);
    }//GEN-LAST:event_bancoClick2

    private void bancoClick3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancoClick3
        banco = 3;
        DefaultListModel<String> modeloLista = obtenerModeloLista(3);
        jListImg.setModel(modeloLista);
        jListImg.setSelectedIndex(0);
    }//GEN-LAST:event_bancoClick3

    private void clickNext(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickNext
        if (jListImg.getSelectedIndex() != jListImg.getFirstVisibleIndex()) {
            jListImg.setSelectedIndex(jListImg.getSelectedIndex() - 1);
        } else {
            jListImg.setSelectedIndex(jListImg.getLastVisibleIndex());
        }
    }//GEN-LAST:event_clickNext

    private void clickAnterior(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAnterior
        if (jListImg.getSelectedIndex() != jListImg.getLastVisibleIndex()) {
            jListImg.setSelectedIndex(jListImg.getSelectedIndex() + 1);
        } else {
            jListImg.setSelectedIndex(jListImg.getFirstVisibleIndex());
        }
    }//GEN-LAST:event_clickAnterior

    private void cambioElementoLista(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_cambioElementoLista
        String elementoSeleccionado = "";

        if (!evt.getValueIsAdjusting()) {
            int indiceSeleccionado = jListImg.getSelectedIndex();
            if (indiceSeleccionado != -1) {
                elementoSeleccionado = modeloLista.getElementAt(indiceSeleccionado);
            }
        }

        switch (elementoSeleccionado) {
            case "paisaje1.jpg":
                establecerFondo("paisaje1.jpg");
                break;
            case "paisaje2.jpg":
                establecerFondo("paisaje2.jpg");
                break;
            case "paisaje3.jpg":
                establecerFondo("paisaje3.jpg");
                break;
            case "paisaje4.jpg":
                establecerFondo("paisaje4.jpg");
                break;
            case "paisaje5.jpg":
                establecerFondo("paisaje5.jpg");
                break;
            case "paisaje6.jpg":
                establecerFondo("paisaje6.jpg");
                break;
            case "paisaje7.jpg":
                establecerFondo("paisaje7.jpg");
                break;
            case "paisaje8.jpg":
                establecerFondo("paisaje8.jpg");
                break;
            case "paisaje9.jpg":
                establecerFondo("paisaje9.jpg");
                break;
            case "paisaje10.jpg":
                establecerFondo("paisaje10.jpg");
                break;
            case "paisaje11.jpg":
                establecerFondo("paisaje11.jpg");
                break;
            case "paisaje12.jpg":
                establecerFondo("paisaje12.jpg");
                break;
            case "paisaje13.jpg":
                establecerFondo("paisaje13.jpg");
                break;
            case "paisaje14.jpg":
                establecerFondo("paisaje14.jpg");
                break;
            case "paisaje15.jpg":
                establecerFondo("paisaje15.jpg");
                break;
            case "paisaje16.jpg":
                establecerFondo("paisaje16.jpg");
                break;
            case "paisaje17.jpg":
                establecerFondo("paisaje17.jpg");
                break;
            case "paisaje18.jpg":
                establecerFondo("paisaje18.jpg");
                break;
            case "paisaje19.jpg":
                establecerFondo("paisaje19.jpg");
                break;
            case "paisaje20.jpg":
                establecerFondo("paisaje20.jpg");
                break;
            case "paisaje21.jpg":
                establecerFondo("paisaje21.jpg");
                break;
            case "paisaje22.jpg":
                establecerFondo("paisaje22.jpg");
                break;
            case "paisaje23.jpg":
                establecerFondo("paisaje23.jpg");
                break;
            case "paisaje24.jpg":
                establecerFondo("paisaje24.jpg");
                break;
            case "paisaje25.jpg":
                establecerFondo("paisaje25.jpg");
                break;
            case "paisaje26.jpg":
                establecerFondo("paisaje26.jpg");
                break;
            case "paisaje27.jpg":
                establecerFondo("paisaje27.jpg");
                break;
            case "paisaje28.jpg":
                establecerFondo("paisaje28.jpg");
                break;
            case "paisaje29.jpg":
                establecerFondo("paisaje29.jpg");
                break;
            case "paisaje30.jpg":
                establecerFondo("paisaje30.jpg");
                break;
            /* ----- */
            case "ave.jpg":
                establecerFondo("ave.jpg");
                break;
            case "caballos.jpg":
                establecerFondo("caballos.jpg");
                break;
            case "carpincho.jpg":
                establecerFondo("carpincho.jpg");
                break;
            case "cerdos.jpg":
                establecerFondo("cerdos.jpg");
                break;
            case "ciervo.jpg":
                establecerFondo("ciervo.jpg");
                break;
            case "ciervos.jpg":
                establecerFondo("ciervos.jpg");
                break;
            case "conejos.jpg":
                establecerFondo("conejos.jpg");
                break;
            case "elefantes.jpg":
                establecerFondo("elefantes.jpg");
                break;
            case "flamenco.jpg":
                establecerFondo("flamenco.jpg");
                break;
            case "flamencos.jpg":
                establecerFondo("flamencos.jpg");
                break;
            case "gato.jpg":
                establecerFondo("gato.jpg");
                break;
            case "llamas.jpg":
                establecerFondo("llamas.jpg");
                break;
            case "manada.jpg":
                establecerFondo("manada.jpg");
                break;
            case "ocas.jpg":
                establecerFondo("ocas.jpg");
                break;
            case "oso.jpg":
                establecerFondo("oso.jpg");
                break;
            case "pez.jpg":
                establecerFondo("pez.jpg");
                break;
            case "tortuga.jpg":
                establecerFondo("tortuga.jpg");
                break;
            case "vacas.jpg":
                establecerFondo("vacas.jpg");
                break;
            case "primates.jpg":
                establecerFondo("primates.jpg");
                break;
            case "reptil.jpg":
                establecerFondo("reptil.jpg");
                break;
            /* ----- */
            case "cielo1.jpeg":
                establecerFondo("cielo1.jpeg");
                break;
            case "cielo2.jpeg":
                establecerFondo("cielo2.jpeg");
                break;
            case "cielo3.jpg":
                establecerFondo("cielo3.jpg");
                break;
            case "cielo4.jpg":
                establecerFondo("cielo4.jpg");
                break;
            case "cielo5.jpg":
                establecerFondo("cielo5.jpg");
                break;
            case "cielo6.jpg":
                establecerFondo("cielo6.jpg");
                break;
            case "cielo7.jpg":
                establecerFondo("cielo7.jpg");
                break;
            case "cielo8.jpg":
                establecerFondo("cielo8.jpg");
                break;
            case "cielo9.jpg":
                establecerFondo("cielo9.jpg");
                break;
            case "cielo10.jpg":
                establecerFondo("cielo10.jpg");
                break;
            case "cielo11.jpg":
                establecerFondo("cielo11.jpg");
                break;
            case "cielo12.jpg":
                establecerFondo("cielo12.jpg");
                break;
            case "cometa1.jpg":
                establecerFondo("cometa1.jpg");
                break;
            case "cometa2.jpg":
                establecerFondo("cometa2.jpg");
                break;
            case "luna1.jpg":
                establecerFondo("luna1.jpg");
                break;
            case "luna2.jpg":
                establecerFondo("luna2.jpg");
                break;
            case "luna3.jpg":
                establecerFondo("luna3.jpg");
                break;
            case "luna4.jpg":
                establecerFondo("luna4.jpg");
                break;
            case "luna5.jpg":
                establecerFondo("luna5.jpg");
                break;
            case "luna6.jpg":
                establecerFondo("luna6.jpg");
                break;
        }
    }//GEN-LAST:event_cambioElementoLista

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame frame = new MainJFrame();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JList<String> jListImg;
    private javax.swing.JMenu jMenuBancos;
    private javax.swing.JMenuBar jMenuBarImg;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuItemB1;
    private javax.swing.JMenuItem jMenuItemB2;
    private javax.swing.JMenuItem jMenuItemB3;
    private javax.swing.JPanel jPanelImg;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JScrollPane jScrollPaneLista;
    private javax.swing.JSplitPane jSplitPaneBotones;
    private keeptoo.KGradientPanel kgrPrincipal;
    // End of variables declaration//GEN-END:variables

    // Métodos
    private DefaultListModel<String> obtenerModeloLista(int banco) {

        switch (banco) {
            case 1:
                modeloLista.clear();

                String[] listaImg1 = {"paisaje1.jpg", "paisaje2.jpg", "paisaje3.jpg", "paisaje4.jpg", "paisaje5.jpg", "paisaje6.jpg", "paisaje7.jpg", "paisaje8.jpg", "paisaje9.jpg", "paisaje10.jpg", "paisaje11.jpg", "paisaje12.jpg", "paisaje13.jpg", "paisaje14.jpg", "paisaje15.jpg", "paisaje16.jpg", "paisaje17.jpg", "paisaje18.jpg", "paisaje19.jpg", "paisaje20.jpg", "paisaje21.jpg", "paisaje22.jpg", "paisaje23.jpg", "paisaje24.jpg", "paisaje25.jpg", "paisaje26.jpg", "paisaje27.jpg", "paisaje28.jpg", "paisaje29.jpg", "paisaje30.jpg"};

                for (String img : listaImg1) {
                    modeloLista.addElement(img);
                }
                break;
            case 2:
                modeloLista.clear();

                String[] listaImg2 = {"ave.jpg", "caballos.jpg", "carpincho.jpg", "cerdos.jpg", "ciervo.jpg", "ciervos.jpg", "conejos.jpg", "elefantes.jpg", "flamenco.jpg", "flamencos.jpg", "gato.jpg", "llamas.jpg", "manada.jpg", "ocas.jpg", "oso.jpg", "pez.jpg", "primates.jpg", "reptil.jpg", "tortuga.jpg", "vacas.jpg"};
                for (String img : listaImg2) {
                    modeloLista.addElement(img);
                }
                break;
            case 3:
                modeloLista.clear();

                String[] listaImg = {"cielo1.jpeg", "cielo2.jpeg", "cielo3.jpg", "cielo4.jpg", "cielo5.jpg", "cielo6.jpg", "cielo7.jpg", "cielo8.jpg", "cielo9.jpg", "cielo10.jpg", "cielo11.jpg", "cielo12.jpg", "cometa1.jpg", "cometa2.jpg", "luna1.jpg", "luna2.jpg", "luna3.jpg", "luna4.jpg", "luna5.jpg", "luna6.jpg"};

                for (String img : listaImg) {
                    modeloLista.addElement(img);
                }
                break;
        }
        // return
        return modeloLista;
    }

    private void establecerFondo(String nomImg) {
        String url = null;

        switch (banco) {
            case 1:
                url = "src\\main\\java\\com\\kcs\\banco1\\" + nomImg;
                break;
            case 2:
                url = "src\\main\\java\\com\\kcs\\banco2\\" + nomImg;
                break;
            case 3:
                url = "src\\main\\java\\com\\kcs\\banco3\\" + nomImg;
                break;
        }

        if (url != null) {
            ImageIcon imagenIcono = new ImageIcon(url);
            Image imagen = imagenIcono.getImage();
            Image imagenEscalada = imagen.getScaledInstance(jLabelImg.getWidth() - 20, jLabelImg.getHeight() - 20, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcono = new ImageIcon(imagenEscalada);
            jLabelImg.setIcon(imagenEscaladaIcono);
        }
    }
}
