/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public class Service_RH extends Service {
    public int EmployeeID;
    public String Skills;
    
    public Service_RH(int EmployeeID,String Skills){
        this.EmployeeID =EmployeeID;
        this.Skills=Skills;
        
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getSkills() {
        return Skills;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public void setSkills(String Skills) {
        this.Skills = Skills;
    }
    
    
}
