/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1
package employee_gui_system;

/**
 *
 * @author Yann T
 */


//datatype
public class Employee {
//field
private String id, name, dob;

//method
public String getId(){
        return id;
}//id

public String getName(){
        return name;
}

public String getDob(){
        return dob;
}

//constructor    
public Employee(String id, String name, String dob){
        
    this.id = id;
    this.name = name;
    this.dob = dob;
        
}//constructor






}
