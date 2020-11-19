package com.excel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readExcel {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        // java读取excel内容，打印在控制台上

        // 找到excel
       FileInputStream file = new FileInputStream("sd.xlsx");

       // 双击打开
        Workbook wb = WorkbookFactory.create(file);

        // 获取sheet
        Sheet sheet = wb.getSheetAt(0);


         //System.out.println(sheet.getLastRowNum()); //行数索引最大值
        //System.out.println(sheet.getPhysicalNumberOfRows()); 最大行数

        // 获取row
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);

            //System.out.println(row.getLastCellNum()); //列数索引最大值
            for (int j = 0; j < row.getLastCellNum(); j++) {
                // 找到cell
                Cell cell = row.getCell(j);
                cell.setCellType(CellType.STRING);
                String stringCellValue = cell.getStringCellValue();
                System.out.print(stringCellValue + "\t");
            }
            System.out.println();
        }
        file.close();

    }
}
