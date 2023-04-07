/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
*/

package WORK;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * program3
 */
public class program3 {

    public static void main(String[] args) {
        static boolean ex2(String ex){
            /*
            Написать программу, определяющую правильность расстановки скобок в выражении.
            Пример 0: [a+(d]*3) - ложь
            Пример 1: a+(d*3) - истина
            Пример 2: [a+(1*3) - ложь
            Пример 3: [6+(3*3)] - истина
            Пример 4: {a}[+]{(d*3)} - истина
            Пример 5: <{a}+{(d*3)}> - истина
            Пример 6: {a+]}{(d*3)} - ложь
             */
            Stack<Character> stack = new Stack<>();
            char[] c1 = ex.toCharArray();
            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('[', ']');
            map.put('{', '}');
            map.put('<', '>');
    
            for (int i = 0; i < c1.length; i++) {
                if (map.containsKey(c1[i])){
                    stack.push(c1[i]);
                }
                if (map.containsValue(c1[i])){
                    if (stack.isEmpty() || map.get(stack.pop()) != c1[i]){
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}