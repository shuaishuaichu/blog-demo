package com.chushuai.service;

import com.chushuai.po.Comment;

import java.util.List;

/**
 *author:chushuai
 *date:2021.2.13
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
