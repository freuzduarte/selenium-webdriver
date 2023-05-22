package formacion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {
        StringBuffer verificationErrors = new StringBuffer();
        JavascriptExecutor js;
        System.setProperty("webdriver.chrome.driver", "direccion/webdriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /*
        driver.get("https://demoqa.com/login");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("userName")).sendKeys("micorreo@autentia.com");
        driver.findElement(By.id("password")).sendKeys("mipassword");
        driver.findElement(By.id("newUser")).click();
        */
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;

        driver.get("https://espanol.yahoo.com/?p=us");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.get("https://login.yahoo.com/?.lang=es-CL&src=homepage&.done=https%3A%2F%2Fespanol.yahoo.com%2F%3Fp%3Dus&pspid=2142990676&activity=ybar-signin");
        driver.findElement(By.id("login-username")).clear();
        driver.findElement(By.id("login-username")).sendKeys("tucorreo@");
        driver.findElement(By.id("login-signin")).click();
        driver.get("https://login.yahoo.com/account/challenge/password?.lang=es-CL&src=homepage&pspid=2142990676&activity=ybar-signin&done=https%3A%2F%2Fespanol.yahoo.com%2F%3Fp%3Dus&sessionIndex=Qw--&acrumb=PyrEARd1&display=login&authMechanism=primary");
        driver.findElement(By.id("login-passwd")).clear();
        driver.findElement(By.id("login-passwd")).sendKeys("tuclave");
        driver.findElement(By.id("login-signin")).click();
        driver.get("https://espanol.yahoo.com/?p=us&guccounter=1&guce_referrer=aHR0cHM6Ly9sb2dpbi55YWhvby5jb20v&guce_referrer_sig=AQAAAJEIIoaBUZoc51by7C7mclN6kFkvBgRsEXe9pjiGmwfm7hVywZurs1D_u5x-rgZWP2NyURBdW7VnpSA8JzoA-qW4XyWrNHWWAqmy54JCF7Q3KUH77K04-KQTxZayeUAUG-w_LfSPHI4Oh3ZGzU9VYS8QdLE8oJl7_eeU-UdDjZeD");
        driver.findElement(By.id("ybarMailLink")).click();
        driver.get("https://mail.yahoo.com/");
        driver.findElement(By.xpath("//div[@id='app']/div[2]/div/div/nav/div/div[3]/div/ul/li[7]/div/a/span")).click();
        driver.findElement(By.xpath("//div[@id='mail-app-component']/div/div/div/div[2]/div/div/div[3]/div/div/ul/li[2]/a/div/div/div/button/span")).click();
        driver.findElement(By.xpath("//div[@id='mail-app-component']/div/div/div/div/div/div[2]/div/div[3]/button/span/span")).click();
        driver.findElement(By.xpath("//div[@id='modal-outer']/div/div/div/div[4]/button")).click();
    }
}