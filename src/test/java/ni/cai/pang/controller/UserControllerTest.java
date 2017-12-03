package ni.cai.pang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ni.cai.pang.controller.vo.UserVO;
import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 用户api测试
 *
 * @Author TDKnight
 * @Date 2017/12/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void registerTest(){
        UserVO userVO = new UserVO();
        userVO.setUsername("TDKnight");
        userVO.setPassword("123456");
        ObjectMapper mapper = new ObjectMapper();
        String jsonParam;
        try {
            jsonParam = mapper.writeValueAsString(userVO);
        } catch (JsonProcessingException e) {
            jsonParam = null;
        }
        try {
            mockMvc.perform(MockMvcRequestBuilders.post("/user/register").contentType(MediaType.APPLICATION_JSON_UTF8).content(jsonParam));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void loginTest(){
        UserVO userVO = new UserVO();
        userVO.setUsername("TDKnight");
        userVO.setPassword("123456");
        ObjectMapper mapper = new ObjectMapper();
        String jsonParam;
        try {
            jsonParam = mapper.writeValueAsString(userVO);
        } catch (JsonProcessingException e) {
            jsonParam = null;
        }
        try {
            mockMvc.perform(
                    MockMvcRequestBuilders.post("/user/login")
                            .contentType(MediaType.APPLICATION_JSON_UTF8)
                            .content(jsonParam)
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
