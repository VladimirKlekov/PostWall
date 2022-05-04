package ru.netology.servis.attachment.marketAttachment

import ru.netology.servis.attachment.marketAttachment.categoryMarketAttachment.sectionCategoryMarketAttachment

object CategoryMarketAttachment {
    private val id: Int = 1 //идентификатор категории;
    private val name: String = "название категории."
    private val section: sectionCategoryMarketAttachment = sectionCategoryMarketAttachment

}
//category object Категория товара. Объект, содержащий поля:
//• id (integer) — идентификатор категории;
//• name (string) — название категории;
////• section (object) — секция. Объект, содержащий поля:
//• id (integer) — идентификатор секции;
//• name (string) — название секции.