//package ru.netology.servis.attachment.pollAttachment
//
//import ru.netology.servis.Attachment
//
//
//class PollAttachment(): Attachment("poll") {
//
//    private val id: Int = 1 //Идентификатор опроса для получения информации.
//    private val ownerId: Int = 1 //Идентификатор владельца опроса.
//    private val created: Int = (System.currentTimeMillis() / 1000).toInt()//Дата создания в формате Unixtime.
//    private val question: String = "Текст вопроса."
//    private val votes: Int = 1 //Количество голосов
//    private var answers = emptyArray<AnswerPollAttachment>()
//    private val anonymous: Boolean = true//Является ли опрос анонимным
//    private val multiple: Boolean = true//Допускает ли опрос выбор нескольких вариантов ответа.
//    private var answerIds =
//        emptyArray<AnswerIdPollAttachment>() //Идентификаторы вариантов ответа, выбранных текущим пользователем.
//    private val endDate: Int =
//        (System.currentTimeMillis() / 1000).toInt()//Дата завершения опроса в Unixtime. 0, если опрос бессрочный.
//    private val closed: Boolean = true//Является ли опрос завершенным
//    private val isBoard: Boolean = true//Прикреплён ли опрос к обсуждению
//    private val canEdit: Boolean = true//Можно ли отредактировать опрос.
//    private val canVote: Boolean = true//Можно ли проголосовать в опросе.
//    private val canReport: Boolean = true//Можно ли пожаловаться на опрос
//    private val canShare: Boolean = true//Можно ли поделиться опросом.
//    private val authorId: Int = 1 //Идентификатор автора опроса
//    private val photo: PhotoPollAttachment = PhotoPollAttachment //Идентификатор автора опроса
//    private val background: BackgroundPollAttachment =
//        BackgroundPollAttachment //Фон сниппета опроса. Объект, который содержит поля:
//    private var friends = emptyArray<FriendsPollAttachment>() //Идентификаторы 3 друзей, которые проголосовали в опросе.
////
//
//}
//id integer Идентификатор опроса для получения информации о нем через метод polls.getById.
//owner_id integer Идентификатор владельца опроса.
//created integer Дата создания в формате Unixtime.
//question string Текст вопроса.
//votes integer Количество голосов.
//answers arrayМассив объектов, которые содержат информацию о вариантах ответа. Каждый объект содержит следующие поля:
//• id (integer) — идентификатор ответа;
//• text (string) — текст ответа;
//• votes (integer) — число проголосовавших за этот ответ;
//• rate (number) — рейтинг ответа.
//anonymous boolean Является ли опрос анонимным.
//multiple boolean Допускает ли опрос выбор нескольких вариантов ответа.
//answer_ids array Идентификаторы вариантов ответа, выбранных текущим пользователем.
//end_date integer Дата завершения опроса в Unixtime. 0, если опрос бессрочный.
//closed boolean Является ли опрос завершенным.
//is_board boolean Прикреплён ли опрос к обсуждению.
//can_edit boolean Можно ли отредактировать опрос.
//can_vote boolean Можно ли проголосовать в опросе.
//can_report boolean Можно ли пожаловаться на опрос.
//can_share boolean Можно ли поделиться опросом.
//author_id integer Идентификатор автора опроса.
//photo object Фотография — фон сниппета опроса. Объект фотографии.
//background object Фон сниппета опроса. Объект, который содержит поля:
//• id (integer) — идентификатор фона.
//• type (string) — тип фона. Возможные значения: gradient, tile.
//• angle (integer) — (для type = gradient) угол градиента по оси X.
//• color (string) — HEX-код замещающего цвета (без #).
//• width (integer) — (для type = tile) ширина плитки паттерна.
//• height (integer) — (для type = tile) высота плитки паттерна.
//• images (array) — (для type = tile) изображение плитки паттерна. Массив объектов .
//• points (array) — (для type = gradient) точки градиента. Массив объектов, каждый из которых содержит поля position (number) — положение точки — и color (string) — HEX-код цвета точки.
//friends array Идентификаторы 3 друзей, которые проголосовали в опросе.