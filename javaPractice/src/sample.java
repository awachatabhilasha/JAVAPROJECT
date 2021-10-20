import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Workbook;

public class sample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream excel= new FileInputStream(new File("C:\\Users\\HP\\Desktop\\selenium classes\\Book1.xls"));
		Workbook workbook = Workbook.getWorkbook(excel);
		
	}

}
