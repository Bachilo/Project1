import java.util.List;


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

        User user14 = new User();
        user14.setId(137896l);
        user14.setFirstName("Евгений");
        user14.setLastName("Григорьев");
        user14.setMiddleName("Викторович");
        user14.setDate("15.05.2015");
        user14.setStatus(Status.FIZ);
        user14.setPassword("hlrpbg45hn7867");
        user14.setNumber(List.of(new Account(173982,100.17,"USD",2,false)));


        System.out.println(user13);

        }

    }


