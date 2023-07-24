package bootcamp.cl.ejemplo.lenguajesmvvm.model

class LenguajeProvider {
    companion object {
        fun random(): LenguajeModel {
            val position = (0..10).random()
            return lenguajes[position]
        }

        private val lenguajes = listOf(
            LenguajeModel(
                descripcion = "Python es un lenguaje de programación ampliamente utilizado en las " +
                        "aplicaciones web, el desarrollo de software, la ciencia de datos " +
                        "y el machine learning (ML). Los desarrolladores utilizan Python porque es " +
                        "eficiente y fácil de aprender, además de que se puede ejecutar en muchas plataformas diferentes",
                nombre = "Phyton"
            ),
            LenguajeModel(
                descripcion = "Uno de los lenguajes de programación más antiguos y utilizados en la actualidad es C. " +
                        "Este histórico de la programación cumplió medio siglo el 2022.Su flexibilidad aporta una gran libertad " +
                        "al programador informático; sin embargo, dispone de una baja comprobación " +
                        "de incorrecciones, por lo que la responsabilidad del profesional es total.",
                nombre = "C"
            ),
            LenguajeModel(
                descripcion = "Desde su creación, C++ se ha convertido en uno de los lenguajes de programación " +
                        "más utilizados en el mundo. Los programas bien escritos de C++ son rápidos y eficaces. Este lenguaje es " +
                        "más flexible que otros: puede funcionar en los niveles más altos de abstracción o bajar al nivel del silicio." +
                        " C++ proporciona bibliotecas estándar altamente optimizadas.",
                nombre = "C++"
            ),
            LenguajeModel(
                descripcion = "C# (C Sharp), es una evolución que Microsoft realizó de este" +
                        " lenguaje, tomando lo mejor de los lenguajes C y C++, y ha continuado añadiéndole " +
                        "funcionalidades, tomando de otros lenguajes, como java, algo de su sintaxis evolucionada. " +
                        "Lo orientó a objetos para toda su plataforma NET. Es fácil de aprender , sin perder ni un ápice de la potencia original de C.",
                nombre = "C#"
            ),
            LenguajeModel(
                descripcion = " Es un lenguaje de programación ampliamente utilizado en la industria " +
                        "con millones de aplicaciones Java en uso en la actualidad. Java es un lenguaje" +
                        " multiplataforma, orientado a objetos y centrado en la red que se puede utilizar como una plataforma en sí mismo. " +
                        "Es un lenguaje de programación rápido, seguro y confiable para " +
                        "codificarlo todo, desde aplicaciones móviles y software empresarial hasta aplicaciones de macrodatos y tecnologías del servidor.",
                nombre = "JAVA"
            ),
            LenguajeModel(
                descripcion = " Es un lenguaje de programación de código abierto del lado del servidor " +
                        "que se utiliza principalmente para crear páginas web dinámicas.Otras áreas de implementación " +
                        "son la creación de aplicaciones de escritorio o la programación de líneas de comandos. " +
                        "A pesar de tener una sintaxis sencilla para principiantes, PHP ofrece una cantidad" +
                        " remarcable de funciones. Este lenguaje de programación se distingue por su " +
                        "amplio soporte a bases de datos, puede utilizarse en todo tipo de plataformas.",
                nombre = "PHP"
            ),
            LenguajeModel(
                descripcion = "Un lenguaje de programación dinámico y de código abierto enfocado en la simplicidad " +
                        " y productividad. Su elegante sintaxis se siente natural al leerla y fácil al escribirla.",
                nombre = "Ruby"
            ),
            LenguajeModel(
                descripcion = "Dart es un lenguaje open source desarrollado en Google con el objetivo " +
                        "de permitir a los desarrolladores utilizar un lenguaje orientado a objetos y " +
                        "con análisis estático de tipo.Dart se diseñó con el objetivo de hacer el proceso" +
                        " de desarrollo lo más cómodo y rápido posible para los desarrolladores. " +
                        "Por eso, viene con un conjunto bastante extenso de herramientas integrado.",
                nombre = "Dart"
            ),
            LenguajeModel(
                descripcion = "Javascript es un lenguaje poderoso, capaz de aportar soluciones eficaces " +
                        "en la mayoría de los ámbitos de la tecnología.Es especialmente importante porque " +
                        "es el único lenguaje de programación que entienden los navegadores, con el que se " +
                        "desarrolla la parte de la funcionalidad frontend en sitios web y aplicaciones web modernas. " +
                        "Pero también es fundamental en muchos otros tipos de desarrollos.",
                nombre = "Javascript"),
            LenguajeModel(
                descripcion = "Swift es un lenguaje de programación poderoso e intuitivo creado por Apple para desarrollar" +
                        " apps de iOS, Mac, Apple TV y Apple Watch. Está diseñado para brindar a los desarrolladores " +
                        "más libertad que nunca. Y como es fácil de usar y de código abierto, es ideal para que cualquier" +
                        " persona con una idea pueda hacerla realidad.",
                nombre = "Swift"
            ),
            LenguajeModel(
                descripcion = "Kotlin es un lenguaje de programación de código abierto creado por JetBrains " +
                        "que se ha popularizado gracias a que se puede utilizar para programar aplicaciones Android." +
                        "Este lenguaje es de tipado estático, ya que se puede desarrollar sobre JVM o JavaScript.",
                nombre = "Kotlin")
        )
    }
}