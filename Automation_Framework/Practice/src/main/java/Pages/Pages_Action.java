package Pages;
import TI_LE_Display

public class Pages_Action {
	
	 public TI_LE() {
			PageFactory.initElements(driver.this);
		}
			
		//Here we are defing the Actions
		
		public void purchase_requisition(string pr_num) {
			
			purchase_requisition_num.sendkeys(pr_num).click;
			
		public void other_purchase_requisition() {
				
			purchase_requisition_num.click;
		
		public void Display_Purchase_Req() {
			String getheadertext= Display_Purchase_Req_PageHeader.getText();
			assertEquals("Display Purchase Req",getheadertext);
			
		public void Material_Data() {
				
			Material_Data_tab.click;
			String material_group= Xpath.getText();
			assertEquals("material group",material_group);
			
			
		}
			
			
		}
						
			
			
			
			
			//void  we don't have any return type
			//string int char we have return type
		}
		

}
