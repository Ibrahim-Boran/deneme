package org.apiautomation;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ParallelTest {
    @Test
    public void parallelTest() {
        Results results = Runner.path("classpath:apis").tags("~@ignore").parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
