import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTestsWithPOM extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void mySuccessfulRegistrationFormTest(){

        registrationPage.openPage()
                .setFirstName("Addis")
                .setLastName("Ababa")
                .setEmail("addisababa@mail.com")
                .selectGender("other")
                .setUserMobNumber("1010101010")
                .setDateOfBirth("16", "february", "1992")
                .subjectSet("Computer Science")
                .pickHobbies("Sports,Reading, Music") // there are only: Sports, Reading, Music
                .uploadPicture(imgFilePath)
                .setCurrentAddress("Russia, Saint-Petersburg")
                .selectStateAndCity("NCR", "Gurgaon") // NCR : Delhi, Gurgaon, Noida; Uttar Pradesh : Arga, Lucknow, Merrut
                .pressSubmitButton();

    }
}
