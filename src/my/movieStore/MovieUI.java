package my.movieStore;

import java.util.ArrayList;

public class MovieUI extends javax.swing.JFrame {
    public MovieUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        menuLable = new javax.swing.JLabel();
        dropTablesBtn = new javax.swing.JButton();
        createTablesBtn = new javax.swing.JButton();
        populateTablesBtn = new javax.swing.JButton();
        queryTablesBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        outputScroll = new javax.swing.JScrollPane();
        outputPane = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        heading.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        heading.setText("Online Movie Store DBMS");
        heading.setSize(new java.awt.Dimension(20, 20));

        menuLable.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        menuLable.setText("menu");

        dropTablesBtn.setText("Drop Tables");
        dropTablesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropTablesBtnActionPerformed(evt);
            }
        });

        createTablesBtn.setText("Create Tables");
        createTablesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTablesBtnActionPerformed(evt);
            }
        });

        populateTablesBtn.setText("Populate Tables");
        populateTablesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateTablesBtnActionPerformed(evt);
            }
        });

        queryTablesBtn.setText("Query Table");
        queryTablesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryTablesBtnActionPerformed(evt);
            }
        });

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        outputPane.setEditable(false);
        outputPane.setColumns(20);
        outputPane.setRows(5);
        outputScroll.setViewportView(outputPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuLable)
                            .addComponent(heading)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createTablesBtn)
                                    .addComponent(dropTablesBtn)
                                    .addComponent(populateTablesBtn)
                                    .addComponent(queryTablesBtn))
                                .addGap(367, 367, 367)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exitBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(outputScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropTablesBtn)
                    .addComponent(loginBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createTablesBtn)
                    .addComponent(registerBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(populateTablesBtn)
                        .addGap(18, 18, 18)
                        .addComponent(queryTablesBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(exitBtn)))
                .addGap(39, 39, 39)
                .addComponent(outputScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dropTablesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropTablesBtnActionPerformed
        DropTables droptable = new DropTables();
        ArrayList<String> output = droptable.dropTables();

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        droptable.closeConnection();
    }//GEN-LAST:event_dropTablesBtnActionPerformed

    private void createTablesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTablesBtnActionPerformed

        CreateTables createtable = new CreateTables();
        ArrayList<String> output = createtable.createTables();
        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        createtable.closeConnection();
    }//GEN-LAST:event_createTablesBtnActionPerformed

    private void populateTablesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_populateTablesBtnActionPerformed

        PopulateTables populateTable = new PopulateTables();
        ArrayList<String> output = populateTable.populateTables();
        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        populateTable.closeConnection();
    }//GEN-LAST:event_populateTablesBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void queryTablesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryTablesBtnActionPerformed
        
        QueryTables querytables = new QueryTables();
        ArrayList<String> output = querytables.queryTables();
        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        querytables.closeConnection();
    }//GEN-LAST:event_queryTablesBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        LoginUI loginPage = new LoginUI();
        loginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        Register reg = new Register();
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerBtnActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(MovieUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieUI().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createTablesBtn;
    private javax.swing.JButton dropTablesBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel heading;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel menuLable;
    private javax.swing.JTextArea outputPane;
    private javax.swing.JScrollPane outputScroll;
    private javax.swing.JButton populateTablesBtn;
    private javax.swing.JButton queryTablesBtn;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
