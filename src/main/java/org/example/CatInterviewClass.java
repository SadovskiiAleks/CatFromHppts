package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatInterviewClass {
    private final String id;

    private final String text;

    private final String type;

    private final String user;

    private final int upvotes;

    public CatInterviewClass(
            @JsonProperty("id")String id,
            @JsonProperty("text")String text,
            @JsonProperty("type")String type,
            @JsonProperty("user")String user,
            @JsonProperty("upvotes")int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public int getUpvotes(){
        return upvotes;
    }

    @Override
    public String toString(){
        return "Пользователь: " + user + ", с ником: " + type
                + ", утверждает, что:\n" + text +
                "\nЗа это проголосовало " + upvotes
                + " человек.\n" ;
    }
}
