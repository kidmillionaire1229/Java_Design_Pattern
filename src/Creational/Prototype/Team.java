package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team implements Cloneable{
    String teamName;
    List<Employee> employeeList;

    public Team(String teamName) {
        this.teamName = teamName;
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    //shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException{
        /**shallow copy
        return super.clone();
        **/
        Team copyTeam = new Team(this.teamName);
        copyTeam.employeeList = new ArrayList<>(this.employeeList);
        return copyTeam;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Team that = (Team) obj;
        return Objects.equals(teamName, that.teamName)
                && Objects.equals(employeeList, that.employeeList);
    }
}
