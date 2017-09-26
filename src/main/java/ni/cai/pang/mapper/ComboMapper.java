package ni.cai.pang.mapper;
import ni.cai.pang.entity.Combo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ComboMapper {


    @Select("SELECT * " +
            "FROM t_combo " +
            "WHERE id = #{id}")
    @ResultMap("ComboWithFood")
    Combo getComboById(@Param("id") String id);
}
