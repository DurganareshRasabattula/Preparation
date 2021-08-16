package list_removeall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 * @author durga on 8/13/2021
 */
public class RemoveAll {
     public static void removeWithWhileLoopPrimitiveElement(List<Integer> list, int element) {
        while (list.contains(element)) {
            list.remove(element);
        }
    }

     public static void removeWithWhileLoopNonPrimitiveElement(List<Integer> list, Integer element) {
        while (list.contains(element)) {
            list.remove(element);
        }
    }

    public static void removeWithWhileLoopStoringFirstOccurrenceIndex(List<Integer> list, Integer element) {
        int index;
        while ((index = list.indexOf(element)) >= 0) {
            list.remove(index);
        }
    }

    public static void removeWithCallingRemoveUntilModifies(List<Integer> list, Integer element) {
        while (list.remove(element))
            ;
    }

    public static void removeWithStandardForLoopUsingIndex(List<Integer> list, int element) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(element, list.get(i))) {
                list.remove(i);
            }
        }
    }

    public static void removeWithForLoopDecrementOnRemove(List<Integer> list, int element) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(element, list.get(i))) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeWithForLoopIncrementIfRemains(List<Integer> list, int element) {
        for (int i = 0; i < list.size();) {
            if (Objects.equals(element, list.get(i))) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void removeWithForEachLoop(List<Integer> list, int element) {
        for (Integer number : list) {
            if (Objects.equals(number, element)) {
                list.remove(number);
            }
        }
    }

    public static void removeWithIterator(List<Integer> list, int element) {
        for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
            Integer number = i.next();
            if (Objects.equals(number, element)) {
                i.remove();
            }
        }
    }

    public static List<Integer> removeWithCollectingAndReturningRemainingElements(List<Integer> list, int element) {
        List<Integer> remainingElements = new ArrayList<>();
        for (Integer number : list) {
            if (!Objects.equals(number, element)) {
                remainingElements.add(number);
            }
        }
        return remainingElements;
    }

    public static void removeWithCollectingRemainingElementsAndAddingToOriginalList(List<Integer> list, int element) {
        List<Integer> remainingElements = new ArrayList<>();
        for (Integer number : list) {
            if (!Objects.equals(number, element)) {
                remainingElements.add(number);
            }
        }

        list.clear();
        list.addAll(remainingElements);
    }

    public static List<Integer> removeWithStreamFilter(List<Integer> list, Integer element) {
        return list.stream()
                .filter(e -> !Objects.equals(e, element))
                .collect(Collectors.toList());
    }

    public static void removeWithRemoveIf(List<Integer> list, Integer element) {
        list.removeIf(n -> Objects.equals(n, element));
    }
}
