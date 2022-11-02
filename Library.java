/* This is a stub for the Library class */
import java.text.CollationElementIterator;
import java.util.Hashtable;
public class Library extends Building {
private Hashtable<String, Boolean> collection;
private String title;

  public Library(String name, String address, int nFloors, String title) {
    super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
      Hashtable <String, Boolean> collection = new Hashtable<>();
    }
    public void addTitle(String title){
      collection.put(this.title, null);
    }

    public String removeTitle(String title) {
      collection.remove(this.title, null);
      return title;
    }

    public void checkOut(String title){
      collection.replace(this.title, true, false);
    }
    public void returnBook(String title){
      collection.replace(this.title, false, true);
    }
    

    public String getTitle(){
      return this.title;
    }
    public void printCollection(){
      System.out.println(collection);
    }
    public static void main(String[] args) {
     Building myLibrary = new Library("Sun", "One street", 4, "Harry Potter and th Order of the Phoenix by J.K Rowling");
     ((Object) myLibrary).printCollection(myLibrary);
    }
  
  }