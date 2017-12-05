package ni.cai.pang.entity;


import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 用户实体
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Document(collection="user")
public class User extends BaseEntity {

    private String username;

    private String nickname;

    private String password;

    private String restaurantId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
