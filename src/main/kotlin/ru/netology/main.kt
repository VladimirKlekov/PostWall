package ru.netology

import ru.netology.servis.Attachment
import ru.netology.servis.PhotoAttachment
import ru.netology.servis.PostedPhotoAttachment
import ru.netology.servis.VideoAttachment


fun main() {


val test = PhotoAttachment()
    val test1 =  PostedPhotoAttachment()
    println(test)
    println(test1)

    val attachment: Attachment = VideoAttachment()
     println(attachment.type)

}


