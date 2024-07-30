package com.atguigu.exer4;

public class TestCard {
    public static void main(String[] args) {
        DepositCard d = new DepositCard();
        d.setId("1111111");
        d.save(2000);
        System.out.println("存了2000时，账户情况" + d.getInfo());

        d.withdraw(500);
        System.out.println("取了500时，账户情况" + d.getInfo());

        d.save(-2000);
        System.out.println("存了-2000时，账户情况" + d.getInfo());

        d.withdraw(-500);
        System.out.println("取了-500时，账户情况" + d.getInfo());

        d.withdraw(5000);
        System.out.println("取了5000时，账户情况" + d.getInfo());

        System.out.println("----------------------------");
        CreditCard c = new CreditCard();
        c.setId("22222222");
        c.setTotalOverdraft(2000);
        c.withdraw(1000);
        System.out.println("取1000后，账户情况：" + c.getInfo());

        c.save(500);
        System.out.println("存500后，账户情况：" + c.getInfo());

        c.save(2000);
        System.out.println("存2000后，账户情况：" + c.getInfo());

        c.withdraw(5000);
        System.out.println("取5000后，账户情况：" + c.getInfo());

    }
}
