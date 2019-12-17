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
public class Menu extends JFrame implements ItemListener, ActionListener{
    //field
    JFrame f= new JFrame();  //TO ACTIVATE GRAPHIC       
    Checkbox cb1 = new Checkbox("Register");
     Checkbox cb2 = new Checkbox("Search By ID");
      Checkbox cb3 = new Checkbox("List");
       Checkbox cb4 = new Checkbox("Total Number");
        Checkbox cb5 = new Checkbox("Quit");
        
   // Button b = new Button("Continue");    
    
    //constructor
    Menu(){
        
        //generals on page
        f.setTitle("EMS_MenuPage");
        
        f.setBounds(10, 10, 1000, 600);
        f.getContentPane().setBackground(Color.WHITE);
        //layout manager
        GridLayout gl = new GridLayout(3, 1); //3 means rows, 1 columns
        f.setLayout(gl);
        
        
        //top block
        Label l0 = new Label("Employee Management System: Menu", Label.CENTER);
        l0.setForeground(Color.BLACK); //font color
        l0.setFont(new Font("Times New Roman", Font.BOLD, 24));
        f.add(l0);  
                
        
        
        //middle block
        cb1.addItemListener(this); //cb1 is activated
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);
        
        //b.addActionListener(this);
        
        Panel p1 = new Panel();
        Label l1 = new Label("Select a checkbox: ");
        l1.setForeground(Color.blue); //font color
        l1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        p1.add(l1); p1.add(cb1); p1.add(cb2); p1.add(cb3); p1.add(cb4); p1.add(cb5); //p1.add(b);
        
        f.add(p1);
        
        
        
        //bottom block
        /*Label l3 = new Label("J-Star.com", Label.CENTER);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Calibri", Font.BOLD, 18));
        f.add(l3);*/
        
        //ImageIcon ic = new ImageIcon("ocustar.jpg"); // in source/Hello_world file
        //also  
        ImageIcon ic = new ImageIcon("KERR-McGEE CENTENNIAL PLAZA.jpg");
        JLabel j1 = new JLabel(ic);
        f.add(j1);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//constructor
    
    //method
    /*@Override
    public void textValueChanged(TextEvent e) {
        
    }//tvc*/

    @Override
    public void actionPerformed(ActionEvent e) {
        
      /*  
        String str1 = e.getActionCommand(); //button name
        String reg = cb1.getName();
        String search = cb2.getName();
        String list = cb3.getName();       
        String number = cb4.getName();
        String quit = cb5.getName();
        if(str1.equals("Continue")){
           System.out.println("button name: "+str1);
        //if(itemStateChanged(str).cb1.getName().equals("Register")){
              new Register();
        //}

        }
        */
        
    }//ap
    
   

    @Override
    public void itemStateChanged(ItemEvent ie) {
       Menu mn = new Menu();
        String str = (String)ie.getItem(); //s tring type casting cuz not compatible otherwise
            
       if(str.equals("Register")){
          
           new Register();
       }
       else if(str.equals("Search By ID")){
       
           new Search();
       }
       else if(str.equals("List")){
       
           new List();
       }
       else if(str.equals("Total Number")){
       
           new Count();
       }
       else if(str.equals("Quit")){
           
           System.exit(0);
       }
       
    }
}//
