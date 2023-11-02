//import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardDeliveryTaskOneTest {

    private WebDriver driver;

    @Test
    void nameTestOne(){
        open("http://0.0.0.0:9999");
        $("[data-test-id='city']").setValue("Москва");
        $("[data-test-id='data']").setValue("05.11.2023");
        $("[data-test-id='name']").setValue("Петров-Пётр Петрович");
        $("[data-test-id='phone']").setValue("+70001234567");
        $("checkbox__box").click();
        $("button__text").click();



    }


}
