package ni.cai.pang.util;

import ni.cai.pang.common.AjaxResult;

/**
 * 结果集
 *
 * @Author TDKnight
 * @Date 2017/12/3
 */
public class AjaxResultUtils {

    public static AjaxResult success() {
        return new AjaxResult(0, "success", null);
    }

    public static AjaxResult success(String msg) {
        return new AjaxResult(0, msg, null);
    }

    public static AjaxResult success(Object data) {
        return new AjaxResult(0, "success", data);
    }

    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(0, msg, data);
    }

    public static AjaxResult error() {
        return new AjaxResult(-1, "error", null);
    }

    public static AjaxResult error(String msg) {
        return new AjaxResult(-1, msg, null);
    }

}
