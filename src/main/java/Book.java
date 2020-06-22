public class Book {
    //Napisz program, który będzie reprezentował koszyk sklepowy w księgarni
    //internetowej. Stwórz klasę Book, która posiada tytuł, autora oraz cenę.
    // Dodajklasę Basket, która przechowuje listę książek. Wykorzystując TDD dodaj
    //funkcjonalności:
    //a. pobranie wszystkich książek w koszyku
    //b. dodanie książki do koszyka
    //c. wyczyszczenie koszyka
    //d. suma cen wszystkich książek w koszyku
    private final String title;
    private final String author;
    private double cena;

    public Book (String title, String author, double cena){
        this.title= title;
        this.author=author;
        this.cena=cena;

    }

    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getCena(){
        return cena;
    }
    public void setPrice(double piniadze){
        this.cena= piniadze;
    }

}
