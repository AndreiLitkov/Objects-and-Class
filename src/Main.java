import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Уильям" , "Шекспир");
        System.out.print(author1.getName());
        System.out.print(" ");
        System.out.println(author1.getFamilyName());

        Author author2 = new Author("Александр" , "Пушкин");
        System.out.print(author2.getName());
        System.out.print(" ");
        System.out.println(author2.getFamilyName());

        Author shakespeare = new Author("Уильям ", "Шекспир");
        Book bookGamlet = new Book ("Гамлет " , shakespeare , 1603);
        System.out.println("Название книги - " + bookGamlet.getName());
        System.out.println("Автор - "+ bookGamlet.getAuthor());
        System.out.println("Год Издания - " + bookGamlet.getYear());

        Author defo = new Author("Даниэль", "Дэфо");
        Book bookCruzo = new Book("Робинзон Крузо",defo, 1719);
        System.out.println("Название книги - " + bookCruzo.getName());
        System.out.println("Автор - "+ bookCruzo.getAuthor());
        System.out.println("Год Издания - "+ bookCruzo.getYear());

        bookGamlet.setYear(1700);
        System.out.println("Новый год выпуска книги Гамлет - " + bookGamlet.getYear());

        bookCruzo.setYear(2020);
        System.out.println("Новый год переиздания книги Робинзон Крузо - " + bookCruzo.getYear());

        System.out.println(bookCruzo);
        System.out.println(bookGamlet);

        System.out.println(defo);
        System.out.println(shakespeare);

        System.out.println("Сравнения книг: ");
        System.out.println(bookCruzo.equals(bookGamlet));

        Author lev = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и Мир" , lev , 1867);
        Book book2 = new Book("Война и Мир" , lev , 1868);
        System.out.println(book2.equals(book1));

        book2 = book1;
        System.out.println(book2.equals(book1));

        System.out.println(" ");
        System.out.println("Сравнения авторов :");

        System.out.println(lev.equals(shakespeare));
        Author lev1 = new Author("Лев", "Т.");
        System.out.println(lev.equals(lev1));
        lev1 = lev;
        System.out.println(lev.equals(lev1));

        System.out.println("");
        System.out.println("Вывод хэш-кодов:");
        System.out.println("Хэш-код Автора " + shakespeare + " = " + shakespeare.hashCode());
        System.out.println("Хэш-код книги " + bookCruzo + " = " + bookCruzo.hashCode());


    }
}