package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubPricing {

    @Test
    void pageComparePlansTest() {
        open("https://github.com/");
        $(".d-lg-flex.list-style-none").$(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $("div h1").shouldHave(text("Choose the plan that’s right for you."));
    }
}
