/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов

Вывести данные по сотрудникам с фамилией Иванов.
*/

package WORK;

/**
 * program1
 */
import java.util.HashMap;
import java.util.Map;

public class program1 {

    public static void main(String[] args) {
        
    }
    program1 myDict = new program1();
    Map<String, String> map = new HashMap<>();

    void add(String passport, String name) {
        map.put(passport, name);

        myDict.add("123456", "Иванов");
        myDict.add("321456", "Васильев");
        myDict.add("234561", "Петрова");
        myDict.add("234432", "Иванов");
        myDict.add("654321", "Петрова");
        myDict.add("345678", "Иванов");

        myDict.getByName("Иванов");
    }

    void getByName(String name) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
