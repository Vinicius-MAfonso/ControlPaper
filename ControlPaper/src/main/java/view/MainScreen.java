package view;

public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
//        loadData();
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Control Paper");
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\papeis.png")); // NOI18N
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
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18))
        );

        jListWorkers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListWorkers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Vinicius Mariano Afonso", "Lucas Moura", "Reginaldo Silva", "Pedro de Andrade Magallhães", "Gabriel Monteiro da Silva Melo", "Eduardo Maracaja Witcher Carvalho" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListWorkers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListWorkers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPaneWorkers.setViewportView(jListWorkers);

        jLabelWorker.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelWorker.setText("Funcionários");

        jLabelAddWorker.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabelAddWorker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddWorker.setText("+");
        jLabelAddWorker.setToolTipText("Adicionar funcionário");

        jListPoints.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jListPoints.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPanePoints.setViewportView(jListPoints);

        jLabelAddPoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelAddPoint.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAddPoint.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\OneDrive\\Documentos\\GitHub\\ControlPaper\\resources\\seta-para-cima-e-para-baixo (1).png")); // NOI18N
        jLabelAddPoint.setText("Registrar ponto");
        jLabelAddPoint.setToolTipText("Registrar novo ponto");
        jLabelAddPoint.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabelPoints.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPoints.setText("Pontos");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAddPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPanePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelPoints)
                    .addComponent(jLabelAddWorker)
                    .addComponent(jLabelWorker)
                    .addComponent(jLabelAddPoint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneWorkers)
                    .addComponent(jScrollPanePoints, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
                .addContainerGap())
        );

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAddPoint;
    private javax.swing.JLabel jLabelAddWorker;
    private javax.swing.JLabel jLabelPoints;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelWorker;
    private javax.swing.JList<String> jListPoints;
    private javax.swing.JList<String> jListWorkers;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPanePoints;
    private javax.swing.JScrollPane jScrollPaneWorkers;
    // End of variables declaration//GEN-END:variables
}
