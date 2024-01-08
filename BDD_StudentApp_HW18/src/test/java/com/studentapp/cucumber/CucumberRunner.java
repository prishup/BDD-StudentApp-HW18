package com.studentapp.cucumber;


import com.studentapp.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature")
//        tags = "@POSITIVE, @SMOKE")// tags are optional, can run from runner class


public class CucumberRunner extends TestBase {

}
