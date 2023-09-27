package HomeWorkCourse1.ObjectsAndMethods;

public class Main {
    public static void main(String[] args) {

        Author edUsp = new Author("Эдуард", "Успенский");
        Author korChu = new Author("Корней", "Чуковский");
        Book chcheburashka = new Book("Чебурашка", edUsp, 1966);
        Book powderfill = new Book("Айболит", korChu, 1936);
        chcheburashka.setPublishingYear(1970);

        System.out.println(chcheburashka.getBookName() + " " + chcheburashka.getAuthor().getLastName() + " " + chcheburashka.getAuthor().getName() + " " + chcheburashka.getPublishingYear() + " год ");
        System.out.println(powderfill.getBookName() + " " + powderfill.getAuthor().getLastName() + " " + powderfill.getAuthor().getName() + " " + powderfill.getPublishingYear() + " год ");

    }
}

