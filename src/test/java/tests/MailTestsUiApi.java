package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MailTestsUiApi {
@Test
@Tag("ui_api_tests")
@Feature("qa-guru course 1")
@Story("UI and API tests")
@DisplayName("Open yandex mail, authenticate, send email to myself")
@Description
void logInSendMailToMyself(){
    step("", ()->{
        open("https://mail.yandex.ru");

//        open("https://mail.yandex.ru");

    });
//    step("", ()->{
//
//    });
//    step("", ()->{
//
//    });
//    step("", ()->{
//
//    });
//    step("", ()->{
//
//    });
//    step("", ()->{
//
//    });

    }
}
