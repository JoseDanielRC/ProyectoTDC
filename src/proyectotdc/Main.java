/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotdc;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    ArrayList<Nodo> listaVertices = new ArrayList();
    ArrayList<Linea> lines = new ArrayList();
    Graphics g;
    Graphics c;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        g = this.jp_pizarra.getGraphics();
        c = this.jp_pizarra.getGraphics();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_grados = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtxt_inputgradovertice = new javax.swing.JTextField();
        jp_mainpanel = new javax.swing.JPanel();
        jb_agregarnodo = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jp_pizarra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_camino = new javax.swing.JTextField();
        jb_dibujar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtf_origen = new javax.swing.JTextField();
        jtf_destino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbt_grado = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();

        jButton2.setText("Calcular grado por vértice");

        jButton3.setText("Calcular grado total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxt_inputgradovertice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(160, 160, 160))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jtxt_inputgradovertice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addComponent(jButton3)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_gradosLayout = new javax.swing.GroupLayout(jd_grados.getContentPane());
        jd_grados.getContentPane().setLayout(jd_gradosLayout);
        jd_gradosLayout.setHorizontalGroup(
            jd_gradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_gradosLayout.setVerticalGroup(
            jd_gradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_mainpanel.setBackground(new java.awt.Color(0, 0, 0));

        jb_agregarnodo.setText("Nuevo vértice");
        jb_agregarnodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarnodoActionPerformed(evt);
            }
        });

        jb_limpiar.setText("Limpiar");
        jb_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_pizarraLayout = new javax.swing.GroupLayout(jp_pizarra);
        jp_pizarra.setLayout(jp_pizarraLayout);
        jp_pizarraLayout.setHorizontalGroup(
            jp_pizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        jp_pizarraLayout.setVerticalGroup(
            jp_pizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Ingrese un camino valido(ejem: 1,2,3,4)");

        jtf_camino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_caminoActionPerformed(evt);
            }
        });

        jb_dibujar.setText("Dibujar");
        jb_dibujar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_dibujarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("GRAPHICS E&D&L");

        jtf_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_destinoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Origen");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destino");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("DRAW LINE");

        jButton1.setText("-->");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jbt_grado.setText("Ver grados");
        jbt_grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_gradoActionPerformed(evt);
            }
        });

        jButton4.setText("Ruta Optima");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_mainpanelLayout = new javax.swing.GroupLayout(jp_mainpanel);
        jp_mainpanel.setLayout(jp_mainpanelLayout);
        jp_mainpanelLayout.setHorizontalGroup(
            jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_mainpanelLayout.createSequentialGroup()
                .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_mainpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_camino)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_mainpanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbt_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb_agregarnodo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_mainpanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_mainpanelLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jb_dibujar))
                                    .addGroup(jp_mainpanelLayout.createSequentialGroup()
                                        .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(26, 26, 26)
                                        .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jtf_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jp_pizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jp_mainpanelLayout.setVerticalGroup(
            jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mainpanelLayout.createSequentialGroup()
                .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_mainpanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_mainpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_camino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_mainpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jp_pizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_mainpanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jb_agregarnodo)
                        .addGap(18, 18, 18)
                        .addComponent(jbt_grado)
                        .addGap(26, 26, 26)
                        .addComponent(jb_limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jb_dibujar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_caminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_caminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_caminoActionPerformed

    private void jb_agregarnodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarnodoActionPerformed
        cont++;
        Nodo nodo = new Nodo(cont);
        jp_pizarra.add(nodo);
        listaVertices.add(nodo);
        nodo.updateUI();
//        for (int i = 0; i < lines.size() ; i++) {
//            for (int j = 0; j < lines.size(); j++) {
//                g.drawLine(listaVertices.get(lines.get(i).getX()).getX(), listaVertices.get(lines.get(i).getY()).getY(), listaVertices.get(lines.get(j).getX()).getX(), listaVertices.get(lines.get(j).getX()).getX());
//            }
//        }
    }//GEN-LAST:event_jb_agregarnodoActionPerformed

    private void jtf_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_destinoActionPerformed

    private void jb_dibujarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_dibujarMouseClicked
        if (jtf_origen.getText().equals("") || jtf_destino.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tiene argumentos vacios");
        } else {
            g.drawLine(listaVertices.get(Integer.parseInt(jtf_origen.getText()) - 1).getX() + 5, listaVertices.get(Integer.parseInt(jtf_origen.getText()) - 1).getY() + 5, listaVertices.get(Integer.parseInt(jtf_destino.getText()) - 1).getX() + 5, listaVertices.get(Integer.parseInt(jtf_destino.getText()) - 1).getY() + 5);
            lines.add(new Linea(Integer.parseInt(jtf_origen.getText()), Integer.parseInt(jtf_destino.getText())));
            Nodo origen = listaVertices.get(Integer.parseInt(jtf_origen.getText()) - 1);
            Nodo destino = listaVertices.get(Integer.parseInt(jtf_destino.getText()) - 1);
            listaVertices.get(Integer.parseInt(jtf_origen.getText()) - 1).nodos.add(destino);
            listaVertices.get(Integer.parseInt(jtf_destino.getText()) - 1).nodos.add(origen);
        }
    }//GEN-LAST:event_jb_dibujarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        for (int i = 0; i < jtf_camino.getText().length(); i++) {
            if (jtf_camino.getText().charAt(i) != ',') {
                camino.add(Character.getNumericValue(jtf_camino.getText().charAt(i)));
            }
        }
        ArrayList<Integer> novalido = new ArrayList(camino);
        ArrayList<Integer> valido = new ArrayList(camino);
        System.out.println(camino);
        c.setColor(Color.RED);
        if (validarcamino(camino, listaVertices.get(camino.get(1) - 1))) {
            JOptionPane.showMessageDialog(this, "Camino Válido");
        } else {
            c.setColor(Color.BLACK);
            JOptionPane.showMessageDialog(this, "Camino Inválido");
            validarcamino(novalido, listaVertices.get(novalido.get(1) - 1));
        };
        camino.removeAll(camino);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
        jp_pizarra.removeAll();
        jp_pizarra.repaint();
        lines.removeAll(lines);
        listaVertices.removeAll(listaVertices);
        cont = 0;
        camino.removeAll(camino);
    }//GEN-LAST:event_jb_limpiarActionPerformed

    private void jbt_gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_gradoActionPerformed
        int gradoMayor = listaVertices.get(0).getNodos().size();
        String gradosVertices = "";
        for (int i = 1; i < listaVertices.size(); i++) {
            if (listaVertices.get(i).getNodos().size() > gradoMayor) {
                gradoMayor = listaVertices.get(i).getNodos().size();
            }
            gradosVertices += "El grado del vértice " + String.valueOf(listaVertices.get(i - 1).getNum()) + " es: "
                    + String.valueOf(listaVertices.get(i - 1).getNodos().size()) + "\n";
        }
        gradosVertices += "\n" + "El grado del grafo es: " + String.valueOf(gradoMayor);
        JOptionPane.showMessageDialog(this, gradosVertices);
    }//GEN-LAST:event_jbt_gradoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Codigo de ruta optima
        // Metodo de boton de Ruta Optima
        camilo.removeAll(camilo);
        for (int i = 0; i < jtf_camino.getText().length(); i++) {
            if (jtf_camino.getText().charAt(i) != ',') {
                camilo.add(Character.getNumericValue(jtf_camino.getText().charAt(i)));
            }
        }
        System.out.println(camilo);
        int inicio = camilo.get(0);
        int fin = camilo.get(camilo.size() - 1);
        Nodo origen = listaVertices.get(inicio - 1);
        Nodo destino = listaVertices.get(fin - 1);
        ArrayList[] caminos = new ArrayList[origen.nodos.size()];
        //System.out.println("Inicio: "+inicio+" y destino: "+ destino);

        for (int i = 0; i < origen.nodos.size(); i++) {
            System.out.println(origen.nodos.get(i));
            n.add(origen.getNum());
            //caminos.get(i).add(origen);
            rutaOptima(origen.nodos.get(i), fin, i);
            llenar(n, fin);
            n.removeAll(n);
            //System.out.println(caminos.get(i));
        }

        ArrayList<Integer> gradoMenor = nuevos.get(0);
        for (int i = 1; i < nuevos.size(); i++) {
            if (nuevos.get(i).size() < gradoMenor.size()) {
                gradoMenor = nuevos.get(i);
            }

        }
        System.out.println(gradoMenor);
        c.setColor(Color.blue);
        System.out.println(validarcamino(gradoMenor, listaVertices.get(gradoMenor.get(1) - 1)));
    }//GEN-LAST:event_jButton4ActionPerformed
    public void llenar(ArrayList<Integer> e, int destino) {
        if (e.get(e.size() - 1) == destino) {
            ArrayList<Integer> myObject = new ArrayList(e);
            nuevos.add(myObject);
            System.out.println(nuevos);
        }

    }

    public void rutaOptima(Nodo origen, int fin, int pos) {
        if (origen.getNum() == fin) {
            n.add(origen.getNum());
        } else {
            n.add(origen.getNum());
            for (Nodo e : origen.nodos) {
                if (!n.contains(e.getNum())) {
                    rutaOptima(e, fin, pos);
//                        System.out.println(e);
                }
            }
        }
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public boolean validarcamino(ArrayList valido, Nodo nodo) {
        int bandera = camino.size();
        Nodo nuevonodo = new Nodo();
        if (!valido.isEmpty()) {
            for (int i = 0; i < nodo.nodos.size(); i++) {
                if (valido.get(0).toString().equals(nodo.nodos.get(i).getNum() + "")) {
                    valido.remove(0);
                    nuevonodo = nodo.nodos.get(i);
                    c.drawLine(nodo.getX() + 5, nodo.getY() + 5, nuevonodo.getX() + 5, nuevonodo.getY() + 5);
                    i = nodo.nodos.size();
                }
            }
            if (valido.size() == bandera) {
                return false;
            } else {
                return validarcamino(valido, nuevonodo);
            }
        } else {
            return true;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_agregarnodo;
    private javax.swing.JButton jb_dibujar;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JToggleButton jbt_grado;
    private javax.swing.JDialog jd_grados;
    private javax.swing.JPanel jp_mainpanel;
    private javax.swing.JPanel jp_pizarra;
    private javax.swing.JTextField jtf_camino;
    private javax.swing.JTextField jtf_destino;
    private javax.swing.JTextField jtf_origen;
    private javax.swing.JTextField jtxt_inputgradovertice;
    // End of variables declaration//GEN-END:variables
 int cont = 0;
    ArrayList<Integer> camino = new ArrayList();
    ArrayList<Integer> camilo = new ArrayList();
    ArrayList<Integer> n = new ArrayList();
    ArrayList<ArrayList<Integer>> nuevos = new ArrayList();
}
