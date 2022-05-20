import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String FirstName;
    private String LastName;
    private String MiddleName;
    private String date;
    private Status status;
    private String password;
    private List<Integer> message;
    private List<Number> number;


    public User(long id, String firstName, String lastName, String middleName, String date, Status status, String password, List<Integer> message, List<Number> number) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        MiddleName = middleName;
        this.date = date;
        this.status = status;
        this.password = password;
        this.message = message;
        this.number = number;
    }

    List<User> user = new ArrayList<>();
    User user1 = new User(11111L, "Кирилл", "Бачило", "Вячеславович", "01.01.2001", Status.FIZ, "asdqwewer", List.of(1, 2, 3, 1, 2, 3, 1), List.of(new Number(2000), new Number(3000)));
    User user2 = new User(11112L, "Иван", "Иванов", "Иванович", "02.02.2002");
    User user3 = new User(11113L, "Петр", "Петров", "Петрович", "03.03.2003");
    User user4 = new User(11114L, "Артем", "Артемьев", "Артемович", "04.04.2004");
    User user5 = new User(11115L, "Глеб", "Глебов", "Глебович", "05.05.2015");
    User user6 = new User(11116L, "Александр", "Пушкин", "Сергеевич", "06.06.2006");
    User user7 = new User(11117L, "Михаил", "Лермонтов", "Юрьевич", "07.07.2007");
    User user8 = new User(11118L, "Лев", "Толстой", "Николаевич", "08.08.2008");
    User user9 = new User(11119L, "Иван", "Тургенев", "Сергеевич", "09.09.2009");
    User user10 = new User(11110L, "Иосиф", "Бродский", "Александрович", "10.10.2010");
    User user11 = new User(11111L, "Николай", "Некрасов", "Алексеевич", "11.11.2011");
    User user12 = new User(11112L, "Сергей", "Есенин", "Александрович", "12.12.2012");

}