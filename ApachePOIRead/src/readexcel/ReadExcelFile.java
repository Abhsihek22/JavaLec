package readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Rahul Arora\\Files for Parcts\\MyExcelFile.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("0");
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				switch(cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"\t");
					break;
				default:
					System.out.print("Invalid cell type"+"\t");
				}
			}
			System.out.println();
		}
		
		
	}

}
