package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
@FindBy(id="course")
private WebElement coursetb;


@FindBy(xpath="//a[text()='CATEGORIES']")
private  WebElement categoriestb;

public WebElement getCategoriestb() {
	return categoriestb;
}

public WebElement getCoursetb() {
	return coursetb;
}

@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
private WebElement seleniumtraining;


public SkillraryDemoLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void seleniumtrainingtab() {
	seleniumtraining.click();
}
}
