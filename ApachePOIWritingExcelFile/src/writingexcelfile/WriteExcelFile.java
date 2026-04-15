package writingexcelfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet 1");
		XSSFSheet sheet2=workbook.createSheet("Sheet 2");
		
		for(int rownum=0;rownum<5;rownum++)
		{
			Row row=sheet.createRow(rownum);
			for(int cellnum=0;cellnum<5;cellnum++)
			{
				Cell cell=row.createCell(cellnum);
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		//connecting stream
		
		File file=new File("D:\\Rahul Arora\\Files for Parcts\\MyExcelFile.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		
		workbook.write(fos);
		
		//closing the stream
		fos.close();
		
		System.out.println("Excel file created successfully.");

	}

}
