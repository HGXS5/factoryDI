package cn.example.ssh.demo.testcar;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
    private static Map<String, Car> cars = new HashMap<String,Car>();

    static {
        cars.put("audi", new Car(3000, "我是静态工厂的品牌"));
        cars.put("fodo", new Car(3000, "fodo"));
    }

    //静态工厂方法
    public static Car getCar(String name) {
        return cars.get(name);
    }

}