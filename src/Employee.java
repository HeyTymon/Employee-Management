public class Employee
{
    String firstName;
    String lastName;
    double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return   lastName + " " + firstName  + " " + salary;
    }

    public String introduceYourself()
    {
        return "Name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Salary: " + salary + "\n";
    }

    public void promotion()
    {
        salary += 2000;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
