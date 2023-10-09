/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public class Accessoires extends Materials {
     String name ;

    
    public Accessoires(String name,String registration_number,String date_installtion,String type){
        super (registration_number,date_installtion,type);
        this.type = "Accessoire";
        this.name =name;
    }
    public  void print(){
        System.out.println(" name :" + name);

        print_material_infos();
        
    }
}
