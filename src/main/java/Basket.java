import java.util.ArrayList;
import java.util.List;

public class Basket {
    //Napisz program, który będzie reprezentował koszyk sklepowy w księgarni
    //internetowej. Stwórz klasę Book, która posiada tytuł, autora oraz cenę.
    // Dodajklasę Basket, która przechowuje listę książek. Wykorzystując TDD dodaj
    //funkcjonalności:
    //a. pobranie wszystkich książek w koszyku
    //b. dodanie książki do koszyka
    //c. wyczyszczenie koszyka
    //d. suma cen wszystkich książek w koszyku

    private List<Book> koszyk;

    public Basket() {
        koszyk = new ArrayList<Book>();
    }

    public List<Book> showKoszyk() {
        for (Book book: koszyk){
            System.out.println("Author: "+ book.getAuthor()+" Title: "+ book.getTitle()+" Cena: "+ book.getCena());
        }
        return koszyk;
    }

    public List<Book> showKoszyk(boolean silent ) {
        if (!silent) {
            for (Book book : koszyk) {
                System.out.println("Autor: " + book.getAuthor() +
                        ", Tytuł: " + book.getTitle() +
                        ", cena: " + book.getCena());
            }
        }
        return koszyk;


    }
    public double showTotal(){
        double total= 0.0d;
        for(Book book: koszyk){
            total += book.getCena();
        }
        return total;
    }

    public void addToKoszyk(Book jakasKsiazka) {
        koszyk.add(jakasKsiazka);
    }
    public void removeFromKoszyk(){
        koszyk.clear();
    }

}
