/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Codigo.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Codigo.Reloj;


/**
 *
 * @author Santiago Vergara
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    private int tipoVehiculo;
    private String entrada;
    private String salida;
    public menu() {
        initComponents();
        setTitle("Menu Principal");
        setResizable(false);
        Reloj relojito = new Reloj(0,0,0,0,this);
                
    }
    private estacionamiento est=new estacionamiento();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btnAuto = new javax.swing.JButton();
        btnCamion = new javax.swing.JButton();
        btnMoto = new javax.swing.JButton();
        btnRodante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtpatente = new javax.swing.JTextField();
        txtestadia = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblHora = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        jLabel4.setText("_________________________________________________________________________________________");

        jButton8.setText("jButton8");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo1.png"))); // NOI18N

        btnAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonauto.png"))); // NOI18N
        btnAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoActionPerformed(evt);
            }
        });

        btnCamion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botoncamion.png"))); // NOI18N
        btnCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamionActionPerformed(evt);
            }
        });

        btnMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonmoto.png"))); // NOI18N
        btnMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotoActionPerformed(evt);
            }
        });

        btnRodante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonrodante.png"))); // NOI18N
        btnRodante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRodanteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Patente/Identificación:");

        jLabel8.setText("Duración estadía:");

        jLabel9.setText("Cliente:");

        jButton5.setText("Aplicar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtpatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatenteActionPerformed(evt);
            }
        });

        txtestadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadiaActionPerformed(evt);
            }
        });

        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botoncaja.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonestacionamiento.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonusuario.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonsalir.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel11.setText("Espacios libres:");

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnAuto)
                                .addGap(50, 50, 50)
                                .addComponent(btnMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnCamion)
                                .addGap(50, 50, 50)
                                .addComponent(btnRodante))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtpatente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtestadia, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addGap(29, 29, 29)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRodante)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAuto)
                            .addComponent(btnMoto))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(txtpatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addComponent(txtestadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel11))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoActionPerformed
        tipoVehiculo = 1;
    }//GEN-LAST:event_btnAutoActionPerformed
    private void btnCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamionActionPerformed
        // TODO add your handling code here:
        tipoVehiculo = 3;
    }//GEN-LAST:event_btnCamionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            autos auto = new autos(txtpatente.getText(), Integer.parseInt(txtestadia.getText()), txtcliente.getText(), tipoVehiculo, entrada, salida);
            Reloj reloj = new Reloj(0,0,0,0,this);
            if (listaautos.addautos(auto)) {
                    if (listaautos.getLista()[1]==null){
                        est.setjLabel1(txtcliente.getText(), txtpatente.getText());
                        String imagen="/Imagenes/moto.png";
                        switch(tipoVehiculo){
                            case 1: imagen="/Imagenes/auto.png";
                                    break;
                            case 2: imagen="/Imagenes/moto.png";
                                    break;
                            case 3: imagen="/Imagenes/camion.png";
                                    break;
                            case 4: imagen="/Imagenes/rodante.png";
                                    break;
                        }
           
                        auto.setEntrada(reloj.devolverHora()+"--"+reloj.devolverFecha());
                        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
                        est.getjLabel1().setIcon(icono);
                                
                    } else if (listaautos.getLista()[2]==null){
                        est.setjLabel2(txtcliente.getText(), txtpatente.getText());
                        String imagen="/Imagenes/moto.png";
                        switch(tipoVehiculo){
                            case 1: imagen="/Imagenes/auto.png";
                                    break;
                            case 2: imagen="/Imagenes/moto.png";
                                    break;  
                            case 3: imagen="/Imagenes/camion.png";
                                    break;
                            case 4: imagen="/Imagenes/rodante.png";
                                    break;
                        }
                        auto.setEntrada(reloj.devolverHora()+"--"+reloj.devolverFecha());
                        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
                        est.getjLabel2().setIcon(icono);
                        
                    } else if (listaautos.getLista()[3]==null){
                        est.setjLabel3(txtcliente.getText(), txtpatente.getText());
                        String imagen="/Imagenes/moto.png";
                        switch(tipoVehiculo){
                            case 1: imagen="/Imagenes/auto.png";
                                    break;
                            case 2: imagen="/Imagenes/moto.png";
                                    break;  
                            case 3: imagen="/Imagenes/camion.png";
                                    break;
                            case 4: imagen="/Imagenes/rodante.png";
                                    break;
                        }                     
                        auto.setEntrada(reloj.devolverHora()+"--"+reloj.devolverFecha());
                        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
                        est.getjLabel3().setIcon(icono);
                                
                    } else if (listaautos.getLista()[4]==null){
                        est.setjLabel4(txtcliente.getText(), txtpatente.getText());
                        String imagen="/Imagenes/moto.png";
                        switch(tipoVehiculo){
                            case 1: imagen="/Imagenes/auto.png";
                                    break;
                            case 2: imagen="/Imagenes/moto.png";
                                    break;  
                            case 3: imagen="/Imagenes/camion.png";
                                    break;
                            case 4: imagen="/Imagenes/rodante.png";
                                    break;
                        }
                        auto.setEntrada(reloj.devolverHora()+"--"+reloj.devolverFecha());
                        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
                        est.getjLabel4().setIcon(icono);
                        
                    } else if (listaautos.getLista()[5]==null){
                        est.setjLabel5(txtcliente.getText(), txtpatente.getText());
                        String imagen="/Imagenes/moto.png";
                        switch(tipoVehiculo){
                            case 1: imagen="/Imagenes/autoder.png";
                                    break;
                            case 2: imagen="/Imagenes/motoder.png";
                                    break;  
                            case 3: imagen="/Imagenes/camionder.png";
                                    break;
                            case 4: imagen="/Imagenes/rodanteder.png";
                                    break;
                        }
                        auto.setEntrada(reloj.devolverHora()+"--"+reloj.devolverFecha());
                        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
                        est.getjLabel5().setIcon(icono);
                        
                    } else if (listaautos.getLista()[6]==null){
                        est.setjLabel6(txtcliente.getText(), txtpatente.getText());
                        String imagen="/Imagenes/moto.png";
                        switch(tipoVehiculo){
                            case 1: imagen="/Imagenes/autoder.png";
                                    break;
                            case 2: imagen="/Imagenes/motoder.png";
                                    break;
                            case 3: imagen="/Imagenes/camionder.png";
                                    break;
                            case 4: imagen="/Imagenes/rodanteder.png";
                                    break;
                        }
                        auto.setEntrada(reloj.devolverHora()+"--"+reloj.devolverFecha());
                        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
                        est.getjLabel6().setIcon(icono);
                        
                    } else if (listaautos.getLista()[7]==null){
                        est.setjLabel7(txtcliente.getText(), txtpatente.getText());
                        String imagen="/Imagenes/moto.png";
                        switch(tipoVehiculo){
                            case 1: imagen="/Imagenes/autoder.png";
                                    break;
                            case 2: imagen="/Imagenes/motoder.png";
                                    break;  
                            case 3: imagen="/Imagenes/camionder.png";
                                    break;
                            case 4: imagen="/Imagenes/rodanteder.png";
                                    break;
                        }
                        auto.setEntrada(reloj.devolverHora()+"--"+reloj.devolverFecha());
                        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
                        est.getjLabel7().setIcon(icono);
                        
                    } else if (listaautos.getLista()[8]==null){
                        est.setjLabel8(txtcliente.getText(), txtpatente.getText());
                        String imagen="/Imagenes/moto.png";
                        switch(tipoVehiculo){
                            case 1: imagen="/Imagenes/autoder.png";
                                    break;
                            case 2: imagen="/Imagenes/motoder.png";
                                    break;  
                            case 3: imagen="/Imagenes/camionder.png";
                                    break;
                            case 4: imagen="/Imagenes/rodanteder.png";
                                    break;
                        }
                        auto.setEntrada(reloj.devolverHora()+"--"+reloj.devolverFecha());
                        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(imagen));
                        est.getjLabel8().setIcon(icono);}
                                   
                txtpatente.setText("");
                txtcliente.setText("");
                txtestadia.setText("");
                
            } else {
                JOptionPane.showMessageDialog(this, "No hay mas lugar");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtpatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatenteActionPerformed
    }//GEN-LAST:event_txtpatenteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        caja abrir=new caja ();
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        est.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dispose();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed

    }//GEN-LAST:event_txtclienteActionPerformed


    private void btnMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotoActionPerformed
        tipoVehiculo = 2;
    }//GEN-LAST:event_btnMotoActionPerformed

    private void btnRodanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRodanteActionPerformed
        tipoVehiculo = 4;        
    }//GEN-LAST:event_btnRodanteActionPerformed

    private void txtestadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadiaActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        clientes abrir=new clientes ();
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }

    public JLabel getLblHora() {
        return lblHora;
    }

    public void setLblHora(JLabel lblHora) {
        this.lblHora = lblHora;
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuto;
    private javax.swing.JButton btnCamion;
    private javax.swing.JButton btnMoto;
    private javax.swing.JButton btnRodante;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtestadia;
    private javax.swing.JTextField txtpatente;
    // End of variables declaration//GEN-END:variables


}

