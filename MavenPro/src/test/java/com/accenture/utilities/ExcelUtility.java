package com.accenture.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.accenture.pages.Registration;

public class ExcelUtility {
	 public void getData() throws IOException{
		 FileInputStream fis = new FileInputStream("C:\\Users\\pdc4-training.pdc4\\Desktop\\TestData.xlsx");
		 XSSFWorkbook wrkbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = wrkbook.getSheet("Sheet1");
		 
		 int iRows = sheet.getLastRowNum();
		 
		 DataFormatter dataFormatter = new DataFormatter();
		
		// for(int iLoop=1; iLoop<=iRows; iLoop++){
			 
			 int iCols = sheet.getRow(1).getLastCellNum();
			 String arrData[] = new String[iCols];
			 /*
			 for(int iLoop1=0; iLoop1<iCols; iLoop1++){
				 String data = dataFormatter.formatCellValue(sheet.getRow(iLoop).getCell(iLoop1));
 				 
				 System.out.println(data + " "); 
				 arrData[iLoop1] = data; 
			 }*/
			 
			 for(int iLoop1=0; iLoop1<iCols; iLoop1++){
				 String data = dataFormatter.formatCellValue(sheet.getRow(1).getCell(iLoop1));
				 arrData[iLoop1] = data; 
			 }
			 
			 Registration.Registrations(arrData[0], arrData[1], arrData[2], arrData[3], arrData[4]);
			 System.out.println("\n");	 
		// }
	 }
	 
	 public static void main(String args[]) throws IOException{
		 ExcelUtility e = new ExcelUtility();
		 e.getData();
	 }
	 
}
