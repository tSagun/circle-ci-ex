import MyMath.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyMathTests
{

    @Test
    public void exceptionsTest()
    {
        MyMath calculator = new MyMath();
        assertThrows(ArithmeticException.class, () -> calculator.divide(1,0));
    }

    @Test
    public void divideTest()
    {
        MyMath calc = new MyMath();
        assertDoesNotThrow(() -> calc.divide(234,3));
    }
}
