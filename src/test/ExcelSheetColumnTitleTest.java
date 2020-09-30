package test;

import main.ExcelSheetColumnTitle;
import org.junit.jupiter.api.Test;

class ExcelSheetColumnTitleTest {

    @Test
    void test() {
        ExcelSheetColumnTitle title = new ExcelSheetColumnTitle();
        System.out.println(title.convertToTitle(701));
    }
}