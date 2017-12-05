package ni.cai.pang.common;

import org.springframework.stereotype.Component;

/**
 * 响应类
 *
 * @Author TDKnight
 * @Date 2017/12/3
 */
public class AjaxResult {

    private int code;

    private String msg;

    private Object data;

    public AjaxResult(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
