package ru.netology

import ru.netology.post.Post
import ru.netology.servis.*
import ru.netology.servis.geo.Geo
import ru.netology.servis.repostHistory.CopyHistory


fun main() {
    val postTest = Post(1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
        5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
        emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9,
        true, true, Donut, 10)
    //val service = RuntimeException()
      println(postTest)
    val service = WallService
    service.add(postTest)
    println(service.posts.get(0))
    val CommentTest = Comment(1,1,0,0,"Первый комментарий", 0,0
    ,0,0,0)
    service.createComment(0,CommentTest)
    println(service.comments[0])
    val reportTest = Report(1)
       service.reportComment(1,reportTest)
       println(service.reportComments[0])
}


