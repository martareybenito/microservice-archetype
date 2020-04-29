package it;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "it.stepdef")
public class ApplicationBdd {
}
