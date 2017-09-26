package ni.cai.pang.service.impl;

import ni.cai.pang.mapper.UserMapper;
import ni.cai.pang.service.IUserService;
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
    private UserMapper userMapper;
}
