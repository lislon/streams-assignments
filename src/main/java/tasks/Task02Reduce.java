package tasks;

import java.util.List;
import java.util.Optional;

public class Task02Reduce {

    /**
     * Задача перемножить все числа переданные в список.
     *
     * Метод должен вернуть -1 в 2-х случаях:
     * 1. Если в функцию попадает пустой стрим
     * 2. Если результат умножения превышает 100
     *
     * Примеры:
     *
     *    (2,3) -> 6
     *    (2,2,2) -> 8
     *    () -> -1
     *    (50, 3) -> -1
     *
     * Понадобиться:
     *   - Stream::reduce
     *   - Optional::filter
     *   - Optional::orElse
     *
     * @param linkedListOfNumbers
     * @return
     */
    public static Integer multiply(List<Integer> linkedListOfNumbers) {
        throw new PleaseImplementMeException();
    }
}
