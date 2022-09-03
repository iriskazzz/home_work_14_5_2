package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ComparePlansTest {

  @Test
  void loadingComparePlansPage(){
   // Configuration.browserSize="1600x800";

    open("https://github.com/");
    //На главной странице GitHub выберите меню Pricing -> Compare Plans с помощью команды hover для Pricing
    $(".HeaderMenu").$(byText("Pricing")).hover();
    $(byText("Compare plans")).click();

    //Убедитесь что загрузилась нужная страница (например что заголовок - "Choose the plan that’s right for you."
    $(".font-mktg").shouldHave(text("Compare features"));
  }
}
