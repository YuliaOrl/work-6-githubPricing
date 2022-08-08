package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @Test
    void dragAndDropTest() {
    Configuration.browserSize = "1500x1080";
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDropTo("#column-b");
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));
    }
}
