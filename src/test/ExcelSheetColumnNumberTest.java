package test;

import main.ExcelSheetColumnNumber;
import org.junit.jupiter.api.Test;

class ExcelSheetColumnNumberTest {

    @Test
    void test() {
        ExcelSheetColumnNumber sheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(sheetColumnNumber.titleToNumber("ZY"));
    }
}