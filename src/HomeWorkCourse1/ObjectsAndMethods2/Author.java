package HomeWorkCourse1.ObjectsAndMethods2;

import java.util.Objects;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String firstName) {
        this.name = name;
        this.lastName = firstName;
    }

    public String getName() {
        return this.name;
    }


    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}