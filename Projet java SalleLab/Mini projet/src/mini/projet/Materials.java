/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public abstract class Materials {
   
    public String type ;
    public String registration_number ;
    public String date_installtion ;
    
    public Materials (String registration_number,String date_installtion,String type){
   this.type= type;
    this.registration_number =registration_number ;
    this.date_installtion =date_installtion ;
    }
    
    
    public void print_material_infos (){
        //System.out.println("id :"+ id);
        System.out.println("registration_number :"+ registration_number);
        System.out.println("date_installtion :" + date_installtion);
        
        
    }

}
