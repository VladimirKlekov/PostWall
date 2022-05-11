package ru.netology.post

import ru.netology.servis.*
import ru.netology.servis.DateTime.currentDataTime
import ru.netology.servis.geo.Geo
import ru.netology.servis.repostHistory.CopyHistory


const val ID_OWNER_WALL = 100 //Идентификатор владельца стены, на которой размещена запись
const val ID_AUTHOR_POST = 200 //Идентификатор автора записи (от чьего имени опубликована запись)
const val ID_ADMIN_POST = 300 //Идентификатор администратора, который опубликовал запись
const val REPLY_OWNER_ID = 400 //Идентификатор владельца записи, в ответ на которую была оставлена текущая.
const val REPLY_POST_ID = 500 //Идентификатор записи, в ответ на которую была оставлена текущая
const val SINGER_ID =
    600 //Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
const val IS_PINED = 1 // TODO потом адаптировать//Информация о том, что запись закреплена.


//Data класс Post.
data class Post(
    var idPost: Int = 0,
    val ownerId: Int = ID_OWNER_WALL,
    val fromId: Int = ID_AUTHOR_POST,
    val createdBy: Int = ID_ADMIN_POST,
    val date: String = currentDataTime,
    val text: String = textPost(),
    val replyOwnerId: Int = REPLY_OWNER_ID,
    val replyPostId: Int = REPLY_POST_ID,
    var friendsOnly: Int = friendsOnlyPost(),
    val comments: Comments = Comments,
    val copyright: Copyright = Copyright,
    var likes: Likes = Likes,
    val reposts: Reposts ?,
    var views: Views = Views,
    var postType: String = postTypePost(),
    var post_source: PostSource = PostSource,
    var attachments: Array<Attachment> = emptyArray<Attachment>(), //Медиавложения записи (фотографии, ссылки и т.п.). Описание массива attachments
    var geo: Geo = Geo, //Информация о местоположении , содержит поля:
    val signerId: Int = SINGER_ID,
    var copyHistory: CopyHistory = CopyHistory, ////copyHistory: Array, // Массив, содержащий историю репостов для записи.
    val canPin: Boolean = canPinPost(),
    var canDelete: Boolean = canDeletePost(),
    var canEdit: Boolean = canEditPost(),
    val isPinned: Int = IS_PINED,
    var markedAsAds: Boolean = markedAsAdsPost(),
    var isFavorite: Boolean = isFavoritePost(),
    var donut: Donut = Donut,
    val postponedId: Int = 1 //TODO что это?
)


fun textPost(): String {
    println("Введите текст поста")
    val text = readln()
    return text
}

fun friendsOnlyPost(): Int {
    println("Введите 1, если вы друг")
    val friends = readln().toInt()
    if (friends == 1) {
        println("Друг")
    } else println("Не друг")

    // TODO Потом адаптировать
    return friends
}

fun postTypePost(): String {
    //Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    val post: String = "post"
    val copy: String = "copy"
    val reply: String = "reply"
    val postpone: String = "postpone"
    val suggest: String = "suggest"

    println("Введите от 1 до 5, что бы сделать: post или copy или reply или postpone или suggest")
    val postTypeСhoice = readln().toInt()
    when (postTypeСhoice) {
        1 -> println(post)
        2 -> println(copy)
        3 -> println(reply)
        4 -> println(postpone)
        5 -> println(suggest)
        else -> {
            println("Ошибка ввода. Выберите правильный вариант")
        }
    }
    return postTypeСhoice.toString()
    // TODO Потом адаптировать
}

fun canPinPost(): Boolean {
    //Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    println("Введите 1, если можете закрепить запись")
    var canPin = readln().toInt()
    val doesOneEqualTwo = (canPin == 1)
    if (doesOneEqualTwo == true) {
        println("Запись закреплена")
    } else {
        println("Запись не закреплена")
    }

    // TODO Потом адаптировать
    return doesOneEqualTwo
}

