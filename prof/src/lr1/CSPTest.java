package lr1;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CSPTest {

    @Test
    void backtrackingSearch() {

        //given
        List<Character> letters = List.of('S', 'E', 'N', 'D', 'M', 'O', 'R', 'Y');
        Map<Character, List<Integer>> possibleDigits = new HashMap<>();
        for (Character letter : letters) {
            possibleDigits.put(letter, List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        }

        //when
        possibleDigits.replace('M', List.of(1));
        CSP<Character, Integer> csp = new CSP<>(letters, possibleDigits);
        csp.addConstraint(new SendMoreMoneyConstraint(letters));

        Map<Character, Integer> result = csp.backtrackingSearch();

        //then
        Map<Character, Integer> expected = new HashMap<>();
        // ввести элементы в хеш-отображение
        expected.put('R', 8);
        expected.put('S', 9);
        expected.put('D', 7);
        expected.put('E', 5);
        expected.put('Y', 2);
        expected.put('M', 1);
        expected.put('N', 6);
        expected.put('O', 0);

        assertEquals(result,expected);
    }
}