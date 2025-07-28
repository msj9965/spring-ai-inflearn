package com.msj9965.openai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class AppConfig {
	@Value("classpath:prompt.txt")
	private Resource resource;

	// ChatClient<----openAPI Key---->LLM
	@Bean
	public ChatClient chatClient(ChatClient.Builder chatClientBuilder) {
		// ChatClient를 생성하고 반환하는 메서드
		// System 메시지를 기본값으로 설정
		return chatClientBuilder
			.defaultSystem(resource)
			.build();

	}
}
