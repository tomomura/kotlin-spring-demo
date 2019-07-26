package com.example.demo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import com.example.demo.application.comment.CommentApplicationService
import com.example.demo.domain.model.comment.Comment

@RestController
@RequestMapping("comments")
class CommentController(private val commentApplicationService: CommentApplicationService) {

  @RequestMapping(method = [RequestMethod.GET])
  fun create(): List<Comment> {
    var comments = commentApplicationService.findAll()
    var comment = Comment(1, "aaaa")

    commentApplicationService.save(comment)


    return comments
  }

}
