package com.example.busschedule.viewmodels

import androidx.lifecycle.ViewModel
import com.example.busschedule.database.schedule.ScheduleDAO

class BusScheduleViewModel(private val scheduleDao: ScheduleDAO): ViewModel() {
}