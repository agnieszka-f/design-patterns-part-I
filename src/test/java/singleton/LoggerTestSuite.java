package singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger testLogger;

    @Test
    public void testLogger(){
        //Given
        testLogger = Logger.getInstance();
        //When
        testLogger.log("log.log");
        String result = testLogger.getLastLog();
        //Then
        Assert.assertEquals("log.log", result);

    }
}
