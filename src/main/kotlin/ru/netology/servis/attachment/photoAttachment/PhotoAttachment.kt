package ru.netology.servis.attachment.photoAttachment

import ru.netology.servis.attachment.photoAttachment.SizesCopyImage

//Объект, описывающий фотографию, содержит следующие поля:
class PhotoAttachment {


        private val id: Int = 1 //Идентификатор фотографии
        private val albumId: Int = 1 //Идентификатор альбома, в котором находится фотография.
        private val ownerId: Int = 1 //Идентификатор владельца фотографии.
        private val userId: Int = 1 //Идентификатор альбома, в котором находится фотография.
        private val text: String = "Текст описания фотографии"
        private val date: Int = (System.currentTimeMillis()/1000).toInt()//Дата добавления в формате Unixtime.
        private var sizes = emptyArray<SizesCopyImage>()


    }
//Фотография
//
//Объект, описывающий фотографию, содержит следующие поля:
//id integer - Идентификатор фотографии.
//album_id integer - Идентификатор альбома, в котором находится фотография.
//owner_id integer - Идентификатор владельца фотографии.
//user_id integer - Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе).
// Для фотографий, размещенных от имени сообщества, user_id = 100.
//text string - Текст описания фотографии.
//date integer - Дата добавления в формате Unixtime.
//sizes array - Массив с копиями изображения в разных размерах. Каждый объект массива содержит следующие поля:
//type (string) — тип копии. См. Формат описания размеров фотографии.
//url (string) — URL копии.
//width (integer) — высота в px.
//height (integer) — ширина в px.
//width * integer - Ширина оригинала фотографии в пикселах.
//height * integer - Высота оригинала фотографии в пикселах.

