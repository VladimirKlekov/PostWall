//package ru.netology.servis.attachment.albumAttachment
//
//import ru.netology.servis.Attachment
//
//class AlbumAttachment(): Attachment("album") {
//
//    private val id: Int = 1 //идентификатор альбома
//    private val thumb: ThumbAlbumAttachment = ThumbAlbumAttachment //обложка альбома, объект photo.
//    private val ownerId: Int = 1 //идентификатор владельца альбома
//    private val title: String = "название альбома."
//    private val description: String = "описание альбома."
//    private val created: Int = (System.currentTimeMillis() / 1000).toInt()//дата создания альбома в формате Unixtime.
//    private val updated: Int =
//        (System.currentTimeMillis() / 1000).toInt()//дата последнего обновления альбома в формате Unixtime.
//    private val size: Int = 1 //количество фотографий в альбоме.
//
//
//}
////Альбом с фотографиями (type=album)
////id     integer идентификатор альбома.
////thumb object обложка альбома, объект photo.
////owner_id integer идентификатор владельца альбома.
////title string название альбома.
////description string описание альбома.
////created integer дата создания альбома в формате Unixtime.
////updated integer дата последнего обновления альбома в формате Unixtime.
////size integer количество фотографий в альбоме.