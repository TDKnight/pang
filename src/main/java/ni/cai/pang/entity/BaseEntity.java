package ni.cai.pang.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * 实体基类
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@JsonInclude(JsonInclude.Include.NON_NULL) // 不转换null值
public class BaseEntity implements Serializable{

    @Id
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
