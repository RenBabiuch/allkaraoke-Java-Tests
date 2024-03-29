package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputSelectionPage {

    private final WebDriver driver;

    @FindBy(css = "[data-test='remote-mics']")
    private WebElement useSmartphonesButton;

    @FindBy(css = "[data-test='built-in']")
    private WebElement computersMicButton;

    @FindBy(css = "[data-test='mics']")
    private WebElement singstarMicButton;

    @FindBy(css = "[data-test='advanced']")
    private WebElement advancedSetupButton;

    @FindBy(css = "[data-test='skip']")
    private WebElement skipButton;

    @FindBy(css = "[data-testid='HelpIcon']")
    private WebElement helpButton;


    public InputSelectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectSmartphones() {
        useSmartphonesButton.click();
    }

    public void selectComputersMicrophone() {
        computersMicButton.click();
    }

    public void selectSingstarMicrophones() {
        singstarMicButton.click();
    }

    public void selectAdvancedSetup() {
        advancedSetupButton.click();
    }

    public void skipToMainMenu() {
        skipButton.click();
    }

    public void showMeHelpOptions() {
        helpButton.click();
    }
}