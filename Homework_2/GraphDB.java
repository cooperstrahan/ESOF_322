import java.io.FileWriter;

public class GraphDB implements DatabaseApp
{
    public GraphDB()
    {
        System.out.println("A Graph Database has been created!");
    }

    public void store(String str)
    {
        try
        {
            FileWriter fw = new FileWriter("G.txt");
            fw.write(str);
            fw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("We have stored the data in the Graph Database using Node Store.");
    }

    public String getType()
    {
        return "Graph Database";
    }
}