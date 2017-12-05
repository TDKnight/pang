package ni.cai.pang.service;

import ni.cai.pang.controller.vo.ComboVO;
import ni.cai.pang.entity.Combo;

public interface IComboService {

    void save(ComboVO comboVO);

    Combo findById(String id);
}
