public class Main {
    public static void main(String[] args) {

        Library A = new Library();
        A.name = "A";
        A.addBooks(100, "A");

        // TODO: make B.  and do the same.
        Library B = new Library();
        B.name = "B";
        B.addBooks(150, "B");

        //TODO: print total books for A and B
        System.out.println("Total boos in all libraries: " + Library.getTotalBooks());

    }
}