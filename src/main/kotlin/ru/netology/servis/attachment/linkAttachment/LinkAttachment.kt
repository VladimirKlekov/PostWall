package ru.netology.servis.attachment.linkAttachment

import ru.netology.servis.Attachment

class LinkAttachment(link: String): Attachment(link) {


    private val urlLink: String = "URL ссылки"
    private val title: String = "Заголовок ссылки"
    private val caption: String = "Подпись ссылки (если имеется)."
    private val description: String = "Описание ссылки."
    private val photo: PhotoLinkAttachment = PhotoLinkAttachment
    private val product: ProductLinkAttachment = ProductLinkAttachment
    private val button: ButtonLinkAttachment = ButtonLinkAttachment
    private val previewPage: String = "Идентификатор вики-страницы с контентом"
    private val previewUrl: String = "URL страницы с контентом для предпросмотра содержимого страницы"


}

//Прикреплённая ссылка
//
//Объект, описывающий прикреплённую ссылку в сообщении, комментарии или записи на стене, содержит следующие поля:
//url string URL ссылки.
//title string Заголовок ссылки.
//caption string Подпись ссылки (если имеется).
//description string Описание ссылки.
//photo object Изображение превью, объект фотографии (если имеется).
//product object Информация о продукте (если имеется). Поле возвращается для ссылок на магазины, например, AliExpress. Объект с единственным полем price (object), которое описано на отдельной странице.
//button object Информация о кнопке для перехода (если имеется). Объект описан на отдельной странице.
//preview_page string Идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".
//preview_url  string URL страницы с контентом для предпросмотра содержимого страницы.