package tech.zlia.interest.spi;

import java.lang.annotation.*;

/**
 * 定义每个实现类的优先级
 * 在实现类上加上@Spi(order=1)的方式定义级别
 * 该类是从mpush消息服务框架上拷贝而来
 * @version 2019-04-14
 * @author zlia
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Spi {

    /**
     * SPI name
     * @return name
     */
    String value() default "";

    /**
     * 排序顺序
     * @return sortNo
     */
    int order() default 0;

}
