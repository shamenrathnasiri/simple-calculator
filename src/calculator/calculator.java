
package calculator;

public class calculator extends javax.swing.JFrame {

    private static void setLocationRalativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      double Num1;
      double  Num2;
      double  Result;
      String OP;
      
    public calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void EnterNumber(String q)
    {
    String Nums = jTextField1.getText() + q;
    jTextField1.setText(Nums);
    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnMultiple = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnFloat = new javax.swing.JButton();
        jbtnOk = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 320, 90));

        jbtnDigit4.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDigit4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDigit4.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit4.setText("4");
        jbtnDigit4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 60, 50));

        jbtnDigit6.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDigit6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDigit6.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit6.setText("6");
        jbtnDigit6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 50));

        jbtnDivide.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDivide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDivide.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDivide.setText("/");
        jbtnDivide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 60, 50));

        jbtnMultiple.setBackground(new java.awt.Color(255, 255, 255));
        jbtnMultiple.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnMultiple.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMultiple.setText("*");
        jbtnMultiple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultipleActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMultiple, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 60, 50));

        jbtnDigit5.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDigit5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDigit5.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit5.setText("5");
        jbtnDigit5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 60, 50));

        jbtnMinus.setBackground(new java.awt.Color(255, 255, 255));
        jbtnMinus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMinus.setText("-");
        jbtnMinus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 60, 50));

        jbtnDigit3.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDigit3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDigit3.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit3.setText("3");
        jbtnDigit3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("2");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("1");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 60, 50));

        jbtnPlus.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPlus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPlus.setText("+");
        jbtnPlus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 50));

        jbtnFloat.setBackground(new java.awt.Color(255, 255, 255));
        jbtnFloat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnFloat.setForeground(new java.awt.Color(0, 0, 0));
        jbtnFloat.setText(".");
        jbtnFloat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnFloat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFloatActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnFloat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 60, 50));

        jbtnOk.setBackground(new java.awt.Color(255, 255, 255));
        jbtnOk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnOk.setForeground(new java.awt.Color(0, 0, 0));
        jbtnOk.setText("OK");
        jbtnOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOkActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 60, 50));

        jbtnClear.setBackground(new java.awt.Color(255, 255, 255));
        jbtnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnClear.setForeground(new java.awt.Color(0, 0, 0));
        jbtnClear.setText("C");
        jbtnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 60, 50));

        jbtnDigit7.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDigit7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDigit7.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit7.setText("7");
        jbtnDigit7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 60, 50));

        jbtnDigit8.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDigit8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDigit8.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit8.setText("8");
        jbtnDigit8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 50));

        jbtnDigit9.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDigit9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDigit9.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit9.setText("9");
        jbtnDigit9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 50));

        jbtnDigit0.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDigit0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDigit0.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit0.setText("0");
        jbtnDigit0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 60, 50));

        jbtnEqual.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEqual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnEqual.setForeground(new java.awt.Color(0, 0, 0));
        jbtnEqual.setText("=");
        jbtnEqual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 60, 50));

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(204, 0, 0));
        jTextField2.setFont(new java.awt.Font("Share", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 0));
        jTextField2.setText("The Simple Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 360, 50));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
       
        EnterNumber("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnFloatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFloatActionPerformed
                                 
             
    }//GEN-LAST:event_jbtnFloatActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        Num2 = Double.parseDouble(jTextField1.getText());
        
        if(OP == "+"){
            Result = Num1 + Num2;
            jTextField1.setText(String.valueOf(Result));
        }
        else if(OP == "-"){
            Result = Num1 - Num2;
            jTextField1.setText(String.valueOf(Result));
        }
        else if (OP == "*"){
            Result = Num1 * Num2;
            jTextField1.setText(String.valueOf(Result));
        }
         else {
            Result = Num1 / Num2;
            jTextField1.setText(String.valueOf(Result));
        }        
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
         EnterNumber("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumber("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
         EnterNumber("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        EnterNumber("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
         EnterNumber("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
         EnterNumber("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         EnterNumber("2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         EnterNumber("1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
         EnterNumber("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
     Num1 = Double.parseDouble(jTextField1.getText());
     jTextField1.setText("");
     OP ="/";
     
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultipleActionPerformed
        Num1 = Double.parseDouble(jTextField1.getText());
     jTextField1.setText("");
     OP ="*";
    }//GEN-LAST:event_jbtnMultipleActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
       Num1 = Double.parseDouble(jTextField1.getText());
     jTextField1.setText("");
     OP ="+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
       Num1 = Double.parseDouble(jTextField1.getText());
     jTextField1.setText("");
     OP ="-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOkActionPerformed
        Num2 = Double.parseDouble(jTextField1.getText());
        
        if(OP == "+"){
            Result = Num1 + Num2;
            jTextField1.setText(String.valueOf(Result));
        }
        else if(OP == "-"){
            Result = Num1 - Num2;
            jTextField1.setText(String.valueOf(Result));
        }
        else if (OP == "*"){
            Result = Num1 * Num2;
            jTextField1.setText(String.valueOf(Result));
        }
         else {
            Result = Num1 / Num2;
            jTextField1.setText(String.valueOf(Result));
        }
      
        
        
    }//GEN-LAST:event_jbtnOkActionPerformed

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentAdded

    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnFloat;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMultiple;
    private javax.swing.JButton jbtnOk;
    private javax.swing.JButton jbtnPlus;
    // End of variables declaration//GEN-END:variables
}
