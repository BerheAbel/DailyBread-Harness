package excelFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) throws IOException {
		
      // Tips			
//	since we're working with external tools never forget to associate them with
//	the code.
//		
		Random car = new Random();
		Set<Integer> pin = new LinkedHashSet<Integer>();
		
		int sum = car.nextInt(1000);
		do {
	     pin.add(car.nextInt(sum));
		}
		while (pin.size() !=500);
//create workbook>>create work sheet>>create row>>create cell
//XSSFWorkbook: Is a class representation of XLSX file. 
//HSSFWorkbook: Is a class representation of XLS file. 
//Sheet: XSSFSheet and HSSFSheet classes implement this interface. XSSFSheet
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("sheet1");
		ws.createRow(0).createCell(0).setCellValue("Unique numbers");
		int luck = 0;
		for(Integer i:pin) {
			ws.createRow(luck).createCell(0).setCellValue(i);
			luck++;
		}
//Java FileOutputStream is an output stream used for writing data to a file
		String path = "data\\abc.xlsx";
		File home = new File(path);
		FileOutputStream ca = new FileOutputStream(home);
		wb.write(ca);
		wb.close();
		ca.close();
		
		
	}

}
