package ni.cai.pang.entity;


import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 套餐明细实体
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Table(name = "t_combo_detail")
public class ComboDetail extends BaseEntity{

    @Column(name = "combo_id")
    private String comboId;

    @Column(name = "food_id")
    private String foodId;

    public String getComboId() {
        return comboId;
    }

    public void setComboId(String comboId) {
        this.comboId = comboId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
}
