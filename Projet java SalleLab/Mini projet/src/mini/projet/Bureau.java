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
    public class Bureau extends Building {
    public String bureau_name;
    ArrayList<Materials> materials;

    public Bureau(int id, String building_name, double building_area, int Capacity, String bureau_name) {
        super(id, building_name, building_area, Capacity);
        this.bureau_name = bureau_name;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Occupant Name: " + bureau_name);
    }
}
