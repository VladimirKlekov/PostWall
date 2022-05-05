package ru.netology.servis

import ru.netology.servis.attachment.albumAttachment.AlbumAttachment
import ru.netology.servis.attachment.appAttachment.AppAttachment
import ru.netology.servis.attachment.audioAttachment.AudioAttachment
import ru.netology.servis.attachment.docAttachment.DocAttachment
import ru.netology.servis.attachment.eventAttachment.EventAttachment
import ru.netology.servis.attachment.graffitiAttachment.GraffitiAttachment

import ru.netology.servis.attachment.linkAttachment.LinkAttachment
import ru.netology.servis.attachment.marketAttachment.MarketAttachment
import ru.netology.servis.attachment.noteAttachment.NoteAttachment
import ru.netology.servis.attachment.pageAttachment.PageAttachment
import ru.netology.servis.attachment.photoAttachment.PhotoAttachment
import ru.netology.servis.attachment.photosListAttachment.PhotosListAttachment
import ru.netology.servis.attachment.pollAttachment.PollAttachment
import ru.netology.servis.attachment.videoAttachment.VideoAttachment


abstract class Attachment(val types: String) {
    val valueAttachment: Any = TODO();

    private val typeAttachment= when(types)

    {   "photo" -> valueAttachment = PhotoAttachment(types);
        "posted_photo" -> valueAttachment = PhotoAttachment(types);//
        "video" -> valueAttachment = VideoAttachment(types)
        "audio" -> valueAttachment = AudioAttachment(types)
        "doc" -> valueAttachment = DocAttachment(types);
        "graffiti" -> valueAttachment = GraffitiAttachment(types);
        "link" -> valueAttachment = LinkAttachment(types);
        "note" -> valueAttachment = NoteAttachment(types);
        "app" -> valueAttachment = AppAttachment(types);
        "poll" -> valueAttachment = PollAttachment(types);
        "page" -> valueAttachment = PageAttachment(types);
        "album" -> valueAttachment = AlbumAttachment(types);
        "photosList" -> valueAttachment = PhotosListAttachment(types);
        "market" -> valueAttachment = MarketAttachment(types);
        "marketAlbum" -> valueAttachment = PhotoAttachment(types);
        "sticker" -> valueAttachment = PhotoAttachment(types);
        "prettyCards" -> valueAttachment = PhotoAttachment(types);
        "event" -> valueAttachment = EventAttachment(types);

        else -> {}
    }

    }







//            Задача:
//    есть:
//    1.объект типа Attachment,
//    2.в котором есть поле type,
//    3.а вот какое второе поле у него есть - мы не знаем (оно определяется на базе значения поля type).
//    4.Сделать Attachment абстрактным классом.
//    Выполнить:
//   Информация о медиавложениях в записях и комментариях на стене возвращается в виде массива attachments.
//    - Каждый элемент массива представляет собой объект с двумя полями. Первое поле — type
////    (string) содержит тип вложения (photo,note,audio и т.д.)
//    - Второе поле содержит объект, представляющий медиавложение. Структура объекта в
////    этом поле зависит от его типа.

//







//    1. Фотография (type = photo)
//    2. Фотография, загруженная напрямую (type = posted_photo)
//    3. Видеозапись (type = video)
//    4. Аудиозапись (type = audio)
//    5. Документ (type = doc)
//    6. Граффити (type = graffiti)
//    7. Ссылка (type = link)
//    8. Заметка (type = note)
//    9. Контент приложения (type = app)
//    10. Опрос (type = poll)
//    11. Вики-страница (type = page)
//    12. Альбом с фотографиями (type=album)
//    13. Список фотографий (type=photos_list)
//    14. Товар (type = market)
//    15. Подборка товаров (type = market_album)
//    16. Стикер (type = sticker)
//    17. Карточки (type = pretty_cards)
//    18. Встреча (type = event)
//
//    Информация о медиавложениях в записях и комментариях на стене возвращается в виде массива
//    attachments. Каждый элемент массива представляет собой объект с двумя полями. Первое поле — type
//    (string) содержит тип вложения (photo,note,audio и т.д.). Название второго поля совпадает со значением,
//    переданным в type. Второе поле содержит объект, представляющий медиавложение. Структура объекта в
//    этом поле зависит от его типа.
//    Схематичное представление объекта attachments для двух вложений (фото и аудио):
//    [{"type": "photo", "photo": {photo}}, {"type": "audio", "audio": {audio}}]
//    Каждый объект может содержать дополнительное поле access_key — ключ доступа к контенту. Описание
//    поля access_key Вы можете найти на

//private val photo: PhotoAttachment = PhotoAttachment,
//private val postedPhoto: PostedPhotoAttachment = PostedPhotoAttachment,
//private val video: VideoAttachment = VideoAttachment,
//private val audio: AudioAttachment = AudioAttachment,
//private val doc: DocAttachment = DocAttachment,
//private val graffiti: GraffitiAttachment = GraffitiAttachment,
//private val link: LinkAttachment = LinkAttachment,
//private val note: NoteAttachment = NoteAttachment,
//private val app: AppAttachment = AppAttachment,
//private val poll: PollAttachment = PollAttachment,
//private val page: PageAttachment = PageAttachment,
//private val album: AlbumAttachment = AlbumAttachment,
//private val photosList: PhotosListAttachment = PhotosListAttachment,
//private val market: MarketAttachment = MarketAttachment,
//private val marketAlbum: MaketAlbumAttachment = MaketAlbumAttachment,
//private val sticker: StickerAttachment = StickerAttachment,
//private val prettyCards: PrettyCardsAttachement = PrettyCardsAttachement,
//private val event: EventAttachment = EventAttachment,