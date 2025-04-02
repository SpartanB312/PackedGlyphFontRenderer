package net.spartanb312.ain.font

import net.spartanb312.ain.utils.emptyColorArray
import net.spartanb312.gmath.color.ColorRGBA

interface FontRenderer {

    // properties
    val generalScale: Float

    fun reset()

    fun getHeight(scale: Float = 1f): Float

    fun getWidth(char: Char, scale: Float = 1f): Float

    fun getWidth(text: String = "", scale: Float = 1f): Float

    fun rawWidth(text: String = "", scale: Float = 1f): Float

    fun drawString(
        text: String,
        x: Float,
        y: Float,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
        gradient: Boolean = false,
        colors: Array<ColorRGBA> = emptyColorArray,
        sliceMode: Boolean = true,
        shadow: Boolean = false,
    )

    // float overloads
    fun drawString(
        text: String,
        x: Float,
        y: Float,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
    ) = drawString(text, x, y, color, scale, false, emptyColorArray, true)

    fun drawCenteredString(
        text: String,
        x: Float,
        y: Float,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
    ) {
        val startX = x + getWidth(text, scale) * 0.5f
        val startY = y + getHeight(scale) * 0.5f
        drawString(text, startX, startY, color, scale)
    }

    fun drawStringWithShadow(
        text: String,
        x: Float,
        y: Float,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
        shadowDepth: Float = 1f
    ) {
        val offset = shadowDepth * scale
        drawString(text, x + offset, y + offset, color, scale, shadow = true)
        drawString(text, x, y, color, scale)
    }

