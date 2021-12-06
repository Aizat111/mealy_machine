
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class MealyMac extends javax.swing.JFrame {
    DefaultTableModel myModel;
    String input[],output[];//kullanicinin deger girmek istedigi zaman kullaniriz
    String [] input1=new String[2];//default tabledaki degerleri tutmak icin kullaniriz
    String [] output1= new String[2];
    int RowStatus=1;//kaldigimiz satir bilgisini tutmak icin kullanilir
    int states; //state sayisi
    String States="";// output state yazisini tutar
    public MealyMac() {
        initComponents();
       // default tabledaki bilgileri atiyorum
        myModel=(DefaultTableModel)jTable1.getModel();
        states=5;
        input1[0]="a";
        input1[1]="b"; 
        output1[0]="0";
        output1[1]="1"; 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Countstates_txt = new javax.swing.JTextField();
        inputSet_txt = new javax.swing.JTextField();
        outputSet_txt = new javax.swing.JTextField();
        change_btn = new javax.swing.JButton();
        states_lbl = new javax.swing.JLabel();
        output_lbl = new javax.swing.JLabel();
        input_lbl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        input_txt = new javax.swing.JTextField();
        newTable_btn = new javax.swing.JButton();
        outputs_txt = new javax.swing.JLabel();
        openSeconFrame_btn = new javax.swing.JButton();
        states_txt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.setBounds(new java.awt.Rectangle(250, 300, 480, 340));

        Countstates_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Countstates_txtActionPerformed(evt);
            }
        });

        change_btn.setText("OK");
        change_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_btnActionPerformed(evt);
            }
        });

        states_lbl.setText("Count od states:");

        output_lbl.setText("Set of outputs:");

        input_lbl1.setText("Set of inouts:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("!!! Input ve output degerlerini virgullere ayirarak giriniz");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(output_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outputSet_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(change_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(states_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputSet_txt)
                                    .addComponent(Countstates_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(193, 193, 193))))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(states_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Countstates_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSet_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(output_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputSet_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(change_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Moore Machine");
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Old State", "New State", "Output", "New State", "Output"},
                {"q0", "q1", "1", "q2", "0"},
                {"q1", "q2", "0", "q0", "1"},
                {"q2", "q2", "0", "q3", "1"},
                {"q3", "q1", "0", "q1", "0"}
            },
            new String [] {
                "", "After a", "", "After b", ""
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(20);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        input_txt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                input_txtAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        input_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_txtActionPerformed(evt);
            }
        });
        input_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_txtKeyTyped(evt);
            }
        });

        newTable_btn.setText("Transition Table is Done");
        newTable_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTable_btnActionPerformed(evt);
            }
        });

        outputs_txt.setText("Output");
        outputs_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        openSeconFrame_btn.setText("I wanna do some changes");
        openSeconFrame_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSeconFrame_btnActionPerformed(evt);
            }
        });

        states_txt.setText("States");
        states_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Tabloda degisiklik yapmak isterseniz,yeni girdiginiz son degerden sonra taba basip, alttaki butonla kaydetmeyi unutmayin ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newTable_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputs_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openSeconFrame_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(states_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_txt, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(input_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(states_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputs_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openSeconFrame_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(newTable_btn)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Countstates_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Countstates_txtActionPerformed

    }//GEN-LAST:event_Countstates_txtActionPerformed
    private void CreateTable()
    {
        //TableHeader
        String [] columnId = new String[input.length*2+1];
        columnId[0]="";
        int i;
        for(i=1;i<input.length*2+1;i++)
        {
            if(i%2!=0)
            columnId[i]="After "+input[i/2];
            else columnId[i]="";
        }
        myModel.setColumnIdentifiers(columnId);
        //0.row
        myModel.setValueAt("Old States", 0,0);
        for(int j=1;j<myModel.getColumnCount();j++)
        {
            if(j%2!=0)
            {
                myModel.setValueAt("New State", 0,j);
            }
            else
                myModel.setValueAt("Output", 0,j);
        }
        //0.column
        for(int j=1;j<states;j++)
        {
            myModel.setValueAt("q"+(j-1), j,0);
        }
        
    }
    private void change_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_btnActionPerformed
        jDialog1.setVisible(false);
        for(int l=0;l<myModel.getRowCount();l++)
        {
            for(int p=0;p<myModel.getColumnCount();p++)
            {
                myModel.setValueAt(null, l, p);
            }
        }
        states=Integer.parseInt(Countstates_txt.getText())+1;
        input=inputSet_txt.getText().split(",");
        output=outputSet_txt.getText().split(",");
        myModel.setColumnCount(input.length*2+1);
        myModel.setRowCount(states);
        CreateTable();
        input1= new String[input.length];
        output1=new String[output.length];
        for(int k=0;k<input.length;k++)
        {
            input1[k]=input[k];
        }
        for(int k=0;k<output.length;k++)
        {
            output1[k]=output[k];
        }
        
    }//GEN-LAST:event_change_btnActionPerformed

    private void input_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_txtActionPerformed
        RowStatus=1;
        String text,let="";
        States="";
        String letter[]=null;
     
            text=input_txt.getText();
            letter=text.split("");
            for(int p=0;p<letter.length;p++)
            {
                let=let+setOutput(letter[p]);
                States=States+getNewState(letter[p]);
             
            }
            outputs_txt.setText(let);
            states_txt.setText(States);
    }//GEN-LAST:event_input_txtActionPerformed

    private void newTable_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTable_btnActionPerformed
        int control=0;
        int control1=0;
      
        //statelerin kontrolu
        outer: for(int k=1;k<myModel.getColumnCount()-1;k=k+2)
        {
            
            for(int l=1;l<myModel.getRowCount();l++)
            {   
                control=0;
                for(int m=0;m<states-1;m++)
                {   
                    if(myModel.getValueAt(l,k).equals("q"+m)) 
                    {
                        control=1;//state state kumesinin elemenai olup olmadigini kontrol etmek icin
                        break;
                    }
                }
                if(control==0) {
                JOptionPane.showMessageDialog(rootPane,"Belirttiginiz durumlar disindaki durumu tablonuza giremezsiniz\n"+l+".satir; "+k+".sutunda hataniz var","Uyari!",JOptionPane.ERROR_MESSAGE);
                control1=1;//bir hata cikip cikmadigini kontrol etmek icin
                break outer;
                }
            }
           
           
        }
        //outputlarin kontrolu
       outer: for(int l=2;l<myModel.getColumnCount();l=l+2)
       {
            for(int k=1;k<myModel.getRowCount();k++)
            {
                control=0;//her elemani ayri ayri kontrol edebilmek icin
                for(int m=0;m<output1.length;m++)
                {
                 if(myModel.getValueAt(k,l).equals(output1[m]))
                 {
                    control=1;
                    break;
                 }
            }
            if(control==0)
            {
                JOptionPane.showMessageDialog(rootPane,"Çıkış sütununa sadece çıkış kümesindeki elemanları girebilirsiniz\n"+k+".satir; "+l+".sutunda hataniz var","Uyari!",JOptionPane.ERROR_MESSAGE);
                control1=1;
                break outer;
            }
           }
       }
        if(control1==0)input_txt.setEnabled(true);
        input_txt.setText("");
        outputs_txt.setText("");
        states_txt.setText("");
    }//GEN-LAST:event_newTable_btnActionPerformed


    String getNewState(String let)  
    {   
     String tempState="";
         for(int p=0;p<input1.length;p++)
         {
             if(let.equals(input1[p]))
             {
               tempState=String.valueOf(myModel.getValueAt(RowStatus,p*2+1));
             }
         }
         for(int p=1;p<myModel.getRowCount();p++)
         {
             if(tempState.equals(myModel.getValueAt(p,0)))
             {
                 RowStatus=p;
                 break;
             }
         }
         return tempState;
     }
    String setOutput(String let)
    {
       for(int p=0;p<input1.length;p++)
         {
             if(let.equals(input1[p]))
             {
               return String.valueOf(myModel.getValueAt(RowStatus,p*2+2)); 
             }
         }
        return "e";
    }
    private void input_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_txtKeyTyped
       
    }//GEN-LAST:event_input_txtKeyTyped

    private void input_txtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_input_txtAncestorAdded
 
    }//GEN-LAST:event_input_txtAncestorAdded

    private void openSeconFrame_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSeconFrame_btnActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_openSeconFrame_btnActionPerformed

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
      
    }//GEN-LAST:event_jTable1KeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        input_txt.setEnabled(false);
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
                input_txt.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MealyMac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MealyMac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MealyMac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MealyMac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MealyMac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Countstates_txt;
    private javax.swing.JButton change_btn;
    private javax.swing.JTextField inputSet_txt;
    private javax.swing.JLabel input_lbl1;
    private javax.swing.JTextField input_txt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newTable_btn;
    private javax.swing.JButton openSeconFrame_btn;
    private javax.swing.JTextField outputSet_txt;
    private javax.swing.JLabel output_lbl;
    private javax.swing.JLabel outputs_txt;
    private javax.swing.JLabel states_lbl;
    private javax.swing.JLabel states_txt;
    // End of variables declaration//GEN-END:variables
}
