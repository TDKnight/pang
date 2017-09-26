package ni.cai.pang.service.impl;

import ni.cai.pang.mapper.ComboDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 套餐详情业务
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Service
public class ComboDetailService implements ComboDetailMapper{

    @Autowired
    private ComboDetailMapper comboDetailMapper;
}
