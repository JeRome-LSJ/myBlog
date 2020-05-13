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
public class UserCollection extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private Long postId;

    private Long postUserId;


}
