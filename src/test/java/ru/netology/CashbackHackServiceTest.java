package ru.netology;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void testCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void testCalculateBonus1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void testCalculateBonus2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int expected = 100;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void testCalculateBonus3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void testCalculateBonus4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void testCalculateBonus5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }

}