/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testemaitha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author fernandogodoy
 */
public class TesteMaitha  extends JFrame{
    
    private static String labelPrefix = "No. de clicks ";
    private int nClicks = 0;
    final JLabel lblMsg = new JLabel(labelPrefix + "0");
    final JButton btnOk = new JButton("Ok");
    
    JPanel painel = new JPanel();
    
   public TesteMaitha(String titulo){
       setTitle(titulo);
       setSize(250 , 100);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       painel.add(btnOk);
       painel.add(lblMsg);
       add(painel);
       setVisible(true);
       btnOk.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               btnOk_actionPerformed(e);
           }

           private void btnOk_actionPerformed(ActionEvent e) {
               nClicks++;
               lblMsg.setText(labelPrefix + nClicks);
           }
           
       });
   }
   
   public static void main(String ... args){
       TesteMaitha app = new TesteMaitha("Aplicação de Botão");
   }
    
}