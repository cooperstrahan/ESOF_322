public class Main {
    public static void main(String args[])
    {
        System.out.println("Please select a Database Software!");
        System.out.println("...");
        System.out.println("You have selected to store your data using a Relational Database!");

        DBTool database = new DBTool(new RelationalDB());
        database.performStore("Relational Data");

        database.setStoreStrategy(new GraphDB());
        database.performStore("Graph Data");

        database.setStoreStrategy(new NoSQLDB());
        database.performStore("NoSQL Data");

    }
}
