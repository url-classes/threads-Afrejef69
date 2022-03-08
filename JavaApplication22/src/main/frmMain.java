/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.logging.Level;
import java.util.logging.Logger;
/* @author */
public class frmMain extends javax.swing.JFrame {

    Hilo hilo1 = new Hilo();
    Hilo hilo2 = new Hilo();
    
    public frmMain() {
        initComponents();
        hilo1.window = 1;
        hilo1.start();
        hilo2.window = 2;
        hilo2.start();
    }

    public class Hilo extends Thread {
        public int window = 0;
        private boolean run = false;
        public void startRunning(){run = true;}
        public void stopRunning(){run = false;}
        public int getRandom(){
            int random = (int)(Math.random() * 5 + 1);
            return random;
        }
        @Override
        public void run(){
        String vocal;
        int numero;
            while(window==1){
                while(run){
                    if (this.getRandom()==1)
                        vocal = "a";
                    else if (this.getRandom()==2)
                        vocal = "e";
                    else if (this.getRandom()==3)
                        vocal = "i";
                    else if (this.getRandom()==4)
                        vocal = "o";
                    else
                        vocal = "u";
                    Letra.setText(vocal);
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException ex){
                        Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
                try{
                        Thread.sleep(100);
                } catch (InterruptedException ex){
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            while(window==2){
                while(run){
                    if (this.getRandom()==1)
                        numero = 1;
                    else if (this.getRandom()==2)
                        numero = 2;
                    else if (this.getRandom()==3)
                        numero = 3;
                    else if (this.getRandom()==4)
                        numero = 4;
                    else
                        numero = 5;
                    Numero.setText(String.valueOf(numero));
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException ex){
                        Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
                try{
                        Thread.sleep(100);
                } catch (InterruptedException ex){
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Letra = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        btnIniciarNumero = new javax.swing.JButton();
        btnIniciarLetra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Letra.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Letra.setText("a");

        Numero.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Numero.setText("0");

        btnIniciarNumero.setText("Iniciar");
        btnIniciarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarNumeroActionPerformed(evt);
            }
        });

        btnIniciarLetra.setText("Iniciar");
        btnIniciarLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarLetraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Letra)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnIniciarNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnIniciarLetra)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(Numero)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Letra)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarNumero)
                    .addComponent(btnIniciarLetra))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(Numero)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarNumeroActionPerformed
        hilo2.startRunning();
    }//GEN-LAST:event_btnIniciarNumeroActionPerformed

    private void btnIniciarLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarLetraActionPerformed
        hilo1.startRunning();
    }//GEN-LAST:event_btnIniciarLetraActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Letra;
    private javax.swing.JLabel Numero;
    private javax.swing.JButton btnIniciarLetra;
    private javax.swing.JButton btnIniciarNumero;
    // End of variables declaration//GEN-END:variables
}
