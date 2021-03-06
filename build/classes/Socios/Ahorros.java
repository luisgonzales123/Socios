/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socios;

import Class_Socio.Tools;
import DATABASE.ToolsDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabriel
 */
public class Ahorros extends javax.swing.JFrame {
public String ID;
public Date date;
private static final long serialVersionUID = 1L;
    /**
     * Creates new form Ahorros
     * @param ID
     * @param date
     */
    public Ahorros(String ID,Date date) {
        
        this.ID=ID;
        this.date=date;initComponents();setTabla();
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAB = new javax.swing.JTable();
        L_coda = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        S_year = new javax.swing.JSpinner();
        S_month = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 80));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 533, -1, -1));

        TablaAB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        TablaAB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Concepto", "Monto", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaAB);
        if (TablaAB.getColumnModel().getColumnCount() > 0) {
            TablaAB.getColumnModel().getColumn(0).setResizable(false);
            TablaAB.getColumnModel().getColumn(0).setPreferredWidth(150);
            TablaAB.getColumnModel().getColumn(1).setResizable(false);
            TablaAB.getColumnModel().getColumn(1).setPreferredWidth(80);
            TablaAB.getColumnModel().getColumn(2).setResizable(false);
            TablaAB.getColumnModel().getColumn(2).setPreferredWidth(80);
        }
        setTabla();

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 98, 390, 410));

        L_coda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_coda.setForeground(new java.awt.Color(255, 255, 255));
        L_coda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_coda.setText(getCod_A());
        jPanel1.add(L_coda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Año y");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 50, 40));

        S_year.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jPanel1.add(S_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 40, -1));

        S_month.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(S_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Abonos y Liquidaciones");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Meses");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 60, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Actualizar");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 190, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Periodo de la Tabla");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Socio sp = new Socio(ID);
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        setTabla();
    }//GEN-LAST:event_jLabel8MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_coda;
    private javax.swing.JSpinner S_month;
    private javax.swing.JSpinner S_year;
    private javax.swing.JTable TablaAB;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private String getCod_A() {
    
        String coda = null;
        try {
            ResultSet rs = ToolsDB.RS("select Cod_A from Ahorro_Apertura where ID_Socio = '"+ID+"'");
            System.out.println("select Cod_A from Ahorro_Apertura where ID_Socio = '"+ID+"'");
            while(rs.next()){
                coda = rs.getString("Cod_A");
            }
        } catch (SQLException ex) {
          Logger.getLogger(Ahorros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coda;
    }

    private void setTabla() {
    try {
        Tools.limpiarTabla(TablaAB);
        DefaultTableModel e = (DefaultTableModel) TablaAB.getModel();
        ResultSet rs = ToolsDB.RS("select AA.Fecha,AA.Cod_A,AA.Monto,MS.Tasa_Rendimiento,MS.ID_Socio from My_Socios as MS, Ahorro_Apertura as AA where MS.ID_Socio = AA.ID_Socio and MS.ID_Socio = '"+ID+"'");
        while(rs.next()){
            String s=  "Liquidacion al Socio";
            int meses = (Integer) S_month.getValue() + ((Integer) S_year.getValue()*12);
            for (int i = 0; i < meses; i++) {
                Object [] row =  new Object[3];
                Calendar c = Calendar.getInstance();
                c.setTime(rs.getDate("Fecha"));
                c.add(Calendar.MONTH, i + 1);
                row[2] = Tools.getFecha(c.getTime());
                if(c.get(Calendar.MONTH) == Calendar.NOVEMBER){
                    row[0] = "Abono a la Cuenta "+L_coda.getText();
                    row[1] = rs.getDouble("Monto");
                    e.addRow(row);
                    row [0] = s;
                    Calendar cfin = Calendar.getInstance(); 
                    cfin.setTime(rs.getDate("Fecha"));
                    cfin.add(Calendar.MONTH, meses);
                    row [1] = Tools.Redondear(2, Tools.FutDAn(rs.getDouble("Monto"), ToolsDB.getRendimiento(rs.getString("ID_Socio")), cfin.get(Calendar.MONTH), cfin.get(Calendar.YEAR), rs.getDate("Fecha")));
                    row[2] = Tools.getFecha(c.getTime());
                    e.addRow(row);
                }else{
                    row[0] = "Abono a la Cuenta "+L_coda.getText();
                    row[1] = rs.getDouble("Monto");
                    e.addRow(row);                    
                }
            }

            TablaAB.setModel(e);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Ahorros.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
