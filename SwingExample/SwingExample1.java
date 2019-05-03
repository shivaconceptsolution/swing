/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingExample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author SHIVA
 */
public class SwingExample1 {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        obj.setBounds(100, 50, 500, 500);
        //obj.setSize(400,400);
        obj.setVisible(true);
        obj.setLayout(null);
        JButton btn = new JButton("CLICK");
        btn.setBounds(100,100, 150, 30);
        obj.add(btn);
        JTextField txt = new JTextField();
        txt.setBounds(100, 50, 150, 30);
        obj.add(txt);
        JLabel lbl = new JLabel();
        lbl.setBounds(100,150, 100, 30);
        obj.add(lbl);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lbl.setText(txt.getText());
            }
        });
        
        
        
        
        
        
    }
}
