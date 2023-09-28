package ru.netology;

import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {

    @org.junit.Test

    public void testRemain500() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test

    public void testRemainZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test

    public void testRemainWhenAmountExceedsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCashbackHackLessBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int expected = 400;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldCashbackHackOneBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);

    }
    @org.junit.Test
    public void shouldCashbackHackTwoBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);

    }
}