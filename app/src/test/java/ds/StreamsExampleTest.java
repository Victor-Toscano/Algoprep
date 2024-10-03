package ds;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StreamsExampleTest extends TestCase {
    private StreamsExample streamsExample;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        streamsExample = new StreamsExample();
    }

    @Test
    public void testStreamsExample() {
        String result = streamsExample.streamsExample();
        Assert.assertTrue(!result.isEmpty());
    }

    @Test
    public void testStreamsExample1() {
        String result = streamsExample.streamsExample1();
        Assert.assertTrue(!result.isEmpty());
    }
}