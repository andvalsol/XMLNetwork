package dx.queen.networkandmap.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "TestExample", strict = false)
data class TestExampleData @JvmOverloads constructor(
    @field:Element(name = "Message", required = false)
    @param:Element(name = "Message", required = false)
    val message: String? = null,

    @field:Element(name = "GPS", required = false)
    @param:Element(name = "GPS", required = false)
    val gps: String? = null
)