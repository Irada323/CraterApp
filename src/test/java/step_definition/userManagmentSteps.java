package step_definition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.CraterPages;
import utilities.BrowserUtils;
import utilities.DataReader;
import utilities.Driver;

public class userManagmentSteps {
	
     CraterPages cp=new CraterPages();
     BrowserUtils bu=new BrowserUtils();
    
     
     
     
@Given("I am on the login page")
public void i_am_on_the_login_page(){
	Driver.getDriver().get(DataReader.getProperty("appUrl"));
	
}
@When("I enter valid user name and valid password")
public void i_enter_valid_user_name_and_valid_password() {
	bu.actionsSendKeys(cp.emailField, DataReader.getProperty("username"));
	bu.actionsSendKeys(cp.passwordField, DataReader.getProperty("password"));
}

@When("I click on login button")
public void i_click_on_login_button() {
	cp.submitBtn.click();
}

@SuppressWarnings("deprecation")
@Then("I should be on the user profile page")
public void i_should_be_on_the_user_profile_page() {
bu.waitUntilElementVisiable(cp.accountSetting);
	Assert.assertTrue(cp.accountSetting.isDisplayed());
	
}


@Given("As an entity user, I am logged in")
public void as_an_entity_user_i_am_logged_in() {
  bu.waitUntilElementVisiable(cp.accountSetting);
  
}


	@And("I navigate to Items tab")
	public void i_navigate_to_items_tab() {
	   cp.itemTab.click();
	   bu.waitUntilElementVisiable(cp.itemTab);
	 
	}

	@When("I click on the Add Item button")
	public void i_click_on_the_add_item_button() {
		cp.addTab.click();
	   
	}

	@When("I should be on item input page")
	public void i_should_be_on_item_input_page() {
		Assert.assertEquals(true, cp.newItemText.isDisplayed());
		  System.out.println("test pass");
	  
	}
	@When("I provide item information name {string}, price {string}, and description {string},select dropdown {string}")
	public void i_provide_item_information_name_price_and_description_select_dropdown(String string, String string2, String string3, String string4) {
		   bu.actionsSendKeys( cp.itemName, "book1",cp.itemPrice, "1800", cp.descriptionField, "a good book");
		   Select select=new Select(cp.dropBtn);
		    select.deselectByVisibleText("pc");
	}


	@When("I click Save Item button")
	public void i_click_save_item_button() {
	    cp.saveItemBtn.click();
	}

	@Then("The Item is added to the Item list table")
	public void the_item_is_added_to_the_item_list_table() {
		Assert.assertTrue(cp.addedItem.isDisplayed());
	    
	}

	@When("I select the item {string}")
	public void i_select_the_item(String string) {
	    cp.addedItem.click();
	}

	@When("I should be on item details page")
	public void i_should_be_on_item_details_page() {
	   System.out.println(Driver.getDriver().getTitle());
	}

	@When("I update the item price to {int} dollars")
	public void i_update_the_item_price_to_dollars(Integer int1) {
		cp.itemPrice.clear();
		cp.itemPrice.sendKeys("3000");
	  
	}

	@When("I click Update Item button")
	public void i_click_update_item_button() {
	 cp.updateBtn.click();
	}

	@Then("the Item price is updated to {int} dollars")
	public void the_item_price_is_updated_to_dollars(Integer int1) {
	 Assert.assertTrue(cp.updatedPrice.isDisplayed());
	}
	
	@When("I select the item book1")
	public void i_select_the_item_book1() {
	  
		
	}

	@When("I select the item book2")
	public void i_select_the_item_name2() {
	    
	}
}
