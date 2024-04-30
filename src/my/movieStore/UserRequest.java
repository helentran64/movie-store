package my.movieStore;

import java.util.ArrayList;

public class UserRequest extends javax.swing.JFrame {
    private String email;

    public UserRequest(String email) {
        this.email = email;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputPane = new javax.swing.JTextArea();
        updatePassBtn = new javax.swing.JButton();
        newPassInput = new javax.swing.JTextField();
        viewMoviesBtn = new javax.swing.JButton();
        movieIdInput4 = new javax.swing.JTextField();
        purchaseMovieBtn = new javax.swing.JButton();
        viewtransactionBtn = new javax.swing.JButton();
        viewRatingBtn = new javax.swing.JButton();
        makeMovieRatingBtn = new javax.swing.JButton();
        ratingInput7 = new javax.swing.JTextField();
        movieIdInput7 = new javax.swing.JTextField();
        viewLanguagesBtn = new javax.swing.JButton();
        addToWatchlistBtn = new javax.swing.JButton();
        movieIdInput9 = new javax.swing.JTextField();
        viewWatchlistBtn = new javax.swing.JButton();
        delRatingBtn = new javax.swing.JButton();
        movieIdInput11 = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        heading.setText("Online Movie Store DBMS");
        heading.setSize(new java.awt.Dimension(20, 20));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Update password");
        jLabel1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("View all movies");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Purchase a movie");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("View your transactions");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("View all movie ratings");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Make a movie rating");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("View languages of movies");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Add movie to watchlist");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("View your watchlist");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setText("Delete your movie rating");

        outputPane.setEditable(false);
        outputPane.setColumns(20);
        outputPane.setRows(5);
        jScrollPane1.setViewportView(outputPane);

