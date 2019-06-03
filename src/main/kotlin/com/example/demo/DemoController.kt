package com.example.demo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class DemoController {

  @GetMapping("/demo")
  fun demo(): String {
    return "<h1>demo</h1>"
  }

}
