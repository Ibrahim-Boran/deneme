package com.gt.cucumber.web;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import com.intuit.karate.junit4.Karate;
//import org.junit.jupiter.api.TestFactory;
//import com.intuit.karate.junit5.Karate;
//@ExtendWith(Karate.class)
//@ContextConfiguration(classes = { Karate.class })
//@RunWith(Karate.class)
//@KarateOptions(
//      tags = "@wip"
//)
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Login.feature"
        , glue = {"LoginStep"}
        //plugin = {"pretty", "junit:.target/surefire-reports/TEST-Report.xml", "json:."}
)
public class RunnerTest {
    public RunnerTest() {}

    //Karate.Test (Junit5)
    //public Karate allFeatures() {
    //   return Karate.run("orchestration").relativeTo(getClass());
    //}
}