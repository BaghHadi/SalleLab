/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public abstract class Building {
    private int id;
    protected String building_name;
    protected double building_area;
    protected int Capacity;
    
    public Building(int id, String building_name, double building_area, int Capacity) {
        this.id = id;
        this.building_name = building_name;
        this.building_area = building_area;
        this.Capacity = Capacity;
    }
    public void printInfo() {
        System.out.println("Building ID: " + id);
        System.out.println("Building Name: " + building_name);
        System.out.println("Building Area: " + building_area );
        System.out.println("Capacity: " + Capacity);
    }
 
    
}
