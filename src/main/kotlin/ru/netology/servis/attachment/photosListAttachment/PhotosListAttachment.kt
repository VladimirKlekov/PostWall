package ru.netology.servis.attachment.photosListAttachment

import ru.netology.servis.Attachment

class PhotosListAttachment(photosList: String): Attachment(photosList) {

}

//Список фотографий (type=photos_list)
//Массив из строк, содержащих идентификаторы фотографий. Сами фотографии дублируются в виде
//приложенных объектов фотографий, однако этот список необходим в случае, если фотографий
//использовано больше максимального количества возвращаемых вложений (10).
