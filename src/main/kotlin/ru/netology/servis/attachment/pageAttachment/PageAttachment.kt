package ru.netology.servis.attachment.pageAttachment

import ru.netology.servis.Attachment

class PageAttachment(page: String): Attachment(page) {

    private val id: Int = 1 //Идентификатор вики-страницы
    private val groupId: Int = 1 //Идентификатор сообщества.
    private val creatorId: Int = 1 //Идентификатор создателя вики-страницы.
    private val title: String = "Название вики-страницы."
    private val currentUserCanEdit: Int =
        1 //если текущий пользователь может редактировать текст вики-страницы, иначе — 0.
    private val currentUserCanAccess: Int =
        1 //1, если текущий пользователь может изменять права доступа на вики-страницу, иначе — 0.
    private val whoCanView: Int = 1 //Информация о том, кто может просматривать вики-страницу:
    private val whoCanEdit: Int = 1 //Информация о том, кто может просматривать вики-страницу:
    private val edited: Int =
        (System.currentTimeMillis() / 1000).toInt()//Дата последнего изменения вики-страницы в формате Unixtime
    private val created: Int =
        (System.currentTimeMillis() / 1000).toInt()//Дата создания вики-страницы в формате Unixtime.
    private val editorId: Int = 1 //Идентификатор пользователя, который редактировал вики-страницу последним.
    private val views: Int = 1 //Количество просмотров вики-страницы.
    private val parent: String = "аголовок родительской страницы для навигации, если есть."
    private val parent2: String = "Заголовок второй родительской страницы для навигации, если есть."
    private val source: String = "Текст страницы в вики-формате, если был запрошен."
    private val html: String = "Текст страницы в html-формате, если был запрошен."
    private val viewUrl: String = "Адрес страницы для отображения вики-страницы."


}
//Вики-страница
//
//Объект, описывающий вики-страницу, содержит следующие поля:
//
//
//id  integer Идентификатор вики-страницы.
//group_id  integer     Идентификатор сообщества.
//creator_id integer Идентификатор создателя вики-страницы.
//title string Название вики-страницы.
//current_user_can_edit integer 1, если текущий пользователь может редактировать текст вики-страницы, иначе — 0.
//current_user_can_edit_access integer 1, если текущий пользователь может изменять права доступа на вики-страницу, иначе — 0.
//who_can_view integer Информация о том, кто может просматривать вики-страницу:
//• 2 — просматривать страницу могут все;
//• 1 — только участники сообщества;
//• 0 — только руководители сообщества.
//who_can_edit integer Указывает, кто может редактировать вики-страницу:
//•  2 — редактировать страницу могут все;
//• 1 — только участники сообщества;
//• 0 — только руководители сообщества.
//edited integer Дата последнего изменения вики-страницы в формате Unixtime.
//created integer Дата создания вики-страницы в формате Unixtime.
//editor_id integer Идентификатор пользователя, который редактировал вики-страницу последним.
//views integer Количество просмотров вики-страницы.
//parent string Заголовок родительской страницы для навигации, если есть.
//parent2 string Заголовок второй родительской страницы для навигации, если есть
//source string Текст страницы в вики-формате, если был запрошен.
//html string Текст страницы в html-формате, если был запрошен.
//view_url string Адрес страницы для отображения вики-страницы.