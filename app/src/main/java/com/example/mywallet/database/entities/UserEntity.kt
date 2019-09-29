package com.example.mywallet.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) var id: Int?=null,
    @ColumnInfo(name = "email") var email: String = "",
    @ColumnInfo(name = "password") var password: String ="",
    @ColumnInfo(name = "firstname") var firstName:String = "",
    @ColumnInfo(name = "lastname") var lastName:String = "",
    @ColumnInfo(name = "birth_at") var birthAt: Long = 0,
    @ColumnInfo(name = "create_at") var createAt: Long = 0
)