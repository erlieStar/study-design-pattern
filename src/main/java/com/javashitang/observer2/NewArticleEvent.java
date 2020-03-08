package com.javashitang.observer2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NewArticleEvent {

    private String authorName;
    private String articleName;
}
