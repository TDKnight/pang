package ni.cai.pang;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import ni.cai.pang.entity.User;
import ni.cai.pang.util.JwtUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.Key;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PangApplicationTests {

	@Autowired
	private JavaMailSender mailSender;


	@Test
	public void contextLoads() {
		// 发邮件
//		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//		simpleMailMessage.setFrom("412046232@qq.com");
//		simpleMailMessage.setTo("610437280@qq.com");
//		simpleMailMessage.setSubject("标题");
//		simpleMailMessage.setText("内容");
//		mailSender.send(simpleMailMessage);

		// jwt
//		Key key = MacProvider.generateKey();
//		String compactJws = Jwts.builder()
//				.setSubject("Joe")
//				.signWith(SignatureAlgorithm.HS256, key)
//				.compact();
//
//		System.out.print(key);
//		System.out.print(compactJws);
//		Jws<Claims> claimsJws = Jwts.parser().setSigningKey(key).parseClaimsJws(compactJws);
//		System.out.print(1);


		User user = new User();
		user.setId("5566");
		user.setNickname("TDKnight");
		user.setPassword("123456");
		String jwt = JwtUtil.createJWT(user);
		Claims claims = null;
		try {
			claims = JwtUtil.parseJWT(jwt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("create===" + jwt);
		System.out.println("parse===" + claims.getSubject());



	}

}
