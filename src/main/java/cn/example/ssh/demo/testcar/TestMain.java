package cn.example.ssh.demo.testcar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext cx=new ClassPathXmlApplicationContext("test.xml");
        Car car1 = (Car) cx.getBean("car1");
        System.out.println(car1);
        Car car2 = (Car) cx.getBean("car2");
        System.out.println(car2);
    }
}
