import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.cupcake.model.OrderViewModel
import junit.framework.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

@get:Rule
var instantTaskExecutorRule = InstantTaskExecutorRule()

class ViewModelTests {

    @Test
    fun price_twelve_cupcakes(){
        val viewModel = OrderViewModel()
        viewModel.setQuantity(12)
    }
}