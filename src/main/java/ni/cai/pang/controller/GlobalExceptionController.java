package ni.cai.pang.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理
 *
 * @Author TDKnight
 * @Date 2017/12/3
 */
@ControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(Exception.class)
    public String index(Exception ex) {
        System.out.println(ex.getMessage());
        return null;
    }
}
