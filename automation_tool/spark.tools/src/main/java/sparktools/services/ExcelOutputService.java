package sparktools.services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import sparktools.utility.DataUtility;

public class ExcelOutputService {
	public static void printExcelColumn(Workbook workbook, Sheet sheet, String colName, String[] colData,
			int column) {
		Row r = sheet.getRow(0);
		if (r == null)
			r = sheet.createRow(0);
		
		Cell head = r.createCell(column);
		head.setCellValue(colName.substring(0,colName.length()-4));

		for (int i = 0; i < colData.length; i++) {
			r = sheet.getRow(i + 1);
			if (r == null)
				r = sheet.createRow(i+1);
			
			Cell c = r.createCell(column);
			c.setCellValue(colData[i]);
		}

		String filePathName = DataUtility.WORKBOOKOUTPUTPATH + "\\" + DataUtility.WORKBOOKFILENAME;
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(filePathName);
			workbook.write(output);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if (output != null)
				output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
