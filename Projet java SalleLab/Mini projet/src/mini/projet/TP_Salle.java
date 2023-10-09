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
    public class TP_Salle extends Salle {
    public Boolean isActive;
    public ArrayList<Materials> materials;
    public TP_Salle(String accessoire, int id, String building_name, double building_area, int Capacity) {
        super(id, building_name, building_area, Capacity, accessoire);
        this.isActive = isActive;
        this.materials = new ArrayList<Materials>();
        
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Activity of the TP_salle: " + isActive);
    }
    
    public void add_material_to_TPSalle(Materials mat) {
    this.materials.add(mat);
}
    
    public void remouve_material_from_TPSalle(int index){
        this.materials.remove(index);
    }
    }
    
    
