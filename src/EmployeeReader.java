import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader
{
    BufferedReader reader;

    List<String> firstNameList = new ArrayList<>();
    List<String> lastNameList = new ArrayList<>();
    List<Double> salaryList = new ArrayList<>();

    public <T extends Employee>  void newList(List<T> newlist)
    {
        
    }

    public <T extends Employee> void readFile(List<T> list)
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

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
