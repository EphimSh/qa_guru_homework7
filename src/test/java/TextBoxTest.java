import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import pages.component.verification.TextBoxVerificationContainer;

public class TextBoxTest extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxVerificationContainer textBoxVerification = new TextBoxVerificationContainer();

    @Test
    void textBoxTest(){
        textBoxPage.openPage()
                .setFullName("Addis", "Ababa")
                .setEmail("addisababa@mail.com")
                .setCurrentAddress("woods")
                .setPermanentAddress("saint-petersburg")
                .pressSubmitButton();

        textBoxVerification
                .verifyFullName("Addis", "Ababa")
                .verifyEmail("addisababa@mail.com")
                .verifyCurrAddress("woods")
                .verifyPermanentAddress("saint-petersburg");
    }
}
