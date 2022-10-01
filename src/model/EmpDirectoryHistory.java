/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author USHA SINGH
 */
public class EmpDirectoryHistory {
    
    private ArrayList<EmpDirectory> history;
    public EmpDirectoryHistory(){
        this.history = new ArrayList<EmpDirectory>();
    }

    public ArrayList<EmpDirectory> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmpDirectory> history) {
        this.history = history;
    }
    public EmpDirectory addNewEmp(){
        EmpDirectory newEmp = new EmpDirectory();
        history.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmp(EmpDirectory ed){
        history.remove(ed);
    }
}
