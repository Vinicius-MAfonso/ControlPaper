package view;

import controller.WorkerController;
import java.awt.Component;
import model.Worker;

public class AddWorkerFrame extends javax.swing.JFrame {
    Worker worker = null;
    WorkerController workerController = null;
    public AddWorkerFrame(Component component) {
        initComponents();
        setLocationRelativeTo(component);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelRole = new javax.swing.JLabel();
        jLabeShift = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldRole = new javax.swing.JTextField();
        jComboBoxShift = new javax.swing.JComboBox<>();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar novo funcionário");
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitle.setText("Cadastro de funcionário");

        jLabelFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelFirstName.setText("Primeiro nome*");

        jLabelRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRole.setText("Cargo*");

        jLabeShift.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabeShift.setText("Turno*");

        jTextFieldFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jComboBoxShift.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maturtino", "Vespertino", "Noturno", "Administrativo" }));
        jComboBoxShift.setBorder(null);

        jLabelLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelLastName.setText("Sobrenome");

        jTextFieldLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegister.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\adicionar.png")); // NOI18N
        jLabelRegister.setText("Cadastrar");
        jLabelRegister.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelRegister)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabeShift)
                                .addComponent(jLabelRole)
                                .addComponent(jTextFieldFirstName)
                                .addComponent(jLabelFirstName)
                                .addComponent(jComboBoxShift, 0, 169, Short.MAX_VALUE)
                                .addComponent(jTextFieldRole))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelLastName))))
                    .addComponent(jLabelTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabeShift)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelRegister)
                    .addComponent(jComboBoxShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMainLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldFirstName, jTextFieldLastName});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        worker = new Worker();
        workerController = new WorkerController();
        
        if(jTextFieldLastName.getText().isBlank() || jTextFieldLastName.getText().isEmpty()){
            worker.setName(jTextFieldFirstName.getText());
        }else{
            worker.setName(String.format("%s %s", 
                    jTextFieldFirstName.getText(),
                    jTextFieldLastName.getText()));
        }
        worker.setRole(jTextFieldRole.getText());
        int selectedIndexShift = jComboBoxShift.getSelectedIndex();
        worker.setShift(jComboBoxShift.getItemAt(selectedIndexShift));
        
        workerController.save(worker);
        dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxShift;
    private javax.swing.JLabel jLabeShift;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldRole;
    // End of variables declaration//GEN-END:variables
}
