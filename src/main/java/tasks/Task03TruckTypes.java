package tasks;

import java.util.List;
import java.util.Map;

/**
 * Есть грузовик Truck, у которого задана максимальная грузоподьемность.
 *
 * Грузовики делятся на 3 типа в зависимости от грузоподьемности:
 *  - Pickup        - до 2 тонн
 *  - SmallBoxTruck - до 12 тонн
 *  - SemiTrailer   - до 20 тонн
 */
public class Task03TruckTypes {

    /**
     * Возвращает тип грузовика с наименьшей грузоподьемностью,
     * который сможет перевести заданный вес.
     * <p>
     * Если вес слишком большой, то метод должен кинуть WeightTooHighException с сообщением "слишком большой вес"
     *
     * <pre>
     * Пример:
     *   1_000 -> Pickup   (для одной тонны достаточно пикапа)
     * </pre>
     *
     * Вы можете решить это задание как через Stream, так и через цикл.
     * Какой код выйдет проще и легче для понимания, тот и используйте.
     * <p>
     *
     * <i>Подсказка: Доступные значения в enum можно перебирать через метод values()</i>
     * <p>Совет: Нажмите Ctrl+Q (Cmd+Q) чтобы увидеть комментарии с форматированием.
     *
     * @param weight
     * @return
     */
    public static TruckType getTypeByWeight(int weight) {
        throw new PleaseImplementMeException();
    }

    /**
     * Сгруппировать все грузовики по их грузоподьемности.
     *
     * <p>Пример:
     * <pre>
     *      List(Truck(5_000), Truck(5_100), Truck(20_000))
     *      ->
     *      Map [
     *          SmallBoxTruck => List(Truck(5_000), Truck(5_100))
     *          SemiTrailer   => List(Truck(20_000))
     *      ]
     *
     * Понадобиться:
     *   - Stream::collect
     *   - Collectors.groupingBy
     * </pre>
     *
     * @param trucks
     * @return
     */
    public static Map<TruckType, List<Truck>> groupTrucksByType(List<Truck> trucks) {
        throw new PleaseImplementMeException();
    }

    /**
     * Посчитать кол-во грузовиков в каждой группе.
     *
     * <p>Пример:
     * <pre>
     *      List(Truck(5_000), Truck(5_100), Truck(20_000))
     *      ->
     *      Map [
     *          SmallBoxTruck => 2
     *          SemiTrailer   => 1
     *      ]
     *
     * Понадобиться:
     *   - Stream::collect
     *   - Collectors.groupingBy
     *   - Collectors.counting
     * </pre>
     *
     * @param trucks
     * @return
     */
    public static Map<TruckType, Long> countTrucksByType(List<Truck> trucks) {
        throw new PleaseImplementMeException();
    }

    /**
     * Грузовик и его грузоподьемность.
     */
    static class Truck {
        int maxWeightKg;
        Truck(int maxWeightKg) {
            this.maxWeightKg = maxWeightKg;
        }
    }

    /**
     * Тип грузовика по грузоподьемности в кг.
     */
    enum TruckType {
        Pickup(2000),
        SmallBoxTruck(12_000),
        SemiTrailer(20_000);

        private int maxLoad;

        TruckType(int maxLoad) {
            this.maxLoad = maxLoad;
        }

        public boolean canHandleWeight(int weight) {
            return weight <= this.maxLoad;
        }
    }

    public static class WeightTooHighException extends RuntimeException {
        public WeightTooHighException() {
            super("Weight is too high for any type of vehicle available");
        }
    }

}
