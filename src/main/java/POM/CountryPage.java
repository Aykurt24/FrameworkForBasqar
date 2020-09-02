package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryPage extends BaseClass {

    public CountryPage (){
        super();
        PageFactory.initElements(driver,this);
    }


@FindBy (linkText = "Setup")
    WebElement setup ;
@FindBy (linkText = "Parameters")
    WebElement parameters ;
@FindBy (linkText = "Countries")
    WebElement countries ;
@FindBy (css = "ms-add-button.ng-star-inserted>div>button")
    WebElement add;
@FindBy (css = "ms-text-field[ formcontrolname = 'name']>input")
    WebElement name;
@FindBy (css = "ms-text-field[ formcontrolname = 'code']>input")
    WebElement code;
@FindBy (css = "ms-save-button>button")
    WebElement save;
@FindBy (css = "ms-delete-button>button")
    WebElement delete;
@FindBy (css = "button[type='submit']")
    WebElement yes;


WebElement myelement;

public void clickOnElement (String element){

    switch (element) {

        case "Setup":
            myelement = setup;
        break;
        case "Parameters":
            myelement = parameters;
        break;
        case "Countries":
            myelement = countries;
        break;
        case "Add":
            myelement = add;
        break;
        case "Save":
            myelement = save;
        break;
        case "Delete":
            myelement = delete;
        break;
        case "Yes":
            myelement = yes;

    }

     click(myelement);

}

public void SendKeysToElement (String element, String text){

    switch (element){

        case "Name":
            myelement=name;
        break;
        case "Code":
            myelement=code;
    }

    sendKeys(myelement,text);

}


}
