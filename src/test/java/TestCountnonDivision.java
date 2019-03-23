import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestCountnonDivision {


    @Test
    public void testSolution(){
        CountNonDivisible countNonDivisible = new CountNonDivisible();
        int[] input = {3,1,2,3,6};
        int[] result = {2,4,3,2,0};
        assertArrayEquals( result, countNonDivisible.solution(input));
    }


}