    fun drawCenteredStringWithShadow(
        text: String,
        x: Float,
        y: Float,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
        shadowDepth: Float = 1f
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, color, scale, shadow = true)
        drawString(text, startX, startY, color, scale)
    }

    fun drawGradientString(
        text: String,
        x: Float,
        y: Float,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) = drawString(text, x, y, colors[0], scale, true, colors, false)


    fun drawGradientStringWithShadow(
        text: String,
        x: Float,
        y: Float,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val offset = shadowDepth * scale
        drawString(text, x + offset, y + offset, colors[0], scale, shadow = true)
        drawString(text, x, y, colors[0], scale, true, colors, false)
    }

    fun drawCenteredGradientString(
        text: String,
        x: Float,
        y: Float,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        drawString(text, startX, startY, colors[0], scale, true, colors, false)
    }

    fun drawCenteredGradientStringWithShadow(
        text: String,
        x: Float,
        y: Float,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, colors[0], scale, shadow = true)
        drawString(text, startX, startY, colors[0], scale, true, colors, false)
    }

    fun drawSlicedString(
        text: String,
        x: Float,
        y: Float,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) = drawString(text, x, y, colors[0], scale, true, colors, true)


    fun drawSlicedStringWithShadow(
        text: String,
        x: Float,
        y: Float,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val offset = shadowDepth * scale
        drawString(text, x + offset, y + offset, colors[0], scale, shadow = true)
        drawString(text, x, y, colors[0], scale, true, colors, true)
    }

    fun drawCenteredSlicedString(
        text: String,
        x: Float,
        y: Float,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        drawString(text, startX, startY, colors[0], scale, true, colors, true)
    }

    fun drawCenteredSlicedStringWithShadow(
        text: String,
        x: Float,
        y: Float,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, colors[0], scale, shadow = true)
        drawString(text, startX, startY, colors[0], scale, true, colors, true)
    }

    // int overloads
    fun drawString(
        text: String,
        x: Int,
        y: Int,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
    ) = drawString(text, x.toFloat(), y.toFloat(), color, scale, false, emptyColorArray, true)

    fun drawCenteredString(
        text: String,
        x: Int,
        y: Int,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
    ) {
        val startX = x + getWidth(text, scale) * 0.5f
        val startY = y + getHeight(scale) * 0.5f
        drawString(text, startX, startY, color, scale)
    }

    fun drawStringWithShadow(
        text: String,
        x: Int,
        y: Int,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
        shadowDepth: Float = 1f
    ) {
        val offset = shadowDepth * scale
        drawString(text, x + offset, y + offset, color, scale, shadow = true)
        drawString(text, x, y, color, scale)
    }

    fun drawCenteredStringWithShadow(
        text: String,
        x: Int,
        y: Int,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
        shadowDepth: Float = 1f
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, color, scale, shadow = true)
        drawString(text, startX, startY, color, scale)
    }

    fun drawGradientString(
        text: String,
        x: Int,
        y: Int,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) = drawString(text, x.toFloat(), y.toFloat(), colors[0], scale, true, colors, false)


    fun drawGradientStringWithShadow(
        text: String,
        x: Int,
        y: Int,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val offset = shadowDepth * scale
        drawString(text, x + offset, y + offset, colors[0], scale, shadow = true)
        drawString(text, x.toFloat(), y.toFloat(), colors[0], scale, true, colors, false)
    }

    fun drawCenteredGradientString(
        text: String,
        x: Int,
        y: Int,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        drawString(text, startX, startY, colors[0], scale, true, colors, false)
    }

    fun drawCenteredGradientStringWithShadow(
        text: String,
        x: Int,
        y: Int,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, colors[0], scale, shadow = true)
        drawString(text, startX, startY, colors[0], scale, true, colors, false)
    }

    fun drawSlicedString(
        text: String,
        x: Int,
        y: Int,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) = drawString(text, x.toFloat(), y.toFloat(), colors[0], scale, true, colors, true)


    fun drawSlicedStringWithShadow(
        text: String,
        x: Int,
        y: Int,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val offset = shadowDepth * scale
        drawString(text, x + offset, y + offset, colors[0], scale, shadow = true)
        drawString(text, x.toFloat(), y.toFloat(), colors[0], scale, true, colors, true)
    }

    fun drawCenteredSlicedString(
        text: String,
        x: Int,
        y: Int,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        drawString(text, startX, startY, colors[0], scale, true, colors, true)
    }

    fun drawCenteredSlicedStringWithShadow(
        text: String,
        x: Int,
        y: Int,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, colors[0], scale, shadow = true)
        drawString(text, startX, startY, colors[0], scale, true, colors, true)
    }

    // double overloads
    fun drawString(
        text: String,
        x: Double,
        y: Double,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
    ) = drawString(text, x.toFloat(), y.toFloat(), color, scale, false, emptyColorArray, true)

    fun drawCenteredString(
        text: String,
        x: Double,
        y: Double,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
    ) {
        val startX = x + getWidth(text, scale) * 0.5f
        val startY = y + getHeight(scale) * 0.5f
        drawString(text, startX, startY, color, scale)
    }

    fun drawStringWithShadow(
        text: String,
        x: Double,
        y: Double,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
        shadowDepth: Float = 1f
    ) {
        val offset = shadowDepth * scale
        drawString(text, x.toFloat() + offset, y.toFloat() + offset, color, scale, shadow = true)
        drawString(text, x, y, color, scale)
    }

    fun drawCenteredStringWithShadow(
        text: String,
        x: Double,
        y: Double,
        color: ColorRGBA = ColorRGBA.WHITE,
        scale: Float = 1f,
        shadowDepth: Float = 1f
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, color, scale, shadow = true)
        drawString(text, startX, startY, color, scale)
    }

    fun drawGradientString(
        text: String,
        x: Double,
        y: Double,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) = drawString(text, x.toFloat(), y.toFloat(), colors[0], scale, true, colors, false)


    fun drawGradientStringWithShadow(
        text: String,
        x: Double,
        y: Double,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val offset = shadowDepth * scale
        drawString(text, x.toFloat() + offset, y.toFloat() + offset, colors[0], scale, shadow = true)
        drawString(text, x.toFloat(), y.toFloat(), colors[0], scale, true, colors, false)
    }

    fun drawCenteredGradientString(
        text: String,
        x: Double,
        y: Double,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        drawString(text, startX, startY, colors[0], scale, true, colors, false)
    }

    fun drawCenteredGradientStringWithShadow(
        text: String,
        x: Double,
        y: Double,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, colors[0], scale, shadow = true)
        drawString(text, startX, startY, colors[0], scale, true, colors, false)
    }

    fun drawSlicedString(
        text: String,
        x: Double,
        y: Double,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) = drawString(text, x.toFloat(), y.toFloat(), colors[0], scale, true, colors, true)


    fun drawSlicedStringWithShadow(
        text: String,
        x: Double,
        y: Double,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val offset = shadowDepth * scale
        drawString(text, x.toFloat() + offset, y.toFloat() + offset, colors[0], scale, shadow = true)
        drawString(text, x.toFloat(), y.toFloat(), colors[0], scale, true, colors, true)
    }

    fun drawCenteredSlicedString(
        text: String,
        x: Double,
        y: Double,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        drawString(text, startX, startY, colors[0], scale, true, colors, true)
    }

    fun drawCenteredSlicedStringWithShadow(
        text: String,
        x: Double,
        y: Double,
        colors: Array<ColorRGBA>,
        scale: Float = 1f,
        shadowDepth: Float = 1f,
    ) {
        val startX = getWidth(text, scale) * 0.5f
        val startY = getHeight(scale) * 0.5f
        val offset = shadowDepth * scale
        drawString(text, startX + offset, startY + offset, colors[0], scale, shadow = true)
        drawString(text, startX, startY, colors[0], scale, true, colors, true)
    }

}