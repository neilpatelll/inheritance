public class Appointment extends Date
{
    private String textStr;
    Appointment a;
    public String getText()
    {
        return textStr;   
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
    
    public Appointment()
    {
        
    }
     
    public Appointment(int month, int day, int year, String texts)
    {
        super.getMonth();
        super.getDay();
        super.getYear();
        this.textStr= texts;
    }
}
