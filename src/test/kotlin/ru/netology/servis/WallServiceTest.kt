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
        val testPost = Post(1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
        5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
        emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9,
        true, true, Donut, 10)
        WallService.add(testPost)

        val testComment = Comment(1,1,1,1,"Test add comment",1,1
        ,1,1,1)

       val testWallService = WallService

        val result = testWallService.createComment(testPost.idPost,testComment)

        assertEquals(result,testWallService.comments.get(0))
    }

    @Test
    fun reportComment() {
    }

    @Test
    fun add() {
    }

    @Test
    fun update() {
    }
}