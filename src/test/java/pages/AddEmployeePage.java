package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "middleName")
    public WebElement middleName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement menu_pim_viewPimModule;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement menu_pim_addEmployee;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButton;

    @FindBy(xpath= "//input[@id='employeeId']")
    public WebElement employeeId;

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}
