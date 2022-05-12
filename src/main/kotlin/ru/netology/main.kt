package ru.netology

import ru.netology.servis.Attachment
import ru.netology.servis.PhotoAttachment
import ru.netology.servis.VideoAttachment


fun main() {


val test = PhotoAttachment("photo")
    println(test)
    val attachment: Attachment = VideoAttachment("video")
     println(attachment.type)

}


