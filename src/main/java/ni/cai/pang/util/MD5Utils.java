package ni.cai.pang.util;

import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MD5Utils {

    public static String getPwd(String password) {
        if (StringUtils.hasText(password)) {
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                byte[] base64_bytes = Base64.getEncoder().encode(password.getBytes(StandardCharsets.UTF_8));
                byte[] md5_bytes = md5.digest(base64_bytes);
                return new String(Base64.getEncoder().encode(md5_bytes), StandardCharsets.UTF_8);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
