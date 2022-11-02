import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building  {

  private ArrayList<String> residents; 
  private boolean hasDiningRoom;
  private int nResidents;

  public House(String name, String address, int nFloors, String residents, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
  }
  public boolean gethasDiningRoom(){
    return hasDiningRoom;
  }
  public int getResidents(){

  return nResidents;
}

  public void moveIn(String name){
  residents.add(name);
}

  public String moveOut(String name){
  residents.remove(name);
  return name;

  public boolean getisResident(String person){
    return person;
  }
}
}