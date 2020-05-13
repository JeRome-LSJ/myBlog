package com.github.jerome.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;
/**
 * @author JeRome
 * @date 2020-05-14 00:27
 * @description
 */
@Data
public class BaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Date created;
    private Date modified;

}
