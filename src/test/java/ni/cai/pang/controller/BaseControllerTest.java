package ni.cai.pang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author TDKnight
 * @Date 2017/12/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BaseControllerTest {

    ObjectMapper mapper = new ObjectMapper();

    public String toJson(Object object) {
        String jsonParam;
        try {
            jsonParam = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            jsonParam = null;
            e.printStackTrace();
        }
        return jsonParam;
    }
}
