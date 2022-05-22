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
    private List<Account> number;


    public User(long id, String firstName, String lastName, String middleName, String date, Status status, String password, List<Integer> message, List<Account> number) {
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


}
