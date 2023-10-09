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
    
    public class Amphitheater extends Building {
    public boolean Availability ;
    ArrayList<Materials> materials;
    public Amphitheater(int id, String building_name, double building_area,int Capacity, boolean Availability) {
        super(id, building_name, building_area, Capacity);
        this.Availability = Availability;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Has Projector: " + Availability);
    }
    
    }
