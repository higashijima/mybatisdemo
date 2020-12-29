package com.example.mybatisdemo.service

import com.example.mybatisdemo.mapper.UsersMapper
import com.example.mybatisdemo.model.UsersModel
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UsersService(private val mapper: UsersMapper) {
    fun find(): List<UsersModel> = mapper.find()
}