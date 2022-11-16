package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

import java.util.*
import java.util.Date

@Entity
data class Crime(@PrimaryKey var id: UUID = UUID.randomUUID(),
                        var title:String = "",
                        var date: Date = Date(),
                        var isSolved: Boolean? = null,
                        var requiresPolice:Boolean = false)
{

    constructor(id: UUID, title: String, date1: Date, isSolved:Boolean,requiresPolice1:Boolean):this(id){
        this.title = title
        date = date1
        this.id = id
     this.isSolved=isSolved
      requiresPolice = false
    }


    fun requiresPolice(): Boolean {
        return requiresPolice
    }
}