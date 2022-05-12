//package ru.netology.servis.attachment.eventAttachment
//
//import ru.netology.servis.Attachment
//
//
//class EventAttachment(): Attachment("event") {
//
//    private val id: Int = 1 //идентификатор встречи
//    private val time: Int = (System.currentTimeMillis() / 1000).toInt()//время начала встречи в Unixtime
//    private val memberStatus: Int = 1 //дёт ли текущий пользователь на встречу. Возможные значения:
//    private val isFavorite: Boolean = true//добавлена ли встреча в закладки.
//    private val address: String = "место проведения встречи."
//    private val text: String = "текст для отображения сниппета."
//    private val buttonText: String = "текст на кнопке сниппета."
//    private var  friends = emptyArray<FriendsEventAttachment>()
//
//
//
//}
////8. Встреча (type = event)
////id integer идентификатор встречи.
////time integer время начала встречи в Unixtime
////member_status integer идёт ли текущий пользователь на встречу. Возможные значения:
////1 -- точно идёт;
////2 -- возможно пойдёт;
////3 -- не идёт.
////is_favorite bool добавлена ли встреча в закладки.
////address (string) место проведения встречи.
////text (string) текст для отображения сниппета.
////button_text (string) текст на кнопке сниппета.
////friends (integer[]) список идентификаторов друзей, которые также идут на мероприятие.