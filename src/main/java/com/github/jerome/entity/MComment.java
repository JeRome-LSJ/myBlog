package com.github.jerome.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author JeRome
 * @date 2020-05-14 00:27
 * @description
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class MComment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 评论的内容
     */
    private String content;

    /**
     * 回复的评论ID
     */
    private Long parentId;

    /**
     * 评论的内容ID
     */
    private Long postId;

    /**
     * 评论的用户ID
     */
    private Long userId;

    /**
     * “顶”的数量
     */
    private Integer voteUp;

    /**
     * “踩”的数量
     */
    private Integer voteDown;

    /**
     * 置顶等级
     */
    private Integer level;


}
