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
		// TODO Auto-generated method stub
		
		
//		
//		
		Random ranum = new Random();
		Set<Integer> pin = new LinkedHashSet<Integer>();
		
		int answer = ranum.nextInt(1000);
		while(pin.size() !=500) {
	     pin.add(ranum.nextInt(answer));
			}
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("sheet1");
		ws.createRow(0).createCell(0).setCellValue("Random numbers");
		int count = 1;
		for(Integer i:pin) {
			ws.createRow(count).createCell(0).setCellValue(i);
			count++;
		}
	   
		String path = "data\\abc.xlsx";
		File fname = new File(path);
		FileOutputStream fo = new FileOutputStream(fname);
		wb.write(fo);
		wb.close();
		fo.close();
		
		
	}

}
