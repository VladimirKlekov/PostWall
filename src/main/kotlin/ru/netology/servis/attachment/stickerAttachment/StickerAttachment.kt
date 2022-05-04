package ru.netology.servis.attachment.stickerAttachment

import ru.netology.servis.attachment.photoAttachment.SizesCopyImage

class StickerAttachment {

    private val id: Int = 1 //Идентификатор набора
    private val stickerId: Int = 1 // Идентификатор стикера.
    private val title: String = "Название подборки."
    private var images = emptyArray<ImagesStickerAttachment>()
    private var imagesWithBackground = emptyArray<ImageWithBackgroundStickerAttachment>()
    private val animationUrl: String = "URL анимации стикера."
    private val isAllowed: Boolean = true//Информация о том, доступен ли стикер.




}
//Стикер
//
//Объект, описывающий стикер, содержит следующие поля (с версии 5.74):
//
//
//product_id integer Идентификатор набора.
//sticker_id integer Идентификатор стикера.
//images array Изображения для стикера (с прозрачным фоном). Массив, каждый объект в котором содержит поля:
//• url (string) — URL копии изображения;
//• width (integer) — ширина копии в px;
//• height (integer) — высота копии в px.
//images_with_background array  Изображения для стикера (с непрозрачным фоном). Массив, каждый объект в котором содержит поля:
//• url (string) — URL копии изображения;
//• width (integer) — ширина копии в px;
//• height (integer) — высота копии в px.
//animation_url string URL анимации стикера.
//is_allowed boolean Информация о том, доступен ли стикер.