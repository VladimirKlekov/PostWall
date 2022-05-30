package ru.netology.servis

open class Report (
    var id: Int,
    var text:String = addReport()
)
{
    override fun toString(): String {
        return "Жалоба на комментарий $id создана. Причина жалобы:$text"
    }
}

fun addReport():String{
    println("Выберите тип жалобы:" +
            "\n0 — спам" +
            "\n1 — детская порнография" +
            "\n2 — экстремизм" +
            "\n3 — насилие" +
            "\n4 — пропаганда наркотиков" +
            "\n5 — материал для взрослых" +
            "\n6 — оскорбление" +
            "\n8 — призывы к суициду")
    val report = readln().toInt()
    var textReport: String = ""
    when (report) {
        0 -> textReport = "спам"
        1 -> textReport = "детская порнография"
        2 -> textReport = "экстремизм"
        3 -> textReport = "насилие"
        4 -> textReport = "пропаганда наркотиков"
        5 -> textReport = "материал для взрослых"
        6 -> textReport = "оскорбление"
        8 -> textReport = "призывы к суициду"
    }
   // println("Комментарий заблокирован.  Поступила жалоба: $textReport")
    return textReport
}