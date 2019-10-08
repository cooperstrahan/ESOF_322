public class DBTool
{
    private DatabaseApp A;

    DBTool(DatabaseApp da)
    {
        System.out.println("A Database tool has been created");
        A = da;
    }

    public void performStore(String str)
    {
        this.A.store(str);
    }

    public void setStoreStrategy(DatabaseApp a)
    {
        System.out.println("Calling setStoreStrategy to change the Database Tool's strategy to " + a.getType());
        this.A = a;
    }
}
