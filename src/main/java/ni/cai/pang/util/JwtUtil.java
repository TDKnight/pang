package ni.cai.pang.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import ni.cai.pang.constant.JwtConstant;
import ni.cai.pang.entity.User;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;

public class JwtUtil {

    /**
     * 生成密钥
     * @return
     */
    private static SecretKey generalKey(){
        byte[] encodedKey = Base64.getEncoder()
                .encode(JwtConstant.SECRET.getBytes(StandardCharsets.UTF_8));
        SecretKey key = new SecretKeySpec(encodedKey,0, encodedKey.length,"AES");
        return key;
    }

    /**
     * 生成jwt
     * @param user
     * @return
     */
    public static String createJWT(User user){
        String subject = generalSubject(user);
        JwtBuilder builder = Jwts.builder();
        SecretKey key = generalKey();
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        builder.setIssuedAt(now)
                .setSubject(subject)
                .signWith(SignatureAlgorithm.HS512, key);
        return builder.compact();
    }


    /**
     * 解密jwt
     * @param jwt
     * @return
     * @throws Exception
     */
    public static Claims parseJWT(String jwt) throws Exception{
        SecretKey key = generalKey();
        Claims claims = Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jwt).getBody();
        return claims;
    }


    /**
     * 生成subject信息
     * @param user
     * @return
     */
    private static String generalSubject(User user){
        ObjectMapper objectMapper = new ObjectMapper();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("user_id", user.getId());
        map.put("user_nickname", user.getNickname());
        try {
            return objectMapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
