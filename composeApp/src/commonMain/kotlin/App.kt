import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import com.zeeeeej.zhongguohong.color.Cheng
import com.zeeeeej.zhongguohong.color.Dian
import com.zeeeeej.zhongguohong.color.Hong
import com.zeeeeej.zhongguohong.color.Huang
import com.zeeeeej.zhongguohong.color.Lan
import com.zeeeeej.zhongguohong.color.Lv
import com.zeeeeej.zhongguohong.color.Zi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import libzhongguohong.composeapp.generated.resources.Res
import libzhongguohong.composeapp.generated.resources.compose_multiplatform
import libzhongguohong.composeapp.generated.resources.hello
import libzhongguohong.composeapp.generated.resources.ic_launcher
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.stringResource
import yunext.kotlin.util.invoke
import yunext.kotlin.util.myScope2
import yunext.kotlin.util.toDateStr
import yunext.kotlin.util.toDateStr1


@OptIn(ExperimentalResourceApi::class, InternalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
//                val color = MyColor
                var color by remember { mutableStateOf(Color(colors.random().toInt())) }
                val animateIntAsState by animateColorAsState(color,
                    animationSpec = tween(durationMillis = 2000)){

                }


                var colorBG by remember { mutableStateOf(Color(colors.random().toInt())) }
                val animateIntAsStateBG by animateColorAsState(colorBG,
                    animationSpec = tween(durationMillis = 3000)){

                }

                LaunchedEffect(Unit){
                    launch {
                        while (isActive){
                            delay(5000)
                            color = Color(colors.random().toInt())

                        }
                    }

                    launch {
                        while (isActive){
                            delay(3000)
                            colorBG = Color(colors.random().toInt())

                        }
                    }

                }

                Column(Modifier.fillMaxWidth().background(animateIntAsStateBG), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Image(painterResource(Res.drawable.ic_launcher), null)
                    Text("Compose: $greeting", color =  animateIntAsState)
                }
            }
            Text(stringResource(Res.string.hello))
        }
    }
}

val colors = listOf(Hong, Cheng, Huang, Lv, Lan, Dian, Zi)
expect val MyColor:Long