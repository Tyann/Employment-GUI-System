/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_gui_system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Yann T
 */
public class Search extends JFrame implements TextListener, ActionListener{
    
    JFrame f= new JFrame();  //TO ACTIVATE GRAPHIC       
    TextField tf1 = new TextField("", 5);
    TextField tf2 = new TextField("", 30);
   
    //constructor
    Search(){
        
        //generals on page
        f.setTitle("Search Page");
        
        f.setBounds(10, 10, 1000, 600);
        f.getContentPane().setBackground(Color.WHITE);
        //layout manager
        GridLayout gl = new GridLayout(5, 1); //2 means rows, 3 columns
        f.setLayout(gl);
        
        
        //top block
        Label l0 = new Label("Search by ID", Label.CENTER);
        l0.setForeground(Color.BLUE); //font color
        l0.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        f.add(l0);  
                
       
        
                
        
        
        //middle block
//2nd label
        Panel pm = new Panel();
        Label l1 = new Label("Enter ID: ", Label.CENTER);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Calibri", Font.ITALIC, 18));
        pm.add(l1); pm.add(tf1);
        
        
            
        Button b1 = new Button("Search");
        
        b1.addActionListener(this);
        pm.add(b1);
        f.add(pm);
        
        
        Panel pm2 = new Panel();
        Label l3 = new Label("Result :- ", Label.CENTER);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Calibri", Font.ITALIC, 18));
        pm2.add(l3); pm2.add(tf2);
        
        f.add(pm2);
        
       Panel pm3 = new Panel();
        Button b2 = new Button("Back to Menu");
        b2.addActionListener(this);
        pm3.add(b2);
        f.add(pm3);
        
        //bottom block
        
        ImageIcon ic = new ImageIcon("KERR-McGEE CENTENNIAL PLAZA.jpg");
        JLabel j1 = new JLabel(ic);
        f.add(j1);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//constructor
    
    
    
    
    @Override
    public void textValueChanged(TextEvent te) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Dbase db1 = new Dbase();
        
        String str1 = e.getActionCommand(); //button name
        String id = tf1.getText();
        
        if(str1.equals("Search")){
             //Employee result = null;
          db1.search(id);
        }
        else if(str1.equals("Back to Menu")){
        new Menu();
        }
    }
    
}
