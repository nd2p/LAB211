/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import bo.Inputter;
import bo.SalaryHistoryManager;
import bo.WorkerManager;
import entity.SalaryHistory;
import entity.SalaryStatus;
import entity.Worker;
import java.util.Date;
    import utils.Validator;

/**
 *
 * @author admin
 */
public class Controller {

    private SalaryHistoryManager salaryHistoryManager;
    private WorkerManager workerManager;
    private Inputter inputter;

    public Controller() {
        salaryHistoryManager = new SalaryHistoryManager();
        workerManager = new WorkerManager();
    }

    public Worker addWorker() throws Exception {
        inputter = new Inputter();
        Worker worker = inputter.inputter();
        if (workerManager.addWorker(worker)) {
            return worker;
        }
        throw new Exception("Can not add!");
    }

    public SalaryHistory upSalary() throws Exception {
        String code = Validator.getString("Enter Code: ",
                "Code invalid!", "[Ww]\\d+");
        double amount = Validator.getDouble("Enter salary: ",
                "Salary must be greater than 0",
                "Invalid number", Double.MIN_VALUE, Double.MAX_VALUE);
        Worker worker = workerManager.changeSalary(SalaryStatus.UP, code, amount);
        SalaryHistory salaryHistory = new SalaryHistory(worker, worker.getSalary(), SalaryStatus.UP, new Date());
        salaryHistoryManager.addHistory(salaryHistory);
        return salaryHistory;
    }

    public SalaryHistory downSalary () throws Exception{
        String code = Validator.getString("Enter Code: ",
                "Code invalid!", "[Ww]\\d+");
        double amount = Validator.getDouble("Enter salary: ",
                "Salary must be greater than 0",
                "Invalid number", Double.MIN_VALUE, Double.MAX_VALUE);
        Worker worker = workerManager.changeSalary(SalaryStatus.DOWN, code, amount);
        SalaryHistory salaryHistory = new SalaryHistory(worker, worker.getSalary(), SalaryStatus.DOWN, new Date());
        salaryHistoryManager.addHistory(salaryHistory);
        return salaryHistory;
    }
    
    public void getInformatoinSalary() throws Exception{
        String information = salaryHistoryManager.toString();
        if (information==null){
            throw new Exception("Salary history is empty!");
        } else {
            System.out.println(information);
        }
    }
}
