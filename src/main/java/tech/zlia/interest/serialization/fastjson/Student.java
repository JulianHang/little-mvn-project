package tech.zlia.interest.serialization.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * 实体类，采用fastJson序列化该对象
 * 该对象中包含枚举类,fastJson可以序列化成功，但是默认的反序列化会报错，故只能自定义反序列化的实现类
 * 反序列化时必须要有默认的构造函数
 * @version  2019-04-17
 * @author  zlia
 */
public class Student implements Serializable {

    /**
     * 唯一标识
     */
    private static final long serialVersionUID = 3083987595140340233L;

    /**
     * id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     * 枚举类，自定义反序列化实现类
     */
    @JSONField(deserializeUsing = TypeDeserializer.class)
    private Sex sex;

    /**
     * 获取id
     * @return id值
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id值
     * @param id id值
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取姓名
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别类
     * @return 性别类
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * 设置性别类
     * @param sex 性别类
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Student student = new Student();//必须是空的构造函数才可以自定义序列化
        student.setName("name");
        student.setId(1L);
        student.setSex(Sex.MAN);
//        System.out.println(JSON.toJSON(student).toString());
//        System.out.println(JSON.toJSONString(student));
        String str = JSON.toJSONString(student);
//        String str1 = "{\"id\":1,\"name\":\"name\",\"sex\":\"MAN\"}";
        Student stu1 = JSON.parseObject(str,Student.class);
        System.out.println(stu1);
//        System.out.println(stu1.sex.getCode());
//        System.out.println(stu1.sex.getDes());
//        System.out.println(JSON.toJSONString(stu1));
//        String str2 = "{\"id\":1,\"name\":\"name\",\"sex\":{\"code\":\"1\",\"des\":\"男\"}}";
//        JSON.parseObject(str2, Student.class);
    }

    @Override
    public String toString(){
        return "{\"id\":" + id + ",\"name\":" + "\"" + name + "\"" + ",\"sex\":" + sex + "}";
    }

}


