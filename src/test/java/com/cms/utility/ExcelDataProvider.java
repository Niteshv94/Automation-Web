package com.cms.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public XSSFWorkbook workbook;
	
	public FileInputStream fileInputStream;
	public File source;
	
	//public FileInputStream assetFileStream;
	//public File assetFilePath;

	//This constructor will load the Excel as soon as we create object of this class 
	public ExcelDataProvider() {
		
		 source=new File("./TestData/LoginData.xlsx");
		 
		
		try {
			 fileInputStream = new FileInputStream(source);
			
			//In order to read xlsx file we need one class called XSSFWorkBook
			 workbook = new XSSFWorkbook(fileInputStream);
		} catch (Exception e) {
			
			System.out.println("Unable to read Excel file " + e.getMessage());
		} 
		
//		assetFilePath = new File("./ExcelCSVFile/Lighting Test.xlsx");
//		
//		try {
//			assetFileStream = new FileInputStream(assetFilePath);
//			
//			workbook = new XSSFWorkbook(assetFileStream);
//		} catch (Exception e) {
//			
//			System.out.println(">>>Unable to load Asset Ecel file>>> " + e.getMessage());
//		} 
	}
	

	
	//Method Overloading Scenario
	public String getStringData(int sheetIndex, int row, int column)
	{
		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	
	public String getCategoryName(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String uploadCSVFile(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String sucessMessage(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String getProductAttributes(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String searchItemCatalog(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String getProductCategory(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String updateProductCategory(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String deleteProductCategory(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String searchClusters(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String enterCluster(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String updateCluster(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String enterEmailForForgotPassword(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String enterProductCatalogName(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String enterUserDetails(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public String enterMandatorySpecifications(String SheetName, int row, int column)
	{
		return workbook.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
}
