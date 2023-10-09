/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public class Pc extends Materials {
     String cpu ;
     String ram ;

    
    public Pc(String cpu,String ram ,String registration_number,String date_installtion,String type){
        super (registration_number,date_installtion,type);
        this.type = "Pc";
        this.cpu = cpu;
        this.ram= ram;
    }
    public  void print(){
        System.out.println("cpu :" + cpu);
        System.out.println("ram :"+ ram);
        print_material_infos();
        
    }
    
    public String getPcCpu() {
        return cpu;
    }
    public String getPcRam() {
        return ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    
    
}
