import java.io.FileWriter;

public class RelationalDB implements DatabaseApp
{
    public RelationalDB()
    {
        System.out.println("A Relational Database has been created!");
    }

    public void store(String str)
    {
        try
        {
            FileWriter fw = new FileWriter("R.txt");
            fw.write(str);
            fw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("We have stored the data in the Relational Database using Table Store.");
    }

    public String getType()
    {
        return "Relational Database";
    }
}