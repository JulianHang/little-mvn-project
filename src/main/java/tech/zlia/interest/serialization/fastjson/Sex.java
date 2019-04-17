package tech.zlia.interest.serialization.fastjson;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * 定义枚举类
 * 枚举作为对象被序列化
 * @version 2019-04-17
 * @author zlia
 */
@JSONType(serializeEnumAsJavaBean = true)
public enum Sex{

    /**
     * 对象
     */
    NONE(Constants.ZERO,Constants.NONE), MAN(Constants.ONE,Constants.MAN), WOMAN(Constants.TWO,Constants.WOMAN);

    /**
     * 编号
     */
    private final String code;

    /**
     * 描述
     */
    private final String des;

    /**
     * 初始化参数
     * @param code 编号
     * @param des 描述
     */
    Sex(String code, String des) {
        this.code = code;
        this.des = des;
    }

    /**
     * 获取编号
     * @return 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取描述
     * @return 描述
     */
    public String getDes() {
        return des;
    }

    /**
     * 根据编号获取实现对象
     * @param code 编号
     * @return 实体对象
     */
    public static Sex toCode(String code) {
        switch (code){
            case Constants.ZERO :
                return NONE;
            case Constants.ONE :
                return MAN;
            case Constants.TWO:
                return WOMAN;
            default:
                return null;
        }
    }

    @Override
    public String toString(){
        return "{\"code\":" + "\"" + code + "\"" + ",\"des\":" + "\"" +des + "\"" +"}";
    }
}
