/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitydatabasemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universitydatabasemanagementsystem.Connection.DataBaseConnection;

/**
 * This is the main class of the Faculty Portal application.
 * It provides a graphical user interface for managing faculty records.
 * Users can add, modify, and delete faculty records, as well as search for records.
 * The application connects to a database to perform these operations.
 *
 * @author 
 * @version 
 * @since 
 */

public class FacultyPortal extends javax.swing.JFrame {

    /**
     * Creates new form FacultyPortal
     */
    public FacultyPortal() {
        initComponents();
        LoadFacultyRecordTable();
    }

    /**
     * Creates a new instance of the FacultyPortal class.
     * Initializes the GUI components and loads faculty records.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	// GUI component initialization code

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LogOut1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ModifyButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        DesignationField = new javax.swing.JTextField();
        CourseField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        IDSearchField = new javax.swing.JTextField();
        NameSearchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IDSearchButton = new javax.swing.JButton();
        NameSearchButton = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FacultyRecordTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        AddNewRecordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faculty Portal | Bahria University Database Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 600));

        jPanel2.setBackground(new java.awt.Color(0, 0, 44));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACULTY PORTAL");

        LogOut1.setBackground(new java.awt.Color(35, 133, 255));
        LogOut1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LogOut1.setForeground(new java.awt.Color(204, 204, 255));
        LogOut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universitydatabasemanagementsystem/Images/logout.png"))); // NOI18N
        LogOut1.setText("LogOut");
        LogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("  Faculty ID:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("  Faculty Name:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Designation:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Course:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Email Address:");

        ModifyButton.setBackground(new java.awt.Color(0, 0, 204));
        ModifyButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ModifyButton.setForeground(new java.awt.Color(255, 255, 255));
        ModifyButton.setText("Modify");
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(204, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("From this Panel you can edit/modify and delete existing records.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        IDField.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel7)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IDField)
                                .addComponent(NameField)
                                .addComponent(DesignationField)
                                .addComponent(CourseField)
                                .addComponent(EmailField)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(ModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesignationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyButton)
                    .addComponent(DeleteButton))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        IDSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDSearchFieldActionPerformed(evt);
            }
        });

        NameSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameSearchFieldActionPerformed(evt);
            }
        });

        jLabel2.setText(" Search by Name");

        jLabel8.setText("Search by ID :");

        IDSearchButton.setBackground(new java.awt.Color(0, 67, 98));
        IDSearchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        IDSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        IDSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universitydatabasemanagementsystem/Images/Search icon.jpg"))); // NOI18N
        IDSearchButton.setText(" Search");
        IDSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDSearchButtonActionPerformed(evt);
            }
        });

        NameSearchButton.setBackground(new java.awt.Color(0, 67, 98));
        NameSearchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        NameSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universitydatabasemanagementsystem/Images/Search icon.jpg"))); // NOI18N
        NameSearchButton.setText(" Search");
        NameSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameSearchButtonActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 51, 51));
        Exit.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universitydatabasemanagementsystem/Images/Exit.png"))); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(153, 255, 51));
        Back.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universitydatabasemanagementsystem/Images/back icon.png"))); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        FacultyRecordTable.setBackground(new java.awt.Color(102, 102, 102));
        FacultyRecordTable.setForeground(new java.awt.Color(255, 255, 255));
        FacultyRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Designation", "Course", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FacultyRecordTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacultyRecordTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FacultyRecordTable);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Listed Faculty Records");

        AddNewRecordButton.setBackground(new java.awt.Color(255, 255, 255));
        AddNewRecordButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddNewRecordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universitydatabasemanagementsystem/Images/Add New Record Icon.jpg"))); // NOI18N
        AddNewRecordButton.setText("Add New Record");
        AddNewRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewRecordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                            .addComponent(IDSearchField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NameSearchField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(IDSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(NameSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addComponent(AddNewRecordButton)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(IDSearchButton)
                                .addGap(26, 26, 26)
                                .addComponent(NameSearchButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(AddNewRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NameSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Exit))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(924, 636));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Loads faculty records into the table when the application starts.
     * Retrieves data from the database and populates the table.
     */
    public void LoadFacultyRecordTable(){
    	// Database connection and record loading code
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Class.forName(DataBaseConnection.DriverPath);
            con = DriverManager.getConnection(DataBaseConnection.DatabaseFile);
            String query = "select * from Faculty";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)FacultyRecordTable.getModel();
            while(rs.next()){
                Object[] row = new Object[5];
                    row[0] = rs.getInt("ID");
                    row[1] = rs.getString("Name");
                    row[2] = rs.getString("Designation");
                    row[3] = rs.getString("Course");
                    row[4] = rs.getString("Email");
                model.addRow(row); 
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * Action performed when the "Modify" button is clicked.
     * Allows the user to modify a selected faculty record.
     *
     * @param evt The ActionEvent object representing the button click.
     */
    public void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        // TODO add your handling code here:
        String ID = IDField.getText();
        String Name = NameField.getText();
        String Designation = DesignationField.getText();
        String Course= CourseField.getText();
        String Email= EmailField.getText();
        if(!IDField.getText().equals(""))
        {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                Class.forName(DataBaseConnection.DriverPath);
                con = DriverManager.getConnection(DataBaseConnection.DatabaseFile);

                String query = "Update Faculty set Name =  ? ,Designation = ?, Course= ?, Email = ? where ID=?";
                ps = con.prepareStatement(query);

                ps.setString(5, ID);
                ps.setString(1, Name);
                ps.setString(2, Designation);
                ps.setString(3, Course);
                ps.setString(4, Email);

                int result = ps.executeUpdate();
                if(result > 0){
                    JOptionPane.showMessageDialog(null, "Faculty Records Modifed Sucessfully.");
                    DefaultTableModel model = (DefaultTableModel)FacultyRecordTable.getModel();
                    model.setRowCount(0);
                    IDField.setText("");
                    NameField.setText("");
                    DesignationField.setText("");
                    CourseField.setText("");
                    EmailField.setText("");
                    LoadFacultyRecordTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Faculty Records Not Modifed.");
                }

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Faculty Record Must be Selected First From the Table.");
        }
    }//GEN-LAST:event_ModifyButtonActionPerformed
    
