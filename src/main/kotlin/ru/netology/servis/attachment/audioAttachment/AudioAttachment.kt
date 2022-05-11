package ru.netology.servis.attachment.audioAttachment

import ru.netology.servis.Attachment

class AudioAttachment(): Attachment("audio") {

    private val idAudio: Int = 1 //Идентификатор аудиозаписи.
    private val ownerId: Int = 1 //Идентификатор владельца аудиозаписи.
    private val artist: String = "Исполнитель."
    private val title: String = "Название композиции."
    private val duration: Int = 10 // Длительность аудиозаписи в секундах.
    private val urlAudio: String = "www.Ссылка на mp3"
    private val lyrics: Int = 1 // Идентификатор текста аудиозаписи (если доступно).
    private val albumId: Int = 1 //Идентификатор альбома, в котором находится аудиозапись (если присвоен).
    private val genreId: Int = 1 //Идентификатор жанра из списка аудио жанров.
    private val date: Int = 1 //Дата добавления.
    private val noSearch: Int =
        1 // 1, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    private val isHq: Int = 1 // 1, если аудио в высоком качестве.
}
//Аудиозапись
//
//Объект, описывающий аудиозапись, содержит следующие поля:
//id integer Идентификатор аудиозаписи.
//owner_id integer Идентификатор владельца аудиозаписи.
//artist string Исполнитель.
//title string Название композиции.
//duration integer Длительность аудиозаписи в секундах.
//url string Ссылка на mp3.
//lyrics_id integer Идентификатор текста аудиозаписи (если доступно).
//album_id integer Идентификатор альбома, в котором находится аудиозапись (если присвоен).
//genre_id integer Идентификатор жанра из списка аудио жанров.
//date integer Дата добавления.
//no_search integer 1, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
//is_hq integer 1, если аудио в высоком качестве.