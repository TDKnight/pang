package ni.cai.pang.service;

import ni.cai.pang.entity.User;

public interface IUserService {

    int register(User user);

    String login(User user);
}
