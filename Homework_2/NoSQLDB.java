import java.io.FileWriter;

public class NoSQLDB implements DatabaseApp
{
    public NoSQLDB()
    {
        System.out.println("A NoSQL Database has been created!");
    }

    public void store(String str)
    {
        try
        {
            FileWriter fw = new FileWriter("N.txt");
            fw.write(str);
            fw.close();
        } catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("We have stored the data in the NoSQL Database using document store.");
    }

    public String getType()
    {
        return "NoSQL Database";
    }
}