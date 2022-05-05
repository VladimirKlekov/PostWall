package ru.netology.servis.attachment.maketAlbumAttachment

import ru.netology.servis.Attachment

class MaketAlbumAttachment(marketAlbum: String): Attachment(marketAlbum) {

    private val id: Int = 1 //Идентификатор подборки
    private val ownerId: Int = 1 // Идентификатор владельца подборки
    private val title: String = "Название подборки."
    private val isMain: Boolean = true//Является ли подборка основной.
    private val isHidden: Boolean = true//Является ли подборка скрытой.
    private val  photo: PhotoMaketAlbumAttachment = PhotoMaketAlbumAttachment//подборки, объект, описывающий фотографию.
    private val count: Int = 1 //Число товаров в подборке.


}
//Подборка товаров
//
//Объект, описывающий подборку товаров, содержит следующие поля:
//
//
//id integer Идентификатор подборки.
//owner_id integer Идентификатор владельца подборки.
//title string Название подборки.
//is_main     boolean Является ли подборка основной.
//is_hidden boolean Является ли подборка скрытой.
//photo object Обложка подборки, объект, описывающий фотографию.
//count integer Число товаров в подборке.