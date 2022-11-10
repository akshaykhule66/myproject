package com.myproject.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.myproject.qa.Base.BaseClass;

public class Utilityclass extends BaseClass{
	
		// 1. Taking a screenshot of the Webpage
		public static void Screenshot(WebDriver driver) throws IOException{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date d=new Date();
			String filename="ScreenShot_"+d.toString().replace(":","_").replace(" ","_")+".jpg";
			File dest=new File("C:\\Users\\Administrator\\Desktop\\ScreenshotEclipse\\"+filename);
			FileUtils.copyFile(src,dest);
		}
			
		// 2. Drawing the border around the element.
	
		public static void BorderbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		
		// 3. Capture the title of the webpage.
		
		public static String titlebyJS(WebDriver driver) {
			 JavascriptExecutor js = ((JavascriptExecutor)driver);
			 String Title = js.executeScript("return document.title").toString();
			 return Title;
		}
		
		// 4. Click on Some Element.
		
		public static void clickbyJS(WebDriver driver,WebElement element) {
			 JavascriptExecutor js = ((JavascriptExecutor)driver);
			 js.executeScript("arguments[0].click();", element);
		}

		
		// 5. Generate an Alert.
		
		public static void alertbyJS(WebDriver driver, String Message) {
		    JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("alert('"+ Message + "')");
		}
		
		
		// 6. Refreshing the webpage.
		
		public static void refreshbyJS(WebDriver driver) {
			 JavascriptExecutor js = ((JavascriptExecutor)driver);
			 js.executeScript("history.go(0)");
		}
		
		// 7. Scrolling of the webpage.
		
		public static void scrollbyJS(WebDriver driver,int x, int y) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("scroll("+x+","+y+")");
		}
		
		// 8. Scroll into view
		
		public static void scrollIntoViewbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			//element.click();
		}
		
		// 9. excel 
		public static String exel(int x,int y) throws EncryptedDocumentException, IOException{
			
			FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\com.myproject.qa\\src\\main\\java\\com\\myproject\\qa\\Testdata\\SeleniumExel.xlsx");
			String data=WorkbookFactory.create(file).getSheet("sheet1").getRow(x).getCell(y).getStringCellValue();
			return data;	
		}
		
		
		
}

