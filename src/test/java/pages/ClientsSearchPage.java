package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

/**
 * Created by jbalacha on 15/10/15.
 */
public class ClientsSearchPage extends BasePage {

  @FindBy(id = "search")
  private WebElement search_textbox;

  @FindBy(className = "searchBtn")
  private WebElement search_button;

  @FindBy(partialLinkText = "Add New Client")
  private WebElement select_first_client_link;

  public ClientsSearchPage(WebDriver webDriver) {

    this.webDriver = webDriver;
    PageFactory.initElements(webDriver, this);
  }

  public void searchAndSelectFirstClient(String client) {

    search_textbox.sendKeys(client);
    search_button.click();
    select_first_client_link.click();
  }
}
