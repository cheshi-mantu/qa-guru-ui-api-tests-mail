package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


@Feature("qa-guru course 1")
@Story("UI and API tests")
public class MailTestsUiApi extends TestBase {

@Test
@Tag("ui_api_tests")
@DisplayName("Open yandex mail, authenticate, send email to myself")
@Description("attempt 1")
void logInSendMailToMyself(){
    step("", ()->{
        open("https://mail.yandex.ru");
        $(".HeadBanner-Button-Enter").shouldBe(visible).click();
        $(".passp-form-field__label").should(exist);// this is label of log-in field saying "Введите логин, почту или телефон"
        $("[data-t='field:login']").shouldBe(visible);
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
//@Test
//@Tag("ui_api_tests")
//@DisplayName("Open yandex mail, authenticate, send email to myself")
//@Description("Attempt 2")
//void logInSendMailToMyself1(){
//    step("", ()->{
//        open("https://mail.yandex.ru");
//
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
//    step("", ()->{
//
//    });
//
//    }
}
