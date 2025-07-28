package com.msj9965.openai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msj9965.openai.service.ChatService;

import lombok.RequiredArgsConstructor;

//클라이언트의 요청을 받아서 JSON 형식으로 응답하는 컨트롤러
@RestController
@RequiredArgsConstructor
public class ChatController {

	private final ChatService chatService;
	//LLM(gpt-4o)와 통신할 수 있는 객체: ChatClient

	@PostMapping("/chat")
	public String chat(@RequestBody String message) {

		return chatService.chat(message);
	}

	@PostMapping("/chat/add-system")
	public String addSystem(@RequestBody String message) {

		return chatService.chatSystem(message);
	}
}
