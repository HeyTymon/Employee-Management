import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader<T extends Employee>
{
    List<String> firstNameList = new ArrayList<>();
    List<String> lastNameList = new ArrayList<>();
    List<Double> salaryList = new ArrayList<>();

    public void newList(List<T> newlist)
    {
        for(int i = 0; i < firstNameList.size(); i++)
        {
            T thingLikeEmployee = (T) new Employee("","",0);
            thingLikeEmployee.setFirstName(firstNameList.get(i));
            thingLikeEmployee.setLastName(lastNameList.get(i));
            thingLikeEmployee.setSalary(salaryList.get(i));

            newlist.add(i,thingLikeEmployee);
        }
    }

    BufferedReader reader;

    public void readFile()
    {
        try {
            reader = new BufferedReader(new FileReader("employees.txt"));

            String line;
            int i = 1;
            while((line = reader.readLine()) != null)
            {
               if(i % 3 == 0)
               {
                   salaryList.add(Double.valueOf(line));
               }
               else if(i % 2 == 0)
               {
                   lastNameList.add(line);
               }
               else
               {
                   firstNameList.add(line);
               }

               if(i == 3) i =0;
               i++;
            }

//            System.out.println(firstNameList);
//            System.out.println(lastNameList);
//            System.out.println(salaryList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
