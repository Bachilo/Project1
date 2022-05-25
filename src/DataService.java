import java.util.List;

public class DataService {
    public List<User> UserFromData() {
        return List.of(new User(11131L, "Кирилл", "Бачило", "Вячеславович", "01.01.2001", Status.FIZ, "asdqwe8216wer", List.of(1, 2, 3, 1, 2, 3, 1),
                        List.of(new Number(227934, 2267.15, "RUB", 1, false), new Number(115823, 3937.23, "USD", 2, false), new Number(108655, 4000, "EUR", 3, false))),
                new User(11156L, "Иван", "Иванов", "Иванович", "02.02.2002", Status.VIP, "qa53zxs1mfg52rr60168", List.of(2, 3, 4, 2, 3, 4, 2),
                        List.of(new Number(192883, 5937.27, "EUR", 3, false), new Number(249301, 8238.93, "USD", 2, false), new Number(183924, 11864.49, "RUB", 1, false))),
                new User(11113L, "Петр", "Петров", "Петрович", "03.03.2003", Status.BLOCK, "edcvfr4655ncyq862275", List.of(3, 4, 5, 3, 4, 5, 3),
                        List.of(new Number(273641, 3229.86, "USD", 2, false), new Number(100273, 6668.53, "RUB", 1, false), new Number(222860, 9023.01, "EUR", 3, false))),
                new User(11167L, "Артем", "Артемьев", "Артемович", "04.04.2004", Status.BLOCK, "jn2p67ozc111ty789bd3", List.of(4, 5, 6, 4, 5, 6, 4),
                        List.of(new Number(155299, 5627.64, "RUB", 1, false), new Number(115823, 20667.41, "USD", 2, false), new Number(108655, 4729.25, "EUR", 3, false))),
                new User(11125L, "Глеб", "Глебов", "Глебович", "05.05.2015", Status.FIZ, "nqwr872nb132uje99h78", List.of(5, 6, 7, 5, 6, 7, 5),
                        List.of(new Number(348521, 10597.35, "null", 1000, true), new Number(115823, 39375.23, "USD", 2, false), new Number(108655, 11995.99, "EUR", 3, false))),
                new User(11198L, "Александр", "Пушкин", "Сергеевич", "06.06.2006", Status.VIP, "g77gmner723jbnp04923", List.of(6, 7, 8, 6, 7, 8, 7),
                        List.of(new Number(521984, 5009.73, "USD", 2, false), new Number(115823, 8337.69, "null", 1000, true), new Number(108655, 23750.11, "RUB", 1, false))),
                new User(11126L, "Михаил", "Лермонтов", "Юрьевич", "07.07.2007", Status.FIZ, "d69234bneu4423jqrc2j", List.of(7, 8, 9, 7, 8, 9, 7),
                        List.of(new Number(376201, 9201.34, "USD", 2, false), new Number(115823, 14796.96, "EUR", 3, false), new Number(108655, 5050.96, "RUB", 1, false))),
                new User(11118L, "Лев", "Толстой", "Николаевич", "08.08.2008", Status.VIP, "ghn5ur2kcb894bnm50375", List.of(8, 9, 1, 8, 9, 1, 8),
                        List.of(new Number(168274, 6753.99, "EUR", 3, false), new Number(115823, 26337.29, "RUB", 1, false), new Number(108655, 13755.52, "null", 1000, true))),
                new User(11137L, "Иван", "Тургенев", "Сергеевич", "09.09.2009", Status.BLOCK, "m345jl12gdt8ngop7540", List.of(9, 1, 2, 9, 1, 2, 9),
                        List.of(new Number(456297, 18275.05, "RUB", 1, false), new Number(115823, 19256.23, "EUR", 3, false), new Number(108655, 34855.26, "EUR", 3, false))),
                new User(11196L, "Иосиф", "Бродский", "Александрович", "10.10.2010", Status.FIZ, "ola666y72nfsdf445w91", List.of(1, 4, 7, 1, 4, 7, 1),
                        List.of(new Number(304278, 22154.79, "null", 1000, true), new Number(115823, 1023.63, "USD", 2, false), new Number(108655, 1485.22, "RUB", 1, false))),
                new User(11173L, "Николай", "Некрасов", "Алексеевич", "11.11.2011", Status.VIP, "hkle6921bm5jd01278jl", List.of(2, 5, 8, 2, 5, 8, 2),
                        List.of(new Number(661257, 37266.82, "RUB", 1, false), new Number(115823, 22096.12, "EUR", 3, false), new Number(108655, 30225.24, "USD", 2, false))),
                new User(11178L, "Сергей", "Есенин", "Александрович", "12.12.2012", Status.BLOCK, "ynf3k7md9n209jn23m72", List.of(3, 6, 9, 3, 6, 9, 3),
                        List.of(new Number(100001, 2788.18, "RUB", 1, false), new Number(115823, 3937.75, "USD", 2, false), new Number(108655, 40000.55, "EUR", 1000, true))));


    }
}