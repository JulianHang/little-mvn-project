package tech.zlia.interest.spi.impl;

import tech.zlia.interest.spi.DemoService;

/**
 * spi接口标准实现
 * @version  2019-04-11
 * @author  zlia
 */
public class TestADemoService implements DemoService {

    /**
     * spi接口标准方法实现
     */
    @Override
    public void test() {
        System.out.println(TestADemoService.class.getSimpleName());
    }
}
