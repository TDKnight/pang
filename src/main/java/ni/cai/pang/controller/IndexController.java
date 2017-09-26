package ni.cai.pang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @Author TDKnight
 * @Date 2017/9/14
 */
@Controller
public class IndexController extends BaseController{

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
