package ru.netology;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void testCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testCalculateBonus1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testCalculateBonus2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testCalculateBonus3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testCalculateBonus4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testCalculateBonus5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);

    }




}