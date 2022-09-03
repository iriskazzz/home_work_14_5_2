package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HerokuappDragAndDrop {

  @Test
  void moveSquare() {
    open("https://the-internet.herokuapp.com/drag_and_drop");

    //Перенесите прямоугольник А на место В
    // actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(10,0).release().perform();
    $("#column-a").dragAndDropTo($("#column-b"));

    //Проверьте, что прямоугольники действительно поменялись
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));
  }
}
