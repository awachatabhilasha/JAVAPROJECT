import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;




public class Valuefromexcel {

	public static String[][] main(String[] args) throws IOException, BiffException {
		// TODO Auto-generated method stub


		
			FileInputStream excel= new FileInputStream(new File("C:\\Users\\HP\\Desktop\\selenium classes\\Book1.xls"));
			//Workbook workbook = Workbook.getWorkbook(excel);
			
			
			
			Sheet sheetexcel= workbook.getSheet(0);
			int row=sheetexcel.getRows();
			int column=sheetexcel.getColumns();
			System.out.println(row);
			System.out.println(column);
			
			String [][] value=new String[row-1][column];

			for(int i=1;i<row;i++)
			{

				for(int j=0;j<column;j++)
				{
					Object sheet;
					uname[j]  = sheet.getCell(j,i).getContents(); 
					pwd[j]=sheet.getCell(j,i).getContents();
				}
			}

		}

		
		public static void username(String uname,String pwd)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");

			for (String[] strings : value) {
				
			}
			WebElement username = driver.findElement(By.id("txtUsername"));
			username.sendKeys(uname);

			WebElement password = driver.findElement(By.id("txtPassword"));
			password.sendKeys(pwd);

			WebElement login = driver.findElement(By.id("btnLogin"));
			login.click();

			driver.close();
		}

	}
}