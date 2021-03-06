/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socios;

import Class_Socio.Reloj;
import DATABASE.ToolsDB;
import com.toedter.plaf.JCalendarTheme;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gabriel
 */
public class Socio extends javax.swing.JFrame {
      JCalendarTheme jCalendarTheme1;
      private static final long serialVersionUID = 1L;
      public String name=""+System.getProperty("user.name");
      public String ID;
    /**
     * Creates new form Socio
     * @param ID
     */
    public Socio(String ID) {
        this.ID=ID;
        initComponents();
        jDateChooser1.setDate(new java.util.Date());
        this.setTitle("Usuario:"+name);
        this.setLocationRelativeTo(null);
    }
     @Override
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/shield-2.png"));
        return retValue;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        roundPanel1 = new roundpanel.RoundPanel();
        ano = new javax.swing.JLabel();
        mes = new javax.swing.JLabel();
        diaSem = new javax.swing.JLabel();
        diaMes = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setColor2(new java.awt.Color(255, 255, 255));
        roundPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel1MouseExited(evt);
            }
        });

        ano.setFont(new java.awt.Font("Segoe UI Semibold", 1, 40)); // NOI18N
        ano.setForeground(new java.awt.Color(0, 0, 80));
        ano.setText("2018");

        mes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        mes.setForeground(new java.awt.Color(0, 0, 80));
        mes.setText("JUNIO");

        diaSem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        diaSem.setForeground(new java.awt.Color(0, 0, 80));
        diaSem.setText("Lunes");

        diaMes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        diaMes.setForeground(new java.awt.Color(0, 0, 80));
        diaMes.setText("01");

        Hora.setText(null);
        Reloj reloj = new Reloj(Hora);
        reloj.start();

        roundPanel1.setLayer(ano, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(mes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(diaSem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(diaMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(Hora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ano)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(diaMes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaSem)
                                .addGap(0, 51, Short.MAX_VALUE))))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mes)
                .addGap(14, 14, 14)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaMes)
                    .addComponent(diaSem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, -1, -1));

        jLabel3.setText(System.getProperty("user.name"));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 121, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 2, 702, 560));

        jMenuBar1.setBackground(new java.awt.Color(45, 71, 104));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Ahorros");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Abonos.png"))); // NOI18N
        jMenuItem2.setText("Ver Ahorros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Prestamos");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Prestamos.png"))); // NOI18N
        jMenuItem4.setText("Solicitar o ver Prestamo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Ajustes");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cambiar.png"))); // NOI18N
        jMenuItem5.setText("Cambiar Contrasena");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/renuncia.png"))); // NOI18N
        jMenuItem6.setText("Solicitar Renuncia");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Salir");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
       String[] opciones = {"Aceptar", "Cancelar"};
       int opcion = JOptionPane.showOptionDialog(null, "¿Esta seguro que desea Salir?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
       if (opcion == 0)
           System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MousePressed

    private void roundPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel1MouseEntered
        ano.setForeground(Color.white);
        mes.setForeground(Color.white);
        diaMes.setForeground(Color.white);
        diaSem.setForeground(Color.white);
        Hora.setForeground(Color.white);
        roundPanel1.setColor1(new Color(0,0,90));
        roundPanel1.setColor2(new Color(20,20,20));
        roundPanel1.repaint();
    }//GEN-LAST:event_roundPanel1MouseEntered

    private void roundPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel1MouseExited
        ano.setForeground(new Color(0,0,90));
        mes.setForeground(new Color(0,0,90));
        diaMes.setForeground(new Color(0,0,90));
        diaSem.setForeground(new Color(0,0,90));
        Hora.setForeground(new Color(0,0,90));
        roundPanel1.setColor1(new Color(255,255,255));
        roundPanel1.setColor2(new Color(250,250,250));
        roundPanel1.repaint();
    }//GEN-LAST:event_roundPanel1MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DPrestamos pr = new DPrestamos(ID,jDateChooser1.getDate());
        pr.setLocationRelativeTo(null);
        pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            Ahorros ah = new Ahorros(ID,jDateChooser1.getDate());
            ah.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JTextField tx = new JTextField();
        String pass_old=DATABASE.ToolsDB.datoReturn(ID,"Pass","My_Socios");
        String pass_new=JOptionPane.showInputDialog(tx,"Contrasena Antigua :"+pass_old);
        String[] opciones = {"Aceptar", "Cancelar"};
        if(pass_new != null){
        int opcion = JOptionPane.showOptionDialog(null, "¿Esta seguro que desea cambiar la contrasena?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
        if (opcion == 0){
           DATABASE.ToolsDB.Actualizar("update My_Socios set Pass='"+pass_new+"' where ID_Socio='"+ID+"'");
        }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Seguro que quieres renunciar?");
        if(opcion == 0){
            ToolsDB.Actualizar("update My_Socios set Activo = 0 where ID_Socio = '"+ID+"'");
            JOptionPane.showMessageDialog(null, "Renuncia Aceptada D:");
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel ano;
    private javax.swing.JLabel diaMes;
    private javax.swing.JLabel diaSem;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mes;
    private roundpanel.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
