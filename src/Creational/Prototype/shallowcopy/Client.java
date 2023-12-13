package Creational.Prototype.shallowcopy;

import Creational.Prototype.Employee;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("-----Shallow Copy-----");
        Team firstTeam = new Team("firstTeam");
        firstTeam.addEmployee(new Employee("James"));
        firstTeam.addEmployee(new Employee("Ted"));

        Team copyTeam = (Team) firstTeam.clone();

        System.out.println("Are they the same Instance? => "+ (firstTeam == copyTeam));
        System.out.println("Do they have the same content? => "+ (firstTeam.equals(copyTeam)));

        System.out.println("firstTeam's members: " +firstTeam.getEmployeeList());
        System.out.println("copyTeam's members: " +copyTeam.getEmployeeList());

        //원본 Team의 0번째 index에 있는 Employee를 수정
        firstTeam.getEmployeeList().set(0, new Employee("Gale"));

        //shallow copy이기 때문에, firstTeam이 employee 변경하면, copyTeam의 원소도 따라서 변경된다. 
        System.out.println("firstTeam's members: " +firstTeam.getEmployeeList());
        System.out.println("copyTeam's members: " +copyTeam.getEmployeeList());
    }
}
