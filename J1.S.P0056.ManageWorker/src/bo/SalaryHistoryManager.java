/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.SalaryHistory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author admin
 */
public class SalaryHistoryManager {

    private List<SalaryHistory> listSalaryHistory;

    public SalaryHistoryManager() {
        listSalaryHistory = new ArrayList<>();
    }

    public List<SalaryHistory> getListSalaryHistory() {
        return listSalaryHistory;
    }

    public void setListSalaryHistory(List<SalaryHistory> listSalaryHistory) {
        this.listSalaryHistory = listSalaryHistory;
    } 

    public boolean addHistory(SalaryHistory history) {
        return listSalaryHistory.add(history);
    }

    private void sortByID() {
        Collections.sort(listSalaryHistory);
    }

    @Override
    public String toString() {
        if (listSalaryHistory.isEmpty()) {
            return null;
        }
        sortByID();
        String str = String.format("%7s%10s%10s%10s%10s%15s\n", "Code", 
                "Name", "Age", "Salary", "Status", "Date");
        for (int i = 0; i < listSalaryHistory.size(); i++) {
            str += listSalaryHistory.get(i).toString();
            str += "\n";
        }
        return str;
    }

}
