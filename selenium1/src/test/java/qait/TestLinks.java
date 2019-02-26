package qait;


//import org.junit.Before;
//import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import java.util.List;
import java.util.ArrayList;
public class TestLinks {
    WebDriver driver;
    String driverpath="/home/asimsabbag_qait/Downloads/chromedriver";
    @BeforeTest 
    public void setup() {
        System.setProperty("webdriver.chrome.driver",driverpath);
        driver=new ChromeDriver();
        driver.get("http://10.0.14.57:9292/");
    }
    @Test(dataProvider="linkProvider")
    public void testLinks(ArrayList<String> searchlink) {
        List<WebElement> linklist = new ArrayList<WebElement>();
        linklist=driver.findElements(By.cssSelector("li>a"));
        for(int i=0;i<searchlink.size();i++)
        {
            Assert.assertEquals(linklist.get(i).getText(),searchlink.get(i));
        }
        driver.close();
        
    }
    @DataProvider(name="linkProvider")
    public Object[][] getDataFromDataprovider(){
        List<String> links=new ArrayList<String>();
        links.add("A/B Testing");
        links.add("Basic Auth");
        links.add("Broken Images");
        links.add("Challenging DOM");
        links.add("Checkboxes");
        links.add("Context Menu");
        links.add("Disappearing Elements");
        links.add("Drag and Drop");
        links.add("Dropdown");
        links.add("Dynamic Content");
        links.add("Dynamic Controls");
        links.add("Dynamic Loading");
        links.add("Exit Intent");
        links.add("File Download");
        links.add("File Upload");
        links.add("Floating Menu");
        links.add("Forgot Password");
        links.add("Form Authentication");
        links.add("Frames");
        links.add("Geolocation");
        links.add("Horizontal Slider");
        links.add("Hovers");
        links.add("Infinite Scroll");
        links.add("JQuery UI Menus");
        links.add("JavaScript Alerts");
        links.add("JavaScript onload event error");
        links.add("Key Presses");
        links.add("Large & Deep DOM");
        links.add("Multiple Windows");
        links.add("Nested Frames");    
        links.add("Notification Messages");
        links.add("Redirect Link");    
        links.add("Secure File Download");
        links.add("Shifting Content");    
        links.add("Slow Resources");
        links.add("Sortable Data Tables");    
        links.add("Status Codes");
        links.add("Typos");    
        links.add("WYSIWYG Editor");
    return new Object[][] 
    	{
            { links }
        };

    }
}