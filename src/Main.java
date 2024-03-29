/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abhi-onfire
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jPanel1 = new javax.swing.JPanel();
        txtResultSub = new javax.swing.JLabel();
        txtResult = new javax.swing.JLabel();
        btnEq = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnPer = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btnBraces = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocationByPlatform(true);
        setResizable(false);

        txtResultSub.setBackground(new java.awt.Color(255, 255, 255));
        txtResultSub.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        txtResultSub.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtResultSub.setOpaque(true);

        txtResult.setBackground(new java.awt.Color(255, 255, 255));
        txtResult.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtResult.setOpaque(true);

        btnEq.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnEq.setText("=");
        btnEq.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEq.setBorderPainted(false);
        btnEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqActionPerformed(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnSub.setText("-");
        btnSub.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSub.setBorderPainted(false);
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnAdd.setText("+");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnDiv.setText("÷");
        btnDiv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDiv.setBorderPainted(false);
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMul.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnMul.setText("x");
        btnMul.setToolTipText("");
        btnMul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMul.setBorderPainted(false);
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnPer.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPer.setText("MOD");
        btnPer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPer.setBorderPainted(false);
        btnPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn9.setBorderPainted(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn6.setBorderPainted(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn3.setBorderPainted(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnDot.setText(".");
        btnDot.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDot.setBorderPainted(false);
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn2.setBorderPainted(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn5.setBorderPainted(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn8.setBorderPainted(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn0.setBorderPainted(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn1.setBorderPainted(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnClear.setText("AC");
        btnClear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClear.setBorderPainted(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn7.setBorderPainted(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn4.setBorderPainted(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        btnBackspace.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnBackspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backspace.png"))); // NOI18N
        btnBackspace.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBackspace.setBorderPainted(false);
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnBraces.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnBraces.setText("( )");
        btnBraces.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBraces.setBorderPainted(false);
        btnBraces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBracesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResultSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBraces, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtResultSub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBraces, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqActionPerformed
        String txt = txtResultSub.getText().replace(" ", "");
        txt = txt.replace("x", "*");
        var manager = new javax.script.ScriptEngineManager();
        var engine = manager.getEngineByName("js");
        Object result = null;
        try{
            result = engine.eval(txt);
        } catch(javax.script.ScriptException __){}
        if(result==null){ //eval can make string null even if it wasnt previously
            txtResultSub.setText("Invalid Input");
        }else{
            txtResult.setText(result.toString());
        }
    }//GEN-LAST:event_btnEqActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                       
        txtResultSub.setText("");
        txtResult.setText("");
    }  
    
    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        appendToResultSub(" - ");
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        appendToResultSub(" + ");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        appendToResultSub(" x ");
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        appendToResultSub(" / ");
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerActionPerformed
        appendToResultSub(" % ");
    }//GEN-LAST:event_btnPerActionPerformed

    private void appendToResultSub(String text) {
        String prevTxt = txtResultSub.getText();
        txtResultSub.setText(prevTxt + text);
    }

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        appendToResultSub(".");
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnNumsActionPerformed(java.awt.event.ActionEvent evt) {                                     
        appendToResultSub(evt.getActionCommand());
    } 

    private void btnClear
    (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtResultSub.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        String txt = txtResultSub.getText();
        if (!txt.isEmpty()) {
            txt = txt.substring(0, txt.length() - 1);
        }
        txtResultSub.setText(txt);
    }//GEN-LAST:event_btnBackspaceActionPerformed

    boolean bracesOpen = false;
    
    private void btnBracesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBracesActionPerformed
        if(!bracesOpen){
            appendToResultSub(" (");
        }else{
            appendToResultSub(") ");
        }
        bracesOpen = !bracesOpen;
    }//GEN-LAST:event_btnBracesActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnBraces;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEq;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnPer;
    private javax.swing.JButton btnSub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtResult;
    private javax.swing.JLabel txtResultSub;
    // End of variables declaration//GEN-END:variables
}
