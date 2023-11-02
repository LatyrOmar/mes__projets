/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestion.des.délibérations;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LATYR
 */
public class ajouterMatiere extends javax.swing.JFrame {
    PreparedStatement pst;
    ResultSet rs;
    

    /**
     * Creates new form ajouterMatiere
     */
    public ajouterMatiere() {
        initComponents();
        tableauMatiere();
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
        textIntitule = new javax.swing.JTextField();
        titre = new javax.swing.JLabel();
        nomMatiere = new javax.swing.JLabel();
        textCoefficent = new javax.swing.JTextField();
        coefficient = new javax.swing.JLabel();
        textCredit = new javax.swing.JTextField();
        credit = new javax.swing.JLabel();
        enregistrer = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        supprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(140, 40));

        jPanel1.setBackground(new java.awt.Color(119, 181, 254));
        jPanel1.setLayout(null);

        textIntitule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIntituleActionPerformed(evt);
            }
        });
        textIntitule.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textIntituleKeyReleased(evt);
            }
        });
        jPanel1.add(textIntitule);
        textIntitule.setBounds(320, 130, 210, 30);

        titre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(255, 255, 255));
        titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre.setText("MATIERES");
        titre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 4, true));
        jPanel1.add(titre);
        titre.setBounds(200, 10, 460, 60);

        nomMatiere.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nomMatiere.setForeground(new java.awt.Color(255, 255, 255));
        nomMatiere.setText("INTITULE:");
        jPanel1.add(nomMatiere);
        nomMatiere.setBounds(200, 130, 100, 30);

        textCoefficent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCoefficentActionPerformed(evt);
            }
        });
        jPanel1.add(textCoefficent);
        textCoefficent.setBounds(320, 180, 210, 30);

        coefficient.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        coefficient.setForeground(new java.awt.Color(255, 255, 255));
        coefficient.setText("COEFFICIENT:");
        jPanel1.add(coefficient);
        coefficient.setBounds(170, 180, 140, 30);

        textCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCreditActionPerformed(evt);
            }
        });
        jPanel1.add(textCredit);
        textCredit.setBounds(320, 230, 210, 30);

        credit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        credit.setForeground(new java.awt.Color(255, 255, 255));
        credit.setText("CREDIT:");
        jPanel1.add(credit);
        credit.setBounds(220, 230, 90, 30);

        enregistrer.setBackground(new java.awt.Color(0, 153, 153));
        enregistrer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        enregistrer.setForeground(new java.awt.Color(255, 255, 255));
        enregistrer.setText("ENREGISTRER");
        enregistrer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });
        jPanel1.add(enregistrer);
        enregistrer.setBounds(70, 320, 160, 40);

        modifier.setBackground(new java.awt.Color(0, 153, 153));
        modifier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        modifier.setForeground(new java.awt.Color(255, 255, 255));
        modifier.setText("MODIFIER");
        modifier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });
        jPanel1.add(modifier);
        modifier.setBounds(280, 320, 160, 40);

        retour.setBackground(new java.awt.Color(0, 153, 153));
        retour.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        retour.setForeground(new java.awt.Color(255, 255, 255));
        retour.setText("HOME");
        retour.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });
        jPanel1.add(retour);
        retour.setBounds(700, 320, 160, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 400, 840, 240);

        supprimer.setBackground(new java.awt.Color(0, 153, 153));
        supprimer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        supprimer.setForeground(new java.awt.Color(255, 255, 255));
        supprimer.setText("SUPPRIMER");
        supprimer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });
        jPanel1.add(supprimer);
        supprimer.setBounds(490, 320, 160, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIntituleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIntituleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIntituleActionPerformed

    private void textIntituleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIntituleKeyReleased
        // TODO add your handling code here:
        // tableRecherche(textPrenom.getText());
    }//GEN-LAST:event_textIntituleKeyReleased

    private void textCoefficentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCoefficentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCoefficentActionPerformed

    private void textCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCreditActionPerformed

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
        // TODO add your handling code here:
        connexion conn = new connexion();
        String s="";
        try{
            pst = conn.con.prepareStatement("insert into matiere(nomMat,coefMat,creditMat)values(?,?,?)");
            pst.setString(1,textIntitule.getText());
            pst.setString(2,textCoefficent.getText());
            pst.setString(3,textCredit.getText());
            pst.executeUpdate();
            tableauMatiere();
            JOptionPane.showMessageDialog(this, "Matiere ajoute!");
            pst.close();
            textIntitule.setText(s);
            textCoefficent.setText(s);
            textCredit.setText(s);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ECHEC!",null,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_enregistrerActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
        connexion conn = new connexion();
        String s="";
       // String intitule= textIntitule.getText();
        try{

            pst = conn.con.prepareStatement("update matiere set coefMat=?,creditMat=? where nomMat=?");
            pst.setString(3,textIntitule.getText());
            pst.setString(1,textCoefficent.getText());
            pst.setString(2,textCredit.getText());
            //  pst.setString(4,textPrenom.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, " valeur modifer!");
            pst.close();
            tableauMatiere();
            textIntitule.setText(s);
            textCoefficent.setText(s);
            textCredit.setText(s);

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ECHEC!",null,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modifierActionPerformed

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
        // TODO add your handling code here:
        acceuilleAdmin pageAdmin = new acceuilleAdmin();
        pageAdmin.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_retourActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        int selectionner= jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        textIntitule.setText(model.getValueAt(selectionner, 1).toString());
        textCoefficent.setText(model.getValueAt(selectionner, 2).toString());
        textCredit.setText(model.getValueAt(selectionner,3).toString());

    }//GEN-LAST:event_jTable1MouseReleased

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
        String s="";
        int option= JOptionPane.showConfirmDialog(null, "voulez vous supprimer cette matiere","supression",JOptionPane.YES_NO_OPTION);
        connexion conn = new connexion();
        if(option==0){
            try{
                pst = conn.con.prepareStatement("delete from matiere where nomMat=?");
                pst.setString(1,textIntitule.getText());
                pst.executeUpdate();
                pst.close();
                tableauMatiere();
                JOptionPane.showMessageDialog(this, " matiere suprimer!");
                 textIntitule.setText(s);
            textCoefficent.setText(s);
            textCredit.setText(s);
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"ECHEC!",null,JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_supprimerActionPerformed

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
            java.util.logging.Logger.getLogger(ajouterMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouterMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouterMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouterMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouterMatiere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coefficient;
    private javax.swing.JLabel credit;
    private javax.swing.JButton enregistrer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modifier;
    private javax.swing.JLabel nomMatiere;
    private javax.swing.JButton retour;
    private javax.swing.JButton supprimer;
    private javax.swing.JTextField textCoefficent;
    private javax.swing.JTextField textCredit;
    private javax.swing.JTextField textIntitule;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables

    private void tableauMatiere() {
        connexion connect = new connexion();
        String colonne[] ={"CODEMATIERE","INTITULE","COEFFICIENT","CREDIT"};
        DefaultTableModel model = new DefaultTableModel(null,colonne) ;
        PreparedStatement st ;
        ResultSet RS;
        try{
            st = connect.con.prepareStatement("select* from matiere");
           RS= st.executeQuery();
           while(RS.next()){
               Object o[]= {
                    RS.getString("codeMat"),
                   RS.getString("nomMat"),
                   RS.getString("coefMat"),
                   RS.getString("creditMat"),
               };
                model.addRow(o);
           };
          
           jTable1.setModel(model);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
