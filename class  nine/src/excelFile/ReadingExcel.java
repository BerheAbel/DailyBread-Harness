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
		// TODO Auto-generated method stub

		String path = "data\\abc.xlsx";
		File fold = new File(path);
		FileInputStream fi = new FileInputStream(fold);
		Workbook wb2 = WorkbookFactory.create(fi);
		Sheet ws2 = wb2.getSheetAt(0);
		for(int i=0;i<501;i++) {
			System.out.println(ws2.getRow(i).getCell(0));
		}
	}

}
