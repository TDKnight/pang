package ni.cai.pang.service;

import ni.cai.pang.controller.vo.UserVO;
import ni.cai.pang.entity.User;

public interface IUserService {

    void register(UserVO userVO);

    String login(UserVO userVO);
}
