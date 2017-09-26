package ni.cai.pang.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 实体基类
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
public class BaseEntity implements Serializable{

    @Id
    @Column(name = "id")
    @JsonIgnore
    @GeneratedValue(generator = "UUID")
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
