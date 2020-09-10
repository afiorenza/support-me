import java.io.FileInputStream
import java.util.*

class Env {
    private final var properties : Properties

    init {
        val path : String = "default.properties"
        val propertiesStream : FileInputStream = FileInputStream(path)

        properties = Properties();
        properties.load(propertiesStream)
    }

    fun get(key: String): String {
        return properties[key].toString()
    }
}