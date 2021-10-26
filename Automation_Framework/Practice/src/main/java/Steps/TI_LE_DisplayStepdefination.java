package Steps;
import Configuration

public class TI_LE_DisplayStepdefination {
	
	String portalURL = Configuration.URL
	// we have to call these  configuration file from Utilities.
	// Configuartion file consist of common testdata
			\	
	@Given("Given Open the dasinfra");
public void dasinfra_URL() {
	Webdriver driver=system.setproperty("Webdriver.Chrome.driver","chromelocation");
	driver = new Chromedriver();
	driver.get(portalURL);
	

   @When("user set transcode 'tcode' and click on Enter");
   public void user_set_trans_code() {
	   
	   
   }
	
	
}

}
