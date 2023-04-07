/*Взять набор строк, например,

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный 
Пора красавица проснись.

Написать метод, который отсортирует эти строки по длине с помощью TreeMap.

Строки с одинаковой длиной не должны “потеряться”.
*/

// package WORK;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.TreeMap;

// /**
//  * program4
//  */
// public class program4 {
//     public static void main(String[] args) {
//         ex1("Мороз и солнце день чудесный \n" +
//                 "Еще ты дремлешь друг прелестный \n" +
//                 "Пора красавица проснись");
//     }

//     static void ex1(String s) {
//         s = s.replace("\n", "");
//         Map<Integer, List<String>> map = new TreeMap<>();
//         String[] arr = s.split(" ");
//         for (String s1 : arr) {
//             int len = s1.length();
//             if (map.containsKey(len)) {
//                 List<String> list = map.get(len);
//                 list.add(s1);
//             } else {
//                 List<String> list = new ArrayList<>();
//                 list.add(s1);
//                 map.put(len, list);
//             }
//         }
//         System.out.println(map);
//     }
// }

//ОТВЕТ: {1=[и], 2=[ты], 3=[Еще], 4=[день, друг, Пора], 5=[Мороз], 6=[солнце],
//8=[чудесный, дремлешь, проснись], 9=[красавица], 10=[прелестный]}