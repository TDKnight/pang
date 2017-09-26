package ni.cai.pang.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 餐厅实体
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Table(name = "t_restaurant")
public class Restaurant extends BaseEntity{

    @Column
    private String name;

    @Column
    private String desc;

    @Column
    private String address;

    @Column
    private String phone;

    @Column
    @JsonIgnore
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
