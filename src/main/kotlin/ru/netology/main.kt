package ru.netology

import ru.netology.post.Post
import ru.netology.servis.*
import ru.netology.servis.geo.Geo
import ru.netology.servis.repostHistory.CopyHistory


fun main() {
    val post = Post(1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
        5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
        emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9, true, true, Donut, 10)
    val service = RuntimeException()


}


