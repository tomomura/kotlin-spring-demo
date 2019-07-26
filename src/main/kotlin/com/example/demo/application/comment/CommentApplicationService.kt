package com.example.demo.application.comment

import org.springframework.stereotype.Service
import com.example.demo.domain.model.comment.CommentRepository
import com.example.demo.domain.model.comment.Comment

@Service
class CommentApplicationService(private val commentRepository: CommentRepository) {

    fun findAll() = commentRepository.findAll()

    fun save(comment: Comment) = commentRepository.save(comment)

}