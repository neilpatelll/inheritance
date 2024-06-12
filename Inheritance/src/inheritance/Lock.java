public class Lock
{
    private boolean locked;
    
    public void open()
    {
        locked = false;   
    }
    
    public void close()
    {
        locked = true;   
    }
    
    public boolean isLocked()
    {
        return locked;   
    }
    
    @Override
    public String toString()
    {
        if(locked == false)
        {
            return "Lock is open.";   
        }
        else
        {
            return "Lock is closed.";
        }
    }
}