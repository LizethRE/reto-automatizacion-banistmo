package com.banistmo.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@RutaCritica",
        glue = "com.banistmo.reto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class TagsRunner {
}
