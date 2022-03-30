package com.example.busschedule.database

import androidx.room.RoomDatabase
import com.example.busschedule.database.schedule.ScheduleDAO

abstract class AppDatabase : RoomDatabase {
    abstract fun scheduleDao(): ScheduleDAO
    
}