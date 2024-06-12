public class CombinationLock extends Lock
{
    private String combination;
    Scanner console = new Scanner(System.in);
    private String combo;
    
    
    public void open()
    {
        System.out.println("Combination = " + combo);
        combo = console.nextLine();
        if(combination == combo)
        {
           super.open();    
        }
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\n" + "Combination = " + combination + "\n";   
    }
    
    public CombinationLock()
    {
        super();
        combination = "";
    }
    
    public CombinationLock(String combo)
    {
        super();
        combination = combo;
    }
    
    public void setCombination(String c)
    {
        this.combination = c;
    }
    
    public String getCombination()
    {
        return combination;
    }
}