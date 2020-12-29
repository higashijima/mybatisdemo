package com.example.mybatisdemo.controller

import com.example.mybatisdemo.service.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SampleController {
    @Autowired
    lateinit var service: UsersService

    @GetMapping("/")
    fun index(model: Model): String{
        val modelList = service.find()
        model.addAttribute("modelList", modelList)
        return "index"
    }
}