/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public class Service_Pyments extends Service{
    
    private int PaymentID;
    private double Amount;

    public Service_Pyments(int PaymentID, double Amount) {
        this.PaymentID = PaymentID;
        this.Amount = Amount;
    }

    public int getPaymentID() {
        return PaymentID;
    }

    public double getAmount() {
        return Amount;
    }

    public void setPaymentID(int PaymentID) {
        this.PaymentID = PaymentID;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    
    
    
}
