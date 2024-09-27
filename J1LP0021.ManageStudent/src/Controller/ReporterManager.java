/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ReporterManager {

    List<Reportter> reportList; 

    public ReporterManager() {
        reportList = new ArrayList<>();
    }
    
    public boolean isReportExist(Reportter reportter){
        for (Reportter reportter1 : reportList) {
            if (reportter1.getStudent().getId().equalsIgnoreCase(reportter.getStudent().getId())
                    && reportter1.getStudent().getCourseName().equalsIgnoreCase(reportter.getStudent().getCourseName())){
                return true;
            }
        }
        return false;
    }
    
    public void addReport(Reportter reportter){
        if(!isReportExist(reportter)){
            reportList.add(reportter);
        }
    }
    
}
