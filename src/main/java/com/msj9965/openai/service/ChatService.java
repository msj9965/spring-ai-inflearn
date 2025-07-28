package com.msj9965.openai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatService {
	private final ChatClient chatClient;

	public String chat(String message) {
		return chatClient.prompt()//프롬프트 생성
			.user(message)//사용자 메세지
			.call()// AI 모델 호출
			.content(); // 요청정보를 받는 부분
	}
}
