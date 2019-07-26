package com.example.demo.domain.model.comment

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table

@Entity
@Table(name = "comments")
data class Comment (
    @Id
    @GeneratedValue
    var id : Int = 0,
    var content: String = String()
)