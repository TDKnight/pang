package ni.cai.pang.service.impl;

import ni.cai.pang.mapper.ComboMapper;
import ni.cai.pang.service.IComboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 套餐业务
 *
 * @Author TDKnight
 * @Date 2017/9/26
 */
@Service
public class ComboService implements IComboService{

    @Autowired
    private ComboMapper comboMapper;
}