        updatePassBtn.setText("Select");
        updatePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePassBtnActionPerformed(evt);
            }
        });

        newPassInput.setText("Enter new password");

        viewMoviesBtn.setText("Select");
        viewMoviesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMoviesBtnActionPerformed(evt);
            }
        });

        movieIdInput4.setText("Enter movieId");

        purchaseMovieBtn.setText("Select");
        purchaseMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseMovieBtnActionPerformed(evt);
            }
        });

        viewtransactionBtn.setText("Select");
        viewtransactionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtransactionBtnActionPerformed(evt);
            }
        });

        viewRatingBtn.setText("Select");
        viewRatingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRatingBtnActionPerformed(evt);
            }
        });

        makeMovieRatingBtn.setText("Select");
        makeMovieRatingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeMovieRatingBtnActionPerformed(evt);
            }
        });

        ratingInput7.setText("Enter rating");

        movieIdInput7.setText("Enter movieId");

        viewLanguagesBtn.setText("Select");
        viewLanguagesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLanguagesBtnActionPerformed(evt);
            }
        });

        addToWatchlistBtn.setText("Select");
        addToWatchlistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToWatchlistBtnActionPerformed(evt);
            }
        });

        movieIdInput9.setText("Enter movieId");

        viewWatchlistBtn.setText("Select");
        viewWatchlistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWatchlistBtnActionPerformed(evt);
            }
        });

        delRatingBtn.setText("Select");
        delRatingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delRatingBtnActionPerformed(evt);
            }
        });

        movieIdInput11.setText("Enter movieId");

        emailInput.setText("Enter email");

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewMoviesBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(movieIdInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(purchaseMovieBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewtransactionBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewRatingBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(movieIdInput7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ratingInput7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(makeMovieRatingBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewLanguagesBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewWatchlistBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(movieIdInput11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delRatingBtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(movieIdInput9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addToWatchlistBtn))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(newPassInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updatePassBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitBtn)
                .addGap(5, 5, 5)
                .addComponent(heading)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPassInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatePassBtn))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(viewMoviesBtn))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(movieIdInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseMovieBtn))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(viewtransactionBtn))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(viewRatingBtn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(makeMovieRatingBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ratingInput7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(movieIdInput7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewLanguagesBtn)
                            .addComponent(jLabel8))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(addToWatchlistBtn)
                            .addComponent(movieIdInput9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(viewWatchlistBtn))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delRatingBtn)
                        .addComponent(movieIdInput11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePassBtnActionPerformed

        String pass = newPassInput.getText();
        
        MakeRequests r = new MakeRequests();
        ArrayList<String> output = r.updatePassword(email, pass);

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_updatePassBtnActionPerformed

    private void viewMoviesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMoviesBtnActionPerformed
        MakeRequests r = new MakeRequests();
        ArrayList<String> output = r.viewMovies();

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_viewMoviesBtnActionPerformed

    private void purchaseMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseMovieBtnActionPerformed
        MakeRequests r = new MakeRequests();
        int movieId = Integer.parseInt(movieIdInput4.getText());
        String username = r.getUsername(email);
        System.out.println(username);
        ArrayList<String> output = r.purchaseMovies(username, movieId);

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_purchaseMovieBtnActionPerformed

    private void viewtransactionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtransactionBtnActionPerformed

        MakeRequests r = new MakeRequests();
        String username = r.getUsername(email);
        ArrayList<String> output = r.viewTransactions(username);

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_viewtransactionBtnActionPerformed

    private void viewRatingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRatingBtnActionPerformed
        MakeRequests r = new MakeRequests();
        ArrayList<String> output = r.viewRatings();

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_viewRatingBtnActionPerformed

    private void makeMovieRatingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeMovieRatingBtnActionPerformed
        MakeRequests r = new MakeRequests();
        int movieId = Integer.parseInt(movieIdInput7.getText());
        String username = r.getUsername(email);
        int rating = Integer.parseInt(ratingInput7.getText());
        ArrayList<String> output = r.makeRating(movieId, username, rating);

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_makeMovieRatingBtnActionPerformed

    private void viewLanguagesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLanguagesBtnActionPerformed
        MakeRequests r = new MakeRequests();
        ArrayList<String> output = r.viewLang();

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_viewLanguagesBtnActionPerformed

    private void addToWatchlistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToWatchlistBtnActionPerformed
        MakeRequests r = new MakeRequests();
        int movieId = Integer.parseInt(movieIdInput9.getText());
        String username = r.getUsername(email);
        ArrayList<String> output = r.addToWatchlist(movieId, username);

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_addToWatchlistBtnActionPerformed

    private void viewWatchlistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWatchlistBtnActionPerformed
        MakeRequests r = new MakeRequests();
        String username = r.getUsername(email);
        ArrayList<String> output = r.viewWatchlist(username);

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_viewWatchlistBtnActionPerformed

    private void delRatingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delRatingBtnActionPerformed
        MakeRequests r = new MakeRequests();
        int movieId = Integer.parseInt(movieIdInput11.getText());
        String username = r.getUsername(email);
        ArrayList<String> output = r.delRating(movieId, username);

        outputPane.setText("");

        // Append each element to the output pane
        for (String element : output) {
            outputPane.append(element + "\n");
        }
        r.closeConnection();
    }//GEN-LAST:event_delRatingBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToWatchlistBtn;
    private javax.swing.JButton delRatingBtn;
    private javax.swing.JTextField emailInput;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeMovieRatingBtn;
    private javax.swing.JTextField movieIdInput11;
    private javax.swing.JTextField movieIdInput4;
    private javax.swing.JTextField movieIdInput7;
    private javax.swing.JTextField movieIdInput9;
    private javax.swing.JTextField newPassInput;
    private javax.swing.JTextArea outputPane;
    private javax.swing.JButton purchaseMovieBtn;
    private javax.swing.JTextField ratingInput7;
    private javax.swing.JButton updatePassBtn;
    private javax.swing.JButton viewLanguagesBtn;
    private javax.swing.JButton viewMoviesBtn;
    private javax.swing.JButton viewRatingBtn;
    private javax.swing.JButton viewWatchlistBtn;
    private javax.swing.JButton viewtransactionBtn;
    // End of variables declaration//GEN-END:variables
}
