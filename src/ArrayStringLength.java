import java.util.*;


public class ArrayStringLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Iron man", "Black Widow", "Doctor Strange","Black Panter", "Spider man","Doctor Stronge"));
        Comparator<String> lengthComparator = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            }
            return 0;
        };
List<String> list1 = new ArrayList<>(list);
        for (String s : list) {
            if (lengthComparator.compare(s,list.get(0)) > 0) {
                list = List.of(s);
            }
        }

        System.out.println( list);
    }

}





