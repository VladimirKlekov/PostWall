package ru.netology.servis

class Comment(
     id:Int,
     var post_id: Int ,
     private val owner_id: Int= -1,
     private val from_group: Int = 0,
     private val message:String = "Comment add",
     private val reply_to_comment: Int = 0,
     private val attachments: Int = 0,
     private val sticker_id: Int = 0,
     private val guid: Int = 0,
     var complaint: Int = 0 // 0 нет жалобы, 1 - есть жалоба
 ):ComId(id){

    override fun toString(): String {
        return "комментарий c номером $id к посту ${post_id} с текстом: $message создан "
    }
}
