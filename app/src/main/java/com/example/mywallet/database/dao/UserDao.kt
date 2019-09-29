package com.example.mywallet.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mywallet.database.entities.UserEntity

@Dao
interface UserDao{
    @Insert
    fun create(user: UserEntity)

    @Query("SELECT * FROM user")
    fun getALl():List<UserEntity>

    @Query("SELECT * FROM user WHERE id = :id")
    fun get(id:Int):UserEntity
}