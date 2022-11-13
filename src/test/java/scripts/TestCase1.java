package scripts;

//changes made in branch-1
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
@Test
public void tc1()
{
	SkillraryLoginPage s= new SkillraryLoginPage(driver);
	s.gearsbtn();
	s.skillrarydemoapp();
	
	
	utilities.switchingtabs(driver);
	
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
			utilities.mouseHover(driver, sd.getCoursetb());
	sd.seleniumtrainingtab(); 
	
	AddtoCartPage d= new AddtoCartPage(driver);
	utilities.doubleClick(driver,d.getAddbtn());
	d.cartbtn();
	utilities.alertpopup(driver);
}
}
