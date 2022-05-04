package ru.netology.servis

import org.junit.Test

import org.junit.Assert.*
import ru.netology.post.Post
import ru.netology.servis.geo.Geo
import ru.netology.servis.repostHistory.CopyHistory

class WallServiceTest {


    @Test
    fun add() {
        //arrange // создаём целевой сервис
        val wallServiceTest = WallService
        wallServiceTest.add(
            Post(
                0, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
                5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
                emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9, true, true, Donut, 10
            )
        )

        val update = Post(
            2, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
            5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
            emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9, true, true, Donut, 10 )

        //assert//выполняем целевое действие

        val result = wallServiceTest.add(post = update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertEquals(4, result.idPost)
    }


    @Test
    fun update() {
        // создаём целевой сервис
        val serviceUpdate = WallService
        serviceUpdate.add(
            Post(0, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
                5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
                emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9, true, true, Donut, 10
            )
        )
        serviceUpdate.add(
            Post(
                1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
                5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
                emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9, true, true, Donut, 10
            )
        )
        serviceUpdate.add(
            Post(
                2, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
                5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
                emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9, true, true, Donut, 10
            )
        )

        val update = Post(
            1, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
            5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия", PostSource,
            emptyArray<Attachment>(), Geo, 9, CopyHistory, true, true, true, 9, true, true, Donut, 10
        )

        // выполняем целевое действие
        val result = serviceUpdate.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun printArray() {
    }
}
