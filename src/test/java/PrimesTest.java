import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import primes.PrimalityChecker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimesTest
{
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1})
    public void primesBoundary(int number)
    {
        PrimalityChecker checker = new PrimalityChecker();
        assertFalse(checker.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7})
    public void primesTest(int number)
    {
        PrimalityChecker checker = new PrimalityChecker();
        assertTrue(checker.isPrime(number));
    }
}
