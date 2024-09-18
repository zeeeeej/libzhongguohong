import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toIntRect
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

private object Defaults {
    val Default_End_Color = Color.White
    val ItemShape = RoundedCornerShape(12.dp)
    val ItemShape_RGB = RoundedCornerShape(4.dp)
    val ItemShape_Color = Color.White.copy(alpha = .1f)
    const val START_ANIMATE_DURATION_MILLIS = 2000
    const val END_ANIMATE_DURATION_MILLIS = 3000
}


@Composable
fun ZhongGuoHong(modifier: Modifier = Modifier) {
    val gridState = rememberLazyGridState()
    val coroutineScope = rememberCoroutineScope()
    val list by remember {
        mutableStateOf(zhongGuoSeList)
    }
    var current: 中国色 by remember { mutableStateOf(ZhongGuoSe.大红) }
    var endBG by remember { mutableStateOf(Color.White) }
    val startBGAnimate by animateColorAsState(
        current.color,
        animationSpec = tween(durationMillis = Defaults.START_ANIMATE_DURATION_MILLIS)
    ) {
        endBG = it
    }

    val endBGAnimate by animateColorAsState(
        endBG,
        animationSpec = tween(durationMillis = Defaults.END_ANIMATE_DURATION_MILLIS)
    )

    val location = { scope: CoroutineScope ->
        scope.launch {
            // gridState.animateScrollToItem(current.ordinal) // 卡顿
            gridState.scrollToItem(
                current.ordinal,
            )
        }
    }

    Column(
        modifier
            .drawBehind {
                drawRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            endBGAnimate,
                            startBGAnimate,
//                            endBGAnimate
                        )
                    )
                )
            }
    )
    {

        Current(current) {
            location(coroutineScope)
        }

        LaunchedEffect(Unit) {
            current = randomZhongGuoSe()
            endBG = Defaults.Default_End_Color
        }

        ZhongGuoSeList(gridState, list) {
            current = it
            endBG = Defaults.Default_End_Color
        }
    }
}

@Composable
private fun ZhongGuoSeList(
    gridState: LazyGridState,
    list: List<中国色>,
    onChanged: (中国色) -> Unit,
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(3),
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
                onChanged.invoke(it)
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

    Box(Modifier.fillMaxWidth().aspectRatio(1f)
        .clip(CircleShape), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .clickable { onClick() }
                    .padding(4.dp)

                ,
                text = color.text, style = TextStyle.Default.copy(
                    color = Color.White, fontSize = 32.sp, fontWeight = FontWeight.ExtraBold
                )
            )
            Text(
                color.pinyin, style = TextStyle.Default.copy(
                    color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Light
                ), modifier = Modifier.padding(0.dp)
            )
            Spacer(Modifier.height(16.dp))
            Text(
                "0x${color.colorInHex}", style = TextStyle.Default.copy(
                    color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Light
                )
            )
            Spacer(Modifier.height(4.dp))
            Row(Modifier
                .clip(Defaults.ItemShape_RGB)
                .drawBehind {
                    drawRect(Defaults.ItemShape_Color)
                }
                .padding(4.dp), horizontalArrangement = Arrangement.SpaceAround) {
                RGB(Modifier, RGB.R, color.color.red)
                RGB(Modifier, RGB.G, color.color.green)
                RGB(Modifier, RGB.B, color.color.blue)
            }
        }
    }
}


@Composable
fun ZhongGuoseItem(item: 中国色, onClick: () -> Unit) {
    Column(
        Modifier.aspectRatio(1f).shadow(4.dp, Defaults.ItemShape).clip(Defaults.ItemShape)
            .background(Color.White)
            .border(2.dp, Color.Black, Defaults.ItemShape)
            .clickable { onClick() }) {
        Text(
            item.text, style = TextStyle.Default.copy(
                color = item.color, fontSize = 18.sp, fontWeight = FontWeight.Bold
            ), modifier = Modifier.padding(start = 12.dp, top = 12.dp)
        )
        Text(
            item.pinyin, style = TextStyle.Default.copy(
                color = item.color, fontSize = 11.sp, fontWeight = FontWeight.Light
            ), modifier = Modifier.padding(start = 12.dp, top = 0.dp)
        )
        Spacer(Modifier.height(4.dp))
        ColorCard(modifier = Modifier.fillMaxWidth().weight(1f).heightIn(24.dp), color = item.color)
        Spacer(Modifier.height(4.dp))
        Text(
            item.colorInHex, style = TextStyle.Default.copy(
                color = item.color, fontSize = 14.sp, fontWeight = FontWeight.Light
            ), modifier = Modifier.padding(start = 12.dp, bottom = 12.dp)
        )
        Spacer(Modifier.height(4.dp))
    }

}

