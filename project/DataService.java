import java.util.List;

public class DataService {
    public List<User> UserFromData() {
        return List.of(new User(11131L, "Кирилл", "Бачило", "Вячеславович", "01.01.2001", Status.FIZ, "asdqwe8216wery725834", List.of(1, 2, 3, 1, 2, 3, 1),
                        List.of(new Account(227934, 2267.15, "RUB", 1, false), new Account(115823, 3937.23, "USD", 2, false), new Account(108655, 4000, "EUR", 3, false))),
                new User(11156L, "Иван", "Иванов", "Иванович", "02.02.2002", Status.VIP, "qa53zxs1mfg52rr60168", List.of(2, 3, 4, 2, 3, 4, 2),
                        List.of(new Account(192883, 5937.27, "BYR", 0, false), new Account(249301, 8238.93, "AZN", 0, false), new Account(183924, 11864.49, "BHD", 0, false))),
                new User(11113L, "Петр", "Петров", "Петрович", "03.03.2003", Status.BLOCK, "edcvfr4655ncyq862275", List.of(3, 4, 5, 3, 4, 5, 3),
                        List.of(new Account(273641, 3229.86, "AUD", 0, false), new Account(100273, 6668.53, "ALL", 0, false), new Account(222860, 9023.01, "DZD", 0, false))),
                new User(11167L, "Артем", "Артемьев", "Артемович", "04.04.2004", Status.BLOCK, "jn2p67ozc111ty789bd3", List.of(4, 5, 6, 4, 5, 6, 4),
                        List.of(new Account(155299, 5627.64, "XCD", 0, false), new Account(115823, 20667.41, "SYP", 0, false), new Account(108655, 4729.25, "ARS", 0, false))),
                new User(11125L, "Глеб", "Глебов", "Глебович", "05.05.2015", Status.FIZ, "nqwr872nb132uje99h78", List.of(5, 6, 7, 5, 6, 7, 5),
                        List.of(new Account(348521, 10597.35, "null", 1000, true), new Account(115823, 39375.23, "AMD", 0, false), new Account(108655, 11995.99, "AWG", 0, false))),
                new User(11198L, "Александр", "Пушкин", "Сергеевич", "06.06.2006", Status.VIP, "g77gmner723jbnp04923", List.of(6, 7, 8, 6, 7, 8, 7),
                        List.of(new Account(521984, 5009.73, "XOF", 0, false), new Account(115823, 8337.69, "null", 1000, true), new Account(108655, 23750.11, "BIF", 0, false))),
                new User(11126L, "Михаил", "Лермонтов", "Юрьевич", "07.07.2007", Status.FIZ, "d69234bneu4423jqrc2j", List.of(7, 8, 9, 7, 8, 9, 7),
                        List.of(new Account(376201, 9201.34, "BTN", 0, false), new Account(115823, 14796.96, "GBP", 0, false), new Account(108655, 5050.96, "HUF", 0, false))),
                new User(11118L, "Лев", "Толстой", "Николаевич", "08.08.2008", Status.VIP, "ghn5ur2kcb894bnm50375", List.of(8, 9, 1, 8, 9, 1, 8),
                        List.of(new Account(168274, 6753.99, "VEF", 0, false), new Account(115823, 26337.29, "HTG", 0, false), new Account(108655, 13755.52, "null", 1000, true))),
                new User(11137L, "Иван", "Тургенев", "Сергеевич", "09.09.2009", Status.BLOCK, "m345jl12gdt8ngop7540", List.of(9, 1, 2, 9, 1, 2, 9),
                        List.of(new Account(456297, 18275.05, "GYD", 0, false), new Account(115823, 19256.23, "GTQ", 0, false), new Account(108655, 34855.26, "BWP", 0, false))),
                new User(11196L, "Иосиф", "Бродский", "Александрович", "10.10.2010", Status.FIZ, "ola666y72nfsdf445w91", List.of(1, 4, 7, 1, 4, 7, 1),
                        List.of(new Account(304278, 22154.79, "null", 1000, true), new Account(115823, 1023.63, "HNL", 0, false), new Account(108655, 1485.22, "HKD", 0, false))),
                new User(11173L, "Николай", "Некрасов", "Алексеевич", "11.11.2011", Status.VIP, "hkle6921bm5jd01278jl", List.of(2, 5, 8, 2, 5, 8, 2),
                        List.of(new Account(661257, 37266.82, "GEL", 0, false), new Account(115823, 22096.12, "DKK", 0, false), new Account(108655, 30225.24, "USD", 2, false))),
                new User(11178L, "Сергей", "Есенин", "Александрович", "12.12.2012", Status.BLOCK, "ynf3k7md9n209jn23m72", List.of(3, 6, 9, 3, 6, 9, 3),
                        List.of(new Account(100001, 2788.18, "DOP", 0, false), new Account(115823, 3937.75, "EGP", 0, false), new Account(108655, 40000.55, "ZMW", 0, true))));


    }
}