package ru.netology.servis.attachment.noteAttachment

class NoteAttachment {

    private val idNote: Int = 1 //Идентификатор заметки.
    private val ownerIdNote: Int = 1 //Идентификатор владельца заметки.
    private val title: String = "Заголовок заметки."
    private val text: String = "Текст заметки."
    private val date: Int = (System.currentTimeMillis() / 1000).toInt()//Дата создания заметки в формате Unixtime.
    private val comments: Int = 1 //Количество комментариев.
    private val readComments: Int =
        1 //Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
    private val viewUrl: String = "URL страницы для отображения заметки."
    private val privacyView: String = "Настройки приватности комментирования заметки."
    private val canComment: Int = 1 //Есть ли возможность оставлять комментарии.
    private val textWiki: String = "эги ссылок на wiki."

}
//Заметка
//
//Объект, описывающий заметку, содержит следующие поля:
//
//
//id  integer Идентификатор заметки.
//owner_id integer Идентификатор владельца заметки.
//title string Заголовок заметки.
//text string Текст заметки.
//date integer Дата создания заметки в формате Unixtime.
//comments integer Количество комментариев.
//read_comments integer Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
//view_url string URL страницы для отображения заметки.
//privacy_view string Настройки приватности комментирования заметки
//can_comment integer Есть ли возможность оставлять комментарии
//text_wiki string Тэги ссылок на wiki