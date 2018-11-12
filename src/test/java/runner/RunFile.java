package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/features/"},glue= {"stepdefinition","pages"},monochrome=true)
// src/test/java/features/CreateLead_POM.feature","src/test/java/features/EditLead_POM.feature",

public class RunFile {

}
