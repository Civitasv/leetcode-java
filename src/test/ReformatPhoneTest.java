package test;


import main.contest220.ReformatPhone;
import org.junit.jupiter.api.Test;

class ReformatPhoneTest {

    @Test
    void test(){
        ReformatPhone phone = new ReformatPhone();
        System.out.println(phone.reformatNumber("123 4-567"));
    }
}