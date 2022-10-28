/*
This java script is source code of GUI calculator which has very attractive user interface
 
 */
package calculator;

public class FirstCalculator extends javax.swing.JFrame {
    private static String action ="";
    private static float num1 = 0 ;
    private static float num2 = 0 ;
    private static float res = 0 ;
 
    public FirstCalculator() {
        setTitle("Calculator");
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        txtval = new javax.swing.JTextField();
        btn7 = new java.awt.Button();
        btn3 = new java.awt.Button();
        btnsq = new java.awt.Button();
        btn8 = new java.awt.Button();
        btn6 = new java.awt.Button();
        btn0 = new java.awt.Button();
        btn5 = new java.awt.Button();
        btn2 = new java.awt.Button();
        btn9 = new java.awt.Button();
        btn4 = new java.awt.Button();
        btn1 = new java.awt.Button();
        btnpoint = new java.awt.Button();
        clear = new java.awt.Button();
        btndiv = new java.awt.Button();
        btnmul = new java.awt.Button();
        btnsub = new java.awt.Button();
        btnans = new java.awt.Button();
        btnadd = new java.awt.Button();
        back = new java.awt.Button();
        btnsqrt = new java.awt.Button();

        label1.setText("label1");

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtval.setBackground(new java.awt.Color(204, 204, 204));
        txtval.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtval.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 255, 204));
        btn7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn7.setLabel("7");
        btn7.setName(""); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 255, 204));
        btn3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn3.setLabel("3");
        btn3.setName(""); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnsq.setBackground(new java.awt.Color(255, 204, 0));
        btnsq.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnsq.setLabel("^");
        btnsq.setName(""); // NOI18N
        btnsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 255, 204));
        btn8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn8.setLabel("8");
        btn8.setName(""); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 255, 204));
        btn6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn6.setLabel("6");
        btn6.setName(""); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 255, 204));
        btn0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn0.setLabel("0");
        btn0.setName("0"); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 255, 204));
        btn5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn5.setLabel("5");
        btn5.setName(""); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 255, 204));
        btn2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn2.setLabel("2");
        btn2.setName(""); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 255, 204));
        btn9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn9.setLabel("9");
        btn9.setName(""); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 255, 204));
        btn4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn4.setLabel("4");
        btn4.setName(""); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 255, 204));
        btn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1.setLabel("1");
        btn1.setName(""); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnpoint.setBackground(new java.awt.Color(0, 255, 204));
        btnpoint.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btnpoint.setLabel(".");
        btnpoint.setName(""); // NOI18N
        btnpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpointActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 255, 255));
        clear.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        clear.setLabel("Clear");
        clear.setMinimumSize(new java.awt.Dimension(20, 20));
        clear.setName(""); // NOI18N
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        btndiv.setBackground(new java.awt.Color(255, 204, 0));
        btndiv.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btndiv.setLabel("/");
        btndiv.setName(""); // NOI18N
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnmul.setBackground(new java.awt.Color(255, 204, 0));
        btnmul.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnmul.setLabel("X");
        btnmul.setName(""); // NOI18N
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btnsub.setBackground(new java.awt.Color(255, 204, 0));
        btnsub.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnsub.setLabel("-");
        btnsub.setName(""); // NOI18N
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btnans.setBackground(new java.awt.Color(0, 255, 255));
        btnans.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnans.setLabel("=");
        btnans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnansActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(255, 204, 0));
        btnadd.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnadd.setLabel("+");
        btnadd.setName(""); // NOI18N
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 204, 0));
        back.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        back.setLabel("Back");
        back.setName(""); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        btnsqrt.setBackground(new java.awt.Color(255, 204, 0));
        btnsqrt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnsqrt.setLabel("Sqrt");
        btnsqrt.setName(""); // NOI18N
        btnsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqrtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtval)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnsq, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnans, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpoint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnans, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtvalActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtval.setText(txtval.getText()+btn1.getActionCommand());
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
         txtval.setText(txtval.getText()+btn2.getActionCommand());
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtval.setText(txtval.getText()+btn3.getActionCommand());
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtval.setText(txtval.getText()+btn4.getActionCommand());
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
       txtval.setText(txtval.getText()+btn5.getActionCommand());
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtval.setText(txtval.getText()+btn6.getActionCommand());
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
       txtval.setText(txtval.getText()+btn7.getActionCommand());
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtval.setText(txtval.getText()+btn8.getActionCommand());
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtval.setText(txtval.getText()+btn9.getActionCommand());
    }                                    

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtval.setText(txtval.getText()+btn0.getActionCommand());
    }                                    

    private void btnsqActionPerformed(java.awt.event.ActionEvent evt) {                                      
        action = "^";
        num1 = Float.valueOf(txtval.getText());
        txtval.setText("");
        
        
    }                                     

    private void btnpointActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtval.setText(txtval.getText()+btnpoint.getActionCommand());
    }                                        

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {                                       
        action = "/";
        num1 = Float.valueOf(txtval.getText());
        txtval.setText("");
    }                                      

    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {                                       
        action = "*";
        num1 = Float.valueOf(txtval.getText());
        txtval.setText("");
    }                                      

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {                                       
        action = "-";
        num1 = Float.valueOf(txtval.getText());
        txtval.setText("");
    }                                      

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {                                       

        action ="+";
        num1 = Float.valueOf(txtval.getText());
        txtval.setText("56+45");
    }                                      

    private void btnansActionPerformed(java.awt.event.ActionEvent evt) {                                       
        num2 = Float.valueOf(txtval.getText());
        
        if (action =="+")
                {
                   res = num1 + num2;
                }
        else  if (action =="-")
                {
                   res = num1 - num2;
                }
        else  if (action =="*")
                {
                   res = num1 * num2;
                }
        else  if (action =="/")
                {
                   res = num1 / num2;
                }
        else  if (action =="^")
                {
                   res = (float) (Math.pow(num1, num2));
                }
        
        txtval.setText(String.valueOf(res));
    }                                      

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        txtval.setText("");
    }                                     

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String s = txtval.getText();
        s = s.substring(0 , s.length() - 1 );
        txtval.setText(s);
    }                                    

    private void btnsqrtActionPerformed(java.awt.event.ActionEvent evt) {                                        
       double num1 = Double.valueOf(txtval.getText());
        Double sq = Math.sqrt((double)(num1));
       txtval.setText(String.valueOf(sq));
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
            java.util.logging.Logger.getLogger(FirstCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private java.awt.Button back;
    private java.awt.Button btn0;
    private java.awt.Button btn1;
    private java.awt.Button btn2;
    private java.awt.Button btn3;
    private java.awt.Button btn4;
    private java.awt.Button btn5;
    private java.awt.Button btn6;
    private java.awt.Button btn7;
    private java.awt.Button btn8;
    private java.awt.Button btn9;
    private java.awt.Button btnadd;
    private java.awt.Button btnans;
    private java.awt.Button btndiv;
    private java.awt.Button btnmul;
    private java.awt.Button btnpoint;
    private java.awt.Button btnsq;
    private java.awt.Button btnsqrt;
    private java.awt.Button btnsub;
    private java.awt.Button button1;
    private java.awt.Button clear;
    private java.awt.Label label1;
    private javax.swing.JTextField txtval;
    // End of variables declaration                   
}
