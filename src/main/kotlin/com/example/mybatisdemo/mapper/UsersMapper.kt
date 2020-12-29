package com.example.mybatisdemo.mapper

import com.example.mybatisdemo.model.UsersModel
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UsersMapper {
    fun find(): List<UsersModel>
}