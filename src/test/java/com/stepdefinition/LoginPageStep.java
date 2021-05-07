package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep {
	WebDriver driver;
	
	@Given("User on the adactin page")
	public void user_on_the_adactin_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEW\\eclipse-workspace\\Cucumber2Day\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://adactinhotelapp.com/");
		
	}

	@When("User should enter{string} and {string}")
	public void user_should_enter_and(String userName, String userPassword) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(userName);
		Assert.assertEquals("verify username", userName,txtUserName.getAttribute("value"));
		
		WebElement txtUserPassword = driver.findElement(By.id("password"));
		txtUserPassword.sendKeys(userPassword);
		Assert.assertEquals("verify userpass", userPassword,txtUserPassword.getAttribute("value"));
		}

	@When("User click the login button")
	public void user_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	    
	}

	@When("User should select {string},{string},{string},{string},{string}and{string}")
	public void user_should_select_and(String location, String hotels, String roomType, String noOfRoom, String adult, String child) {
		WebElement loc = driver.findElement(By.id("location"));
		loc.sendKeys(location);
		WebElement hot = driver.findElement(By.id("hotels"));
		hot.sendKeys(hotels);
		WebElement room = driver.findElement(By.id("room_type"));
		room.sendKeys(roomType);
		WebElement noRoom = driver.findElement(By.id("room_nos"));
		noRoom.sendKeys(noOfRoom);
		WebElement adu = driver.findElement(By.id("adult_room"));
		adu.sendKeys(adult);
		WebElement chi = driver.findElement(By.id("child_room"));
		chi.sendKeys(child);
		}

	@When("User click search button")
	public void user_click_search_button() {
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
	   
	}

	@When("User select hotel button")
	public void user_select_hotel_button() {
		WebElement radioButton  = driver.findElement(By.id("radiobutton_0"));
		radioButton.click();
		
	}

	@When("User click the continue button")
	public void user_click_the_continue_button() {
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	}

	@When("User should enter {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_enter_and(String firstName, String lastName, String address, String credits, String cardType, String endMnth, String endYr, String cvv) {
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys(firstName);
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys(lastName);
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys(address);
		WebElement cre = driver.findElement(By.id("cc_num"));
		cre.sendKeys(credits);
		WebElement card = driver.findElement(By.id("cc_type"));
		card.sendKeys(cardType);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		month.sendKeys(endMnth);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		year.sendKeys(endYr);
		WebElement cv= driver.findElement(By.id("cc_cvv"));
		cv.sendKeys(cvv);
	  }

	@When("User click the book now button")
	public void user_click_the_book_now_button() {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	 }

	@Then("User should  booking  successfully")
	public void user_should_booking_successfully() {
		WebElement order = driver.findElement(By.className("disable_text"));
	    String text = order.getText();
		System.out.println(text);
		
	   
	}




}
