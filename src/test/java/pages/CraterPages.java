package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CraterPages {
	public CraterPages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (name="email")
	public WebElement emailField;
	
	@FindBy (name="password")
	public WebElement passwordField;
	
	@FindBy (xpath="//h6[contains(text(),'Account Settings')]")
	public WebElement accountSetting;
	
	@FindBy (xpath="//button[@type='submit']")
	public WebElement submitBtn;
	
	@FindBy (xpath="//a[@href='/admin/items']")
	public WebElement itemTab;
	
	@FindBy (xpath="//button[@class='inline-flex whitespace-nowrap items-center border font-medium focus:outline-none focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm leading-5 rounded-md border-transparent shadow-sm text-white bg-primary-600 hover:bg-primary-700 focus:ring-primary-500']")
	public WebElement addTab;
	
	@FindBy (xpath="//h3[contains(text(),\"New Item\")]")
	public WebElement newItemText;
	
	@FindBy (xpath="//input[@type='text']//following::input[1]")
	public WebElement itemName;

	@FindBy (xpath="//input[@type='tel']")
	public WebElement itemPrice;
	
	@FindBy (xpath="//div[@class='flex flex-col mt-1']//following::input[3]")
	public WebElement dropBtn;
	
	@FindBy (name="description")
	public WebElement descriptionField;
	
	@FindBy (xpath="//span[@class='bg-multiselect-caret bg-center bg-no-repeat w-5 h-5 py-px box-content z-5 relative mr-1 opacity-40 shrink-0 grow-0 transition-transform']")
	public WebElement itemUnit;
	
	@FindBy (xpath="//button[@type='submit']")
	public WebElement saveItemBtn;
	
	@FindBy (xpath="//a[@href='/admin/items/6/edit']")
	public WebElement addedItem;
	
	@FindBy (xpath="//button[@type='submit']")
	public WebElement updateBtn;
	
	@FindBy (xpath="//span[contains(text(),'$ 30.00')]")
	public WebElement updatedPrice;
}
