/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class SalaryHistory implements Comparable<SalaryHistory>{

    private Worker worker;
    private double SalaryUpdate;
    private SalaryStatus status;
    private Date date;
    
    public SalaryHistory() {
    }
    
    public SalaryHistory(Worker worker, double SalaryUpdate, SalaryStatus status, Date date) {
        this.worker = worker;
        this.SalaryUpdate = SalaryUpdate;
        this.status = status;
        this.date = date;
    }
    
    public Worker getWorker() {
        return worker;
    }
    
    public void setWorker(Worker worker) {
        this.worker = worker;
    }
    
    public double getSalaryUpdate() {
        return SalaryUpdate;
    }
    
    public void setSalaryUpdate(double SalaryUpdate) {
        this.SalaryUpdate = SalaryUpdate;
    }
    
    public SalaryStatus getStatus() {
        return status;
    }
    
    public void setStatus(SalaryStatus status) {
        this.status = status;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%7s%10s%10d%10.0f%10s%15s", worker.getId(),
                worker.getName(), worker.getAge(), SalaryUpdate,
                getStatus(), format.format(date));
    }

    @Override
    public int compareTo(SalaryHistory o) {
        return worker.getId().compareTo(o.getWorker().getId());
    }
    
}
