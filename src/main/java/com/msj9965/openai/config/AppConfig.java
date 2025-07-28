package com.msj9965.openai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	// ChatClient<----openAPI Key---->LLM
	@Bean
	public ChatClient chatClient(ChatClient.Builder chatClientBuilder) {
		// ChatClient를 생성하고 반환하는 메서드
		return chatClientBuilder.build();

	}
}
