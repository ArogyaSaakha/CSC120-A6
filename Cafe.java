
/* This is a stub for the Cafe class */
public class Cafe extends Building {
    
    private int nCoffeeOunces = 50; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets = 50; // The number of sugar packets remaining in inventory
    private int nCreams = 50; // The number of "splashes" of cream remaining in inventory
    private int nCups = 50; // The number of cups remaining in inventory 
    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
            nCoffeeOunces = 100;
            nSugarPackets = 100;
            nCreams = 100;
            nCups = 100;
    }
    
    public Cafe(String name, String address, int nFloors, int size, int SugarPackets, int Creams) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int nCreams)
    {
        if(nCoffeeOunces < 20 || nSugarPackets < 20 || nCreams < 20 || nCups < 10){
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCreams); 
        }
        this.nCoffeeOunces = this.nCoffeeOunces - nCoffeeOunces;
        this.nSugarPackets = this.nSugarPackets - nSugarPackets;
        this.nCreams = this.nCreams - nCreams;
        nCups = nCups - 1;
        
           
    }
    public int getSize(){
        return this.nCoffeeOunces;
    }

    public int getSugarPackets(){
        return this.nSugarPackets;
    }

    public int getCreams()
    {
        return this.nCreams;
    }

    public int getCups(){
        return this.nCups;
    }
    public String toString() {
        return this.nCoffeeOunces + " ounce of coffee, " + this.nSugarPackets + " number of sugar packets and " + this.nCreams + " amount of inventory left.";
    }
    public static void main(String[] args) {
        Building myCafe = new Cafe("Snow", "one street", 1, 12, 5, 1);
        ((Cafe) myCafe).sellCoffee(40,5,1);
        ((Cafe) myCafe).sellCoffee(5,5,1);
        System.out.print(myCafe);
    }
    
}