fun canDeletePost(): Boolean {
    //Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    println("Введите 1, если можете удалить запись")
    var canDelete = readln().toInt()
    val doesOneEqualTwo = (canDelete == 1)
    if (doesOneEqualTwo == true) {
        println("Запись может быть удалена")
    } else {
        println("Запись не может быть удалена")
    }

    // TODO Потом адаптировать
    return doesOneEqualTwo
}

fun canEditPost(): Boolean {
    //Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    println("Введите 1, если можете редактировать запись")
    var canEdit = readln().toInt()
    val doesOneEqualTwo = (canEdit == 1)
    if (doesOneEqualTwo == true) {
        println("Запись может быть отредактирована")
    } else {
        println("Запись не может быть отредактирована")
    }

    // TODO Потом адаптировать
    return doesOneEqualTwo
}

fun markedAsAdsPost(): Boolean {
    //Информация о том, содержит ли запись отметку «реклама» (1 — да, 0 — нет).
    println("Введите 1, если есть реклама")
    var markedAsAds = readln().toInt()
    val doesOneEqualTwo = (markedAsAds == 1)
    if (doesOneEqualTwo == true) {
        println("Реклама будет показана")
    } else {
        println("Реклама не будет показана")
    }

    // TODO Потом адаптировать
    return doesOneEqualTwo
}

fun isFavoritePost(): Boolean {
    //true, если объект добавлен в закладки у текущего пользователя
    println("Введите 1, если объект добавлен в закладки у текущего пользователя")
    var isFavorite = readln().toInt()
    val doesOneEqualTwo = (isFavorite == 1)

    if (doesOneEqualTwo == true) {
        println("Объект добавлен в закладки")
    } else {
        println("Объект не добавлен в закладки")
    }

    // TODO Потом адаптировать
    return doesOneEqualTwo
}


//val doesOneEqualTwo = (1 == 1)
//id: Integer, //Идентификатор записи. - 1
//ownerId: Integer, //Идентификатор владельца стены, на которой размещена запись. - 777
//fromId: Integer, //Идентификатор автора записи (от чьего имени опубликована запись). - 888
//createdBy: Integer, //Идентификатор администратора, который опубликовал запись - 999
//date: Integer, //Время публикации записи в формате unixtime
//text: String, //Текст записи.
//replyOwnerId: Integer,//Идентификатор владельца записи, в ответ на которую была оставлена текущая.
//replyPostId: Integer, //Идентификатор записи, в ответ на которую была оставлена текущая
//friendsOnly: Integer,//1, если запись была создана с опцией «Только для друзей».
//comments: Object,//Информация о комментариях к записи, объект с полями:
//copyright: String, //Источник материала, объект с полями:
//likes: Object,//Информация о лайках к записи, объект с полями:
//reposts: Object,//Информация о репостах записи («Рассказать друзьям»), объект с полями:
//views: Object,//Информация о просмотрах записи. Объект с единственным полем:
//postType: String,//Тип записи, может принимать следующие значения
////post_source: Object, //Поле возвращается только для Standalone-приложений с ключом доступа, полученным в Implicit Flow.
////attachments: Array, //Медиавложения записи (фотографии, ссылки и т.п.). Описание массива attachments
////geo: Object, //Информация о местоположении , содержит поля:
//signerId: Integer, //Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
////copyHistory: Array, // Массив, содержащий историю репостов для записи.
//canPin: Integer, //Информация о том, может ли текущий пользователь закрепить запись
//canDelete: Integer, //Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
//canEdit: Integer, //Информация о том, может ли текущий пользователь редактировать запись
//isPinned: Integer, //Информация о том, что запись закреплена.
//markedAsAds: Integer, //Информация о записи VK Donut:
//isFavorite: Boolean, //true, если объект добавлен в закладки у текущего пользователя.
//donut: Object, //Информация о записи VK Donut:
//postponedId: Integer, //Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
