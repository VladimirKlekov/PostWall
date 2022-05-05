package ru.netology.servis

import kotlin.random.Random
import kotlin.random.nextInt


object PostSource {

    private val typePostSource: String = typePostSource()
    private val platformPostSource: String = platformPostSource()
    private val dataPostSource: String = dataPostSource(typePostSource)
    private val url: String = "https://dev.vk.com/reference/objects/post-source"


    fun typePostSource(): String {
        var testTypeRandom = Random.nextInt(1..5)//пока придумал так

        var type: String = ""
        when (testTypeRandom) {
            1 -> {
                type = "vk"; println("запись создана через основной интерфейс сайта https://vk.com/")
            }
            2 -> {
                type = "widget"; println("запись создана через виджет на стороннем сайте")
            }
            3 -> {
                type = "api"; println("запись создана приложением через API")
            }
            4 -> {
                type = "rss"; println("запись создана посредством импорта RSS-ленты со стороннего сайта")
            }
            5 -> {
                type = "rss"; println("запись создана посредством отправки SMS-сообщения на специальный номер")
            }
            else -> {
                print("Ошибка ввода. Выберите правильный вариант")
            }
        }
        return type
    }

    fun platformPostSource(): String {
        var testPlatformRandom = Random.nextInt(1..3)

        var platform: String = ""
        when (testPlatformRandom) {
            1 -> platform = "платфорама android"
            2 -> platform = "платфорама iphone"
            3 -> platform = "платфорама wphone"

            else -> {
                print("Ошибка ввода. Выберите правильный вариант")
            }
        }
        return platform
    }

    fun dataPostSource(typePostSource: String): String {
        var testData: String = ""
        val profileActivityVK: String = "online"
        val profilePhotoVK: String = "фотография изменена"
        val commentsWidget: String = "виджет комментариев"
        val likeWidget: String = "виджет мне нравиться"
        val pollWidget: String = "виджет опросов"


        if (typePostSource == "vk") {
            testData = println("$profileActivityVK $profilePhotoVK").toString()
        }else return ""

        if (typePostSource == "widget") {
            testData = println("$commentsWidget $likeWidget $pollWidget").toString()
        }else return ""
       return testData

        }
    }



// TODO Implicit Flow
//    Открытие диалога авторизации//не объясняли
//
//    Необходимо перенаправить браузер пользователя по адресу
//    https://oauth.vk.com/authorize, передав следующие параметры:
//client_id (обязательный) — идентификатор вашего приложения.
//redirect_uri (обязательный) — адрес, на который будет переадресован пользователь после прохождения авторизации (см. redirect_uri).
//display — указывает тип отображения страницы авторизации. Поддерживаются следующие варианты:
//page — форма авторизации в отдельном окне;
//popup — всплывающее окно;
//mobile — авторизация для мобильных устройств (без использования Javascript)
//
//    Если пользователь авторизуется с мобильного устройства, будет использован тип mobile.
//scope — битовая маска настроек доступа приложения, которые необходимо проверить при авторизации пользователя и запросить отсутствующие.
//response_type — тип ответа, который необходимо получить. Укажите token.
//state — произвольная строка, которая будет возвращена вместе с результатом авторизации.
//revoke=1 — параметр, указывающий, что необходимо не пропускать этап подтверждения прав, даже если пользователь уже авторизован.


// TODO Standalone-приложение - не объяснили
//    Поле возвращается только для Standalone-приложений с ключом доступа, полученным в Implicit Flow.

//Standalone-приложение («Stand» и «Alone», что на русский дословно переводится как «остаться одному») —
// это программное обеспечение (ПО), которое не нуждается в каких-либо дополнительных программах и зависимостях
// для его установки и функционирования


//type
//string
//Тип источника. Возможные значения:
//vk — запись создана через основной интерфейс сайта https://vk.com/;
//widget — запись создана через виджет на стороннем сайте;
//api — запись создана приложением через API;
//rss — запись создана посредством импорта RSS-ленты со стороннего сайта;
//sms — запись создана посредством отправки SMS-сообщения на специальный номер.

//platform
//string
//Название платформы, если оно доступно. Возможные значения:
//android;
//iphone;
//wphone.

//data
//string
//Тип действия (только для type = vk или widget). Возможные значения:
//profile_activity — изменение статуса под именем пользователя (для type = vk);
//profile_photo — изменение профильной фотографии пользователя (для type = vk);
//comments — виджет комментариев (для type = widget);
//like — виджет «Мне нравится» (для type = widget);
//poll — виджет опросов (для type = widget).
//url

//string
//URL ресурса, с которого была опубликована запись.
