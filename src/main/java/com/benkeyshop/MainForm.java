package com.benkeyshop;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/** Form pembuka NetBeans GUI Builder untuk aplikasi BenkeyShop. */
public class MainForm extends javax.swing.JFrame {
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(17, 24, 27));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        mainPanel = new javax.swing.JPanel();
        brandLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        openButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        footerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BenkeyShop | Smart Retail");
        setMinimumSize(new java.awt.Dimension(700, 460));
        setPreferredSize(new java.awt.Dimension(820, 520));

        mainPanel.setBackground(new java.awt.Color(17, 24, 27));
        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(35, 45, 25, 45));

        brandLabel.setFont(new java.awt.Font("SansSerif", 1, 42));
        brandLabel.setForeground(new java.awt.Color(153, 220, 92));
        brandLabel.setText("BenkeyShop");

        subtitleLabel.setFont(new java.awt.Font("SansSerif", 1, 13));
        subtitleLabel.setForeground(new java.awt.Color(166, 181, 177));
        subtitleLabel.setText("SMART RETAIL  /  POINT OF SALE");

        descriptionLabel.setFont(new java.awt.Font("SansSerif", 0, 15));
        descriptionLabel.setForeground(new java.awt.Color(230, 238, 234));
        descriptionLabel.setText("Kelola produk, transaksi kasir, struk, dan laporan penjualan dalam satu aplikasi.");

        openButton.setBackground(new java.awt.Color(153, 220, 92));
        openButton.setFont(new java.awt.Font("SansSerif", 1, 15));
        openButton.setForeground(new java.awt.Color(20, 29, 24));
        openButton.setText("Buka Aplikasi Kasir  →");
        openButton.setFocusPainted(false);
        openButton.addActionListener(evt -> openButtonActionPerformed(evt));

        exitButton.setBackground(new java.awt.Color(43, 58, 57));
        exitButton.setFont(new java.awt.Font("SansSerif", 0, 14));
        exitButton.setForeground(java.awt.Color.WHITE);
        exitButton.setText("Keluar");
        exitButton.setFocusPainted(false);
        exitButton.addActionListener(evt -> System.exit(0));

        footerLabel.setFont(new java.awt.Font("SansSerif", 0, 12));
        footerLabel.setForeground(new java.awt.Color(130, 150, 143));
        footerLabel.setText("JAVA 21  •  MAVEN  •  MYSQL / XAMPP  •  OOP");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(brandLabel)
                .addComponent(subtitleLabel)
                .addComponent(descriptionLabel)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(footerLabel)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(brandLabel)
                .addGap(4, 4, 4)
                .addComponent(subtitleLabel)
                .addGap(26, 26, 26)
                .addComponent(descriptionLabel)
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(footerLabel)
        );

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        dispose();
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }//GEN-LAST:event_openButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        UIManager.put("Component.arc", 14);
        UIManager.put("Button.arc", 16);
        SwingUtilities.invokeLater(() -> new MainForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel footerLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton openButton;
    private javax.swing.JLabel subtitleLabel;
    // End of variables declaration//GEN-END:variables
}
