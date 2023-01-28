/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.hr.application.model;

import edu.poly.hr.application.helper.XFile;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lytri
 */
public class EmployeeList {

    private ArrayList<Employee> list = new ArrayList<>();
    private String path = "C:/netbean_wordspace/hr.dat";

    public void saveToFile() throws Exception {
        XFile.writeObject(path, list);
    }

    public void loadFromFile() throws Exception {
        File file = new File(path);
        if (file.exists()) {
            list = (ArrayList<Employee>) XFile.readObject(path);
        } else {
            initEmployeeData();
        }
    }

    private void initEmployeeData() {
        list.add(new Employee("E01", "Minh", "minh@gmail.com", 5000000, 20));
        list.add(new Employee("E02", "Hung", "Hung@gmail.com", 6000000, 21));
        list.add(new Employee("E03", "Thanh", "Thanh@gmail.com", 7000000, 22));
        list.add(new Employee("E04", "Ha", "Ha@gmail.com", 8000000, 23));
        list.add(new Employee("E05", "Trung", "Trung@gmail.com", 9000000, 24));

    }
    private int currentIndex = 0;

    public void setCurrentEmployee(Employee emp) {
        currentIndex = list.indexOf(emp);
    }

    public String getCurrentEmployeeInfo() {
        return "Record " + (currentIndex + 1) + " of " + list.size();
    }

    public void first() {
        currentIndex = 0;
    }

    public void previous() {
        if (currentIndex > 0) {
            currentIndex--;
        }
    }

    public void next() {
        if (currentIndex < list.size() - 1) {
            currentIndex++;
        }
    }

    public void last() {
        currentIndex = list.size() - 1;
    }

    public int getCurrentEmployeeIndex() {
        return currentIndex;
    }

    public Employee getCurrentEmployee() {
        if (list.size() == 0) {
            return null;
        }
        return list.get(currentIndex);
    }

    public void add(Employee emp) {
        list.add(emp);
    }

    public Employee findById(String employeeId) {
        for (Employee employee : list) {
            if (employee.getEmployeeId().equals(employeeId)) {

                return employee;
            }
        }
        return null;
    }

    public boolean deleteById(String employeeId) {
        for (Employee employee : list) {
            if (employee.getEmployeeId().equals(employeeId)) {
                list.remove(employee);
                return true;
            }
        }
        return false;
    }

    public boolean update(Employee emp) {
        Employee existEmp = findById(emp.getEmployeeId());
        boolean flag = false;
        if (existEmp != null) {
            existEmp.setName(emp.getName());
            existEmp.setAge(emp.getAge());
            existEmp.setEmail(emp.getEmail());
            existEmp.setSalary(emp.getSalary());
            flag = true;
        }
        return flag;
    }

    public void renderToTable(DefaultTableModel tblModel) {
        tblModel.setRowCount(0);
        for (Employee employee : list) {
            Object[] row = new Object[]{
                employee.getEmployeeId(),
                employee.getName(),
                employee.getAge(),
                employee.getEmail(),
                employee.getSalary()};
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
    }
}
