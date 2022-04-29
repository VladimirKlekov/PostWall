package ru.netology.servis

import ru.netology.post.Post


//Объект WallService, который внутри себя хранит посты в массиве. property
object WallService {

    private var posts = emptyArray<Post>()
    private var property: Int = 0


    fun add(post: Post): Post {
        posts += if (posts.isEmpty()) {
            post.copy(idPost = 0)
        } else {
            post.copy(idPost = property)
        }
        property++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((idPost, newPost) in posts.withIndex()) {
            if (newPost.idPost == post.idPost) {
                posts[idPost] = newPost.copy(ownerId = newPost.ownerId, date = newPost.date)
                return true
            }
        }
        return false
    }

    fun printArray() {

        var i = 0
        for (printArray in posts) {

            println(" Проверка массива $printArray")

        }
    }
}


//------
//метод для создания записи
//Он должен добавлять запись в массив, но при этом назначать посту уникальный среди всех постов идентификатор.
//Возвращать пост с уже выставленным идентификатором.
//Возможно, вам стоит завести private property для хранения следующего уникального id. Пока у нас in-memory система
// — всё хранится в оперативной памяти, и всё работает на одной машине, этого будет достаточно.
//------
//Метод для обновления записи
//Он должен находить среди всех постов запись с тем же id, что и у post и обновлять все свойства, кроме id владельца
// и даты создания.
//Если пост с таким id не найден, то ничего не происходит и возвращается false, в противном случае - возвращается true