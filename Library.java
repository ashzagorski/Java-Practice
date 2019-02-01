import java.util.HashMap;

public class Library {
  public Library() {
    
  }
  
  public void getFinishedBooks(HashMap<String, Boolean> library) {
    if (library.size() < 1) {
      System.out.println("Please add books to library.");
    } else {
      for (String book : library.keySet()) {
        if (library.get(book) == true) {
          System.out.println(book);
        }
      }
    }
  }
  
  public void getUnreadBooks(HashMap<String, Boolean> library) {
    if (library.size() < 1) {
      System.out.println("Please add books to your library.");
    } else {
      for (String book : library.keySet()) {
        if(library.get(book) == false) {
          System.out.println(book);
        }
      }
    }
  }
  
  public static void main(String[] args) {
  HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
    
    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(myBooks);
    myLibrary.getUnreadBooks(myBooks);
    
  }
}