package io.cucumber.shouty

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(plugin = ["pretty", "html:target/cucumber"], features = ["classpath:features"])
abstract class AcceptanceTestRunner