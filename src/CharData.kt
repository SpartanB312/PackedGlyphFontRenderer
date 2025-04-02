package net.spartanb312.ain.font

class CharData(
    val width: Int,
    val height: Int,
    val renderWidth: Int
) {
    var u = 0f
    var v = 0f
    var u1 = 0f
    var v1 = 1f
    var layer = 0

    @Override
    override fun toString(): String {
        return "CharData(width=$width, height=$height, layer=$layer, u=$u, v=$v, u1=$u1, v1=$v1)"
    }
}