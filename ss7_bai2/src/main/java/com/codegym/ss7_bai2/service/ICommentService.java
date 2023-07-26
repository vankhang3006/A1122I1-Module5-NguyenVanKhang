package com.codegym.ss7_bai2.service;


import com.codegym.ss7_bai2.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICommentService extends IGeneralService<Comment>{
    Page<Comment> findAll(Pageable pageable);

    List<Comment> findAll();


    Comment saveOrUpdate(Comment comment);

    Comment findById(int id);
}