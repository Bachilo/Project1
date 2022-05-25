import java.util.ArrayList;
import java.util.List;
;

public class Main {
    public static void main(String[] args) {
        User user13 = new User();
        user13.setId(111222l);
        user13.setFirstName("Кирилл");
        user13.setLastName("Бачило");
        user13.setMiddleName("Вячеславович");
        user13.setDate("15.05.2015");
        user13.setStatus(Status.VIP);
        user13.setPassword("dfgdfg45345");
        user13.setNumber(List.of(new Account(156234,1500.65,"RUB",1,false)));

        System.out.println(user13);
    }

}
