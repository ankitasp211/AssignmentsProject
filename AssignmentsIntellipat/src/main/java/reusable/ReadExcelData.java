package reusable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelData {

    public static String
    excelData(String sheetName, int rowIndex, int columnIndex) throws IOException {
        File f = new File("src/main/resources/testdata/testdataforfb.xlsx");
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        DataFormatter dataFormatter = new DataFormatter();
        return dataFormatter.formatCellValue(sheet.getRow(rowIndex).getCell(columnIndex));

    }
}
