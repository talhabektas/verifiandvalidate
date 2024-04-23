package example;
import org.example.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
*B211202067
*MEHMET TALHA BEKTAŞ
*SOFTWARE VERIFICATION AND VALIDATION HOMEWORK
*https://github.com/talhabektas
* */

public class calculatorTest {

    @ParameterizedTest
    @MethodSource("divisionValues")
    public void testDivision(float a, float b, float expected) {
        float result = Calculator.divide(a, b);
        assertEquals(expected, result);
    }

    private static Object[][] divisionValues() {
        return new Object[][]{
                {10, 2, 5},
                {10, 4, 2.5f},
                {12.5f, 2.5f, 5},
                {10, 2.5f, 4},
                {12.5f, 5, 2.5f}
        };
    }
}
