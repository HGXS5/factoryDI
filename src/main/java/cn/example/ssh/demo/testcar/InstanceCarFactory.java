package cn.example.ssh.demo.testcar;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private Map<String ,Car> cars=null;
    public InstanceCarFactory() {
// TODO Auto-generated constructor stub
        cars=new HashMap<String, Car>();
        cars.put("audi", new Car(1000,"我是实例工厂的品牌"));
        cars.put("dffdas", new Car(2000,"dffdas"));
    }
    public Car getCar(String brand){
        return cars.get(brand);
    }
}
