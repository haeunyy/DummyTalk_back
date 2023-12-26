package com.example.DummyTalk.Chat.Channel.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SendChatDto {
    private Long chatId;
    private String message;
    private int sender;
    private String nickname;
    private String profileImage;
    private int channelId;
    private LocalDateTime timeStamp;
    private String type;
    private List<SendChatDto> chatList;

    /* 오디오 저장 */
    private String language;
    private String audioUrl;
    private int audioChatId;

}