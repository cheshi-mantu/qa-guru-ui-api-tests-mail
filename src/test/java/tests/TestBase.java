package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class TestBase {
    @BeforeAll
    static void setUpTest(){
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }

}
