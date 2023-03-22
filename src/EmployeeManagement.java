import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManagement<T extends Employee>
{
    ArrayList<T> employeeList = new ArrayList<>();

    double averageSalary = 0;

    public void displayList()
    {
       employeeList.forEach(System.out::println);
    }

    public void addNewEmployee(T thingToAdd)
    {
       employeeList.add(thingToAdd);
    }

    public void deleteEmployee(T thingToDelete)
    {
        employeeList.remove(thingToDelete);
    }

    public void sortAlphabetically()
    {
        List<T> list =  employeeList.stream()
                .sorted((s1,s2) -> s1.toString().compareTo(s2.toString()))
                .collect(Collectors.toList());

        employeeList = (ArrayList<T>) list;

    }

    public void sortSalary()
    {
        List<T> list = employeeList.stream()
                .sorted((d1,d2) -> Double.valueOf(d1.getSalary()).compareTo(Double.valueOf(d2.getSalary())))
                .collect(Collectors.toList());

        employeeList = (ArrayList<T>) list;
    }


    public void promotion(T thingToPromote)
    {
        thingToPromote.promotion();
    }

    public double getAverageSalary()
    {
        averageSalary = 0;
        employeeList.forEach(employee -> averageSalary += employee.getSalary());
        return averageSalary /= employeeList.size();
    }

    public void biggerSalaryThanAverage()
    {
        employeeList.stream()
                .filter(employee -> employee.getSalary() > getAverageSalary())
                .forEach(System.out::println);
    }


}
