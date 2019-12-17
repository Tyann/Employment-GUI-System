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
public class Login extends JFrame implements TextListener, ActionListener{
    //field
    JFrame f= new JFrame();  //TO ACTIVATE GRAPHIC       
    TextField tf1 = new TextField("", 20);
    TextField tf2 = new TextField("", 20);
    
    //constructor
    Login(){
        
        //generals on page
        f.setTitle("ems_FrontPage");
        
        f.setBounds(10, 10, 1000, 600);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        //layout manager
        GridLayout gl = new GridLayout(3, 1); //1 means rows, 3 columns
        f.setLayout(gl);
        
        
        //top block
        Label l0 = new Label("Employee Management System", Label.CENTER);
        l0.setForeground(Color.BLACK); //font color
        l0.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f.add(l0);  
                
        
        
        //middle block
//2nd label
        Panel pm = new Panel();
        Label l1 = new Label("Username: ", Label.CENTER);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        //TextField tf1 = new TextField("", 20);
        tf1.addTextListener(this);
        //Button b1 = new Button
        
        pm.add(l1); pm.add(tf1);
        
        
        Label l2 = new Label("Password: ", Label.CENTER);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 18));
       //TextField tf2 = new TextField("", 20);
       tf2.setEchoChar('*');
        pm.add(l2); pm.add(tf2);
        Button b1 = new Button("enter");
        b1.addActionListener(this);
        pm.add(b1);
        f.add(pm);
        
        //bottom block
        /*Label l3 = new Label("J-Star.com", Label.CENTER);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Calibri", Font.BOLD, 18));
        f.add(l3); */
        ImageIcon ic = new ImageIcon("KERR-McGEE CENTENNIAL PLAZA.jpg");
        Image scaleImage = ic.getImage().getScaledInstance(10, 10,Image.SCALE_SMOOTH);
        JLabel j1 = new JLabel(ic);
        f.add(j1);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//constructor
    
    //method
    @Override
    public void textValueChanged(TextEvent e) {
        
    }//tvc

    @Override
    public void actionPerformed(ActionEvent e) {
        String str1 = e.getActionCommand(); //button name
        String username = tf1.getText();
        String pw = tf2.getText();
        if(str1.equals("enter")){
        
            
        if(tf1.getText().equals("Yann")&& tf2.getText().equals("1102")){
                new Menu();
        }//if    
            /*System.out.println("button name: "+str1);
        System.out.println("username: "+username);
        System.out.println("password: "+pw);
*/      if(tf1.getText().isEmpty()&& tf2.getText().isEmpty()){
           System.out.print("error"); 
        }
        //tmp(str1, username, pw);
        
    }//ap
    
    
    }}//
