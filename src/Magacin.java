
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asmir
 */
public class Magacin extends javax.swing.JFrame {

    /**
     * Creates new form Magacin
     */
    public Magacin() {
        initComponents();
        SelectProd();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
     
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MagacinPiceTbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtxtPImeProizvoda = new javax.swing.JTextField();
        jtxtPKolicina = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtPCena = new javax.swing.JTextField();
        SacuvajPBtn = new javax.swing.JButton();
        IzmeniPBtn = new javax.swing.JButton();
        IzbrisiPBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtxtPIDPica = new javax.swing.JTextField();
        jbtnPStampanje = new javax.swing.JButton();
        jbtnPIzlaz = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MagacinHraneTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtHImeProizvoda = new javax.swing.JTextField();
        jtxtHKolicina = new javax.swing.JTextField();
        jtxtHCena = new javax.swing.JTextField();
        SacuvajHbtn = new javax.swing.JButton();
        IzmeniHbtn = new javax.swing.JButton();
        IzbrisiHbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtHIDHrana = new javax.swing.JTextField();
        jbtnHStampanje = new javax.swing.JButton();
        jbtnHIzlaz = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MagacinPiceTbl.setFont(new java.awt.Font("Sylfaen", 0, 17)); // NOI18N
        MagacinPiceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDPica", "ImeProizvoda", "Kolicina", "Cena"
            }
        ));
        MagacinPiceTbl.setMinimumSize(new java.awt.Dimension(300, 0));
        MagacinPiceTbl.setRowHeight(24);
        MagacinPiceTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MagacinPiceTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(MagacinPiceTbl);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 34, 850, 560));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setText("Ime Proizvoda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 110, -1));

        jtxtPImeProizvoda.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jPanel1.add(jtxtPImeProizvoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 230, -1));

        jtxtPKolicina.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jPanel1.add(jtxtPKolicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 230, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setText("Kolicina");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, 70, -1));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setText("Cena:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 250, -1, -1));

        jtxtPCena.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jPanel1.add(jtxtPCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 240, 230, -1));

        SacuvajPBtn.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        SacuvajPBtn.setText("Sačuvaj");
        SacuvajPBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SacuvajPBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SacuvajPBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, -1, -1));

        IzmeniPBtn.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        IzmeniPBtn.setText("Izmeni");
        IzmeniPBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IzmeniPBtnMouseClicked(evt);
            }
        });
        jPanel1.add(IzmeniPBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 300, -1, -1));

        IzbrisiPBtn.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        IzbrisiPBtn.setText("Izbriši");
        IzbrisiPBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IzbrisiPBtnMouseClicked(evt);
            }
        });
        IzbrisiPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzbrisiPBtnActionPerformed(evt);
            }
        });
        jPanel1.add(IzbrisiPBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setText("IDPica");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, -1, -1));

        jtxtPIDPica.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jtxtPIDPica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPIDPicaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtPIDPica, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, 230, -1));

        jbtnPStampanje.setBackground(new java.awt.Color(0, 204, 255));
        jbtnPStampanje.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        jbtnPStampanje.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPStampanje.setText("Stampanje");
        jbtnPStampanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPStampanjeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPStampanje, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 180, 60));

        jbtnPIzlaz.setBackground(new java.awt.Color(0, 204, 255));
        jbtnPIzlaz.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        jbtnPIzlaz.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPIzlaz.setText("Izlaz");
        jbtnPIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPIzlazActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPIzlaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 180, 60));

        jTabbedPane1.addTab("Pice", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MagacinHraneTbl.setFont(new java.awt.Font("Sylfaen", 0, 17)); // NOI18N
        MagacinHraneTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDHrana", "ImeProizvoda", "Kolicina", "Cena"
            }
        ));
        MagacinHraneTbl.setMinimumSize(new java.awt.Dimension(300, 0));
        MagacinHraneTbl.setRowHeight(24);
        MagacinHraneTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MagacinHraneTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MagacinHraneTbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 34, 850, 560));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setText("Ime Proizvoda");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 120, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setText("Kolicina");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setText("Cena:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 250, -1, -1));

        jtxtHImeProizvoda.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jPanel2.add(jtxtHImeProizvoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 230, -1));

        jtxtHKolicina.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jPanel2.add(jtxtHKolicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 230, -1));

        jtxtHCena.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jPanel2.add(jtxtHCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 240, 230, -1));

        SacuvajHbtn.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        SacuvajHbtn.setText("Sačuvaj");
        SacuvajHbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SacuvajHbtnMouseClicked(evt);
            }
        });
        SacuvajHbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacuvajHbtnActionPerformed(evt);
            }
        });
        jPanel2.add(SacuvajHbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, -1, -1));

        IzmeniHbtn.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        IzmeniHbtn.setText("Izmeni");
        IzmeniHbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IzmeniHbtnMouseClicked(evt);
            }
        });
        jPanel2.add(IzmeniHbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 300, -1, -1));

        IzbrisiHbtn.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        IzbrisiHbtn.setText("Izbriši");
        IzbrisiHbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IzbrisiHbtnMouseClicked(evt);
            }
        });
        jPanel2.add(IzbrisiHbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setText("IDHrana");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, -1, -1));

        jtxtHIDHrana.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jtxtHIDHrana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtHIDHranaActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtHIDHrana, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, 230, -1));

        jbtnHStampanje.setBackground(new java.awt.Color(0, 204, 255));
        jbtnHStampanje.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        jbtnHStampanje.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHStampanje.setText("Stampanje");
        jbtnHStampanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHStampanjeActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnHStampanje, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 180, 60));

        jbtnHIzlaz.setBackground(new java.awt.Color(0, 204, 255));
        jbtnHIzlaz.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        jbtnHIzlaz.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHIzlaz.setText("Izlaz");
        jbtnHIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHIzlazActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnHIzlaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 180, 60));

        jTabbedPane1.addTab("Hrana", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 1400, 800));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 42)); // NOI18N
        jLabel9.setText("Magacin:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void SelectProd(){
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magacin","root","root");
        St = Con.createStatement();
        Rs = St.executeQuery("select *from pice");
        MagacinPiceTbl.setModel(DbUtils.resultSetToTableModel(Rs));
        Rs = St.executeQuery("select *from hrana");
        MagacinHraneTbl.setModel(DbUtils.resultSetToTableModel(Rs));
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    private void SacuvajHbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacuvajHbtnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_SacuvajHbtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formComponentShown

    private void SacuvajPBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SacuvajPBtnMouseClicked
        // TODO add your handling code here:
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magacin","root","root");
            PreparedStatement add = Con.prepareStatement("insert into pice values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(jtxtPIDPica.getText()));
            add.setString(2, jtxtPImeProizvoda.getText());
            add.setString(3, jtxtPKolicina.getText());
            add.setString(4, jtxtPCena.getText());
            int row =add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ubacili ste Proizvod !");
            Con.close();
            SelectProd();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
   
        
    }//GEN-LAST:event_SacuvajPBtnMouseClicked

    private void jtxtPIDPicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPIDPicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPIDPicaActionPerformed

    private void SacuvajHbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SacuvajHbtnMouseClicked
        // TODO add your handling code here:
         try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magacin","root","root");
            PreparedStatement add = Con.prepareStatement("insert into hrana values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(jtxtHIDHrana.getText()));
            add.setString(2, jtxtHImeProizvoda.getText());
            add.setString(3, jtxtHKolicina.getText());
            add.setString(4, jtxtHCena.getText());
            int row =add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ubacili ste Proizvod !");
            Con.close();
            SelectProd();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SacuvajHbtnMouseClicked

    private void jtxtHIDHranaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtHIDHranaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtHIDHranaActionPerformed

    private void IzbrisiPBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IzbrisiPBtnMouseClicked
        // TODO add your handling code here:
        if (jtxtPIDPica.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Unesite proizvod koji zelite da izbrisete ?");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magacin","root","root");
                String id = jtxtPIDPica.getText();
                String Query = "Delete from magacin.pice where idpice="+id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectProd();
                JOptionPane.showMessageDialog(this, "Usesno izbrisan proizvod");
                
            
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
    }//GEN-LAST:event_IzbrisiPBtnMouseClicked

    private void MagacinPiceTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MagacinPiceTblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)MagacinPiceTbl.getModel();
        int Myindex = MagacinPiceTbl.getSelectedRow();
        jtxtPIDPica.setText(model.getValueAt(Myindex, 0).toString());
        jtxtPImeProizvoda.setText(model.getValueAt(Myindex, 1).toString());
        jtxtPKolicina.setText(model.getValueAt(Myindex, 2).toString());
        jtxtPCena.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_MagacinPiceTblMouseClicked

    private void MagacinHraneTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MagacinHraneTblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)MagacinHraneTbl.getModel();
        int Myindex = MagacinHraneTbl.getSelectedRow();
        jtxtHIDHrana.setText(model.getValueAt(Myindex, 0).toString());
        jtxtHImeProizvoda.setText(model.getValueAt(Myindex, 1).toString());
        jtxtHKolicina.setText(model.getValueAt(Myindex, 2).toString());
        jtxtHCena.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_MagacinHraneTblMouseClicked

    private void IzbrisiHbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IzbrisiHbtnMouseClicked
        // TODO add your handling code here:
         if (jtxtHIDHrana.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Unesite proizvod koji zelite da izbrisete ?");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magacin","root","root");
                String id = jtxtHIDHrana.getText();
                String Query = "Delete from magacin.hrana where idhrana="+id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectProd();
                JOptionPane.showMessageDialog(this, "Usesno izbrisan proizvod");
                
            
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
    }//GEN-LAST:event_IzbrisiHbtnMouseClicked

    private void IzmeniPBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IzmeniPBtnMouseClicked
        // TODO add your handling code here:
        
        if (jtxtPIDPica.getText().isEmpty() || jtxtPImeProizvoda.getText().isEmpty() || jtxtPKolicina.getText().isEmpty() || jtxtPCena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nedostaju Informacije !");
        }
        else{
            try {
                 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magacin","root","root");
                 String UpdateQuery = "update magacin.pice set ImeProizvoda='"+jtxtPImeProizvoda.getText()+"'"+",Kolicina="+jtxtPKolicina.getText()+""+",Cena='"+jtxtPCena.getText()+"'"+"where IDPice="+jtxtPIDPica.getText();
                 Statement Add = Con.createStatement();
                 Add.executeUpdate(UpdateQuery);
                 JOptionPane.showMessageDialog(this, "Uspesno Izmenjeno !");
                 SelectProd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_IzmeniPBtnMouseClicked

    private void IzmeniHbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IzmeniHbtnMouseClicked
        // TODO add your handling code here:
         
        if (jtxtHIDHrana.getText().isEmpty() || jtxtHImeProizvoda.getText().isEmpty() || jtxtHKolicina.getText().isEmpty() || jtxtHCena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nedostaju Informacije !");
        }
        else{
            try {
                 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magacin","root","root");
                 String UpdateQuery = "update magacin.hrana set ImeProizvoda='"+jtxtHImeProizvoda.getText()+"'"+",Kolicina="+jtxtHKolicina.getText()+""+",Cena='"+jtxtHCena.getText()+"'"+"where IDHrana="+jtxtHIDHrana.getText();
                 Statement Add = Con.createStatement();
                 Add.executeUpdate(UpdateQuery);
                 JOptionPane.showMessageDialog(this, "Uspesno Izmenjeno !");
                 SelectProd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_IzmeniHbtnMouseClicked

    private void jbtnPStampanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPStampanjeActionPerformed
        // TODO add your handling code here:
         MessageFormat header = new MessageFormat("Magacin:");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            MagacinPiceTbl.print(JTable.PrintMode.NORMAL, header,footer);
            
        } catch (Exception e) {
            System.err.format("No Printer found", e.getMessage());
        }    
            
    }//GEN-LAST:event_jbtnPStampanjeActionPerformed

    private void IzbrisiPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzbrisiPBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IzbrisiPBtnActionPerformed

    private void jbtnPIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPIzlazActionPerformed
        // TODO add your handling code here:
         
             int a = JOptionPane.showConfirmDialog(null,"Da li zelite da izadjete iz Programa?","Select",JOptionPane.YES_NO_OPTION);
             if (a==0) {
            
             setVisible(false);
             new login().setVisible(true);
            
            
        }
    }//GEN-LAST:event_jbtnPIzlazActionPerformed

    private void jbtnHStampanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHStampanjeActionPerformed
        // TODO add your handling code here:
          MessageFormat header = new MessageFormat("Magacin:");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            MagacinHraneTbl.print(JTable.PrintMode.NORMAL, header,footer);
            
        } catch (Exception e) {
            System.err.format("No Printer found", e.getMessage());
        }    
    }//GEN-LAST:event_jbtnHStampanjeActionPerformed

    private void jbtnHIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHIzlazActionPerformed
        // TODO add your handling code here:
            
             int a = JOptionPane.showConfirmDialog(null,"Da li zelite da izadjete iz Programa?","Select",JOptionPane.YES_NO_OPTION);
             if (a==0) {
            
            setVisible(false);
            new login().setVisible(true);
            
            
        }
    }//GEN-LAST:event_jbtnHIzlazActionPerformed

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
            java.util.logging.Logger.getLogger(Magacin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Magacin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Magacin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Magacin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Magacin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IzbrisiHbtn;
    private javax.swing.JButton IzbrisiPBtn;
    private javax.swing.JButton IzmeniHbtn;
    private javax.swing.JButton IzmeniPBtn;
    private javax.swing.JTable MagacinHraneTbl;
    private javax.swing.JTable MagacinPiceTbl;
    private javax.swing.JButton SacuvajHbtn;
    private javax.swing.JButton SacuvajPBtn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnHIzlaz;
    private javax.swing.JButton jbtnHStampanje;
    private javax.swing.JButton jbtnPIzlaz;
    private javax.swing.JButton jbtnPStampanje;
    private javax.swing.JTextField jtxtHCena;
    private javax.swing.JTextField jtxtHIDHrana;
    private javax.swing.JTextField jtxtHImeProizvoda;
    private javax.swing.JTextField jtxtHKolicina;
    private javax.swing.JTextField jtxtPCena;
    private javax.swing.JTextField jtxtPIDPica;
    private javax.swing.JTextField jtxtPImeProizvoda;
    private javax.swing.JTextField jtxtPKolicina;
    // End of variables declaration//GEN-END:variables
}
