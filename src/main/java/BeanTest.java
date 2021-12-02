import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        Album album1 = new Album();
        album1.setId(1);
        album1.setArtist("Mariah Carey");
        album1.setName("Daydream");
        album1.setReleaseDate(1995);
        album1.setSales(20);
        album1.setGenre("Pop, R&B");

        Album album2 = new Album();
        album2.setId(2);
        album2.setArtist("Spice Girls");
        album2.setName("Spice");
        album2.setReleaseDate(1996);
        album2.setSales(23);
        album2.setGenre("Pop");

        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("Charles");
        author1.setLastName("Dickens");

        Author author2 = new Author();
        author2.setId(2);
        author2.setFirstName("Chris");
        author2.setLastName("Van Allsburg");

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setContent("\"Bah\"! said Scrooge, \"Humbug!\"");
        quote1.setAuthor("Charles Dickens");

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setContent("Seeing is believing, but sometimes the most real things in the world are the things we can't see.");
        quote2.setAuthor("Chris Van Allsburg");


        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);

        for (Quote quote : quotes) {
            System.out.println(quote.getContent() + " by " + quote.getAuthor());
        }


    }

}
