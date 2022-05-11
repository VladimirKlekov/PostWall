package ru.netology.servis

import ru.netology.servis.attachment.albumAttachment.ThumbAlbumAttachment
import ru.netology.servis.attachment.docAttachment.Preview
import ru.netology.servis.attachment.eventAttachment.FriendsEventAttachment
import ru.netology.servis.attachment.linkAttachment.ButtonLinkAttachment
import ru.netology.servis.attachment.linkAttachment.PhotoLinkAttachment
import ru.netology.servis.attachment.linkAttachment.ProductLinkAttachment
import ru.netology.servis.attachment.maketAlbumAttachment.PhotoMaketAlbumAttachment
import ru.netology.servis.attachment.marketAttachment.CategoryMarketAttachment
import ru.netology.servis.attachment.marketAttachment.PriceMarketAttachment
import ru.netology.servis.attachment.marketAttachment.dimensionsMarketAttachment.DimensionsMarketAttachment
import ru.netology.servis.attachment.photoAttachment.SizesCopyImage
import ru.netology.servis.attachment.pollAttachment.*
import ru.netology.servis.attachment.prettyCardsAttachement.ImagesPrettyCardsAttachement
import ru.netology.servis.attachment.stickerAttachment.ImageWithBackgroundStickerAttachment
import ru.netology.servis.attachment.stickerAttachment.ImagesStickerAttachment
import ru.netology.servis.attachment.videoAttachment.FirstFrame
import ru.netology.servis.attachment.videoAttachment.Reposts
import ru.netology.servis.attachment.videoAttachment.VideoLikes
import ru.netology.servis.attachment.videoAttachment.СoverImage


abstract class Attachment(val type: String) {
    val valueAttachment: Any = TODO();

    fun smartCast(type:String): String {
        if(type is String){
            return type
        }
        return ""

    }

