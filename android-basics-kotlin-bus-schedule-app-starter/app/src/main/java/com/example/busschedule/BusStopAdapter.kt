import android.widget.ListAdapter
import com.example.busschedule.database.schedule.Schedule

class BusStopAdapter(private val onItemClicked: (Schedule) -> Unit) : ListAdapter<Schedule, BusStopAdapter.BusStopViewHolder>(DiffCallback) {
}