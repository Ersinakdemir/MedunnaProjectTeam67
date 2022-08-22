package stepdefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.IbrahimPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US008_UiSteps {
    IbrahimPage us008=new IbrahimPage();

    @Given("Kullanici Medunna url'sine gider")
    public void kullaniciMedunnaUrlSineGider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
        Driver.wait(3);
    }


    @Then("Kullanici sayfasina gider")
    public void kullaniciSayfasinaGider() {

        us008.GirisSekmesi.click();
        us008.SignInButonu.click();
        us008.UserNameBox.sendKeys(ConfigurationReader.getProperty("gecerliUserName"));
        us008.passwordBox.sendKeys(ConfigurationReader.getProperty("gecerliPassword"));
        us008.GirisSignInButonu.click();

    }


    @And("Kullanici password degistirme sayfasina gider")
    public void kullaniciPasswordDegistirmeSayfasinaGider()  {
        us008.KullaniciIsmiButonu.click();
        us008.PassswordDegistirmeButonu.click();


    }

    @And("Kullanici CurrentPassword bolumune mevcut passwordunu girer")
    public void kullaniciCurrentPasswordBolumuneMevcutUnuGirer() {
        us008.CurrentPasswordBox.sendKeys(ConfigurationReader.getProperty("gecerliPassword"));
    }


    @And("Kullanici New password bolumune yeni passwordunu girer")
    public void kullaniciNewPasswordBolumuneYeniPasswordunuGirer() {
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("newPassword"));
    }

    @And("Kullanici New password confirmation bolumune girdigi yeni passwordunu girer")
    public void kullaniciNewPasswordConfirmationBolumuneGirdigiYeniPasswordunuGirer() {
        us008.ConfirmPasswordBox.sendKeys(ConfigurationReader.getProperty("newPassword"));
    }
    
    @And("Kullanici Save butonuna tiklar Password changed! yazisini gorur")
    public void kullaniciSaveButonunaTiklarPasswordChangedYazisiniGorur() throws InterruptedException {

        us008.SaveButonu.click();

        String expectedYazisi=ConfigurationReader.getProperty("PasswordChangedYazisi");
        String actualYazisi=us008.PasswordChangedYazisi.getText();
        Assert.assertTrue(actualYazisi.contains(expectedYazisi));

    }



    @And("Kullanici sayfasindan cikar ve sayfayi kapatir")
    public void kullaniciSayfasindanCikarVeSayfayiKapatir() {

        us008.KullaniciIsmiButonu.click();
        us008.SignOutButonu.click();

    }


    @And("Kullanici New password bolumune kucuk harf caracteri icermeyen en az yedi carakterli yeni passwordunu girer")
    public void kullaniciNewPasswordBolumuneKucukHarfCaracteriIcermeyenEnAzYediCarakterliYeniPasswordunuGirer() {
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("rakamliPassword"));
    }


    @And("Kullanici New password bolumunde girdigi passworduna bir tane kucuk harf caracteri ekler ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordBolumundeGirdigiPasswordunaBirTaneKucukHarfCaracteriEklerVePasswordStrengthSeviyesininDegistiginiGorur() {

        int oncekiSeviye=ReusableMethods.passwordSeviyesiMethodu();
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("kucukharf"));
        int sonrakiSeviye=ReusableMethods.passwordSeviyesiMethodu();

        Assert.assertTrue(oncekiSeviye!=sonrakiSeviye);
    }

    @And("Kullanici New password bolumune buyuk harf caracteri icermeyen en az yedi carakterli yeni passwordunu girer")
    public void kullaniciNewPasswordBolumuneBuyukHarfCaracteriIcermeyenEnAzYediCarakterliYeniPasswordunuGirer() {
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("rakamliPassword"));
    }

    @And("Kullanici New password bolumunde girdigi passworduna bir tane buyuk harf caracteri ekler ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordBolumundeGirdigiPasswordunaBirTaneBuyukHarfCaracteriEklerVePasswordStrengthSeviyesininDegistiginiGorur() {
        int oncekiSeviye=ReusableMethods.passwordSeviyesiMethodu();
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("buyukharf"));
        int sonrakiSeviye=ReusableMethods.passwordSeviyesiMethodu();

        Assert.assertTrue(oncekiSeviye!=sonrakiSeviye);
    }


    @And("Kullanici New password bolumune rakam caracteri icermeyen en az yedi carakterli yeni passwordunu girer")
    public void kullaniciNewPasswordBolumuneRakamCaracteriIcermeyenEnAzYediCarakterliYeniPasswordunuGirer() {
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("rakamsizPassword"));
    }

    @And("Kullanici New password bolumunde girdigi passworduna bir tane rakam caracteri ekler ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordBolumundeGirdigiPasswordunaBirTaneRakamCaracteriEklerVePasswordStrengthSeviyesininDegistiginiGorur() {
        int oncekiSeviye=ReusableMethods.passwordSeviyesiMethodu();
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("rakam"));
        int sonrakiSeviye=ReusableMethods.passwordSeviyesiMethodu();

        Assert.assertTrue(oncekiSeviye!=sonrakiSeviye);
    }

    @And("Kullanici New password bolumune özel carakter icermeyen en az yedi carakterli yeni passwordunu girer")
    public void kullaniciNewPasswordBolumuneOzelCarakterIcermeyenEnAzYediCarakterliYeniPasswordunuGirer() {
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("rakamliPassword"));
    }

    @And("Kullanici New password bolumunde girdigi passworduna bir tane ozel caracteri ekler ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordBolumundeGirdigiPasswordunaBirTaneOzelCaracteriEklerVePasswordStrengthSeviyesininDegistiginiGorur() {
        int oncekiSeviye=ReusableMethods.passwordSeviyesiMethodu();
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("ozelcaracter"));
        int sonrakiSeviye=ReusableMethods.passwordSeviyesiMethodu();
        Assert.assertTrue(oncekiSeviye!=sonrakiSeviye);
    }

    @And("Kullanici New password bolumune  yeni passwordunun alti caracterini girer")
    public void kullaniciNewPasswordBolumuneYeniPasswordununAltiCaracteriniGirer() {
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("rakamliPassword").substring(0,6));
    }

    @And("Kullanici New password bolumunde girdigi passwordunun yedinci caracteri ekler ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordBolumundeGirdigiPasswordununYedinciCaracteriEklerVePasswordStrengthSeviyesininDegistiginiGorur() {
        int oncekiSeviye=ReusableMethods.passwordSeviyesiMethodu();
        us008.NewPasswordBox.sendKeys(ConfigurationReader.getProperty("buyukharf"));
        int sonrakiSeviye=ReusableMethods.passwordSeviyesiMethodu();

        Assert.assertTrue(oncekiSeviye!=sonrakiSeviye);
    }


    @And("Kullanici sayfasindan cikar")
    public void kullaniciSayfasindanCikar() {
        us008.KullaniciIsmiButonu.click();
        us008.SignOutButonu.click();
    }

    @And("Kullanici kullanici giris sayfasina gider")
    public void kullaniciKullaniciGirisSayfasinaGider() {
        us008.GirisSekmesi.click();
        us008.SignInButonu.click();

    }

    @And("Kullanici gecerli username ve bir onceki pasword ile giris yapamadigini gorur")
    public void kullaniciGecerliUsernameVeBirOncekiPaswordIleGirisYapamadiginiGorur() {
        us008.UserNameBox.sendKeys(ConfigurationReader.getProperty("gecerliUserName"));
        us008.passwordBox.sendKeys(ConfigurationReader.getProperty("gecerliPassword"));
        us008.GirisSignInButonu.click();

        String expectedErrorYazisi=ConfigurationReader.getProperty("PasswordErrorYazisi");
        String actualErrorYazisi=us008.PasswordErrorYazisi.getText();
        Assert.assertTrue(actualErrorYazisi.contains(expectedErrorYazisi));

        String expectedAgainYazisi=ConfigurationReader.getProperty("PasswordAgainYazisi");
        String actualAgainYazisi=us008.PasswordAgainYazisi.getText();
        Assert.assertTrue(actualAgainYazisi.contains(expectedAgainYazisi));

        us008.CancelYazisi.click();

    }


    @And("Kullanici passwordunu onceki passwordu ile degistirir")
    public void kullaniciPasswordunuOncekiPassworduIleDegistirir() {
        String OldPassword=ConfigurationReader.getProperty("newPassword");
        String NewPassword=ConfigurationReader.getProperty("gecerliPassword");

        us008.GirisSekmesi.click();
        us008.SignInButonu.click();
        us008.UserNameBox.sendKeys(ConfigurationReader.getProperty("gecerliUserName"));
        us008.passwordBox.sendKeys(OldPassword);
        us008.GirisSignInButonu.click();
        us008.KullaniciIsmiButonu.click();
        us008.PassswordDegistirmeButonu.click();
        us008.CurrentPasswordBox.sendKeys(OldPassword);
        us008.NewPasswordBox.sendKeys(NewPassword);
        us008.ConfirmPasswordBox.sendKeys(NewPassword);
        us008.SaveButonu.click();
    }
}
