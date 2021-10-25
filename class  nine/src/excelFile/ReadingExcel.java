package excelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
// FileInputStream is meant for reading streams of data.
//WorkbookFactory for creating the appropriate kind of Workbook 
//by auto-detecting from the supplied input.

		String path = "data\\abc.xlsx";
		File sky = new File(path);
		FileInputStream world = new FileInputStream(sky);
		Workbook usa = WorkbookFactory.create(world);
		Sheet texas = usa.getSheetAt(0);
		try {
		for(int i=0;i<501;i++) {
			System.out.println(texas.getRow(i).getCell(0));
		}
		}
		catch (Exception a) {
			System.out.println("random");
		}
		
	}

}
