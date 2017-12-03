package ni.cai.pang.service.impl;

import ni.cai.pang.controller.vo.ComboVO;
import ni.cai.pang.entity.Combo;
import ni.cai.pang.repo.ComboRepository;
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
public class ComboService implements IComboService {

    @Autowired
    private ComboRepository comboRepository;

    @Override
    public void save(ComboVO comboVO) {
        Combo combo = new Combo();
        combo.setName(comboVO.getName());
        combo.setFoods(comboVO.getFoods());
        comboRepository.save(combo);
    }
}
