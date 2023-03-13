import org.junit.jupiter.api.Test;
import people.Person;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTests
{

    @Test
    public void constructorTest()
    {
        Person testMe = new Person("Joe", "Smith");
        assertAll(
                () -> assertEquals("Joe", testMe.getFirst()),
                () -> assertEquals("Smith", testMe.getLast())
        );
    }
}
