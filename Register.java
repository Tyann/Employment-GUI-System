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
public class Register extends JFrame implements TextListener, ActionListener{
    
     JFrame f= new JFrame();  //TO ACTIVATE GRAPHIC       
    TextField tf1 = new TextField("", 1);
    TextField tf2 = new TextField("", 20);
    TextField tf3 = new TextField("", 20);
    //constructor
    Register(){
        
        //generals on page
        f.setTitle("Registration Page");
        
        f.setBounds(10, 10, 1000, 600);
        f.getContentPane().setBackground(Color.WHITE);
        //layout manager
        GridLayout gl = new GridLayout(4, 1); //2 means rows, 3 columns
        f.setLayout(gl);
        
        
        //top block
        Label l0 = new Label("Employee Registration", Label.CENTER);
        l0.setForeground(Color.BLUE); //font color
        l0.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f.add(l0);  
                
        
        
        //middle block
//2nd label
        Panel pm = new Panel();
        Label l1 = new Label("Employee ID: ", Label.CENTER);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Calibri", Font.BOLD, 18));
        
        //TextField tf1 = new TextField("", 20);
        tf1.addTextListener(this);
        //Button b1 = new Button
        
        pm.add(l1); pm.add(tf1);
        
        
        Label l2 = new Label("Employee Name: ", Label.CENTER);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Calibri", Font.BOLD, 18));
       //TextField tf2 = new TextField("", 20);
       tf2.addTextListener(this);
        pm.add(l2); pm.add(tf2);
        
         Label l3 = new Label("Employee DOB: ", Label.CENTER);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Calibri", Font.BOLD, 18));
        tf3.addTextListener(this);
        pm.add(l3); pm.add(tf3);
        
        
        
        
        Button b1 = new Button("ADD");
        b1.addActionListener(this);
        pm.add(b1);
        f.add(pm);
        
        Panel pm2 = new Panel();
        Button b2 = new Button("Back to Menu");
        b2.addActionListener(this);
        pm2.add(b2);
        f.add(pm2);
        
        //bottom block
        /*Label l3 = new Label("J-Star.com", Label.CENTER);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Calibri", Font.BOLD, 18));
        f.add(l3); */
        ImageIcon ic = new ImageIcon("KERR-McGEE CENTENNIAL PLAZA.jpg");
        JLabel j1 = new JLabel(ic);
        f.add(j1);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//constructor

    @Override
    public void textValueChanged(TextEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Dbase db1 = new Dbase();
        
        String str1 = e.getActionCommand(); //button name
        String id = tf1.getText();
        String name = tf2.getText();
        String dob = tf3.getText();
        if(str1.equals("ADD")){
            Employee e1 = new Employee(tf1.getText(), tf2.getText(), tf3.getText());
            db1.register(e1);
            
        }
        else if(str1.equals("Back to Menu")){
        new Menu();
        }
        
    }
    
    
}
