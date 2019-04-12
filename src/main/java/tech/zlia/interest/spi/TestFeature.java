package tech.zlia.interest.spi;
import java.util.ServiceLoader;

/**
 * spi标准的测试类
 * @version  2019-04-11
 * @author zlia
 */
public class TestFeature {

    public static void main(String[] args) {
        ServiceLoader<DemoService> sl = ServiceLoader.load(DemoService.class);
        for (DemoService ds : sl) {
            ds.test();
        }
    }
}
/* 结果展示

TestADemoService
TestBDemoService

 */
