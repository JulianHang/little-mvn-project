package tech.zlia.interest.serialization.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import java.lang.reflect.Type;

/**
 * 自定义反序列化实现类
 * ObjectDeserializer是自定义反序列化的接口
 * @version 2019-04-17
 * @author  zlia
 */
public class TypeDeserializer implements ObjectDeserializer {

    /**
     * 定义常量
     */
    private static final String CODE = "code";

    /**
     * 反序列化
     * @param parse 默认的解析器
     * @param type 自定义反序列化的对象类型  在此例子中是tech.zlia.interest.serialization.fastjson.Sex
     * @param o 自定义反序列化的属性值 在此例子中是sex
     * @param <T>
     * @return 实体对象，在此例子中是Sex
     */
    @Override
    public <T> T deserialze(DefaultJSONParser parse, Type type, Object o) {
        JSONObject object = parse.parseObject();
        String code = object.getString(CODE);
        return (T)Sex.toCode(code);
    }

    /**
     * 暂未用到
     * @return
     */
    @Override
    public int getFastMatchToken() {
        return 0;
    }
}
