package ni.cai.pang.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

/**
 * 餐厅实体
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
public class Restaurant extends BaseEntity{

    private String name;

    private String desc;

    private String address;

    private String phone;

    private String imgUrl;

    @DBRef
    private User user;

    private List<Food> foods;

    private List<Combo> combos;

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Combo> getCombos() {
        return combos;
    }

    public void setCombos(List<Combo> combos) {
        this.combos = combos;
    }
}
