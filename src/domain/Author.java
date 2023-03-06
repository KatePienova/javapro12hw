package domain;

import java.util.List;

public class Author {
    private Long id;
    private String name;
    private String lastname;
    private List<Book> books;

    public Author(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastname = lastName;
    }

    public Author( String name, String lastName) {
        this.name = name;
        this.lastname = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastname + '\'' +
                '}';
    }
}
