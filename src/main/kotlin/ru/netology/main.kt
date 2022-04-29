package ru.netology

import ru.netology.post.Post
import ru.netology.servis.WallService
import ru.netology.servis.WallService.printArray

fun main() {


    val Post1 = Post()
    WallService.add(Post1)
    printArray()

    val Post2 = Post()
    WallService.add(Post2)
    printArray()


}


