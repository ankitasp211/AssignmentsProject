package reusable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Date;
import java.util.List;

public class WriteExcelData {



    public static void writeDateToExcel(String sheetName, int rowIndex, int columnIndex, List<String> data) throws IOException {
        FileInputStream fis = new FileInputStream((new File("src/main/resources/testdata/testdataforfb.xlsx")));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetName);

        Row row = sheet.createRow(rowIndex);
        Cell cell1 = row.createCell(columnIndex);
        cell1.setCellValue(String.valueOf(data));
        FileOutputStream fos = new FileOutputStream("src/main/resources/testdata/testdataforfb.xlsx");
       wb.write(fos);




    }
}