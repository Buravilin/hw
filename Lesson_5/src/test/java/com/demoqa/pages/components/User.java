package com.demoqa.pages.components;

//import com.demoqa.pages.components.RandomMonth;
import com.github.javafaker.Faker;
//import java.util.Locale;

    public class User {
        private static final Faker faker = new Faker();
        //private static final Faker faker = new Faker(new Locale("de"));

                public static String
                firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                email = faker.internet().emailAddress(),
                gender = faker.demographic().sex(),
                number = faker.phoneNumber().subscriberNumber(10),
                day = String.valueOf(faker.number().numberBetween(10, 31)),
                month = String.valueOf(RandomMonth.getRandomMonth()),
                year = String.valueOf(faker.number().numberBetween(1910, 2000)),
                subjects = "Math",
                hobbies = "Sports",
                pic = "1.png",
                picturePath = "src/test/java/com/demoqa/img/1.png",
                address = faker.address().fullAddress(),
                state = "Uttar Pradesh",
                city = "Lucknow",
                date = day + " " + month + "," + year;
    }
