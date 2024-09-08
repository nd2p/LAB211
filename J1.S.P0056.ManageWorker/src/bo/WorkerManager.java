/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.SalaryStatus;
import entity.Worker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class WorkerManager {

    private List<Worker> listWoker;

    public WorkerManager() {
        listWoker = new ArrayList<>();
    }
    
    private boolean isExistWorker(String id) {
        for (Worker worker : listWoker) {
            if (worker.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public Worker getWorker(String id) {
        for (Worker worker : listWoker) {
            if (worker.getId().equalsIgnoreCase(id)) {
                return worker;
            }
        }
        return null;
    }

    public boolean addWorker(Worker worker) throws Exception {
        if (isExistWorker(worker.getId())) {
            throw new Exception("Workers already exist!");
        }
        return listWoker.add(worker);
    }

    public Worker changeSalary(SalaryStatus status, String code, double amount) throws Exception {
        if (!isExistWorker(code)) {
            throw new Exception("Worker can be found!");
        }
        if (amount <= 0) {
            throw new Exception("Amount of changed salary must be greater than 0!");
        }
        Worker worker = getWorker(code);
        switch (status) {
            case UP:
                worker.setSalary(worker.getSalary() + amount);
                break;

            case DOWN:
                if (amount > worker.getSalary()) {
                    throw new Exception("The adjusted salary can not be greater than the current salary!");
                } else {
                    worker.setSalary(worker.getSalary() - amount);
                }
        }
        return worker;

    }

}
