package ni.cai.pang.controller.vo;

import ni.cai.pang.entity.Food;
import ni.cai.pang.entity.Restaurant;

import java.util.List;

/**
 * 套餐接收
 *
 * @Author TDKnight
 * @Date 2017/12/3
 */
public class ComboVO {

    private String name;

    private Restaurant restaurant;

    private Double price;

    private String desc;

    private List<Food> foods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
