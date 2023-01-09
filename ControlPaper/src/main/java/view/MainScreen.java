package view;

import controller.PointController;
import controller.WorkerController;
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

public class MainScreen extends javax.swing.JFrame {
    DefaultListModel workersModel;
    DefaultListModel pointsModel;
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
        jScrollPanePoints = new javax.swing.JScrollPane();
        jListPoints = new javax.swing.JList<>();
        jLabelAddPoint = new javax.swing.JLabel();
        jLabelPoints = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSearch = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDate1 = new javax.swing.JTextField();
        jTextFieldDate2 = new javax.swing.JTextField();
        jLabelEdit = new javax.swing.JLabel();
        jLabelDelete = new javax.swing.JLabel();

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

        jListPoints.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jListPoints.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPanePoints.setViewportView(jListPoints);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar dia:");

        jLabelSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\search.png")); // NOI18N
        jLabelSearch.setToolTipText("Buscar");
        jLabelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("até");

        jTextFieldDate1.setColumns(8);
        jTextFieldDate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldDate1.setToolTipText("dia/mês/ano");
        jTextFieldDate1.setBorder(null);

        jTextFieldDate2.setColumns(8);
        jTextFieldDate2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldDate2.setToolTipText("dia/mês/ano");
        jTextFieldDate2.setBorder(null);

        jLabelEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\edit.png")); // NOI18N
        jLabelEdit.setToolTipText("Editar");

        jLabelDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\delete.png")); // NOI18N
        jLabelDelete.setToolTipText("Excluir");
        jLabelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAddWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneWorkers, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelPoints)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEdit)
                        .addGap(21, 21, 21)
                        .addComponent(jLabelDelete)
                        .addGap(21, 21, 21)
                        .addComponent(jLabelAddPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPanePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMainLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelAddPoint, jLabelDelete, jLabelEdit});

        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelDelete)
                            .addComponent(jLabelAddPoint)
                            .addComponent(jLabelEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPaneWorkers)
                            .addComponent(jScrollPanePoints, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAddWorker, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelWorker, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelPoints, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldDate1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(624, 624, 624))))
        );

        jPanelMainLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelAddPoint, jLabelDelete, jLabelEdit});

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
            .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListWorkersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListWorkersMouseClicked
        int selectedIndex = jListWorkers.getSelectedIndex();
        Worker worker = (Worker) workersModel.get(selectedIndex);
        loadPoints(worker.getId());
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
    }//GEN-LAST:event_jLabelAddPointMouseClicked

    private void jLabelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseClicked
        int selectedIndex = jListWorkers.getSelectedIndex();
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
    }//GEN-LAST:event_jLabelSearchMouseClicked

    private void jLabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseClicked
        int selectedIndex = jListPoints.getSelectedIndex();
        Point point = (Point) pointsModel.get(selectedIndex);
        pointController.delete(point);
        loadPoints(point.getId());
    }//GEN-LAST:event_jLabelDeleteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAddPoint;
    private javax.swing.JLabel jLabelAddWorker;
    private javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelEdit;
    private javax.swing.JLabel jLabelPoints;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelWorker;
    private javax.swing.JList<String> jListPoints;
    private javax.swing.JList<String> jListWorkers;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPanePoints;
    private javax.swing.JScrollPane jScrollPaneWorkers;
    private javax.swing.JTextField jTextFieldDate1;
    private javax.swing.JTextField jTextFieldDate2;
    // End of variables declaration//GEN-END:variables
    private void decorate(){
    }
    private void initControllers(){
        workerController = new WorkerController();
        pointController = new PointController();
    }
    private void initComponentsModel(){
        workersModel = new DefaultListModel();
        loadWorkers();
        
        pointsModel = new DefaultListModel();
        Worker selectedWorker = (Worker) workersModel.get(0);
        loadPoints(selectedWorker.getId());
        jListWorkers.setSelectedIndex(0);
    }
    private void loadPoints(int idWorker){
        List<Point> points = pointController.getAll(idWorker);
        pointsModel.clear();
        for(Point currentPoint : points){
            Point point = currentPoint;
            pointsModel.addElement(point);
        }
        jListPoints.setModel(pointsModel);
    }
    private void loadPoints(int idWorker, Date date){
        List<Point> points = pointController.getAll(idWorker, date);
        pointsModel.clear();
        for(Point currentPoint : points){
            Point point = currentPoint;
            pointsModel.addElement(point);
        }
        jListPoints.setModel(pointsModel);
    }
    private void loadPoints(int idWorker, Date date, Date dateUntil){
        List<Point> points = pointController.getAll(idWorker, date, dateUntil);
        pointsModel.clear();
        for(Point currentPoint : points){
            Point point = currentPoint;
            pointsModel.addElement(point);
        }
        jListPoints.setModel(pointsModel);
    }
    private void loadWorkers(){
        List<Worker> workers = workerController.getAll();
        workersModel.clear();
        for(Worker currentWorker : workers){
            Worker worker = currentWorker;
            workersModel.addElement(worker);
        }
        jListWorkers.setModel(workersModel);
    }
}
