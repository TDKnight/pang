package ni.cai.pang.service.impl;

import ni.cai.pang.controller.vo.UserVO;
import ni.cai.pang.entity.User;
import ni.cai.pang.repo.UserRepository;
import ni.cai.pang.service.IUserService;
import ni.cai.pang.util.JwtUtils;
import ni.cai.pang.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户业务
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(UserVO userVO) {
        User user = new User();
        user.setUsername(userVO.getUsername());
        user.setNickname(userVO.getUsername());
        user.setPassword(MD5Utils.getPwd(userVO.getPassword()));
        userRepository.save(user);
    }

    @Override
    public String login(UserVO userVO) {
        String username = userVO.getUsername();
        User user = userRepository.findByUsername(username);
        if (user != null) {
            String password = userVO.getPassword();
            return user.getPassword().equals(MD5Utils.getPwd(password)) ? JwtUtils.createJWT(user) : "";
        }
        return "";
    }
}
