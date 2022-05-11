//package ru.netology.servis.attachment.marketAttachment
//
//import ru.netology.servis.Attachment
//import ru.netology.servis.attachment.marketAttachment.dimensionsMarketAttachment.DimensionsMarketAttachment
//
//class MarketAttachment(): Attachment("market") {
//    private val id: Int = 1 //Идентификатор товара
//    private val ownerId: Int = 1 //Идентификатор владельца товара.
//    private val title: String = "Название товара."
//    private val description: String = "Текст описания товара."
//    private val price: PriceMarketAttachment = PriceMarketAttachment
//    private val dimensions: DimensionsMarketAttachment = DimensionsMarketAttachment
//    private val  weight: Int = 100 //Вес в граммах.
//    private val category: CategoryMarketAttachment = CategoryMarketAttachment
//    private val  date: String = "URL изображения-обложки товара."
//    private val edited: Int =
//        (System.currentTimeMillis() / 1000).toInt()//Дата создания товара в формате Unixtime.
//    private val   availability: Int = 1 //Статус доступности товара. Возможные значения:
//    private val isFavorite: Boolean = true//rue, если объект добавлен в закладки у текущего пользователя.
//    private val  sku: String = "Артикул товара, произвольная строка длиной до 50 символов"
//
//
//
//
//
//
//
//}
////Товар
////Объект, описывающий товар, содержит следующие поля:
////
////
////Базовые поля
////
////id integer Идентификатор товара.
////owner_id integer Идентификатор владельца товара.
////title string Название товара
////description string Текст описания товара.
////price object Цена. Объект, содержащий поля:
////• amount (string) — цена товара в сотых долях единицы валюты;
////• currency (object) — валюта. Объект, содержащий поля:
////• id (integer) — идентификатор валюты;
////•name(string) — обозначение валюты;
////• old_amount (string) — старая цена товара в сотых долях единицы валюты;
////• text (string) — строковое представление цены.
////dimensions  object Габариты товара. Объект, содержащий поля:
////• width (integer) — ширина в миллиметрах;
////• height (integer) — высота в миллиметрах;
////• length (integer) — длина в миллиметрах;
////weight integer Вес в граммах.
////category object Категория товара. Объект, содержащий поля:
////• id (integer) — идентификатор категории;
////• name (string) — название категории;
////• section (object) — секция. Объект, содержащий поля:
////• id (integer) — идентификатор секции;
////• name (string) — название секции.
////thumb_photo  string URL изображения-обложки товара.
////date integer Дата создания товара в формате Unixtime.
////availability     integer Статус доступности товара. Возможные значения:
////• 0 — товар доступен;
////• 1 — товар удален;
////• 2 — товар недоступен.
////is_favorite  boolean true, если объект добавлен в закладки у текущего пользователя.
////sku string Артикул товара, произвольная строка длиной до 50 символов
////Опциональные поля
////Объект содержит опциональные поля, если в методе был передан параметр extended = 1.
////photos array Изображения товара. Массив объектов, описывающих фотографии.
////can_comment integer Возможность комментировать товар для текущего пользователя (1 — есть, 0 — нет).
////can_repost integer Возможность сделать репост товара для текущего пользователя (1 — есть, 0 — нет).
////likes object Информация об отметках «Мне нравится». Объект, содержащий поля:
////• user_likes (integer) — есть ли отметка «Мне нравится» от текущего пользователя (1 — есть, 0 — нет).
////• count (integer) — число отметок «Мне нравится».
////url string Ссылка на товар во внешних ресурсах.
////button_title string Текст на кнопке товара. Возможные значения:
////• Купить;
////• Перейти в магазин;
////• Купить билет.