
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BasketTest {

    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Basket worekKsiazek;

    @BeforeEach
    public void setUp() {
        book1 = new Book("Wiedzmin", "Sapkowski", 50.0d);
        book2 = new Book("Java podstawy", "Horstmann", 100.01d);
        book3 = new Book("Wichrowe Wzgórza", "Emily Broonte", 99.99d);
        book4 = new Book("Wichrowe Wzgórza", "Emily Broonte", 99.99d);
        worekKsiazek = new Basket();
        worekKsiazek.addToKoszyk(book1);
        worekKsiazek.addToKoszyk(book2);
        worekKsiazek.addToKoszyk(book3);
    }

    @Test
    void showKoszyk() {

        Book[] expected = new Book[]{book1, book2, book3};
        List<Book> actual = worekKsiazek.showKoszyk();
        assertThat(actual.toArray())
                .isNotNull()
                .containsOnly(expected);
    }

    @Test
    void showTotal() {
        double expected = 250.0d;
        double actual = worekKsiazek.showTotal();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void addToKoszyk() {
        // dodajemy jeszcze jedna i sprawdzimy czy tam wejdzie
        Book[] expected = new Book[]{book1, book2, book3, book4};
        worekKsiazek.addToKoszyk(book4);
        List<Book> actual = worekKsiazek.showKoszyk(true);

        assertThat(actual.toArray()).containsOnly(expected);
    }

    @Test
    void removeFromKoszyk() {
        boolean expected = true;
        worekKsiazek.removeFromKoszyk();

        List<Book> listaKsiazek = worekKsiazek.showKoszyk();
        boolean actual = listaKsiazek.isEmpty();
        assertThat(actual).isEqualTo(expected);
    }
}