package ni.cai.pang.common.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtConstant {

    public static String SECRET;

    public static String getSECRET() {
        return SECRET;
    }

    public static void setSECRET(String SECRET) {
        JwtConstant.SECRET = SECRET;
    }
}
