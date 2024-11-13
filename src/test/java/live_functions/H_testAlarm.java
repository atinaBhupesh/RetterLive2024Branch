package live_functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class H_testAlarm extends B_baseClass

{

	@FindBy(xpath = "//span[text()=\"Test Alarm\"]")private WebElement testAlarmModule;
	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/TestAlarms/test_list\"]")
	private WebElement testAlarmList;

	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")
	private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")
	private WebElement fireStationField;
	@FindBy(xpath = "//textarea[@id=\"TestAlarmTitle\"]")
	private WebElement testAlartitlefield;
	@FindBy(xpath = "//textarea[@id=\"TestAlarmDescription\"]")
	private WebElement testAlarmDescriptionField;

	@FindBy(xpath = "//input[@id=\"TestAlarmAlarmType\" and @value=\"3\"]")
	private WebElement alarmTypePush;
	@FindBy(xpath = "//input[@id=\"TestAlarmReminderStatus\"]")
	private WebElement selectRemindar;
	@FindBy(xpath = "//select[@id=\"TestAlarmReminderType\"]")
	private WebElement testAlarmRemindarType;
	@FindBy(xpath = "//input[@class=\"selectRecursive\" and  @value=\"3\"]")
	private WebElement recursiveMonth;

	@FindBy(xpath = "//input[@class=\"rdoMonthlyType\" and @value=\"1\"]")
	private WebElement monthDay;
	@FindBy(xpath = "//input[@class=\"rdoMonthlyType\" and @value=\"2\"]")
	private WebElement monthDate;
	@FindBy(xpath = "//input[@id=\"startDate1\"]")
	private WebElement alatmDate;
	@FindBy(xpath = "//input[@id=\"timePicker1\"]")
	private WebElement alarmTime;
	@FindBy(xpath = "//input[@id=\"inlineRadio1\"]")
	private WebElement userTypeAttribute;
	@FindBy(xpath = "//input[@placeholder=\"Select Vehicle/Cars\"]")
	private WebElement vehicleField;
	@FindBy(xpath = "//input[@id=\"selectCheckboxes\"]")
	private WebElement selectAllCheckBox;
	

	@FindBy(xpath = "//textarea[@id=\"TestAlarmAddress\"]")
	private WebElement testAlarmAdressFeild;
	@FindBy(xpath = "//input[@id=\"locationDrag\"]")
	private WebElement dragMarkerOnMapCheckBox;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement saveTestAlarm;

	@FindBy(xpath = "//input[@aria-controls=\"alarmTable\"]")private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
	@FindBy(xpath = "//i[@class=\"fa fa-trash-o\"]")private WebElement deleteAlarm;
	@FindBy(xpath = "//button[@id=\"delYes\"]")private WebElement deleteYes;
	@FindBy(xpath = "//button[@id=\"delRec\"]")private WebElement deleteYes1;
	@FindBy(xpath = "//a[@href=\"http://live.retteralarm.de/admin/TestAlarms/testAlarmOverviews\"]")private WebElement testAlarmOverview;

	@FindBy(xpath = "(//a[@class=\"blackAnchor\" and @title=\"Chat\"])[1]")private WebElement testAlarmChat1;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")private WebElement sendmessageButton;
	@FindBy(xpath = "(//i[@class=\"fa fa-user-plus\"])[4]")private WebElement extendAlarmButton;
	
	@FindBy(xpath="//input[@id=\"timePicker1\"]")private WebElement recursiveDailyTime;
	 @FindBy(xpath="//input[@value=\"2\" and @class=\"selectRecursive\"]")private WebElement recursiveWeekly;
	@FindBy(xpath="//select[@id=\"TestAlarmRecDay\"]")private WebElement weekDay;
	
	@FindBy(xpath="//input[@id=\"timePicker\"]")private WebElement timeOnetime;
	
    @FindBy(xpath="//input[@id=\"startDate\"]")private WebElement dateOnetime ;
	
    @FindBy(xpath="//input[@class=\"rdoMonthlyType\" and @value=\"1\"]")private WebElement recursiveDayWise;
	@FindBy(xpath="//select[@id=\"TestAlarmWeektype\"]")private WebElement selectDayCount;
	@FindBy(xpath="//select[@id=\"TestAlarmRecDay\"]")private WebElement slectDay;
	 
	@FindBy(xpath = "(//input[@id=\"inlineRadio2\"])[1]")private WebElement userTypeResource;

	@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")private WebElement userTypeFireFighter;


	
	@FindBy(xpath="(//input[@id=\"inlineRadio2\"])[2]")private WebElement userTypeAlarmLoop ;
	
	
	@FindBy(xpath="//select[@name=\"alarmTable_length\"]")private WebElement alarmLength;
	 @FindBy(xpath="(//span[text()=\"Active\"])[1]")private WebElement deactiveAlarm;
	@FindBy(xpath="//button[@id=\"statChange\"]")private WebElement changeStatusYes;
	
	
	
	@FindBy(xpath = "//input[@value=\"15429\"]")private WebElement ADST06A2;
    @FindBy(xpath = "//input[@value=\"3136\"]")private WebElement ADST06R2;
    @FindBy(xpath = "//input[@value=\"22999\"]")private WebElement jonas2;
	@FindBy(xpath = "//input[@value=\"23001\"]")private WebElement jonas3;
