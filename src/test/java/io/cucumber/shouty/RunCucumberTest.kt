package io.cucumber.shouty

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

// TODO: remove if not needed in the future
@RunWith(Cucumber::class)
@CucumberOptions(plugin = ["pretty"])
abstract class RunCucumberTest