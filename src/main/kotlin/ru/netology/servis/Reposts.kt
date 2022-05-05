package ru.netology.servis

object Reposts {
    private var count: Int = 11
    private val userReposted: Int = 1
}
//Информация о репостах записи («Рассказать друзьям»), объект с полями:
//count (integer) — число пользователей, скопировавших запись;
//user_reposted* (integer) — наличие репоста от текущего пользователя (1 — есть, 0 — нет).