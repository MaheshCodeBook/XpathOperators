import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class BooleanOperatorsExample {
    public static void main(String[] args) {
        // Set the path for chromedriver if needed
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://qaxpathoperator.ccbp.tech/");

        // Boolean AND Operator: fetch a paragraph with class 'intro' and data-number attribute
        String introParagraphText = driver.findElement(By.xpath("//p[@class='intro' and @data-number='5']")).getText();
        System.out.println("Boolean AND Operator: " + introParagraphText);

        // Boolean OR Operator: fetch a paragraph with class 'intro' or data-number as 10
        introParagraphText = driver.findElement(By.xpath("//p[@class='intro' or @data-number='10']")).getText();
        System.out.println("Boolean OR Operator: " + introParagraphText);

        // Boolean NOT Operator: fetch any element which does not have the 'hidden' attribute
        introParagraphText = driver.findElement(By.xpath("//p[not(@hidden)]")).getText();
        System.out.println("Boolean NOT Operator: " + introParagraphText);

        // Close the browser after task completion
        driver.quit();
    }
}
