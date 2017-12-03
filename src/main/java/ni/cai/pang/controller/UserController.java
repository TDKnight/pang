package ni.cai.pang.controller;

import ni.cai.pang.controller.vo.UserVO;
import ni.cai.pang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户控制层
 *
 * @Author TDKnight
 * @Date 2017/12/3
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "/register")
    public UserVO register(@RequestBody UserVO userVO, HttpServletRequest request){
        userService.register(userVO);
        return userVO;
    }

    @PostMapping(value = "/login")
    public String login(@RequestBody UserVO userVO) {
        String jwt = userService.login(userVO);
        return "";
    }


}
