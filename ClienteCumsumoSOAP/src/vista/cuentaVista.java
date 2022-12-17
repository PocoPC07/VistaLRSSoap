/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class cuentaVista extends javax.swing.JFrame {

    /**
     * Creates new form cuentaVista
     */
    public cuentaVista() {
        initComponents();
    }

    public JButton getCerrarBtn() {
        return cerrarBtn;
    }

    public void setCerrarBtn(JButton cerrarBtn) {
        this.cerrarBtn = cerrarBtn;
    }

    public JRadioButton getDepositoOpcion() {
        return depositoOpcion;
    }

    public void setDepositoOpcion(JRadioButton depositoOpcion) {
        this.depositoOpcion = depositoOpcion;
    }

    public ButtonGroup getGrupOpciones() {
        return grupOpciones;
    }

    public void setGrupOpciones(ButtonGroup grupOpciones) {
        this.grupOpciones = grupOpciones;
    }

    public JLabel getMsgUsuario() {
        return msgUsuario;
    }

    public void setMsgUsuario(JLabel msgUsuario) {
        this.msgUsuario = msgUsuario;
    }

    public JButton getRegisterSaldoBtn() {
        return registerSaldoBtn;
    }

    public void setRegisterSaldoBtn(JButton registerSaldoBtn) {
        this.registerSaldoBtn = registerSaldoBtn;
    }

    public JRadioButton getRetiroOpcion() {
        return retiroOpcion;
    }

    public void setRetiroOpcion(JRadioButton retiroOpcion) {
        this.retiroOpcion = retiroOpcion;
    }

    public JLabel getSaldoText() {
        return saldoText;
    }

    public void setSaldoText(JLabel saldoText) {
        this.saldoText = saldoText;
    }

    public JLabel getUsernameText() {
        return usernameText;
    }

    public void setUsernameText(JLabel usernameText) {
        this.usernameText = usernameText;
    }

    public JTextField getValorTxt() {
        return valorTxt;
    }

    public void setValorTxt(JTextField valorTxt) {
        this.valorTxt = valorTxt;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupOpciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        msgUsuario = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        registerSaldoBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valorTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        depositoOpcion = new javax.swing.JRadioButton();
        retiroOpcion = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        saldoText = new javax.swing.JLabel();
        cerrarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setText("Selecione una Opcion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        msgUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        msgUsuario.setText("Mensaje para el usuario");
        jPanel1.add(msgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        usernameText.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20)); // NOI18N
        usernameText.setText("username");
        jPanel1.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 40));

        registerSaldoBtn.setText("Registrarse");
        registerSaldoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSaldoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(registerSaldoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 200, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel5.setText("Cuenta de Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setText("Valor:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));
        jPanel1.add(valorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 120, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel7.setText("Saldo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        depositoOpcion.setBackground(new java.awt.Color(204, 255, 204));
        grupOpciones.add(depositoOpcion);
        depositoOpcion.setText("Deposito");
        jPanel1.add(depositoOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        retiroOpcion.setBackground(new java.awt.Color(204, 255, 204));
        grupOpciones.add(retiroOpcion);
        retiroOpcion.setText("Retiro");
        jPanel1.add(retiroOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 480, 10));

        saldoText.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        saldoText.setText("000000");
        jPanel1.add(saldoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 40));

        cerrarBtn.setText("X");
        jPanel1.add(cerrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerSaldoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSaldoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerSaldoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(cuentaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuentaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuentaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuentaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuentaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarBtn;
    public javax.swing.JRadioButton depositoOpcion;
    public javax.swing.ButtonGroup grupOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel msgUsuario;
    public javax.swing.JButton registerSaldoBtn;
    public javax.swing.JRadioButton retiroOpcion;
    public javax.swing.JLabel saldoText;
    public javax.swing.JLabel usernameText;
    public javax.swing.JTextField valorTxt;
    // End of variables declaration//GEN-END:variables
}
