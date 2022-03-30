package com.example.busschedule.viewmodels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.busschedule.database.schedule.Schedule
import com.example.busschedule.database.schedule.ScheduleDAO
import kotlinx.coroutines.flow.Flow

class BusScheduleViewModel(private val scheduleDAO: ScheduleDAO): ViewModel() {

    fun fullSchedule(): Flow<List<Schedule>> = scheduleDAO.getAll()

    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDAO.getByStopName(name)
}

class BusScheduleViewModelFactory(
    private val scheduleDao: ScheduleDAO
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BusScheduleViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return BusScheduleViewModel(scheduleDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}