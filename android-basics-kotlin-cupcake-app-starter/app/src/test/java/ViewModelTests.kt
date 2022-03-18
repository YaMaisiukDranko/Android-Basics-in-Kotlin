import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.cupcake.model.OrderViewModel
import junit.framework.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

@get:Rule
var instantTaskExecutorRule = InstantTaskExecutorRule()

class ViewModelTests {

    @Test
    fun quantity_twelve_cupcakes() //TEST FAILED 18.02.2022 23:13
    {
        val viewModel = OrderViewModel()
        viewModel.quantity.observeForever {}
        viewModel.setQuantity(12)
        assertEquals(12, viewModel.quantity.value)
    }
}