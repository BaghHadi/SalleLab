/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet;

/**
 *
 * @author hadi
 */
public class Service_Teaching extends Service {
    public String Schedule;
    public String EnrolledStudents;
    public String StartDate;
    public String EndDate;

    public Service_Teaching(String Schedule, String EnrolledStudents, String StartDate, String EndDate) {
        this.Schedule = Schedule;
        this.EnrolledStudents = EnrolledStudents;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public String getSchedule() {
        return Schedule;
    }

    public String getEnrolledStudents() {
        return EnrolledStudents;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    public void setEnrolledStudents(String EnrolledStudents) {
        this.EnrolledStudents = EnrolledStudents;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }
    
    
    
}
