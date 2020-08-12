package library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype{
    String name;
    Set<Book> books = new HashSet<>();


    public Library deepCopy() throws CloneNotSupportedException {
        Library copiedLibrary = (Library)super.clone();
        copiedLibrary.name = this.name + " -kopia";

        copiedLibrary.books = new HashSet<>();
        for(Book b: books){
            copiedLibrary.getBooks().add(b);
        }

        return copiedLibrary;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        Library copiedLibrary = (Library)super.clone();
        copiedLibrary.name = this.name + " -kopia";;

        return copiedLibrary;
    }

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

}
