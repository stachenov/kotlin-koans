package v_builders

import util.TODO
import java.util.*

fun todoTask37(): Nothing = TODO(
    """
        Task 37.
        Uncomment the commented code and make it compile.
        Add and implement function 'buildMap' with one parameter (of type extension function) creating a new HashMap,
        building it and returning it as a result.
    """
)

fun task37(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

fun buildMap(builder: MutableMap<Int, String>.() -> Unit): Map<Int, String> {
    val result = HashMap<Int, String>()
    result.builder()
    return result
}
