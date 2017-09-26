package ni.cai.pang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = {"ni.cai.pang.mapper"})
@SpringBootApplication
public class PangApplication {

	public static void main(String[] args) {
		SpringApplication.run(PangApplication.class, args);
	}
}
