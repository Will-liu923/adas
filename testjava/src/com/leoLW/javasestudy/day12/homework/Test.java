package com.leoLW.javasestudy.day12.homework;

public class Test {

    public static void main(String[] args) {
        Bird bird = new RedBird();
        DanGong danGong = new DanGong();
        danGong.tanShe(bird);

        System.out.println("=========================");

        Instrument instrument = new Violin();
        Musician musician = new Musician();
        musician.play(instrument);

        System.out.println("=============================");

        //子类重写父类的getSalary方法，并计算工资
        Employee ele1 = new HourlyEmployee("张三",5,180,50);
        double salary = ele1.getSalary(5) + 160 * 50 + (180 - 160) * 50 * 1.5;
        System.out.println(ele1.getName() + "的工资是" + salary);

        Employee ele2 = new SalariedEmployee("李四",5,8000);
        SalariedEmployee salariedEmployee = (SalariedEmployee) ele2;
        salary = salariedEmployee.getMonthSalary() + ele2.getSalary(5);
        System.out.println(ele2.getName() + "的工资是" + salary);

        SalesEmployee ele3 = new SalesEmployee("王五",5,17000,0.5);
        salary = ele3.getSalary(5) + ele3.getMonthlySales()*ele3.getCommissionRate();
        System.out.println(ele3.getName() + "的工资是" + salary);

        BasePlusSalesEmployee ele4 = new BasePlusSalesEmployee("赵六",4,20000,0.4,3000);
        salary = ele4.getSalary(5) + ele4.getBaseSalary() + ele4.getCommissionRate() * ele4.getMonthlySales();
        System.out.println(ele4.getName() + "的工资是" + salary);
    }
}