    /**
     * Action performed when the "Delete" button is clicked.
     * Allows the user to delete a selected faculty record.
     *
     * @param evt The ActionEvent object representing the button click.
     */
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        String ID = IDField.getText();
        if(!IDField.getText().equals(""))
        {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                Class.forName(DataBaseConnection.DriverPath);
                con = DriverManager.getConnection(DataBaseConnection.DatabaseFile);

                String query = "Delete from Faculty where ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1,ID);
                int result = ps.executeUpdate();
                if(result > 0){
                    JOptionPane.showMessageDialog(null, "Faculty Records Deleted Sucessfully.");
                    DefaultTableModel model = (DefaultTableModel)FacultyRecordTable.getModel();
                    model.setRowCount(0);
                    IDField.setText("");
                    NameField.setText("");
                    DesignationField.setText("");
                    CourseField.setText("");
                    EmailField.setText("");
                    LoadFacultyRecordTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Faculty Records Not Deleted.");
                }

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Faculty Records Must Be Selected First From Table.");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void IDSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDSearchFieldActionPerformed

    private void IDSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDSearchButtonActionPerformed
        // TODO add your handling code here:
        if(!IDSearchField.getText().equals("")){
            
            String Name = IDSearchField.getText();
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            try{
                Class.forName(DataBaseConnection.DriverPath);
                con = DriverManager.getConnection(DataBaseConnection.DatabaseFile);
                String query = "select * from Faculty where ID = ?";
                ps = con.prepareStatement(query);
                  
                ps.setString(1,Name);
                rs = ps.executeQuery();
                
                DefaultTableModel model = (DefaultTableModel)FacultyRecordTable.getModel();
                model.setRowCount(0); 
                
                while(rs.next()){
                    Object[] row = new Object[5];
                    row[0] = rs.getInt("ID");
                    row[1] = rs.getString("Name");
                    row[2] = rs.getString("Designation");
                    row[3] = rs.getString("Course");
                    row[4] = rs.getString("Email");
                    model.addRow(row); 
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            DefaultTableModel model = (DefaultTableModel)FacultyRecordTable.getModel();
            model.setRowCount(0); 
            LoadFacultyRecordTable();
        }
    }//GEN-LAST:event_IDSearchButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void NameSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameSearchFieldActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        MainPage main = new MainPage();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void NameSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameSearchButtonActionPerformed
        // TODO add your handling code here:
        if(!NameSearchField.getText().equals("")){
            
            String Name = NameSearchField.getText();
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            try{
                Class.forName(DataBaseConnection.DriverPath);
                con = DriverManager.getConnection(DataBaseConnection.DatabaseFile);
                String query = "select * from Faculty where Name = ?";
                ps = con.prepareStatement(query);
                  
                ps.setString(1,Name);
                rs = ps.executeQuery();
                
                DefaultTableModel model = (DefaultTableModel)FacultyRecordTable.getModel();
                model.setRowCount(0); 
                
                while(rs.next()){
                    Object[] row = new Object[5];
                    row[0] = rs.getInt("ID");
                    row[1] = rs.getString("Name");
                    row[2] = rs.getString("Designation");
                    row[3] = rs.getString("Course");
                    row[4] = rs.getString("Email");
                    model.addRow(row); 
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            DefaultTableModel model = (DefaultTableModel)FacultyRecordTable.getModel();
            model.setRowCount(0); 
            LoadFacultyRecordTable();
        }
    
    }//GEN-LAST:event_NameSearchButtonActionPerformed

    private void FacultyRecordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyRecordTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)FacultyRecordTable.getModel();
        int selectedRowIndex = FacultyRecordTable.getSelectedRow();
        IDField.setText(model.getValueAt(selectedRowIndex, 0).toString());
        NameField.setText(model.getValueAt(selectedRowIndex, 1).toString());
        DesignationField.setText(model.getValueAt(selectedRowIndex, 2).toString());
        CourseField.setText(model.getValueAt(selectedRowIndex, 3).toString());
        EmailField.setText(model.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_FacultyRecordTableMouseClicked

    private void LogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut1ActionPerformed
        // TODO add your handling code here:
        WelcomePage main = new WelcomePage();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogOut1ActionPerformed

    private void AddNewRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewRecordButtonActionPerformed
        // TODO add your handling code here:
        AddNewFaculty addF = new AddNewFaculty();
        addF.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddNewRecordButtonActionPerformed

    
    /**
     * Main method to launch the FacultyPortal application.
     *
     * @param args The command-line arguments.
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
            java.util.logging.Logger.getLogger(FacultyPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewRecordButton;
    private javax.swing.JButton Back;
    public javax.swing.JTextField CourseField;
    private javax.swing.JButton DeleteButton;
    public javax.swing.JTextField DesignationField;
    public javax.swing.JTextField EmailField;
    private javax.swing.JButton Exit;
    public javax.swing.JTable FacultyRecordTable;
    public javax.swing.JTextField IDField;
    private javax.swing.JButton IDSearchButton;
    private javax.swing.JTextField IDSearchField;
    private javax.swing.JButton LogOut1;
    private javax.swing.JButton ModifyButton;
    public javax.swing.JTextField NameField;
    private javax.swing.JButton NameSearchButton;
    private javax.swing.JTextField NameSearchField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
