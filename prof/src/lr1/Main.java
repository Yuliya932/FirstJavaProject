package lr1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Character> letters = List.of('S', 'E', 'N', 'D', 'M', 'O', 'R', 'Y');
        Map<Character, List<Integer>> possibleDigits = new HashMap<>();
        for (Character letter : letters) {
            possibleDigits.put(letter, List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        }
        // мы не принимаем ответы, начинающиеся с 0
        possibleDigits.replace('M', List.of(1));
        CSP<Character, Integer> csp = new CSP<>(letters, possibleDigits);
        csp.addConstraint(new SendMoreMoneyConstraint(letters));
        Map<Character, Integer> solution = csp.backtrackingSearch();
        if (solution == null) {
            System.out.println("No solution found!");
        } else {
            System.out.println(solution);
        }
    }
}






