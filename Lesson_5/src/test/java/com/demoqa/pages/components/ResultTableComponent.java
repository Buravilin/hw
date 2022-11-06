package com.demoqa.pages.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultTableComponent {
    private static final String TEXT = "Thanks for submitting the form";

    public ResultTableComponent isVisible() {
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text(TEXT));
        return this;
    }

    public ResultTableComponent checkResults(String ... strings) {
        for (String s : strings) {
            $(".table-responsive").shouldHave(text(s));
        }
        return this;
    }

}