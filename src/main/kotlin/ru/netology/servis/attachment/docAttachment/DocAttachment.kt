package ru.netology.servis.attachment.docAttachment

import ru.netology.servis.Attachment


class DocAttachment(): Attachment("doc") {

    private val idDoc: Int = 1 //Идентификатор файла.
    private val ownerId: Int = 1 //Идентификатор пользователя, загрузившего файл.
    private val title: String = "Название файла."
    private val size: Int = 1 //Размер файла в байтах.
    private val ext: String = "Расширение файла."
    private val urlDoc: String = "Адрес файла, по которому его можно загрузить."
    private val date: Int = (System.currentTimeMillis() / 1000).toInt()//Дата создания в формате Unixtime.
    private val typeDoc: Int = 1 //Тип файла.  Возможные значения:
    private val preview: Preview = Preview //Тип файла.  Возможные значения:

}
//Файл
//
//Объект, описывающий файл, содержит следующие поля:
//id integer  Идентификатор файла.
//owner_id integer Идентификатор пользователя, загрузившего файл.
//title string Название файла.
//size integer Размер файла в байтах.
//ext string Расширение файла.
//url string Адрес файла, по которому его можно загрузить.
//date integer Дата добавления в формате Unixtime.
//type integer Тип файла.  Возможные значения:
//• 1 — текстовые документы;
//• 2 — архивы;
//• 3 — gif;
//• 4 — изображения;
//• 5 — аудио;
//• 6 — видео;
//• 7 — электронные книги;
//• 8 — неизвестно.
//preview object Информация для предварительного просмотра файла. Может содержать следующие поля:
//• photo (object) — изображения для предпросмотра. Содержит единственное поле:
//• sizes (array) — массив копий изображения в разных размерах. Подробное описание структуры вы найдёте на этой странице.
//• graffiti (object) — данные о граффити. Содержит следующие поля:
//• src (string) — URL файла с граффити;
//• width (integer) — ширина изображения в px;
//• height (integer) — высота изображения в px.
//• audio_message — данные об аудиосообщении. Объект, который содержит следующие поля:
//• duration (integer) — длительность аудиосообщения в секундах;
//• waveform (array) — массив значений (integer) для визуального отображения звука;
//• link_ogg (string) — URL .ogg-файла;
//•link_mp3 (string) — URL .mp3-файла.