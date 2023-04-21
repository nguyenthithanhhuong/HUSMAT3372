package oop.lab08.ex2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer integer : first) {
            for (Integer integer2 : second) {
                if (integer2 == integer) {
                    newSet.add(integer2);
                    break;
                }
            }
        }
        return newSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        for (int element : second) {
            first.add(element);
        }
        return first;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<Integer>(source);
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new LinkedHashSet<Integer>(source);
        List<Integer> list = new LinkedList<Integer>(set);
        return list;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        for (int i = 0; i < source.size(); i++) {
            for (int j = i + 1; j < source.size(); j++) {
                if (source.get(i) == source.get(j)) {
                    source.remove(j);
                }
            }
        }
        return source;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                return s.charAt(i) + "";
            }
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return (Integer[]) source.toArray();
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

}
