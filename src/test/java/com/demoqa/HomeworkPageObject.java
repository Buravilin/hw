package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import com.demoqa.pages.RegistrationFormPage;
import static com.demoqa.pages.components.User.*;
import org.junit.jupiter.api.BeforeAll;
public class HomeworkPageObject {

 RegistrationFormPage registrationForm = new RegistrationFormPage();

    @BeforeAll
        static void setUp() {
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.holdBrowserOpen = true;
            Configuration.browserSize = "1920x1080";
        }

    @Test
    void fillFormTest() {
             registrationForm.openPage().setFirstName(firstName)
                                        .setLastName(lastName)
                                        .setEmail(email)
                                        .setGender(gender)
                                        .setNumber(number)
                                        .setBirthDate(day, month, year)
                                        .setSubject(subjects)
                                        .setHobby(hobbies)
                                        .uploadFile(picturePath)
                                        .setAddress(address)
                                        .setStateAndCity(state, city)
                                        .submit();

             registrationForm.checkResultTableVisibility().checkResultTableData("Student Name", (firstName + " " + lastName))
                                                            .checkResultTableData("Student Email", email)
                                                            .checkResultTableData("Gender", gender)
                                                            .checkResultTableData("Mobile", number)
                                                            .checkResultTableData("Date of Birth", date)
                                                            .checkResultTableData("Subjects", subjects)
                                                            .checkResultTableData("Hobbies", hobbies)
                                                            .checkResultTableData("Picture", pic)
                                                            .checkResultTableData("Address", address)
                                                            .checkResultTableData("State and City", (state + " " + city));
    }

}