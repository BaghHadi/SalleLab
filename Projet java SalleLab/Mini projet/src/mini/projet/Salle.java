/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
    public class Salle extends Building {
    public String accessoire ;

    public Salle(int id, String building_name, double building_area, int Capacity, String accessoire) {
        super(id, building_name, building_area, Capacity);
        this.accessoire = accessoire;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Room Type: " + accessoire);
    }
}
