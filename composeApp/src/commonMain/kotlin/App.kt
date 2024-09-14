import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import libzhongguohong.composeapp.generated.resources.Res
import libzhongguohong.composeapp.generated.resources.compose_multiplatform
import libzhongguohong.composeapp.generated.resources.hello
import libzhongguohong.composeapp.generated.resources.ic_launcher
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview
fun App() {
    MaterialTheme {
        ZhongGuoHong(Modifier.fillMaxSize())
//        var showContent by remember { mutableStateOf(false) }

//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me!")
//            }
////            AnimatedVisibility(showContent) {
////                val greeting = remember { Greeting().greet() }
//////                val color = MyColor
////                var color by remember { mutableStateOf(Color(colors.random().toInt())) }
////                val animateIntAsState by animateColorAsState(
////                    color,
////                    animationSpec = tween(durationMillis = 2000)
////                ) {
////
////                }
////
////
////                var colorBG by remember { mutableStateOf(Color(colors.random().toInt())) }
////                val animateIntAsStateBG by animateColorAsState(
////                    colorBG,
////                    animationSpec = tween(durationMillis = 3000)
////                ) {
////
////                }
////
////                LaunchedEffect(Unit) {
////                    launch {
////                        while (isActive) {
////                            delay(5000)
////                            color = Color(colors.random().toInt())
////
////                        }
////                    }
////
////                    launch {
////                        while (isActive) {
////                            delay(3000)
////                            colorBG = Color(colors.random().toInt())
////
////                        }
////                    }
////
////                }
////
////                Column(
////                    Modifier.fillMaxWidth().background(animateIntAsStateBG),
////                    horizontalAlignment = Alignment.CenterHorizontally
////                ) {
////                    Image(painterResource(Res.drawable.compose_multiplatform), null)
////                    Image(painterResource(Res.drawable.ic_launcher), null)
////                    Text("Compose: $greeting", color = animateIntAsState)
////                }
////            }
//            Text(stringResource(Res.string.hello))
//            Box(Modifier.fillMaxSize()) {
//
//
//            }
//        }

    }
}


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ZhongGuoHong(modifier: Modifier = Modifier) {
    var current: 中国色 by remember { mutableStateOf(中国色.大红) }
    var old: 中国色? by remember { mutableStateOf(null) }
    val gridState = rememberLazyGridState()
    val coroutineScope = rememberCoroutineScope()
    val list by remember {
        mutableStateOf(中国色.entries.toTypedArray())
    }
    val lastBg by animateColorAsState(
        old?.color ?: Color.Black,
        animationSpec = tween(durationMillis = 3000)
    ) {

    }
    val windowInfo = LocalWindowInfo.current
    val location = { scope: CoroutineScope ->
        scope.launch {
            // gridState.animateScrollToItem(current.ordinal) // 卡顿
            gridState.scrollToItem(
                current.ordinal,
            )

        }
    }

    LaunchedEffect(Unit) {
        location(this)
    }

    Column(Modifier.background(lastBg)) {

        Current(current) {
            location(coroutineScope)
        }
        LazyHorizontalGrid(
            rows = GridCells.Adaptive(96.dp),
            modifier = Modifier.fillMaxSize(),
            state = gridState,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(list, {
                it.ordinal
            }) {
                ZhongGuoseItem(it) {
                    coroutineScope.launch {
                        if (current != it) {
                            old = current
                            current = it
                        }
                    }
                }
            }
        }
    }
}

val 中国色.color: Color
    get() = Color(this.value)

@OptIn(ExperimentalStdlibApi::class)
val 中国色.colorInHex: String
    get() = this.value.toInt().toHexString().uppercase()

@Composable
fun Current(color: 中国色, onClick: () -> Unit) {
    val lastColor by remember(color) {
        mutableStateOf(color.color)
    }
    val animateIntAsStateBG by animateColorAsState(
        lastColor,
        animationSpec = tween(durationMillis = 5000)
    ) {

    }
    Box(
        Modifier.fillMaxWidth().aspectRatio(1f)
            .clickable { onClick() }
            .drawBehind {
                drawRect(animateIntAsStateBG)
            }
            .clip(CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                color.text, style = TextStyle.Default.copy(
                    color = Color.White, fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            )
            Text(
                color.colorInHex, style = TextStyle.Default.copy(
                    color = Color.White, fontSize = 24.sp,
                    fontWeight = FontWeight.Light
                )
            )
        }
    }
}

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun ZhongGuoseItem(item: 中国色, onClick: () -> Unit) {
    Column(Modifier.aspectRatio(1f).background(Color.White)
        .clickable { onClick() }) {
        Text(
            item.text, style = TextStyle.Default.copy(
                color = item.color, fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            ), modifier = Modifier
        )
        Text(
            item.pinyin, style = TextStyle.Default.copy(
                color = item.color, fontSize = 11.sp,
                fontWeight = FontWeight.Light
            ), modifier = Modifier
        )
        Spacer(Modifier.height(4.dp))
        ColorCard(modifier = Modifier.fillMaxWidth().weight(1f).heightIn(24.dp), color = item.color)
        Spacer(Modifier.height(4.dp))
        Text(
            item.colorInHex, style = TextStyle.Default.copy(
                color = item.color, fontSize = 14.sp,
                fontWeight = FontWeight.Light
            ), modifier = Modifier
        )
        Spacer(Modifier.height(4.dp))
    }

}

@Composable
private fun ColorCard(modifier: Modifier, color: Color) {
    Spacer(
        modifier = modifier
            .drawBehind {
                drawRect(color)
            }
    )
}

@Composable
private fun CMYK(modifier: Modifier, ratio: Float) {
    Spacer(
        modifier = modifier.aspectRatio(1f)
            .drawBehind {
                drawOval(Color.Black)
                drawArc(Color.White, 0f, 360 * ratio, true)
            })
}