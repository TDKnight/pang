package ni.cai.pang.controller;

import ni.cai.pang.common.AjaxResult;
import ni.cai.pang.controller.vo.ComboVO;
import ni.cai.pang.service.IComboService;
import ni.cai.pang.util.AjaxResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 套餐控制层
 *
 * @Author TDKnight
 * @Date 2017/12/3
 */
@RestController
@RequestMapping("/combo")
public class ComboController {

    @Autowired
    private IComboService comboService;

    @PostMapping("/save")
    public AjaxResult save(@RequestBody ComboVO comboVO) {
        comboService.save(comboVO);
        return AjaxResultUtils.success();
    }

}
