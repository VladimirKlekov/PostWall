package ru.netology.servis.attachment.pollAttachment

object BackgroundPollAttachment {
    private val id: Int = 1 //идентификатор фона
    private val type: String = "тип фона. Возможные значения: gradient, tile."
    private val angle: Int = 1 //гол градиента по оси X.
    private val color: String = "HEX-код замещающего цвета (без #)."
    private val width: Int = 200 //(для type = tile) ширина плитки паттерна.
    private val height: Int = 200 //(для type = tile) высота плитки паттерна.
    private var images = emptyArray<ImagesBackgroundPollAttachment>()
    private var points = emptyArray<PointsBackgroundPollAttachment>()


}
//background object Фон сниппета опроса. Объект, который содержит поля:
//• id (integer) — идентификатор фона.
//• type (string) — тип фона. Возможные значения: gradient, tile.
//• angle (integer) — (для type = gradient) угол градиента по оси X.
//• color (string) — HEX-код замещающего цвета (без #).
//• width (integer) — (для type = tile) ширина плитки паттерна.
//• height (integer) — (для type = tile) высота плитки паттерна.
//• images (array) — (для type = tile) изображение плитки паттерна. Массив объектов .
//• points (array) — (для type = gradient) точки градиента. Массив объектов, каждый
//из которых содержит поля position (number) — положение точки — и color (string) — HEX-код цвета точки.