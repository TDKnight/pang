package ni.cai.pang.common;

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
}
