package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US17_Page {
    public US17_Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "entity-menu")
    public WebElement itemsDropdown;
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[5]")
    public WebElement testItems;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr/td[1]/a")
    public List<WebElement> idlkSayfaList;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[8]/div/a[2]")
    public List<WebElement> editilkSayfaList;

}
