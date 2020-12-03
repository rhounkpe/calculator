package be.digitcom.calculator;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

/**
 * Main Spring Application
 */
@SpringBootApplication
@EnableCaching
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Bean
	public /*ClientConfig*/Config  hazelcastClientConfig() {
		/*
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.getNetworkConfig().addAddress("localhost");
		return clientConfig;

		 */
		Config config = new Config();
		JoinConfig joinConfig = config.getNetworkConfig().getJoin();
		joinConfig.getMulticastConfig().setEnabled(false);
		joinConfig.getKubernetesConfig().setEnabled(true);
		return config;
	}

}
