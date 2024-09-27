package croutine;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class routineTest extends TestCase {

    Routine routine;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        routine = new Routine();
    }

    @Test
    public void testRepeat() {
        int expected = 1;
        int output = routine.repeat();

        assertEquals(expected, output);
    }
}