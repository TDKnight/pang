package ni.cai.pang.controller;

import io.jsonwebtoken.lang.Assert;
import ni.cai.pang.common.AjaxResult;
import ni.cai.pang.controller.vo.ComboVO;
import ni.cai.pang.entity.Combo;
import ni.cai.pang.service.IComboService;
import ni.cai.pang.util.AjaxResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public AjaxResult combo(@PathVariable("id") String id) {
        Assert.notNull(id);
        AjaxResult ajaxResult = AjaxResultUtils.success(comboService.findById(id));
        return ajaxResult;
    }

}
