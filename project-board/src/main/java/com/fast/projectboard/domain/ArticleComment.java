package com.fast.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime moeifiedAt;
    private String modifiedBy;
}
