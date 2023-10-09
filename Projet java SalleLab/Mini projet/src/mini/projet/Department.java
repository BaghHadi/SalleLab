/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;
import java.util.ArrayList;
/**
 *
 * @author hadi
 */
public class Department {
    public String services;
    public String DepartementName;
    public String Code ;
    public String HeadName;
    public String Email_Address;
    public Block block;
    private ArrayList<IService> service;
    public ArrayList<TP_Salle> tp_salle;
    
    public Department(String services,String DepartementName,String Code ,String HeadName,String Email_Address){
        this.services=services;
        this.DepartementName=DepartementName;
        this.Code=Code;
        this.HeadName=HeadName;
        this.Email_Address=Email_Address;
        this.service = new ArrayList<>();
        this.tp_salle = new ArrayList<>();
        
    };

    public ArrayList<TP_Salle> getTp_salle() {
        return tp_salle;
    }

    public void setTp_salle(ArrayList<TP_Salle> tp_salle) {
        this.tp_salle = tp_salle;
    }
    
    
    
    
    
    public void addService(IService service) {
        this.service.add(service);
    }
    
    
    
    public String getId() {
        return services;
    }

    public String getDepartementName() {
        return DepartementName;
    }

    public String getCode() {
        return Code;
    }

    public String getHeadName() {
        return HeadName;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public Block getBlock() {
        return block;
    }

    public void setId(int id) {
        this.services = services;
    }

    public void setDepartementName(String DepartementName) {
        this.DepartementName = DepartementName;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setHeadName(String HeadName) {
        this.HeadName = HeadName;
    }

    public void setEmail_Address(String Email_Address) {
        this.Email_Address = Email_Address;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
    
}
