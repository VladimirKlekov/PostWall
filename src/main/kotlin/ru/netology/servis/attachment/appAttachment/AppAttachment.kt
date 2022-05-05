package ru.netology.servis.attachment.appAttachment

import ru.netology.servis.Attachment

class AppAttachment(app: String): Attachment(app) {
    private val idApp: Int = 1 //идентификатор приложения.
    private val ownerId: Int = 1 //идентификатор приложения.
    private val photo130: String = "URL изображения для предпросмотра."
    private val photo604: String = "URL полноразмерного изображения."


}
//Это устаревший тип вложений. Он может быть возвращен лишь для записей, созданных раньше 2013 года.
//id  integer идентификатор приложения.
//name string название приложения.
//photo_130 string URL изображения для предпросмотра.
//photo_604 string URL полноразмерного изображения.