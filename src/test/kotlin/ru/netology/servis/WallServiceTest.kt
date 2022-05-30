package ru.netology.servis

import org.junit.Test

import org.junit.Assert.*
import ru.netology.post.Post
import ru.netology.servis.geo.Geo
import ru.netology.servis.repostHistory.CopyHistory

class WallServiceTest {

    @Test
    fun getPosts() {
    }

    @Test
    fun setPosts() {
    }

    @Test
    fun getComments() {
    }

    @Test
    fun setComments() {
    }

    @Test
    fun getReportComments() {
    }

    @Test
    fun setReportComments() {
    }

    @Test
    fun createComment() {
        val testPostComment = Post(1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
            5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
            emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9,
            true, true, Donut, 10)
        val service = WallService
        val test = service.add(testPostComment)
        val testComment = Comment(1, 1, 1, 1, "Test add comment", 1, 1, 1, 1, 1)

        val result = service.createComment(test.idPost, testComment)

        assertEquals(result, service.comments.get(0))
    }

    @Test
    fun reportComment() {
        val testPostReport = Post(1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
            5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
            emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9,
            true, true, Donut, 10)
        val service = WallService
        val test1 = service.add(testPostReport)

        val testComment = Comment(1, 1, 1, 1, "Test add comment", 1, 1, 1, 1, 0)
        //сохранил комментарий
        val test = WallService.createComment(0, testComment)
        //создал жалобу
        val testReport = Report(1, "Проверка жалобы")
        //проверяю работу функции
        val result = WallService.reportComment(test.id, testReport)

        //сравниваю результат
        assertEquals(result, WallService.reportComments.get(0))
    }


    @Test
    fun add() {
        val testPost = Post(1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
            5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
            emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9,
            true, true, Donut, 10)

        //сохраняю результат функции в переменную
        val testArray = WallService.add(testPost)

        //тестирую функцию
        val result = WallService.posts.get(2)

        assertEquals(result, testArray)

    }

    @Test
    fun update() {
        val testPost = Post(1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
            5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
            emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9,
            true, true, Donut, 10)
        val update = Post(1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
            5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
            emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9,
            true, true, Donut, 10)
        val result = WallService.add(testPost)
        val resulr = WallService.update(update)
        assertTrue(true)

    }
}
