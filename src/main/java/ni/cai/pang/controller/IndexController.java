package ni.cai.pang.controller;

import ni.cai.pang.entity.User;
import ni.cai.pang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @Author TDKnight
 * @Date 2017/9/14
 */
@RestController
public class IndexController extends BaseController{

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(User user) {
        int result = userService.register(user);
        if (result == -1) {

        } else if (result == 1){

        } else {

        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(User user) {
        String jwt = userService.login(user);

    }

}
