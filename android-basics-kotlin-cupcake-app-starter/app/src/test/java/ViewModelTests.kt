import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.cupcake.model.OrderViewModel
import junit.framework.Assert.assertEquals
import org.junit.Rule
@get:Rule
var instantTaskExecutorRule = InstantTaskExecutorRule()

class ViewModelTests {

    fun quantity_twelve_cupcakes()
    {
        val viewModel = OrderViewModel()
        viewModel.quantity.observeForever {}
        viewModel.setQuantity(12)
    }
}