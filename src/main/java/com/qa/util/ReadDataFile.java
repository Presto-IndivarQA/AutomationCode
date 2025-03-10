 package com.qa.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
//import java.lang.String;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
//import org.apache.xpath.operations.String;

@SuppressWarnings("unused")
public class ReadDataFile {
	
	public String strAbsolutepath = new File("").getAbsolutePath();
	//private String strDataPath = this.strAbsolutepath + "\\src\\main\\java\\com\\qa\\eticketing\\testdata\\";
	private String strDataPath = this.strAbsolutepath + "\\src\\main\\java\\com\\qa\\testdata\\";

	
	public String readDataFile(String fileName, int expectedRowNumber, String expectedToken , String Methodname){		

		String strData = null;
		int expectedTokenNumber = 0;
		String strDelimiter = "##";
		int counter = 0;
		//String strDataSource = utils.getConfigValues("Data Source");
		String arrFile [] = new String[10];
		//arrFile = fileName.split("_");
		HSSFWorkbook workbook = null;

		//if(strDataSource.equalsIgnoreCase("Excel") || strDataSource.equalsIgnoreCase("xls")){

			String strExcelDataFileName = strDataPath + fileName + "_Data.xls";
			//String strExcelDataFileName = strDataPath + fileName;
			POIFSFileSystem fs; //test
			String strCellValue = null;
			try {
				fs = new POIFSFileSystem(new FileInputStream(strExcelDataFileName));
			    workbook = new HSSFWorkbook(fs);

				//String arrFile [] = new String[10];
				//arrFile = fileName.split("_");

				//HSSFSheet dataSheet =  workbook.getSheet(arrFile[1]);
				HSSFSheet dataSheet =  workbook.getSheet(Methodname);
				HSSFRow dataRow =  dataSheet.getRow(0);

				int totalCells = dataRow.getLastCellNum();
				for(int i=0;i<totalCells;i++){
					strCellValue = dataRow.getCell(i).toString();
					if(strCellValue.equals(expectedToken)){
						dataRow = dataSheet.getRow(expectedRowNumber);
						if(dataRow.getCell(i)!=null){
							strCellValue = dataRow.getCell(i).toString();
						}else{
							strCellValue = "";
						}
						if(strCellValue!=null){
							strData = strCellValue;
							counter++;
						}
						break;
						
					}
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			    try {
			        if (workbook != null) {
			            workbook.close();
			        }
			    } catch (IOException e) {
			        e.printStackTrace();
			    }
			}
			

			
	/*else{
			try {
				String strTextDataFileName = strDataPath + Methodname + "_Data.txt";
				BufferedReader br = new BufferedReader( new FileReader(strTextDataFileName));
				String strLine = null;
				StringTokenizer st = null;
				int tokenNumber = 0;
				int rowNumber = 0;


				while( (strLine = br.readLine()) != null){
					rowNumber++;

					//break data line using delimiter "||"
					st = new StringTokenizer(strLine, strDelimiter);

					while(st.hasMoreTokens()){
						tokenNumber++;
						strData = st.nextToken();
						if(strData.equalsIgnoreCase(expectedToken)){
							expectedTokenNumber = tokenNumber;
						}
						//if(expectedTokenNumber == tokenNumber && counter != 0)
						if(expectedTokenNumber == tokenNumber)
							break;

					}
					//reset token number
					if(expectedRowNumber == rowNumber - 1 && counter != 0){
						break;
					}else{	
						counter++;
						tokenNumber = 0;
					}	

				}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
*/		if(counter>0){
			if(strData==null){
				strData="";
				System.out.println("Please provide data in data file");
				return strData;
			}else{
				return strData;
			}
		}else{
			return "";
		}
	} 

	
	
}
