import java.util.ArrayList;
import java.util.List;
;

public class Main {
    public static void main(String[] args) {
        User user13 = new User();
        user13.setId(111222l);
        user13.setFirstName("Winston");
        user13.setLastName("Cherchil");
        user13.setMiddleName("Govard");
        user13.setDate("15.05.2015");
        user13.setStatus(Status.VIP);
        user13.setPassword("dfgdfg45345");
        user13.setNumber(List.of(new Account(156234,1500.65,"RUB",1,false)));

        User user14 = new User();
        user14.setId(153948l);
        user14.setFirstName("Donald");
        user14.setLastName("Duck");
        user14.setMiddleName("Trump");
        user14.setDate("28.11.2002");
        user14.setStatus(Status.FIZ);
        user14.setPassword("djkl6789kmhku");
        user14.setNumber(List.of(new Account(233927,500358.12,"USD",2,false)));


        System.out.println(user13);
        System.out.println(user13.getNumber());
        System.out.println(user14);
    }

}
