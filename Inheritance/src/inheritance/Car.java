public class Car extends Vehicle
{
    public Car(String t, int y, double p, double m)
    { 
        super(t, y, p);
        this.mpg = m; 
    }
     
    public boolean greatMPG()
    {
        Car car = new Car(type, year, price, mpg);
        if(car.mpg >= 36)
        {
            return true;
        }
        return false;
    }
    
    @Override
    public String getInfo()
    { 
        return year + " " + type + " , " + mpg + " mpg, $" + price;
    }
    
    
}

public class Truck extends Vehicle
{
    public Truck(String t, int y, double p, int tow)
    { 
        super(t,y,p);
        this.towing = tow; 
    }
    
    public boolean canTowBoat()
    {
        Truck towBoat = new Truck(type, year, price, towing);
        if(towBoat.towing >= 2000)
        {
            return true;
        }
        return false;
    }
    
    @Override
    public String getInfo()
    {
        return year + " " + type + " , " + towing + " lbs. towing, $" + price;
    }
}

public class Vehicle 
{
    String type;
    int year;
    double price;
    double mpg;
    int towing;
    public String getType()
    {
        return type;
    }
    
    public int getYear()
    {
        return year;   
    }
    
    public double getPrice()
    {
        return price;   
    }
    
    public double getMpg()
    {
        return mpg; 
    }
    
    public int getTow()
    {
        return towing;   
    }
    
    public String getInfo()
    {
        return year + type;   
    }
    
    public Vehicle(String t, int y, double p)
    {
        type = t;
        year = y;
        price = p;
    }
}

public class Inventory
{
    private ArrayList<Car> cars;
    private ArrayList<Truck> trucks;
    private ArrayList<Vehicle> inventory;
    
    public Inventory()
    {
        
    }
    
    public Inventory(ArrayList <Car> c, ArrayList <Truck> t)
    {
        cars = c;  
        trucks = t;
    }
    
    public void addVehicle(Vehicle v)
    {
         inventory.add(v); 
    }
    
    public void listInventory()
    {
        System.out.println("All the cars in the inventory.");
        for(Vehicle vehicleObj : inventory)
        {
            System.out.println(vehicleObj.getInfo());
        }
    }
}
