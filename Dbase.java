/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_gui_system;
import java.io.*;
/**
 *
 * @author joel yohannan
 */
public class Dbase {
    //field    
    
    //method
    public  void register(Employee emp){ //employee type data should be passed here
        //file write= so we need try catch
        try{
            String stw = emp.getId()+" "+emp.getName()+" "+emp.getDob()+"\n";  //to write in the file
            BufferedWriter bw = new BufferedWriter(new FileWriter("emp.txt", true)); //emp.txt is the file name
            
            bw.write(stw);
            
            bw.flush(); //flush for next use
            bw.close();
            System.out.println();
        }catch(IOException i){
            System.out.println("");
        }//try catch
    
    }//reg
    
    
    //Search
    public void search(String id){
        //try catch for file read       
       
         try{
           String IN[] = new String[100];
           int cnt = 0;
           
           BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
           while(true){
               String str = br.readLine();
               if(str == null){
                   break;
               }//if
               Search sr = new Search();
               IN[cnt] = str;
               for(int i = 0; i<= cnt; i++){
                   if(IN[i].contains(id)){
                       sr.tf2.setText(IN[i]);
                       break;
                   }
                   else{
                       sr.tf2.setText("Employee doesn't exist ");
                   }
               }
              
               cnt++;
        }//while
        }catch(IOException i){
            System.out.println("");
        }//try catch
        
    }//search
    
    
        
    //list
    public void list(){
        //try catch for file read
        try{
            BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
            List ls = new List();
            ls.tf2.read(br, null);
            br.close();
            ls.tf2.requestFocus();
            
            
           /*String IN[] = new String[100];
           //int cnt = 0;
           
           BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
           while(true){
               String str = br.readLine();
               if(str == null){
                   break;
               }//if
               List ls = new List();
               int cnt = 0;
               IN[cnt] = str;
               
               ls.tf2.setText(IN[cnt]);
               
               //System.out.println(IN[cnt]);
               cnt++;
        }//while*/
        }catch(IOException i){
            System.out.println("");
        }//try catch
    }//List
    
    //count
    public void count() {
        
   
        
         //try catch for file read
       try{
            //int cnt = 1;
           String IN[] = new String[20];
           //int cnt = 0;
           
           BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
           int lines = 0;
while (br.readLine() != null) lines++;

br.close();
String str1 = Integer.toString(lines); 
Count c= new Count();
c.tf2.setText(str1);
//System.out.println(lines);
           
           /*while(true){
               String str = br.readLine();
               if(str == null){
                   break;
               }//if
                int cnt = 1;
                for(int i=0; i<cnt;i++){
               IN[i] = str;
               cnt++;
                }
               //System.out.println(IN[i]);                          
               //System.out.println(IN.length);
               //cnt++;
        }//while*/
        }catch(IOException i){
            System.out.println("");
        }//try catch
    
       
       
       
       
    }
    
    
    //constructor
    
}//class