@Composable
private fun ColorCard(modifier: Modifier, color: Color) {

    Column(modifier = modifier.drawBehind {
        drawRect(color)
    }.padding(start = 12.dp), verticalArrangement = Arrangement.SpaceAround) {
//        val cmykColor by remember(color) {
//            mutableStateOf(color.toCMYK())
//        }
//        Row() {
//            CMYKItem(Modifier, CMYK.C, cmykColor.c)
//            CMYKItem(Modifier, CMYK.M, cmykColor.m)
//            CMYKItem(Modifier, CMYK.Y, cmykColor.y)
//            CMYKItem(Modifier, CMYK.K, cmykColor.k)
//
//        }
        Row(Modifier
            .width(84.dp)
            .clip(Defaults.ItemShape_RGB)
            .drawBehind {
                drawRect(Defaults.ItemShape_Color)
            }
            .padding(4.dp)) {
            RGB(Modifier, RGB.R, color.red)
            RGB(Modifier, RGB.G, color.green)
            RGB(Modifier, RGB.B, color.blue)
        }
    }


}

@Composable
private fun CMYKItem(modifier: Modifier, cmyk: CMYK, ratio: Float) {
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            cmyk.name, style = TextStyle.Default.copy(
                color = cmyk.color, fontSize = 9.sp, fontWeight = FontWeight.Light
            ), modifier = Modifier.padding(end = 4.dp)
        )
        Text(
            "${(ratio * 100).toInt()}", style = TextStyle.Default.copy(
                color = cmyk.color, fontSize = 11.sp, fontWeight = FontWeight.Light
            ), modifier = Modifier.padding(end = 4.dp)
        )

    }
}

enum class RGB {
    R, G, B;
}

val RGB.color: Color
    get() = when (this) {
        RGB.R -> Color.Red
        RGB.G -> Color.Green
        RGB.B -> Color.Black
    }

enum class CMYK {
    C, M, Y, K;
}

val CMYK.color: Color
    get() = when (this) {
        CMYK.C -> Color.Cyan
        CMYK.M -> Color.Magenta
        CMYK.Y -> Color.Yellow
        CMYK.K -> Color.DarkGray
    }

// K = 1 - max(R/255, G/255, B/255)
//C = (1 - R/255 - K) / (1 - K)
//M = (1 - G/255 - K) / (1 - K)
//Y = (1 - B/255 - K) / (1 - K)

data class CMYKColor(val c: Float, val m: Float, val y: Float, val k: Float)

fun Color.toCMYK(): CMYKColor {
    val rf = this.red
    val gf = this.green
    val bf = this.blue

    val k = 1f - maxOf(rf, gf, bf)
    if (k == 1f) {
        return CMYKColor(c = 0f, m = 0f, y = 0f, k = k)
    }
    val c = (1f - rf - k) / (1f - k)
    val m = (1f - gf - k) / (1f - k)
    val y = (1f - bf - k) / (1f - k)
    if (this.red == ZhongGuoSe.牡丹粉红.color.red) {
        println(
            """
        toCMYK
        $rf
        $gf
        $bf
        $k
        $c
        $m
        $y
        ----
    """.trimIndent()
        )
    }

    return CMYKColor(c = c, m = m, y = y, k = k)
}


@Composable
private fun RGB(modifier: Modifier, rgb: RGB, ratio: Float) {
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            rgb.name, style = TextStyle.Default.copy(
                color = rgb.color, fontSize = 11.sp, fontWeight = FontWeight.Light
            ), modifier = Modifier.padding(end = 4.dp)
        )
        Text(
            "${(255 * ratio).roundToInt()}", style = TextStyle.Default.copy(
                color = rgb.color, fontSize = 11.sp, fontWeight = FontWeight.Light
            ), modifier = Modifier.padding(end = 4.dp)
        )

    }

}