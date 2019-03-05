package xml;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class sheet {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
		
	}
	

	public static  void main(String[] args)throws Exception {
		String path="./data/Book1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		   
	
		   String v=fis.getsheet("sheet1").getRow(1).getcell(0).toString();
		   System.out.println(v);
	
		   //count the row
	int rc=wb.getsheet("sheet1").getlastRowNUM();
	System.out.println(rc);
	//write goto sheet-rows and cells
	wb.getsheet("sheet").gerrow(0).getcell(0).setcellvalue("qsp");
	wb.write(new FileOutputStream(path));
	wb.close();
	}
}
			
	
		   
		   
		   
		
	