//	@FindBy(xpath = "//input[@value=\"27249\"]")private WebElement bhupeshLive2;
	@FindBy(xpath="//input[@value=\"3497\"]")private WebElement ADST06AL2;
	@FindBy(xpath="//input[@value=\"4220\"]")private WebElement ADST06ALEsc ;


	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public H_testAlarm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void testAlarmCommon(WebDriver driver) throws Throwable {
		testAlarmModule.click();
		Thread.sleep(2000);
		testAlarmList.click();
		Thread.sleep(2000);

	}

	public void testAlarmOverviewCommon(WebDriver driver) throws Throwable {

		testAlarmModule.click();
		

		testAlarmOverview.click();
		
	}

	
	
	
	
	
	
	
	
	
	public void testAlarmByRecursiveMonthlyDateWais(WebDriver driver, String date , String gTimeA7min )
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
	
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		testAlartitlefield.click();
		
		act.sendKeys("BG-Test-Date wise-Alarm loop-" + date+"_"+gTimeA7min).build().perform();
		
		testAlarmDescriptionField.click();
		
		act.sendKeys("checking test alarm created by escalation alarm loop with remndar monthly date wise.").build().perform();
	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		alarmTypePush.click();
		
		selectRemindar.click();
	
		Select se = new Select(testAlarmRemindarType);
	
		se.selectByVisibleText("Recursive");
	
		recursiveMonth.click();
	
		monthDate.click();
	
		alatmDate.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.sendKeys(date).build().perform();
	

		alarmTime.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.sendKeys(gTimeA7min).build().perform();
	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	
        userTypeAlarmLoop.click();
    	Thread.sleep(1000);
		selectAllCheckBox.click();
	
		Thread.sleep(1000);
		selectAllCheckBox.click();
		Thread.sleep(1000);
     
	
		ADST06AL2.click();
		Thread.sleep(1000);
		
		testAlarmAdressFeild.click();

		act.sendKeys("Naredra Nagar Square, Ring road, Nagpur").build().perform();
	
		dragMarkerOnMapCheckBox.click();
		
		saveTestAlarm.click();
		

		driver.navigate().refresh();
		Reporter.log("test alarm created for >"+ date+"-"+gTimeA7min,true);
		
	

	}

	
	public void testAlarmByRecursiveMonthlyDayWise(WebDriver driver, String date , String gTimeA7min, String dayCount,String today)
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
	
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		testAlartitlefield.click();
		
		act.sendKeys("BG-Test-Day wise-Alarm loop-" + date+" "+gTimeA7min).build().perform();
		
		testAlarmDescriptionField.click();
		
		act.sendKeys("checking test alarm created by alarm loop with remindar monthly day wise.").build().perform();
	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		alarmTypePush.click();
		
		selectRemindar.click();
	
		Select se = new Select(testAlarmRemindarType);
	
		se.selectByVisibleText("Recursive");
	
		recursiveMonth.click();
	
		recursiveDayWise.click();
		
		Select se2 = new Select(selectDayCount);

		se2.selectByValue(dayCount);
		
		
		Select se3 = new Select(slectDay);
		se3.selectByVisibleText(today);
		
	
	
		alarmTime.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.sendKeys(gTimeA7min).build().perform();
	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	
		userTypeAlarmLoop.click();
		Thread.sleep(1000);
		selectAllCheckBox.click();
	
		Thread.sleep(1000);
		selectAllCheckBox.click();
		Thread.sleep(1000);
     
		ADST06AL2.click();
		Thread.sleep(1000);




		testAlarmAdressFeild.click();

		act.sendKeys("Dev Nagar Square, Ring road, Nagpur").build().perform();
	
		dragMarkerOnMapCheckBox.click();
		
		saveTestAlarm.click();
		

		driver.navigate().refresh();
		Reporter.log("test alarm created for >"+ date+"-"+gTimeA7min,true);
		
	

	}
	
	
	
	
	
	public void testAlarmByRecursiveWeekly(WebDriver driver, String date , String gTimeA7min, String today )
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
	
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		testAlartitlefield.click();
		
		act.sendKeys("BG-Test-Weely wise-Fire fighter-" + date+" "+gTimeA7min).build().perform();
		
		testAlarmDescriptionField.click();
		
		act.sendKeys("checking test alarm created by firefighter with remindar recursive weekly type.").build().perform();
	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		alarmTypePush.click();
		
		selectRemindar.click();
	
		Select se = new Select(testAlarmRemindarType);
	
		se.selectByVisibleText("Recursive");
	
		recursiveWeekly.click();
		Select se2= new Select(weekDay);
		
		se2.selectByVisibleText(today);
		
		
		
		recursiveDailyTime.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA7min).build().perform();
	
			
	
		userTypeFireFighter.click();
		Thread.sleep(1000);
		vehicleField.click();
		
		
		
		act.sendKeys("06v1").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.sendKeys("06v3").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		selectAllCheckBox.click();
		Thread.sleep(1000);

		selectAllCheckBox.click();
		
		jonas3.click();
		Thread.sleep(1000);
		jonas2.click();
		Thread.sleep(1000);
