package apis.feature;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.TestFactory;
import com.intuit.karate.junit5.Karate;
//@ExtendWith(Karate.class)
//@ContextConfiguration(classes = { Karate.class })

public class RunnerTest {
    public RunnerTest() {}

    @Karate.Test
    public Karate allFeatures() {
        return Karate.run("orchestration").relativeTo(getClass());
    }
}
