public class Main {
    public static void main(String[] args){
        Author stephenKing = new Author("Stephen", "King");
        Book darkTowerBook = new Book(stephenKing,"Dark Tower", 1992);
        Author keiHorstmann = new Author("Horstmann", "Key");
        Book coreJava = new Book(keiHorstmann, "Core Java", 2019);
        darkTowerBook.setYearOfPublishing(2004);

    }
}