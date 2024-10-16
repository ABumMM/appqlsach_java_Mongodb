/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelBoder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author anhng
 */
public class BarChartIcon extends javax.swing.JPanel {

    /**
     * Creates new form BarChartIcon
     */
    private int[] values = {10, 30, 20, 40, 15};
    private Color[] colors = {
        new Color(255, 153, 0),
        new Color(249, 163, 76),
        new Color(255, 204, 102),
        new Color(255, 204, 153),
        new Color(255,153,153)
    };

    public BarChartIcon() {
        initComponents();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int barWidth = getWidth() / values.length;

        for (int i = 0; i < values.length; i++) {
            int barHeight = values[i] * getHeight() / 50;
            g2.setColor(colors[i % colors.length]); // Set màu cho mỗi thanh
            g2.fillRect(i * barWidth, getHeight() - barHeight, barWidth - 2, barHeight);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
