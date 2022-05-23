package ru.netology.servis

import ru.netology.post.Post
import ru.netology.servis.exception.PostNotFoundException


//Объект WallService, который внутри себя хранит посты в массиве. property
object WallService {

    private var posts = emptyArray<Post>()
    private var property: Int = 0
    private var comments = emptyArray<Comment>()
    private var reportComments = emptyArray<Comment>()


    //-----------------------------------------------------------------------------------------------------

    fun createComment(comment: Comment): Comment {
        // проверяет, существует ли в массиве posts пост с id равным тому, что в комментарии в свойстве postId
        for (post in posts) {
            if (comment.post_id == post.idPost) {
                //Если существует, то добавляет комментарий в массив comments
                comments += comment
            }
            //если не существует - выкидывает исключение PostNotFoundException
            else throw PostNotFoundException("нет поста с таким ID ")
        }
        return comments.last()
    }
    //-----------------------------------------------------------------------------------------------------

    fun reportComment(comment: Comment) {

        //Если жалоба поступила в классе Comment, то запускаю метод из class reportComment


//        }else throw NotImplementedError("Комментарий заблокирован. Поступила жалоба")


    }

    //-----------------------------------------------------------------------------------------------------
    fun add(post: Post): Post {
        posts += if (posts.isEmpty()) {
            post.copy(idPost = 0)
        } else {
            post.copy(idPost = property)
        }
        property++
        return posts.last()
    }

    //-----------------------------------------------------------------------------------------------------
    fun update(post: Post): Boolean {
        for ((idPost, newPost) in posts.withIndex()) {
            if (newPost.idPost == post.idPost) {
                posts[idPost] = newPost.copy(ownerId = newPost.ownerId, date = newPost.date)
                return true
            }
        }
        return false
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