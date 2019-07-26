package com.example.demo.domain.model.comment

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import com.example.demo.domain.model.comment.Comment

@Repository
interface CommentRepository : JpaRepository<Comment, Long> {

}