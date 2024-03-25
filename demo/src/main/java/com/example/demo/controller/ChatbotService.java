package com.example.demo.controller;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    public String getResponse(String message) {
        // 사용자의 입력 메시지에 따라 적절한 응답을 반환하는 로직을 작성합니다.
        String response;
        if (message.contains("안녕")) {
            response = "안녕!";
        } else if (message.contains("날씨")) {
            response = "오늘은 맑은 날씨입니다.";
        } else if (message.contains("이름")) {
            response = "내 이름은 허혀누(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧  ";
        } else if (message.contains("어디")) {
            response = "나는 분당에 살고 있어!";
        } else if (message.contains("몇 살")) {
            response = "25살인데 만으로 23살이야";
        } else if (message.contains("취미")) {
            response = "나는 뮤지컬을 조아행~~(*≧ω≦*)";
        } else if (message.contains("음식")) {
            response = "떡보끼랑 타코야끼!°˖✧◝(⁰▿⁰)◜✧˖°";
        } else if (message.contains("이상형")) {
            response = "키가 크고 운동하는 사람이 좋아!";
        } else {
            response = "미안해ㅠㅠ 내가 제대로 이해하지 못했어ㅠㅠ";
        }
        return response;
    }
}
