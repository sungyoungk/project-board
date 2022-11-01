package com.fast.projectboard.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime moeifiedAt;
    private String modifiedBy;
}
