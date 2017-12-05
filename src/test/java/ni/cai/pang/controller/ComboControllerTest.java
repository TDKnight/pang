package ni.cai.pang.controller;

import ni.cai.pang.controller.vo.ComboVO;
import ni.cai.pang.entity.Food;
import ni.cai.pang.repo.FoodRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author TDKnight
 * @Date 2017/12/3
 */

public class ComboControllerTest extends BaseControllerTest{

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private FoodRepository foodRepository;

    private String jwt;

    @Before
    public void login() {
    }

    @Test
    public void addComboTest() {
        Food food = new Food();
        food.setName("a");
        Food food1 = new Food();
        food1.setName("b");
        foodRepository.save(Arrays.asList(food, food1));
        ComboVO comboVO = new ComboVO();
        comboVO.setName("c");
        comboVO.setFoods(Arrays.asList(food, food1));
        try {
            mockMvc.perform(
                    MockMvcRequestBuilders.post("/combo/save")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .content(toJson(comboVO))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void findComboById(){
        String id = "5a26b71f17c7951ef42ee7aa";
        try {
            String result = mockMvc.perform(MockMvcRequestBuilders.get("/combo/" + id))
                    .andExpect(status().isOk())
                    .andReturn().getResponse().getContentAsString();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
