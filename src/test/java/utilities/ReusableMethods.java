package utilities;

import org.openqa.selenium.WebElement;
import pages.IbrahimPage;

import java.util.List;

public class ReusableMethods {


    public static int passwordSeviyesiMethodu() {
        IbrahimPage us008=new IbrahimPage();
        int seviye=1;

        for (int i =1; i<us008.PasswordStrengthList.size(); i++) {
            if(us008.PasswordStrengthList.get(i-1).getAttribute("style").equals(us008.PasswordStrengthList.get(i).getAttribute("style"))) {
                seviye++;
            }else {
                break ;
            }
        }
        return seviye;
    }



}
