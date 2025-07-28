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
		// System 메시지를 기본값으로 설정
		return chatClientBuilder
			.defaultSystem("당신은 교육 튜터입니다. 개념을 명확하고 간단하게 설명하세요")
			.build();

	}
}
