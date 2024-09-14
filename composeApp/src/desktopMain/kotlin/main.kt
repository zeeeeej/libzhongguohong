import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.zeeeeej.zhongguohong.color.ZhongGuoHong
import kotlinmultiplatformsample.composeapp.generated.resources.Res
import kotlinmultiplatformsample.composeapp.generated.resources.app_name
import org.jetbrains.compose.resources.stringResource

suspend fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = stringResource( Res.string.app_name),
    ) {
        App()
    }
}

actual val MyColor:Long
    get() = ZhongGuoHong