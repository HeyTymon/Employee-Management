public class Developer extends Employee
{
    DeveloperPromotion level = DeveloperPromotion.JUNIOR;
    public Developer(String firstName, String lastName, double salary)
    {
        super(firstName, lastName, salary);
    }

    @Override
    public String introduceYourself() {
       return super.introduceYourself() + "Level: " + level + "\n";
    }

    @Override
    public void promotion() {
        super.promotion();

        if(level.equals(DeveloperPromotion.JUNIOR))
        {
            level = DeveloperPromotion.MID;
        }
        else if(level.equals(DeveloperPromotion.MID))
        {
            level = DeveloperPromotion.SENIOR;
        }
    }
}
