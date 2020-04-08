package tasks;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Задания на groupingBy - очень полезная функция в Stream.
 *
 * Есть список сотрудников Employee с 2-мя строковомы полями (имя + компания где работает сотрудник).
 * Нужно потренироваться группировать сотрудников по компаниям.
 */
public class Task3_GroupBy {

    /**
     * Сгруппировать сотрудников по компании в Map.
     *
     * <p>Пример:
     * <pre>
     *      List(
     *           Employee("Boris", "Google"),
     *           Employee("Masha", "Google"),
     *           Employee("Lena", "Microsoft")
     *          )
     *      ->
     *      Map [
     *          "Google" => List(Employee("Boris", "Google"), Employee("Masha", "Google"))
     *          "Microsoft" => List(Employee("Lena", "Microsoft"))
     *      ]
     *
     * Понадобиться:
     *   - Stream::collect
     *   - Collectors.groupingBy
     * </pre>
     */
    public static Map<String, List<Employee>> groupByCompaniesAsList(Collection<Employee> employees) {
        throw new PleaseDeleteMeAndImplement();
    }

    /**
     * Сгруппировать сотрудников по компании в Map структуру, но сделать компании капсом.
     *
     * <p>Пример:
     * <pre>
     *      List(
     *           Employee("Boris", "Google"),
     *           Employee("Masha", "Google"),
     *           Employee("Lena", "Microsoft")
     *          )
     *      ->
     *      Map [
     *          "GOOGLE" => List(Employee("Boris", "Google"), Employee("Masha", "Google"))
     *          "MICROSOFT" => List(Employee("Lena", "Microsoft"))
     *      ]
     *
     * Понадобиться:
     *   - Stream::collect
     *   - Collectors.groupingBy
     *   - лямба функция как первый аргумент groupingBy
     *   - String::toUpperCase
     * </pre>
     */
    public static Map<String, List<Employee>> groupByCompaniesAsListUppercase(Collection<Employee> employees) {
        throw new PleaseDeleteMeAndImplement();
    }


    /**
     * Тут почти тоже самое, но в значениях должны оказаться не List, а Set.
     *
     * <p>
     * Понадобиться
     * - Stream::collect
     * - Collectors.groupingBy
     * - Collectors.toSet (как downstream коллектор для groupingBy)
     * </pre>
     *
     * @param employees
     * @return
     */
    public static Map<String, Set<Employee>> groupByCompaniesAsSet(Collection<Employee> employees) {
        throw new PleaseDeleteMeAndImplement();
    }

    /**
     * А здесь в значениях должны оказаться только имена
     *
     * <p>Пример:
     * <pre>
     *      List(
     *           Employee("Boris", "Google"),
     *           Employee("Masha", "Google"),
     *           Employee("Lena", "Microsoft")
     *          )
     *      ->
     *      Map [
     *          "Google" => Set("Boris", "Google")
     *          "Microsoft" => Set("Lena")
     *      ]
     *
     * Понадобиться:
     *   - Stream::collect
     *   - Collectors.groupingBy
     *   - Collectors.mapping
     *   - Collectors.toList
     * </pre>
     *
     * @param employees
     * @return
     */
    public static Map<String, List<String>> groupByCompaniesAsString(Collection<Employee> employees) {
        throw new PleaseDeleteMeAndImplement();
    }


    public static class Employee {
        private String name;
        private String company;

        public Employee(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public String getName() {
            return name;
        }

        public String getCompany() {
            return company;
        }
    }
}
