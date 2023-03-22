import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Developer d1 = new Developer("Tymon", "Jastrzębski", 3500);
        Developer d2 = new Developer("Jakub", "Żak", 4500);
        Developer d3 = new Developer("Bartłomiej", "Jędrusik", 5500);
        Developer d4 = new Developer("Michał", "Boguski", 6750);
        Developer d5 = new Developer("Michał", "Jedliński", 6750);


        EmployeeManagement<Employee> employees = new EmployeeManagement<>();

//        employees.addNewEmployee(d1);
//        employees.addNewEmployee(d2);
//        employees.addNewEmployee(d3);
//        employees.addNewEmployee(d4);
//        employees.addNewEmployee(d5);
//
//        employees.sortAlphabetically();
//        employees.displayList();
//
//        employees.sortSalary();
//        employees.displayList();

          EmployeeReader reader = new EmployeeReader();
          //reader.readFile();



    }
}