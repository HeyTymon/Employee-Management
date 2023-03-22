import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManagement<T extends Employee>
{
    ArrayList<T> employeeList = new ArrayList<>();

    public void displayList()
    {
        for(Employee employee: employeeList)
        {
            System.out.println(employee.introduceYourself());
        }
    }

    public void addNewEmployee(T thingToAdd)
    {
       employeeList.add(thingToAdd);
    }

    public void deleteEmployee(T thingToDelete)
    {
        employeeList.remove(thingToDelete);
    }

    public void sortAlphabetically(boolean direction)
    {
        Collections.sort(employeeList, (s1, s2) -> (s1.toString()).compareTo(s2.toString()));

        if(direction)
        {
            Collections.reverse(employeeList);
        }
    }

    public void sortSalary(boolean direction)
    {
        Collections.sort(employeeList, (d1, d2) -> Double.valueOf(d1.getSalary()).compareTo(Double.valueOf(d2.getSalary())));

        if(!direction)
        {
            Collections.reverse(employeeList);
        }
    }

    public void getEmployeeType()
    {
        employeeList.getClass();
    }

    public void promotion(T thingToPromote)
    {
        thingToPromote.promotion();
    }



}
