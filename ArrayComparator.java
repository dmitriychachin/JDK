package Sem_3.GB_JDK_Sem3.src.main.java;

import java.util.Objects;

public class ArrayComparator {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1 == null || array2 == null) {
            return false; // Один из массивов - null, они не могут быть одинаковыми.
        }

        if (array1.length != array2.length) {
            return false; // Разная длина массивов.
        }

        for (int i = 0; i < array1.length; i++) {
            if (!Objects.equals(array1[i], array2[i])) {
                return false; // Найден несовпадающий элемент.
            }
        }

        return true; // Массивы идентичны.
    }
}