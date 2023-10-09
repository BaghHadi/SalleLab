/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public class Institution {
    public int id;
    private String type;
    private String Address ;
    private String Phone_Number;
    private String Logo_Url;
    public Department[] departments;
    
    public Institution (int id,String type,String Address, String Phone_Number,String Logo_Url){
        this.id = id;
        this.type=type;
        this.Address= Address;
        this.Phone_Number=Phone_Number;
        this.Logo_Url= Logo_Url;
        this.departments= new Department[2];
    }
    
    public void graduateStrudent(){};
    
    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartment(Department[] departments) {
        this.departments = departments;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public void setLogo_Url(String Logo_Url) {
        this.Logo_Url = Logo_Url;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public String getLogo_Url() {
        return Logo_Url;
    }
    
}
