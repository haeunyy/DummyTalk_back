package com.example.DummyTalk.Chat.Channel.Dto;

import com.example.DummyTalk.User.DTO.ChatSenderDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@ToString
@Builder(toBuilder = true)
public class MessageHistoryDto {

    private Long chatId;
    private String message;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timestamp;
    private ChatSenderDTO sender;
    private String type;

    // Fields related to audio messages
    private String audioUrl; // URL of the audio file
    private int audioChatId; // Unique ID for the audio chat


}
