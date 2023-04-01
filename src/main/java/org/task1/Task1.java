package org.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> unsorted = List.of("A", "B", "X", "M", "F");
        System.out.println("przed posortowaniem : " + unsorted);
        List<String> result = sortByUsingOwnComparator(unsorted);
        System.out.println("sortowanie nr 1 :" + result);
        List<String> result2 = sortUsingLambda(unsorted);
        System.out.println("sortByLambda : " + result2);
        List<String> result3 = sortUsingStream(unsorted);
        System.out.println("sortByStream : " + result3);
        List<String> result4 = sortByListMethod(unsorted);
        System.out.println("sort by List method : " + result4 );




    }
    private static List<String> sortUsingAnonymousClass (List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1,o2  -> gdy oj>oa zrwaca +, -> gdy o1<o2 zwraca - , gdy o1 rowne o2 zwrac 0;
                return  o2.compareTo(o1);

            }
        });
        return sorted;
    }
    private static List<String> sortByUsingOwnComparator(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted) ;
        Collections.sort(sorted, new MyOwnComperator());
        return sorted;
        }
        private static List<String> sortUsingLambda(List<String> unsorted){
            List<String> sorted = new ArrayList<>(unsorted) ;
            Collections.sort(sorted, (o1,o2) -> -o1.compareTo(o2));
                    return sorted;
    }

    private static List<String> sortUsingStream (List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);

        return sorted.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

    }
    private static List<String> sortByListMethod(List<String>unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
}
