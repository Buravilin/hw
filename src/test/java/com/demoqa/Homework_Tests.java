package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Homework_Tests {
    File file = new File("src/test/resources/images.jpg");
    String name = "Alex";
    String email = "alex@alex.ru";
    String number = "9999999999";

    @BeforeAll
    static void setUp () {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x720";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void fillFormTest()
    {
        open("/automation-practice-form");
        zoom(0.5);
        //region Name
        $("#firstName").setValue(name);
        $("#lastName").setValue("Ivanov");
        //endregion
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue(number);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1995");
        $(byAttribute("aria-label", "Choose Tuesday, August 1st, 1995")).click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        //region Хобби
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        //endregion
        //region Файл
        $("#uploadPicture").uploadFile(new File("src/test/resources/images.jpg"));
        //endregion
        //region Адрес
        $("#currentAddress").setValue("st. Kommynna 9");
        //endregion
        //region Город и Штат
        SelenideElement a = $("#state");
        a.scrollIntoView(true);
        a.click();
        a.$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#city").$(byText("Lucknow")).click();
        //endregion

        $("#submit").click();

        $(".table-responsive").shouldHave(text(name));
        $(".table-responsive").shouldHave(text(email));
        $(".table-responsive").shouldHave(text(number));
        $(".table-responsive").shouldHave(text("Maths"));
        $(".table-responsive").shouldHave(text("images.jpg"));
    }
}