//		bhupeshLive2.click();
//		Thread.sleep(1000);
		
		
		
		
		testAlarmAdressFeild.click();

		act.sendKeys("Shatabdhi Square, Ring road, Nagpur").build().perform();
	
		dragMarkerOnMapCheckBox.click();
		
		saveTestAlarm.click();
	

		driver.navigate().refresh();
		Reporter.log("test alarm created for >"+ date+"-"+gTimeA7min,true);
		
	

	}
	
	
	
	
	
	public void testAlarmByRecursiveDaily(WebDriver driver, String date , String gTimeA9min )
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
	
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		testAlartitlefield.click();
		
		act.sendKeys("BG-Test-Daily wise-Resource-" + date+" "+gTimeA9min).build().perform();
		
		testAlarmDescriptionField.click();
		
		act.sendKeys("checkin test alarm created by resource with remindar daily.").build().perform();
	
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		alarmTypePush.click();
		
		selectRemindar.click();
	
		Select se = new Select(testAlarmRemindarType);
	
		se.selectByVisibleText("Recursive");

		
		recursiveDailyTime.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA9min).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
		userTypeResource.click();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		selectAllCheckBox.click();

		Thread.sleep(1000);
		selectAllCheckBox.click();
		Thread.sleep(1000);
		

	    Thread.sleep(1000);
	    ADST06R2.click();
	
		
	    Thread.sleep(1000);
		testAlarmAdressFeild.click();

		act.sendKeys("Omkar Nagar Square, Ring road, Nagpur").build().perform();
	
		dragMarkerOnMapCheckBox.click();
		
		saveTestAlarm.click();
	

		driver.navigate().refresh();
		Reporter.log("test alarm created for >"+ date+"-"+gTimeA9min,true);
		
	

	}
	

	
	
	
	

	

	public void testAlarmByOnetime(WebDriver driver, String date, String gTimeA11min, String today) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("Andrew").build().perform();
		Thread.sleep(2000);
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
	
		act.sendKeys("06").build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		testAlartitlefield.click();
		
		act.sendKeys("BG-Test-One time-Attribute-" + date+" "+gTimeA11min).build().perform();
		
		testAlarmDescriptionField.click();
		
		act.sendKeys("checking one time test alarm created by attribute with reminder.").build().perform();
	

		Thread.sleep(1000);
		
		alarmTypePush.click();
		
		selectRemindar.click();
	
		Select se = new Select(testAlarmRemindarType);
	
		se.selectByVisibleText("One time");
		
		dateOnetime.click();
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
    	act.sendKeys(date).build().perform();
		timeOnetime.click();
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
    	act.sendKeys(date).build().perform();

    	
		
    	timeOnetime.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.sendKeys(gTimeA11min).build().perform();
		
	
	
		act.sendKeys(Keys.PAGE_DOWN).perform();
	
		userTypeAttribute.click();
		Thread.sleep(1000);
		vehicleField.click();

		act.sendKeys("06v1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		act.sendKeys("06v3").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		selectAllCheckBox.click();
		Thread.sleep(1000);

		selectAllCheckBox.click();
		Thread.sleep(1000);
		ADST06A2.click();
		Thread.sleep(1000);
		testAlarmAdressFeild.click();

		act.sendKeys("SBI Narendra Nagar Branch, 435H+86M, Mankapur Ring Rd, Arvind Nagar Housing Society, Narendra Nagar, Badil Kheda, Nagpur, Maharashtra 440015").build().perform();
	
		dragMarkerOnMapCheckBox.click();
		
		saveTestAlarm.click();
	

		driver.navigate().refresh();
		Reporter.log("test alarm created for >"+ date+"-"+gTimeA11min,true);
		
	
		
	}

	public void semdmessageToTestAlarmUsers(WebDriver driver, String date, String gTimeA11min) {
		Actions act = new Actions(driver);
		testAlarmChat1.click();
	
		writemessageField.click();

		act.sendKeys("message-test alarm users").build().perform();
	
		sendmessageButton.click();
		driver.navigate().refresh();
		
	}
	
	
	public void deleteTestAlarmFromList(WebDriver driver) throws Throwable {
		testAlarmModule.click();
		Thread.sleep(2000);
		testAlarmList.click();
		Thread.sleep(2000);

		for (int i = 1; i <= 100; i++) {
			searchField.click();
			Actions act = new Actions(driver);
			act.sendKeys("BG").perform();
			searchButton.click();
			Thread.sleep(3000);
			deleteAlarm.click();
			Thread.sleep(3000);
			deleteYes.click();
	
			Reporter.log("Test alarm number-" + i + " deleted sucessfully from list-testing branch.", true);
			driver.navigate().refresh();
		

		}

	}

	public void deleteTestAlarmFromOverview(WebDriver driver) throws Throwable {

		for (int i = 1; i <= 100; i++) {

			searchField.click();
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.sendKeys("bg").perform();
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(5000);
			deleteAlarm.click();
			Thread.sleep(2000);
			deleteYes1.click();
			Thread.sleep(5000);
			Reporter.log("Test alarm number-" + i + " deleted sucessfully from overview-testing branch.", true);
			driver.navigate().refresh();
			Thread.sleep(2000);

		}

	}
	
	
	
	
	
	public void deactiveTestAlarms(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
		Select se = new Select(alarmLength);
		se.selectByVisibleText("100");
		Thread.sleep(2000);
	
	

		for (int i = 1; i <= 100; i++) {
			searchField.click();
			
			act.sendKeys("BG").build().perform();
			
			searchButton.click();
			Thread.sleep(2000);
		
			deactiveAlarm.click();
			Thread.sleep(1000);
			changeStatusYes.click();
			Thread.sleep(1000);
			Reporter.log("Alarm number-" + i + " is deleted sucessfully.", true);
			Thread.sleep(2000);
		   driver.navigate().refresh();
		   Thread.sleep(1000);;

		}

	}
	
	
	
	
	
	
	
	
	
	
	
}