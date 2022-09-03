package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class ContributorsTest {

  @Test
  void anderiSolntsevShouldContributeTheMost(){
   // Configuration.browserSize="800x400";
    open("https://github.com/selenide/selenide");
    $(".Layout-sidebar").$(byText("Contributors")).ancestor(".BorderGrid-cell")
            .$$("ul li").first().hover();

    $$(".Popover-message").find(visible).shouldHave(text("Andrei Solntsev"));

  }
}
