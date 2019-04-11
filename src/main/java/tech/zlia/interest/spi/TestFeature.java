package tech.zlia.interest.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * spi标准的测试类
 * @version  2019-04-11
 * @author zlia
 */
public class TestFeature {

    public static void main(String[] args) {
        ServiceLoader<DemoService> sl = ServiceLoader.load(DemoService.class);
        Iterator<DemoService> iterator = sl.iterator();
        while (iterator.hasNext()){
            DemoService ds = iterator.next();
            ds.test();
        }
    }
}
