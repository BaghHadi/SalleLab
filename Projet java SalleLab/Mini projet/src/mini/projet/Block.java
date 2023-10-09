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
public class Block {
    public String Block_name;
    public String Block_location;
    public String Walls_color;
    private ArrayList<Building> buildings;

    public Block(String Block_name, String Block_location, String Walls_color) {
        this.Block_name = Block_name;
        this.Block_location = Block_location;
        this.Walls_color = Walls_color;
        this.buildings = new ArrayList<Building>();
    }
    
        public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }
    
    
    
}
