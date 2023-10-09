/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */


public class Datashow extends Materials {
     String brand_name ;


    
    public Datashow(String brand_name ,String registration_number,String date_installtion,String type){
        super (registration_number,date_installtion,type);
        this.type = "Datashow";
        this.brand_name = brand_name;
    }
    public  void print(){
        System.out.println("brand name :" + brand_name);
        print_material_infos();
        
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    
}
