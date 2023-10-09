/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public class Printer extends Materials {
     String brand_name ;
     int capacity ;

    
    public Printer(String registration_number,String date_installtion,String type){
        super (registration_number,date_installtion,type);
        this.type = "Printer";
    }
    public  void print(){
        System.out.println("brand name :" + brand_name);
        System.out.println("capacity :"+ capacity);
        print_material_infos();
        
    }
}
