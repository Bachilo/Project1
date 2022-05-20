import java.util.List;

public class DataService {
    public List<User> userFromData() {
    return List.of(new User(11111L, "Кирилл", "Бачило", "Вячеславович", "01.01.2001", Status.FIZ, "asdqwewer", List.of(1, 2, 3, 1, 2, 3, 1), List.of(new Number(2000), new Number(3000))),
                ,);
    }

}
