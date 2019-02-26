package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_data_from_Excel_file 
{
	

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{


        File file = new File("./Excel/Data.xlsx");

        FileInputStream fis = new FileInputStream(file);

        Workbook wb=WorkbookFactory.create(fis);
        
        Sheet sheet=wb.getSheet("Sheet1");
        
        int lastrow= sheet.getLastRowNum();
  
        	
        for(int i=0;i<lastrow;i++)
        	{
        	
        	Row row= sheet.getRow(i);
        	System.out.println(row.getCell(0).getStringCellValue());
        
        	}
        
        
        System.out.println(" ");
        System.out.println("***********************************************");
        System.out.println("  ");
        
        
        
        for(int i=1;i<lastrow;i++)
    	{
    	Row row= sheet.getRow(i);
    	System.out.println(row.getCell(1).getStringCellValue());
    
    	}
   
     }
  }
