package ni.cai.pang.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 食物实体
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Table(name = "t_food")
public class Food extends BaseEntity{

    @Column
    private String name;

    @Column
    private Double price;

    @Column(name = "img_url")
    private String imgUrl;

    @Column
    private int stock;

    @JsonIgnore
    @Column(name = "restaurant_id")
    private String restaurantId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
