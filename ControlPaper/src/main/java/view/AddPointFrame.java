package view;

import controller.PointController;
import java.awt.Component;
import java.util.Calendar;
import model.Point;
import model.Worker;

public class AddPointFrame extends javax.swing.JFrame {
    Point point = null;
    PointController pointController = null;
    Worker worker = null;
    String description = "Entrada";
    public AddPointFrame(Component component, Worker worker) {
        this.worker = worker;
        initComponents();
        setLocationRelativeTo(component);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonIn = new javax.swing.JRadioButton();
        jRadioButtonOut = new javax.swing.JRadioButton();
        jRadioButtonLunch = new javax.swing.JRadioButton();
        jRadioButtonOther = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOther = new javax.swing.JTextArea();
        jLabelCreate = new javax.swing.JLabel();
        jLabelCancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar novo ponto");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Criar novo ponto");

        buttonGroup.add(jRadioButtonIn);
        jRadioButtonIn.setSelected(true);
        jRadioButtonIn.setText("Entrada");
        jRadioButtonIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonInMouseClicked(evt);
            }
        });

        buttonGroup.add(jRadioButtonOut);
        jRadioButtonOut.setText("Saída");
        jRadioButtonOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonOutMouseClicked(evt);
            }
        });

        buttonGroup.add(jRadioButtonLunch);
        jRadioButtonLunch.setText("Almoço");
        jRadioButtonLunch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonLunchMouseClicked(evt);
            }
        });

        buttonGroup.add(jRadioButtonOther);
        jRadioButtonOther.setText("Outro");
        jRadioButtonOther.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonOtherMouseClicked(evt);
            }
        });

        jTextAreaOther.setColumns(20);
        jTextAreaOther.setRows(5);
        jTextAreaOther.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaOther);

        jLabelCreate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCreate.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\add.png")); // NOI18N
        jLabelCreate.setText("Criar");
        jLabelCreate.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateMouseClicked(evt);
            }
        });

        jLabelCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCancel.setText("Cancelar");
        jLabelCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButtonIn)
                            .addComponent(jRadioButtonOut)
                            .addComponent(jRadioButtonLunch)
                            .addComponent(jRadioButtonOther))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCreate)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonLunch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonOther)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCreate)
                    .addComponent(jLabelCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOtherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonOtherMouseClicked
        jTextAreaOther.setEnabled(true);
        jTextAreaOther.setEditable(true);
        description = jTextAreaOther.getText();
    }//GEN-LAST:event_jRadioButtonOtherMouseClicked

    private void jRadioButtonLunchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonLunchMouseClicked
        jTextAreaOther.setEnabled(false);
        jTextAreaOther.setEditable(false);
        description = "Almoço";
    }//GEN-LAST:event_jRadioButtonLunchMouseClicked

    private void jRadioButtonOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonOutMouseClicked
        jTextAreaOther.setEnabled(false);
        jTextAreaOther.setEditable(false);
        description = "Saída";
    }//GEN-LAST:event_jRadioButtonOutMouseClicked

    private void jRadioButtonInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonInMouseClicked
        jTextAreaOther.setEnabled(false);
        jTextAreaOther.setEditable(false);
        description = "Entrada";
    }//GEN-LAST:event_jRadioButtonInMouseClicked

    private void jLabelCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateMouseClicked
        point = new Point(Calendar.getInstance());
        pointController = new PointController();
        point.setIdWorker(worker.getId());
        point.setDescription(description);
        pointController.save(point);
        dispose();
    }//GEN-LAST:event_jLabelCreateMouseClicked

    private void jLabelCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseClicked
        dispose();
    }//GEN-LAST:event_jLabelCancelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCancel;
    private javax.swing.JLabel jLabelCreate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonIn;
    private javax.swing.JRadioButton jRadioButtonLunch;
    private javax.swing.JRadioButton jRadioButtonOther;
    private javax.swing.JRadioButton jRadioButtonOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaOther;
    // End of variables declaration//GEN-END:variables
}
