package Pages;

public class TI_LE_Display {
	 
	//Here we are defing the locators
	@FindBy(xpath="//input[@title='Purchase Requisition Number")
	WebElemnet purchase_requisition_num;
	
	@FindBy(xpath="//div[contains(@title,'Other Purchase Requisition')")
	WebElemnet other_purchase_requisition_tab;
	
	@FindBy(xpath="//div[@title='Display Purchase Req.]")
	WebElement Display_Purchase_Req_PageHeader
	
	@FindBy(xpath="//div[@title='Display Purchase Req.]")
	WebElement Material_Data_tab
    
	//We have to initiate the pageobjects
	


	

}
