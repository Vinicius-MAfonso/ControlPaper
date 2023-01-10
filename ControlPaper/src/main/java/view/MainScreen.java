package view;

import controller.PointController;
import controller.WorkerController;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Point;
import model.Worker;
import util.PointsTableModel;

public class MainScreen extends javax.swing.JFrame {
    DefaultListModel workersModel;
    PointsTableModel pointsModel;
    WorkerController workerController;
    PointController pointController;
    
    public MainScreen() {
        initComponents();
        initControllers();
        initComponentsModel();
        decorate();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContent = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jScrollPaneWorkers = new javax.swing.JScrollPane();
        jListWorkers = new javax.swing.JList<>();
        jLabelWorker = new javax.swing.JLabel();
        jLabelAddWorker = new javax.swing.JLabel();
        jLabelAddPoint = new javax.swing.JLabel();
        jLabelPoints = new javax.swing.JLabel();
        jLabelSearchDate = new javax.swing.JLabel();
        jLabelSearch = new javax.swing.JLabel();
        jLabelUntil = new javax.swing.JLabel();
        jTextFieldDate1 = new javax.swing.JTextField();
        jTextFieldDate2 = new javax.swing.JTextField();
        jLabelEditPoint = new javax.swing.JLabel();
        jLabelDeletePoint = new javax.swing.JLabel();
        jScrollPanePoints = new javax.swing.JScrollPane();
        jTablePoints = new javax.swing.JTable();
        jLabelDeleteWorker = new javax.swing.JLabel();
        jLabelEditWorker = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Control Paper");
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\papers.png")); // NOI18N
        jLabelTitle.setText("Control Paper");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18))
        );

        jListWorkers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListWorkers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListWorkers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListWorkers.setSelectedIndex(0);
        jListWorkers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListWorkersMouseClicked(evt);
            }
        });
        jScrollPaneWorkers.setViewportView(jListWorkers);

        jLabelWorker.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelWorker.setText("Funcionários");

        jLabelAddWorker.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabelAddWorker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddWorker.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\plus.png")); // NOI18N
        jLabelAddWorker.setToolTipText("Adicionar funcionário");
        jLabelAddWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddWorkerMouseClicked(evt);
            }
        });

        jLabelAddPoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelAddPoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddPoint.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\arrows.png")); // NOI18N
        jLabelAddPoint.setToolTipText("Registrar novo ponto");
        jLabelAddPoint.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelAddPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddPointMouseClicked(evt);
            }
        });

        jLabelPoints.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPoints.setText("Pontos");

        jLabelSearchDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSearchDate.setText("Pesquisar dia:");

        jLabelSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\search.png")); // NOI18N
        jLabelSearch.setToolTipText("Buscar");
        jLabelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseClicked(evt);
            }
        });

        jLabelUntil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUntil.setText("até");

        jTextFieldDate1.setColumns(8);
        jTextFieldDate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldDate1.setToolTipText("dia/mês/ano");
        jTextFieldDate1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextFieldDate2.setColumns(8);
        jTextFieldDate2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldDate2.setToolTipText("dia/mês/ano");
        jTextFieldDate2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelEditPoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditPoint.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\edit.png")); // NOI18N
        jLabelEditPoint.setToolTipText("Editar");
        jLabelEditPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditPointMouseClicked(evt);
            }
        });

        jLabelDeletePoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeletePoint.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\delete.png")); // NOI18N
        jLabelDeletePoint.setToolTipText("Excluir");
        jLabelDeletePoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeletePointMouseClicked(evt);
            }
        });

        jTablePoints.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTablePoints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePoints.setToolTipText("");
        jTablePoints.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPanePoints.setViewportView(jTablePoints);

        jLabelDeleteWorker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeleteWorker.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\delete.png")); // NOI18N
        jLabelDeleteWorker.setToolTipText("Deletar empregado");
        jLabelDeleteWorker.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelDeleteWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeleteWorkerMouseClicked(evt);
            }
        });

        jLabelEditWorker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditWorker.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\edit.png")); // NOI18N
        jLabelEditWorker.setToolTipText("Editar empregado");
        jLabelEditWorker.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelEditWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditWorkerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabelEditWorker)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDeleteWorker)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAddWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneWorkers, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePoints)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelPoints)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jLabelSearchDate)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelUntil)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabelEditPoint)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDeletePoint)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAddPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelMainLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelAddPoint, jLabelAddWorker, jLabelDeletePoint, jLabelDeleteWorker, jLabelEditPoint, jLabelEditWorker});

        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelPoints)
                    .addComponent(jLabelSearchDate)
                    .addComponent(jTextFieldDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUntil)
                    .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditPoint)
                    .addComponent(jLabelDeletePoint)
                    .addComponent(jLabelAddPoint)
                    .addComponent(jLabelAddWorker)
                    .addComponent(jLabelDeleteWorker)
                    .addComponent(jLabelEditWorker)
                    .addComponent(jLabelWorker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPanePoints, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addComponent(jScrollPaneWorkers)))
        );

        jPanelMainLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelAddPoint, jLabelAddWorker, jLabelDeletePoint, jLabelDeleteWorker, jLabelEditPoint, jLabelEditWorker});

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListWorkersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListWorkersMouseClicked
        int selectedIndex = jListWorkers.getSelectedIndex();
        if(!(selectedIndex < 0)){
            Worker worker = (Worker) workersModel.get(selectedIndex);
            loadPoints(worker.getId());
        }
    }//GEN-LAST:event_jListWorkersMouseClicked

    private void jLabelAddWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddWorkerMouseClicked
        AddWorkerFrame addWorkerFrame = new AddWorkerFrame(this);
        
        addWorkerFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e){
               loadWorkers();
            }
        });
    }//GEN-LAST:event_jLabelAddWorkerMouseClicked

    private void jLabelAddPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddPointMouseClicked
        int selectedIndex = jListWorkers.getSelectedIndex();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, 
                    "Selecione ou crie um empregado!", 
                    "Erro ao criar ponto", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            Worker worker = (Worker) workersModel.get(selectedIndex);
            AddPointFrame addPointFrame = new AddPointFrame(this, worker);
            addPointFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e){
                    int selectedIndex = jListWorkers.getSelectedIndex();
                    Worker worker = (Worker) workersModel.get(selectedIndex);
                    loadPoints(worker.getId());
                }
            });
        }
        
    }//GEN-LAST:event_jLabelAddPointMouseClicked

    private void jLabelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseClicked
        int selectedIndex = jListWorkers.getSelectedIndex();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, 
                    "Selecione um empregado!", 
                    "Erro ao pesquisar", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            Worker worker = (Worker) workersModel.get(selectedIndex);
            DateFormat dateFormat = null;
            Date date = null;
            Date dateUntil = null;
            try{
                dateFormat = DateFormat.getDateInstance(DateFormat.SHORT); 
                date = new Date(dateFormat.parse(jTextFieldDate1.getText()).getTime());
                if(!(jTextFieldDate2.getText().isBlank() ||
                        jTextFieldDate2.getText().isEmpty())){
                    dateUntil = new Date(dateFormat.parse(jTextFieldDate2.getText()).getTime());
                    loadPoints(worker.getId(), date, dateUntil);
                }else{
                    loadPoints(worker.getId(), date);
                }

            }catch(ParseException pe){
                JOptionPane.showMessageDialog(this, 
                        "A data deve estar no formato dia/mês/ano", 
                        "Erro ao buscar", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jLabelSearchMouseClicked

    private void jLabelDeletePointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeletePointMouseClicked
        int selectedIndex = jTablePoints.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, 
                    "Selecione um ponto!", 
                    "Erro ao deletar", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            Point point = pointsModel.getPoints().get(selectedIndex);
            pointController.delete(point);
            Worker worker = (Worker) workersModel.get(0);
            loadPoints(worker.getId());
        }
    }//GEN-LAST:event_jLabelDeletePointMouseClicked

    private void jLabelDeleteWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteWorkerMouseClicked
        int selectedIndex = jListWorkers.getSelectedIndex();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, 
                    "Selecione um empregado!", 
                    "Erro ao deletar", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            Worker worker = (Worker) workersModel.get(selectedIndex);
            int confirm = JOptionPane.showConfirmDialog(this, 
                String.format("Deseja excluir o funcionário %s", 
                        worker.getName()), 
                "Excluir funcionário", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
            if(confirm == 0){
                List<Point> points = pointController.getAll(worker.getId());
                for(Point currentlyPoint : points){
                    pointController.delete(currentlyPoint);
                }
                workerController.delete(worker);
            }
            loadWorkers();
            if(!workerController.getAll().isEmpty()){
                worker = (Worker) workersModel.get(0);
                jListWorkers.setSelectedIndex(0);
                loadPoints(worker.getId());
            }
        }
    }//GEN-LAST:event_jLabelDeleteWorkerMouseClicked

    private void jLabelEditWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditWorkerMouseClicked
        int selectedIndex = jListWorkers.getSelectedIndex();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, 
                    "Selecione um empregado!", 
                    "Erro ao editar", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
           Worker worker = (Worker) workersModel.get(selectedIndex);
           ViewProfileFrame viewProfileFrame = new ViewProfileFrame(this, worker); 
        }
    }//GEN-LAST:event_jLabelEditWorkerMouseClicked

    private void jLabelEditPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditPointMouseClicked
        int selectedIndex = jTablePoints.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, 
                    "Selecione um ponto!", 
                    "Erro ao editar", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
           Point point = pointsModel.getPoints().get(selectedIndex);
           EditPointFrame editPointFrame = new EditPointFrame(this, point); 
        }
    }//GEN-LAST:event_jLabelEditPointMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAddPoint;
    private javax.swing.JLabel jLabelAddWorker;
    private javax.swing.JLabel jLabelDeletePoint;
    private javax.swing.JLabel jLabelDeleteWorker;
    private javax.swing.JLabel jLabelEditPoint;
    private javax.swing.JLabel jLabelEditWorker;
    private javax.swing.JLabel jLabelPoints;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelSearchDate;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUntil;
    private javax.swing.JLabel jLabelWorker;
    private javax.swing.JList<String> jListWorkers;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPanePoints;
    private javax.swing.JScrollPane jScrollPaneWorkers;
    private javax.swing.JTable jTablePoints;
    private javax.swing.JTextField jTextFieldDate1;
    private javax.swing.JTextField jTextFieldDate2;
    // End of variables declaration//GEN-END:variables
    
    private void decorate(){
       jListWorkers.setSelectedIndex(0);
       jTablePoints.getTableHeader().setFont(new Font("Segoe UI",Font.PLAIN,14));
       jTablePoints.setFont(new Font("Segoe UI",Font.PLAIN,15));
    }
    private void initControllers(){
        workerController = new WorkerController();
        pointController = new PointController();
    }
    private void initComponentsModel(){
        workersModel = new DefaultListModel();
        loadWorkers();
        
        pointsModel = new PointsTableModel();
        jTablePoints.setModel(pointsModel);
        if(!workerController.getAll().isEmpty()){
            Worker worker = (Worker) workersModel.get(0);
            loadPoints(worker.getId());
        }
    }
    private void loadPoints(int idWorker){
        List<Point> points = pointController.getAll(idWorker);
        pointsModel = new PointsTableModel(points);
        jTablePoints.setModel(pointsModel);
        System.gc();
    }
    private void loadPoints(int idWorker, Date date){
        List<Point> points = pointController.getAll(idWorker, date);
        pointsModel = new PointsTableModel(points);
        jTablePoints.setModel(pointsModel);
        System.gc();
    }
    private void loadPoints(int idWorker, Date date, Date dateUntil){
        List<Point> points = pointController.getAll(idWorker, date, dateUntil);
        pointsModel = new PointsTableModel(points);
        jTablePoints.setModel(pointsModel);
        System.gc();
    }
    private void loadWorkers(){
        List<Worker> workers = workerController.getAll();
        workersModel.clear();
        if(!workers.isEmpty()){
                for(Worker currentWorker : workers){
                Worker worker = currentWorker;
                workersModel.addElement(worker);
            }
        }
        jListWorkers.setModel(workersModel);
    }
}
