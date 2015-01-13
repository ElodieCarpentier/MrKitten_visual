/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr_kitten;

/**
 *
 * @author Arya
 */
public class Interface extends javax.swing.JDialog {
    private static Game g = new Game();
    /**
     * Creates new form Interface
     */
    public Interface(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YesNo = new javax.swing.JDialog();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Shutdown = new javax.swing.JButton();
        Explore = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        go_up = new javax.swing.JButton();
        go_down = new javax.swing.JButton();
        go_west = new javax.swing.JButton();
        go_east = new javax.swing.JButton();
        go_north = new javax.swing.JButton();
        go_south = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jRadioButton1.setText("Oh Yes!");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Doesn't sound like Fun... No!");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Your call now!");

        javax.swing.GroupLayout YesNoLayout = new javax.swing.GroupLayout(YesNo.getContentPane());
        YesNo.getContentPane().setLayout(YesNoLayout);
        YesNoLayout.setHorizontalGroup(
            YesNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YesNoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(21, 21, 21))
            .addGroup(YesNoLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YesNoLayout.setVerticalGroup(
            YesNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YesNoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(YesNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(128, 128, 128))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/livingroom.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        Shutdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/shutdown.png"))); // NOI18N
        Shutdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShutdownMouseClicked(evt);
            }
        });

        Explore.setText("Explore");
        Explore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExploreMouseClicked(evt);
            }
        });

        Help.setText("Help");
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
        });

        go_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_up.png"))); // NOI18N
        go_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_upMouseClicked(evt);
            }
        });

        go_down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_down.png"))); // NOI18N
        go_down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_downMouseClicked(evt);
            }
        });

        go_west.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_left.png"))); // NOI18N
        go_west.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_westMouseClicked(evt);
            }
        });

        go_east.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_right.png"))); // NOI18N
        go_east.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_eastMouseClicked(evt);
            }
        });

        go_north.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_up.png"))); // NOI18N
        go_north.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_northMouseClicked(evt);
            }
        });
        go_north.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_northActionPerformed(evt);
            }
        });

        go_south.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_down.png"))); // NOI18N
        go_south.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_southMouseClicked(evt);
            }
        });

        jButton1.setText("Look");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Shutdown, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(go_west, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(go_north)
                            .addComponent(go_south))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(go_east, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Explore)
                            .addComponent(Help)
                            .addComponent(jButton1))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(go_up, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(go_down, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Shutdown, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Explore)
                        .addGap(4, 4, 4)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Help)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(go_up, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(go_north)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(go_south))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(go_west, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(go_east)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(go_down, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShutdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShutdownMouseClicked
    System.exit(1);
    // g.goRoom(new Command("go","north")); pour bouger de salle en fct de la direction avec les fleches
    }//GEN-LAST:event_ShutdownMouseClicked

    private void ExploreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExploreMouseClicked
        //CECI EST UN TEST
        int MrKittenHP = g.getPlayers().getPlayerHP();
        switch(g.getRoom().getName()){
            case "livingRoom" :
                jTextArea1.setText(ExpInfo.printlivingRoom_intro()); 
                getYesNo();
                break;
            case "kitchen" :
                jTextArea1.setText(ExpInfo.printKitchen_intro());
            default : jTextArea1.setText("Just... how??"); 
            break;
        }
    }//GEN-LAST:event_ExploreMouseClicked

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
    jTextArea1.setText(g.printHelp());
    }//GEN-LAST:event_HelpMouseClicked

//DEPLACEMENT ENTRE LES ROOMS
    private void go_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_upMouseClicked
    g.goRoom(new Command("go", "up"));
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(g.getCurrentRoom().getImage())));
    }//GEN-LAST:event_go_upMouseClicked
    private void go_downMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_downMouseClicked
    g.goRoom(new Command("go", "down"));
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(g.getCurrentRoom().getImage())));
    }//GEN-LAST:event_go_downMouseClicked
    private void go_westMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_westMouseClicked
    g.goRoom(new Command("go", "west"));
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(g.getCurrentRoom().getImage())));
    }//GEN-LAST:event_go_westMouseClicked
    private void go_eastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_eastMouseClicked
    g.goRoom(new Command ("go", "east"));
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(g.getCurrentRoom().getImage())));
    }//GEN-LAST:event_go_eastMouseClicked
    private void go_northMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_northMouseClicked
    g.goRoom(new Command("go", "north"));
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(g.getCurrentRoom().getImage())));
    }//GEN-LAST:event_go_northMouseClicked
    private void go_southMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_southMouseClicked
    g.goRoom(new Command("go", "south"));
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(g.getCurrentRoom().getImage())));
    }//GEN-LAST:event_go_southMouseClicked

    private void go_northActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_northActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_go_northActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    jTextArea1.setText((g.currentRoom.getDescription()));    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private javax.swing.JDialog getYesNo (){
        YesNo.setVisible(true);
        return YesNo;
    }
    
    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interface dialog = new Interface(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Explore;
    private javax.swing.JButton Help;
    private javax.swing.JButton Shutdown;
    private javax.swing.JDialog YesNo;
    private javax.swing.JButton go_down;
    private javax.swing.JButton go_east;
    private javax.swing.JButton go_north;
    private javax.swing.JButton go_south;
    private javax.swing.JButton go_up;
    private javax.swing.JButton go_west;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
