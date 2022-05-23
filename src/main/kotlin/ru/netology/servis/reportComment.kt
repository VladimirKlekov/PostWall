package ru.netology.servis

open class reportComment (
    private val owner_id: Int =1,
    private val comment_id: Int = 1,

) {
    open fun complaint() {
        val writingTex: String = ""
        println("0 - спам")
        println("1 - детская порнография")
        println("2 - экстремизм")
        println("3 - насилие")
        println("4 - пропаганда наркотиков")
        println("5 - материал для взрослых")
        println("6 - оскорбление")
        println("8 - призывы к суициду")
        val reason = readln().toInt()

        when (reason) {
            0 -> writingTex == "спам"
            1 -> writingTex == "детская порнография"
            2 -> writingTex == "экстремизм"
            3 -> writingTex == "насилие"
            4 -> writingTex == "пропаганда наркотиков"
            5 -> writingTex == "материал для взрослых"
            6 -> writingTex == "оскорбление"
            8 -> writingTex == "призывы к суициду"
            else -> {
                writingTex == ""
            }
        }
    }
}


//owner_id integer Идентификатор пользователя или сообщества, которому принадлежит комментарий.
//
//comment_id positive Идентификатор комментария.
//reason positive
//
//Причина жалобы:
//0 — спам;
//1 — детская порнография;
//2 — экстремизм;
//3 — насилие;
//4 — пропаганда наркотиков;
//5 — материал для взрослых;
//6 — оскорбление;
//8 — призывы к суициду.
//
//Результат
//После успешного выполнения возвращает 1.