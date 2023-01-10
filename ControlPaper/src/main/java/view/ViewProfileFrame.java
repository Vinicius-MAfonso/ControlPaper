package view;

import controller.WorkerController;
import java.awt.Component;
import model.Worker;

public class ViewProfileFrame extends javax.swing.JFrame {
    Worker worker = null;
    WorkerController workerController = null;
    public ViewProfileFrame(Component component, Worker worker) {
        this.worker = worker;
        initComponents();
        loadData();
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
        jLabelSave = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar funcionário");
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitle.setText("Editar funcionário");

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

        jLabelSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\adicionar.png")); // NOI18N
        jLabelSave.setText("Salvar");
        jLabelSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\contract.png")); // NOI18N
        jLabel1.setText("Gerar relatório");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addComponent(jLabeShift)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGroup(jPanelMainLayout.createSequentialGroup()
                            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelRole)
                                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(jLabelFirstName)
                                    .addComponent(jTextFieldRole))
                                .addComponent(jComboBoxShift, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelLastName)
                                .addComponent(jLabelSave, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jLabelTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabeShift))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSave)
                    .addComponent(jComboBoxShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveMouseClicked
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
        workerController.update(worker);
        dispose();
    }//GEN-LAST:event_jLabelSaveMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxShift;
    private javax.swing.JLabel jLabeShift;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JLabel jLabelSave;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldRole;
    // End of variables declaration//GEN-END:variables
    private void loadData(){
        String[] fullName = worker.getName().split(" ");
        jTextFieldFirstName.setText(fullName[0]);
        if(fullName.length > 1)
            jTextFieldLastName.setText(fullName[1]);
        jTextFieldRole.setText(worker.getRole());
        jComboBoxShift.setSelectedItem(worker.getShift());
    }   
}
