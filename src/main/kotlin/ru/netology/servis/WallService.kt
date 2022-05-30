package ru.netology.servis

import ru.netology.post.Post
import ru.netology.servis.exception.PostNotFoundException


//Объект WallService, который внутри себя хранит посты в массиве. property
object WallService {

    var posts = emptyArray<Post>()
    private var property: Int = 0
    private var nextComId = 1
    var comments = emptyArray<Comment>()
    var reportComments = emptyArray<Report>()


    //-----------------------------------------------------------------------------------------------------

    fun createComment(postId: Int, comment: Comment): Comment {
        // проверяет, существует ли в массиве posts пост с id равным тому, что в комментарии в свойстве postId
        for (post in posts) {
            if (postId == post.idPost) {
                //Если существует, то добавляет комментарий в массив comments
                comment.id = nextComId++
                comments += comment
                return comments.last()
            }
        }
        //если не существует - выкидывает исключение PostNotFoundException
        throw PostNotFoundException("нет поста с таким ID ")
    }
    //-----------------------------------------------------------------------------------------------------

    fun reportComment(idComment: Int, report: Report): Report {
        for (comment in comments) {
            if (comment.id == idComment) {
                comment.complaint = 1
                report.id = idComment
                reportComments += report
                return reportComments.last()
            }
        }
        throw NotImplementedError("Жалоба не поступала")
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