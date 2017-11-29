package ni.cai.pang.service.impl;

import ni.cai.pang.entity.User;
import ni.cai.pang.mapper.UserMapper;
import ni.cai.pang.service.IUserService;
import ni.cai.pang.util.JwtUtil;
import ni.cai.pang.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;


/**
 * 用户业务
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        Example example = new Example(User.class);
        example.createCriteria()
                .andEqualTo("username", user.getUsername());
        int count = userMapper.selectCountByExample(example);
        if (count > 0) {
            return -1;
        } else {
            user.setPassword(MD5Util.getPwd(user.getPassword()));
            return userMapper.insert(user);
        }
    }

    @Override
    public String login(User user) {
        Example example = new Example(User.class);
        example.createCriteria()
                .andEqualTo("username", user.getUsername())
                .andEqualTo("password", MD5Util.getPwd(user.getPassword()));
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() == 1) {
            return JwtUtil.createJWT(userList.get(0));
        }
        return null;
    }
}
