package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestArrayListSort {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(34);
        list.add(28);
        list.add(17);

        dispList(list);

        list.add(7);
        list.add(28);
        dispList(list);

        // compAsc
        // Comparator 인터페이스를 사용해 이름이 없는 클래스에
        // 코드를 추가해 new 할 수 있음
        // 무명이 아니라 익명임(Anonymous)!
        // 람다식 사용한 익명클래스 사용법
        Comparator<Integer> compAsc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        Comparator<Integer> compDesc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        Collections.sort(list, compAsc);
        dispList(list);

        // 문자열 정렬
        ArrayList<String> names = new ArrayList<>();
        names.add("이순신");
        names.add("김유신");
        names.add("강감찬");
        names.add("을지문덕");
        names.add("권율");
        dispName(names);

        // 오름차순
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        dispName(names);

        // 내림차순
        Collections.sort(names, (o1,o2) -> o2.compareTo(o1));
        dispName(names);
    }

    private static void dispList(ArrayList<Integer> list) {
        for (int i=0; i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    private static void dispName(ArrayList<String> names) {
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

}
