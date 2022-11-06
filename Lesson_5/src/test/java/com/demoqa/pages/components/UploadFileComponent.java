package com.demoqa.pages.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadFileComponent {

    public UploadFileComponent uploadFile(String path) {
        $("#uploadPicture").uploadFile(new File(path));
        return this;
    }

}