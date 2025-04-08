package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrowserLaunch {

	public static void main(String[] args) throws IOException {
		
		//Enter All values in Excel:
	

		// To find the file location

		File file = new File("C:\\AprilNewMorning\\Book1.xlsx");

		// To get data from outside file to inside(eclipse)

		FileInputStream input = new FileInputStream(file);

		// To access the workbook

		Workbook book = new XSSFWorkbook(input);

		// To get the sheet from workbook

		Sheet sheet = book.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				switch (cellType) {
				case STRING:
					
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue+"   ");
					
					break;
					
				case NUMERIC :
					
					if(DateUtil.isCellDateFormatted(cell)) {
						
						Date dateCellValue = cell.getDateCellValue();
						
						SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
						
						String format2 = format.format(dateCellValue);
						
						System.out.print(format2+"   ");
						
					}
					
					else {
						
						double numericCellValue = cell.getNumericCellValue();
						
						int x=(int) numericCellValue;
						
						BigDecimal valueOf = BigDecimal.valueOf(x);
						
						String string = valueOf.toString();
						
						System.out.print(string+"   ");
					}

				default:
					break;
				}
				
				
			
		}
			
			System.out.println();
		
		}
		
		

	}

}
