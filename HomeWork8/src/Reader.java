import java.util.ArrayList;

public class Reader {
    private String surname;
    private String name;
    private String patronymic;
    private int ticketNumber;
    private String faculty;
    private int phoneNumber;
    private ArrayList<Book> books = new ArrayList<>();
    private int booksCount;

    public Reader(String surname, String name, int ticketNumber) {
        this.surname = surname;
        this.name = name;
        this.ticketNumber = ticketNumber;
        booksCount = 0;
    }

    public Reader(String surname, String name, String patronymic, int ticketNumber) {
        this (surname, name, ticketNumber);
        this.patronymic = patronymic;
    }

    public Reader(String surname, String name, String patronymic, int ticketNumber, String faculty, int phoneNumber) {
        this (surname, name, patronymic, ticketNumber);
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
    }

    public void WriteFullName() {
        if (this.patronymic == null) {
            System.out.print(String.format(this.surname + this.name.substring(0,1) + "."));
        } else {
            System.out.print(String.format(this.surname + "  " + this.name.substring(0, 1) + ". " + this.patronymic.substring(0, 1) + "."));
        }
    }

    public static void PrintStatus(Reader reader) {
        reader.WriteFullName();
        System.out.print(" взял(а) " + reader.booksCount + " книг(у/и): ");
        for (Book book : reader.books) {
            System.out.print(book.getTitle() + ", ");
        }
        System.out.println();
    }

    public void PrintStatus() {
        PrintStatus(this);
    }

    public static void takeBook(Reader reader, Book book) {
        if (book.getTitle().isEmpty()) {
            System.out.println("Не введено название книги");
        } else if (reader.booksCount == 10) {
            System.out.println("Читатель не может взять больше книг");
        } else {
            reader.books.add(book);
            reader.WriteFullName();
            System.out.println(" взял(а) книгу " + book.getTitle());
        }

    }

    public void takeBook(Book book) {
        takeBook(this, book);
    }

    public static void returnBook(Reader reader, String title) {
        boolean isExists = false;
        if (title.isEmpty()) {
            System.out.println("Не введено название книги");
        } else {
            for (int i = 0; i < reader.books.size(); i++) {
                if (reader.books.get(i).getTitle().equals(title)){
                    reader.books.remove(i);
                    isExists = true;
                    reader.WriteFullName();
                    System.out.println(" вернул(а) книгу " + title);
                }
            }
            if (!isExists) {
                reader.WriteFullName();
                System.out.println(" не хранит книгу " + title);
            }
        }
    }

    public void returnBook(String title) {
        returnBook(this, title);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = "Имя не указано";
        } else {
            this.name = name;
        }
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        if (ticketNumber <= 0) {
            System.out.println("Номер читательского билета введен неверно");
        } else {
            this.ticketNumber = ticketNumber;
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}