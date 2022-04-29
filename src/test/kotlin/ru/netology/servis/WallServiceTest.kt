package ru.netology.servis

import org.junit.Test

import org.junit.Assert.*
import ru.netology.post.Post

class WallServiceTest {


    @Test
    fun add() {
        //arrange // создаём целевой сервис
        val wallServiceTest = WallService
        wallServiceTest.add(
            Post(
                0, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
                5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия",
                8, true, true, true, 9, true, true, Donut, 10
            )
        )

        val update = Post(
            1, 12, 13, 14, DateTime.currentDataTime, "Проверка сервиса",
            15, 16, 17, Comments, Copyright, Likes, Reposts, Views, "Копия",
            18, true, true, true, 19, true, true, Donut, 12
        )

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
            Post(
                0, 2, 3, 4, DateTime.currentDataTime, "Проверка сервиса",
                5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия",
                8, true, true, true, 9, true, true, Donut, 10
            )
        )
        serviceUpdate.add(
            Post(
                1, 3, 4, 4, DateTime.currentDataTime, "Проверка сервиса",
                5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия",
                8, true, true, true, 9, true, true, Donut, 10
            )
        )
        serviceUpdate.add(
            Post(
                2, 4, 5,4, DateTime.currentDataTime, "Проверка сервиса",
                5, 6, 7, Comments, Copyright, Likes, Reposts, Views, "Копия",
                8, true, true, true, 9, true, true, Donut, 10
            )
        )

        val update = Post(
            1, 12, 13, 14, DateTime.currentDataTime, "Проверка сервиса",
            15, 16, 17, Comments, Copyright, Likes, Reposts, Views, "Копия",
            18, true, true, true, 19, true, true, Donut, 12
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
