
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getMessage() {
        return message;
    }

    public void setMessage(List<Integer> message) {
        this.message = message;
    }

    public List<Account> getNumber() {
        return number;
    }

    public void setNumber(List<Account> number) {
        this.number = number;
    }

    public User() {



    }


}