    private val typeAttachment = when (type) {
        "photo" -> valueAttachment = PhotoAttachment();
        "postedPhoto" -> valueAttachment = PostedPhotoAttachment();//
        "video" -> valueAttachment = VideoAttachment()
        "audio" -> valueAttachment = AudioAttachment()
        "doc" -> valueAttachment = DocAttachment();
        "graffiti" -> valueAttachment = GraffitiAttachment();
        "link" -> valueAttachment = LinkAttachment();
        "note" -> valueAttachment = NoteAttachment();
        "app" -> valueAttachment = AppAttachment();
        "poll" -> valueAttachment = PollAttachment();
        "page" -> valueAttachment = PageAttachment();
        "album" -> valueAttachment = AlbumAttachment();
        "photosList" -> valueAttachment = PhotosListAttachment();
        "market" -> valueAttachment = MarketAttachment();
        "marketAlbum" -> valueAttachment = MaketAlbumAttachment();
        "sticker" -> valueAttachment = StickerAttachment();
        "prettyCards" -> valueAttachment = PrettyCardsAttachement();
        "event" -> valueAttachment = EventAttachment();

//
//    class PhotoAttachment(photo: String): Attachment(photo)
//    class PostedPhotoAttachment(postedPhoto: String): Attachment(postedPhoto)

        else -> {}
    }
}

    class PhotoAttachment(): Attachment("photo") {


        private val id: Int = 1 //Идентификатор фотографии
        private val albumId: Int = 1 //Идентификатор альбома, в котором находится фотография.
        private val ownerId: Int = 1 //Идентификатор владельца фотографии.
        private val userId: Int = 1 //Идентификатор альбома, в котором находится фотография.
        private val text: String = "Текст описания фотографии"
        private val date: Int = (System.currentTimeMillis()/1000).toInt()//Дата добавления в формате Unixtime.
        private var sizes = emptyArray<SizesCopyImage>()


    }
    class PostedPhotoAttachment(): Attachment("postedPhoto") {
        private val id: Int = 1
        private val owner_id: Int = 1
        private val photo130: String = "URL изображения для предпросмотра"
        private val photo604: String = "URL полноразмерного изображения"


    }
    class VideoAttachment(): Attachment("video") {
        private val id: Int = 1 //Идентификатор видеозаписи.
        private val ownerId: Int = 1 //Идентификатор владельца видеозаписи.
        private val title: String = "Идентификатор владельца видеозаписи."
        private val description: String = "Текст описания видеозаписи."
        private val duration: Int = 10 //Длительность ролика в секундах.
        private var image = emptyArray<СoverImage>()
        private var firstFrame = emptyArray<FirstFrame>()
        private val date: Int = (System.currentTimeMillis()/1000).toInt()//Дата создания в формате Unixtime.
        private val addingDate: Int = (System.currentTimeMillis()/1000).toInt()//Дата создания в формате Unixtime.
        private val views: Int = 1 // Количество просмотров видеозаписи.
        private val localViews: Int = 1 //Если видео внешнее, количество просмотров ВКонтакте.
        private val comments: Int = 1 //Количество комментариев к видеозаписи. Поле не возвращается, если комментарии недоступны.
        private val player: String = "URL страницы с плеером."
        private val platform: String = "Название платформы ."
        private val canAdd: Int = 1 //Может ли пользователь добавить видеозапись к себе.
        private val isPrivate: Int = 1//Поле возвращается, если видеозапись приватная
        private val accessKey: String = "Ключ доступа к объекту."
        private val processing: Int = 1//Поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
        private val isFavorite: Boolean = true//true, если объект добавлен в закладки у текущего пользователя.
        private val canComment: Int = 1//Может ли пользователь комментировать видео.
        private val canEdit: Int = 1//Может ли пользователь редактировать видео.
        private val canLike: Int = 1//Может ли пользователь добавить видео в список <<Мне нравится>>.
        private val canRepost: Int = 1//Может ли пользователь сделать репост видео.
        private val canSubscribe: Int = 1//Может ли пользователь подписаться на автора видео.
        private val canAddToFaves: Int = 1//Может ли пользователь добавить видео в избранное.
        private val canAttachLink: Int = 1//Может ли пользователь прикрепить кнопку действия к видео.
        private val width: Int = 200 //Ширина видео.
        private val height: Int = 200// Высота видео.
        private val userId: Int = 1//Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников.
        private val converting: Int = 1//Конвертируется ли видео.
        private val added: Int = 1//Добавлено ли видео в альбомы пользователя.
        private val isSubscribed: Int = 1//Подписан ли пользователь на автора видео.
        private val repeat: Int = 1//Поле возвращается в том случае, если видео зациклено, всегда содержит 1
        private val typeVideo: String = "Тип видеозаписи. Может принимать значения: video, music_video, movie."
        private val balance: Int = 1//Баланс донатов в прямой трансляции.
        private val liveStatus: String = "Статус прямой трансляции. Может принимать значения: waiting, started, finished, failed, upcoming."
        private val live: Int = 1//Поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1
        private val upcoming: Int = 1//Поле свидетельствует о том, что трансляция скоро начнётся. Для live =1.
        private val spectators: Int = 1//Количество зрителей прямой трансляции.
        private val likes: VideoLikes = VideoLikes//object Содержит объект отметки «Мне нравится».
        private val reposts: Reposts = Reposts//object Содержит объект репоста.

    }
    class AudioAttachment(): Attachment("audio") {

        private val idAudio: Int = 1 //Идентификатор аудиозаписи.
        private val ownerId: Int = 1 //Идентификатор владельца аудиозаписи.
        private val artist: String = "Исполнитель."
        private val title: String = "Название композиции."
        private val duration: Int = 10 // Длительность аудиозаписи в секундах.
        private val urlAudio: String = "www.Ссылка на mp3"
        private val lyrics: Int = 1 // Идентификатор текста аудиозаписи (если доступно).
        private val albumId: Int = 1 //Идентификатор альбома, в котором находится аудиозапись (если присвоен).
        private val genreId: Int = 1 //Идентификатор жанра из списка аудио жанров.
        private val date: Int = 1 //Дата добавления.
        private val noSearch: Int =
            1 // 1, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
        private val isHq: Int = 1 // 1, если аудио в высоком качестве.
    }
    class DocAttachment(): Attachment("doc") {

        private val idDoc: Int = 1 //Идентификатор файла.
        private val ownerId: Int = 1 //Идентификатор пользователя, загрузившего файл.
        private val title: String = "Название файла."
        private val size: Int = 1 //Размер файла в байтах.
        private val ext: String = "Расширение файла."
        private val urlDoc: String = "Адрес файла, по которому его можно загрузить."
        private val date: Int = (System.currentTimeMillis() / 1000).toInt()//Дата создания в формате Unixtime.
        private val typeDoc: Int = 1 //Тип файла.  Возможные значения:
        private val preview: Preview = Preview //Тип файла.  Возможные значения:

    }
    class GraffitiAttachment(): Attachment("graffiti") {


        private val id: Int = 1 //идентификатор граффити
        private val ownerId: Int = 1 //идентификатор автора граффити.
        private val photo130: String = "URL изображения для предпросмотра"
        private val photo604: String = "URL полноразмерного изображения."
    }

    class LinkAttachment(): Attachment("link") {


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
    class NoteAttachment(): Attachment("note") {

        private val idNote: Int = 1 //Идентификатор заметки.
        private val ownerIdNote: Int = 1 //Идентификатор владельца заметки.
        private val title: String = "Заголовок заметки."
        private val text: String = "Текст заметки."
        private val date: Int = (System.currentTimeMillis() / 1000).toInt()//Дата создания заметки в формате Unixtime.
        private val comments: Int = 1 //Количество комментариев.
        private val readComments: Int =
            1 //Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
        private val viewUrl: String = "URL страницы для отображения заметки."
        private val privacyView: String = "Настройки приватности комментирования заметки."
        private val canComment: Int = 1 //Есть ли возможность оставлять комментарии.
        private val textWiki: String = "эги ссылок на wiki."

    }
    class AppAttachment(): Attachment("app") {
        private val idApp: Int = 1 //идентификатор приложения.
        private val ownerId: Int = 1 //идентификатор приложения.
        private val photo130: String = "URL изображения для предпросмотра."
        private val photo604: String = "URL полноразмерного изображения."


    }
    class PollAttachment(): Attachment("poll") {
        //
        private val id: Int = 1 //Идентификатор опроса для получения информации.
        private val ownerId: Int = 1 //Идентификатор владельца опроса.
        private val created: Int = (System.currentTimeMillis() / 1000).toInt()//Дата создания в формате Unixtime.
        private val question: String = "Текст вопроса."
        private val votes: Int = 1 //Количество голосов
        private var answers = emptyArray<AnswerPollAttachment>()
        private val anonymous: Boolean = true//Является ли опрос анонимным
        private val multiple: Boolean = true//Допускает ли опрос выбор нескольких вариантов ответа.
        private var answerIds =
            emptyArray<AnswerIdPollAttachment>() //Идентификаторы вариантов ответа, выбранных текущим пользователем.
        private val endDate: Int =
            (System.currentTimeMillis() / 1000).toInt()//Дата завершения опроса в Unixtime. 0, если опрос бессрочный.
        private val closed: Boolean = true//Является ли опрос завершенным
        private val isBoard: Boolean = true//Прикреплён ли опрос к обсуждению
        private val canEdit: Boolean = true//Можно ли отредактировать опрос.
        private val canVote: Boolean = true//Можно ли проголосовать в опросе.
        private val canReport: Boolean = true//Можно ли пожаловаться на опрос
        private val canShare: Boolean = true//Можно ли поделиться опросом.
        private val authorId: Int = 1 //Идентификатор автора опроса
        private val photo: PhotoPollAttachment = PhotoPollAttachment //Идентификатор автора опроса
        private val background: BackgroundPollAttachment =
            BackgroundPollAttachment //Фон сниппета опроса. Объект, который содержит поля:
        private var friends =
            emptyArray<FriendsPollAttachment>() //Идентификаторы 3 друзей, которые проголосовали в опросе.
    }
    class PageAttachment(): Attachment("page") {

        private val id: Int = 1 //Идентификатор вики-страницы
        private val groupId: Int = 1 //Идентификатор сообщества.
        private val creatorId: Int = 1 //Идентификатор создателя вики-страницы.
        private val title: String = "Название вики-страницы."
        private val currentUserCanEdit: Int =
            1 //если текущий пользователь может редактировать текст вики-страницы, иначе — 0.
        private val currentUserCanAccess: Int =
            1 //1, если текущий пользователь может изменять права доступа на вики-страницу, иначе — 0.
        private val whoCanView: Int = 1 //Информация о том, кто может просматривать вики-страницу:
        private val whoCanEdit: Int = 1 //Информация о том, кто может просматривать вики-страницу:
        private val edited: Int =
            (System.currentTimeMillis() / 1000).toInt()//Дата последнего изменения вики-страницы в формате Unixtime
        private val created: Int =
            (System.currentTimeMillis() / 1000).toInt()//Дата создания вики-страницы в формате Unixtime.
        private val editorId: Int = 1 //Идентификатор пользователя, который редактировал вики-страницу последним.
        private val views: Int = 1 //Количество просмотров вики-страницы.
        private val parent: String = "аголовок родительской страницы для навигации, если есть."
        private val parent2: String = "Заголовок второй родительской страницы для навигации, если есть."
        private val source: String = "Текст страницы в вики-формате, если был запрошен."
        private val html: String = "Текст страницы в html-формате, если был запрошен."
        private val viewUrl: String = "Адрес страницы для отображения вики-страницы."


    }
    class AlbumAttachment(): Attachment("album") {

        private val id: Int = 1 //идентификатор альбома
        private val thumb: ThumbAlbumAttachment = ThumbAlbumAttachment //обложка альбома, объект photo.
        private val ownerId: Int = 1 //идентификатор владельца альбома
        private val title: String = "название альбома."
        private val description: String = "описание альбома."
        private val created: Int = (System.currentTimeMillis() / 1000).toInt()//дата создания альбома в формате Unixtime.
        private val updated: Int =
            (System.currentTimeMillis() / 1000).toInt()//дата последнего обновления альбома в формате Unixtime.
        private val size: Int = 1 //количество фотографий в альбоме.


    }
    class PhotosListAttachment(): Attachment("photosList") {

    }
    class MarketAttachment(): Attachment("market") {
        private val id: Int = 1 //Идентификатор товара
        private val ownerId: Int = 1 //Идентификатор владельца товара.
        private val title: String = "Название товара."
        private val description: String = "Текст описания товара."
        private val price: PriceMarketAttachment = PriceMarketAttachment
        private val dimensions: DimensionsMarketAttachment = DimensionsMarketAttachment
        private val  weight: Int = 100 //Вес в граммах.
        private val category: CategoryMarketAttachment = CategoryMarketAttachment
        private val  date: String = "URL изображения-обложки товара."
        private val edited: Int =
            (System.currentTimeMillis() / 1000).toInt()//Дата создания товара в формате Unixtime.
        private val   availability: Int = 1 //Статус доступности товара. Возможные значения:
        private val isFavorite: Boolean = true//rue, если объект добавлен в закладки у текущего пользователя.
        private val  sku: String = "Артикул товара, произвольная строка длиной до 50 символов"
    }
    class MaketAlbumAttachment(): Attachment("marketAlbum") {

        private val id: Int = 1 //Идентификатор подборки
        private val ownerId: Int = 1 // Идентификатор владельца подборки
        private val title: String = "Название подборки."
        private val isMain: Boolean = true//Является ли подборка основной.
        private val isHidden: Boolean = true//Является ли подборка скрытой.
        private val  photo: PhotoMaketAlbumAttachment = PhotoMaketAlbumAttachment//подборки, объект, описывающий фотографию.
        private val count: Int = 1 //Число товаров в подборке.


    }
    class StickerAttachment(): Attachment("sticker") {

        private val id: Int = 1 //Идентификатор набора
        private val stickerId: Int = 1 // Идентификатор стикера.
        private val title: String = "Название подборки."
        private var images = emptyArray<ImagesStickerAttachment>()
        private var imagesWithBackground = emptyArray<ImageWithBackgroundStickerAttachment>()
        private val animationUrl: String = "URL анимации стикера."
        private val isAllowed: Boolean = true//Информация о том, доступен ли стикер.

    }
    class PrettyCardsAttachement(): Attachment("prettyCards") {

        private val cardId: String = "идентификатор карточки."
        private val clinkUrl: String = "URL карточки."
        private val  title: String = "подпись карточки."
        private var images = emptyArray<ImagesPrettyCardsAttachement>()

    }
    class EventAttachment(): Attachment("event") {

        private val id: Int = 1 //идентификатор встречи
        private val time: Int = (System.currentTimeMillis() / 1000).toInt()//время начала встречи в Unixtime
        private val memberStatus: Int = 1 //дёт ли текущий пользователь на встречу. Возможные значения:
        private val isFavorite: Boolean = true//добавлена ли встреча в закладки.
        private val address: String = "место проведения встречи."
        private val text: String = "текст для отображения сниппета."
        private val buttonText: String = "текст на кнопке сниппета."
        private var  friends = emptyArray<FriendsEventAttachment>()

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