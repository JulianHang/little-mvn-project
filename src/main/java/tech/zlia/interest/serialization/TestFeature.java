package tech.zlia.interest.serialization;

import com.alibaba.fastjson.JSON;
import tech.zlia.interest.serialization.fastjson.Sex;
import tech.zlia.interest.serialization.fastjson.Student;

/**
 * 序列化测试类
 * @version 2019-04-16
 * @author zlia
 */
public class TestFeature {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1L);
        student.setName("zlia");
        student.setSex(Sex.MAN);

        //序列化对象成json字符串
        String serializerStr = JSON.toJSONString(student);
        System.out.format("student serializer: %s", serializerStr);

        System.out.println();

        //自定义反序列化json字符串成对象
        Student deserializerStu = JSON.parseObject(serializerStr, Student.class);
        System.out.format("student deserializer: %s", deserializerStu);
    }
}
/* 结果展示

student serializer: {"id":1,"name":"zlia","sex":{"code":"1","des":"男"}}
student deserializer: {"id":1,"name":"zlia","sex":{"code":"1","des":"男"}}

 */
