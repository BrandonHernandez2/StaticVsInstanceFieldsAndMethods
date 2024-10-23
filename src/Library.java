public class Library {

    public String name;
    public static int totalBooks;

    public void addBooks(int numBooks, String name){
        System.out.println("Library " + name + " added " +  + numBooks + " books.");
        totalBooks += numBooks;
    }

    public  static  int getTotalBooks(){
        //TO DO
        int total = totalBooks;
        return total;
    }


}
