package io.zveno;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";

    }
    @Test
    void fillFormTest(){
     open("https://demoqa.com/automation-practice-form");
     $("#firstName").setValue("Ivan");
     $("#lasttName").setValue("Ivanov");
     $("#userEmail").setValue("Ivanov@mail.ru");
     $("#userNumber").setValue("89245124758");
     $("#subjectsContainer").setValue("Some subject");
     $("#currentAddress").setValue("some address 1");
     $("#submit").click();

     $("#submit").click();
 }
}
