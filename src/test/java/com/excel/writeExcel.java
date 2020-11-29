package com.excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeExcel {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        //java 写入excel内容

        /*
        * 1、找到excel位置
        * 2、双击打开excel
        * 3、找到cell对应的sheet与row
        * 4、把修改后的内容回写至excel
        * */
        // 找到excel位置
        FileInputStream file = new FileInputStream("sd.xlsx");

        //双击打开
        Workbook wb = WorkbookFactory.create(file);

        // 找到cell对应的sheet与row
        Sheet sheet = wb.getSheetAt(0);
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(3);
        cell.setCellType(CellType.STRING);
        cell.setCellValue("江");

        //把修改的内容回写至excel
        FileOutputStream fo = new FileOutputStream("sd.xlsx");
        wb.write(fo);
        wb.close();
        fo.close();


    }
}
