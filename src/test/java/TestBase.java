import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBase {


    @BeforeAll
    static void init(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";

        Configuration.baseUrl = "https://demoqa.com/";




    }
}
