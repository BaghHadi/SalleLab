/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
 interface IService {
   public void afficherService();
}

public class Service implements IService {

    public Service() {
    }
    
    public String FeedBack(String n){
        return n;
    }

    @Override
    public void afficherService() {
        System.out.println("Service affiché");
    }
}
