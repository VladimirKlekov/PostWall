package ru.netology.servis

object Likes {

    private var count: Int = 10
    private val userLikes: Int = 1
    private val canLike: Int = 1
    private val canPublish: Int = 1
}
//Информация о лайках к записи, объект с полями:
//count (integer) — число пользователей, которым понравилась запись;
//user_likes* (integer) — наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
//can_like* (integer) — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
//can_publish* (integer) — информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).