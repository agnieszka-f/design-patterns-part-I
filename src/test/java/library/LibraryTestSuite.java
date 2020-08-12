package library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks_shallowCopy(){
        Book book1 = new Book("Bieguni","Olga Tokarczuk", LocalDate.of(2007,11,17));
        Book book2 = new Book("dom dzienny, dom nocny","Olga Tokarczuk", LocalDate.of(1998,12,16));

        Library library1 = new Library("Biblioteka nr 1");
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);

        Library library2 = null;
        try{
            library2 = library1.shallowCopy();
        } catch(CloneNotSupportedException c){
            c.printStackTrace();
        }

        Assert.assertEquals(2, library1.getBooks().size());
        Assert.assertEquals(2, library2.getBooks().size());

        Assert.assertEquals("Biblioteka nr 1", library1.getName());
        Assert.assertEquals("Biblioteka nr 1 -kopia", library2.getName());

        library2.getBooks().remove(book1);
        Assert.assertEquals(1,library2.getBooks().size());
        Assert.assertEquals(1,library1.getBooks().size());
    }
    @Test
    public void testGetBooks_deepCopy(){
        Book book1 = new Book("Bieguni","Olga Tokarczuk", LocalDate.of(2007,11,17));
        Book book2 = new Book("dom dzienny, dom nocny","Olga Tokarczuk", LocalDate.of(1998,12,16));

        Library library1 = new Library("Biblioteka nr 1");
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);

        Library library2 = null;
        try{
            library2 = library1.deepCopy();
        } catch(CloneNotSupportedException c){
            c.printStackTrace();
        }

        Assert.assertEquals(2, library1.getBooks().size());
        Assert.assertEquals(2, library2.getBooks().size());

        Assert.assertEquals("Biblioteka nr 1", library1.getName());
        Assert.assertEquals("Biblioteka nr 1 -kopia", library2.getName());

        library2.getBooks().remove(book1);
        Assert.assertEquals(1,library2.getBooks().size());
        Assert.assertEquals(2,library1.getBooks().size());
    }
}
