package com.github.jerome.controller;

import com.github.jerome.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JeRome
 * @date 2020-05-14 00:39
 * @description
 */
public class BaseController {

    @Autowired
    HttpServletRequest req;

    @Autowired
    PostService postService;

    @Autowired
    CommentService commentService;

    @Autowired
    UserService userService;

    @Autowired
    UserMessageService messageService;

    @Autowired
    UserCollectionService collectionService;

    @Autowired
    CategoryService categoryService;


}
