import java.util.ArrayList;
import java.util.List;

public class User {
    private long id;
    private String FirstName;
    private String LastName;
    private String MiddleName;
    private String date;
    public User (long id,String FirstName,String LastName,String MiddleName,String date){
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MiddleName = MiddleName;
        this.date = date;

    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public static void main(String[] args) {
        List<User> user = new ArrayList<>();
        User user1 = new User(00001, "Кирилл","Бачило","Вячеславович","01.01.2001");
        User user2 = new User(00002,"Иван","Иванов","Иванович","02.02.2002");
        User user3 = new User(00003,"Петр","Петров","Петрович","03.03.2003");
        User user4 = new User(00004,"Артем","Артемьев","Артемович","04.04.2004");
        User user5 = new User(00005,"Глеб","Глебов","Глебович","05.05.2015");
        User user6 = new User(00006,"Александр","Пушкин","Сергеевич","06.06.2006");
        User user7 = new User(00007,"Михаил","Лермонтов","Юрьевич","07.07.2007");
        User user8 = new User(00008,"Лев","Толстой","Николаевич","08.08.2008");
        User user9 = new User(00009,"Иван","Тургенев","Сергеевич","09.09.2009");
        User user10 = new User(00010,"Иосиф","Бродский","Александрович","10.10.2010");
        User user11 = new User(00011,"Николай","Некрасов","Алексеевич","11.11.2011");
        User user12 = new User(00012,"Сергей","Есенин","Александрович","12.12.2012");
    }
}

