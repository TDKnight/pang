package ni.cai.pang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户实体
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Table(name = "t_user")
public class User extends BaseEntity{

    @Column
    private String username;

    @Column
    private String nickname;

    @Column
    private String password;

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
}
