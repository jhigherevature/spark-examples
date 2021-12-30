package sparktools.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkBookFinder {
	public static Workbook FindExistingWorkbook(String path, String filename) {
		FileInputStream fis = null;
		String file = path + "\\" + filename;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("Workbook not located, generating new Workbook: " + file);
		}
		
		if (fis != null)
			try {
				return new XSSFWorkbook(fis);
			} catch (IOException e1) {
				System.out.println("Located workbook could not be converted to Workbook object");
				e1.printStackTrace();
			}
		else
			try {
				return GenerateNewWorkBook(path, filename);
			} catch (IOException e) {
				System.out.println("New Workbook Generation Failed");
				e.printStackTrace();
			}
		return null;
	}
	
	public static Workbook GenerateNewWorkBook(String path, String filename) throws IOException {
		Workbook ret = new XSSFWorkbook();
		ret.createSheet();
		return ret;
	}
}

