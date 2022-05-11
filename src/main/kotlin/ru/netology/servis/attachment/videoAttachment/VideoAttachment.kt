//package ru.netology.servis.attachment.videoAttachment
//
//import ru.netology.servis.Attachment
//import ru.netology.servis.attachment.videoAttachment.FirstFrame
//import ru.netology.servis.attachment.videoAttachment.Reposts
//import ru.netology.servis.attachment.videoAttachment.VideoLikes
//import ru.netology.servis.attachment.videoAttachment.СoverImage
//
////class VideoAttachment(): Attachment("video") {
////    private val id: Int = 1 //Идентификатор видеозаписи.
////    private val ownerId: Int = 1 //Идентификатор владельца видеозаписи.
////    private val title: String = "Идентификатор владельца видеозаписи."
////    private val description: String = "Текст описания видеозаписи."
////    private val duration: Int = 10 //Длительность ролика в секундах.
////    private var image = emptyArray<СoverImage>()
////    private var firstFrame = emptyArray<FirstFrame>()
////    private val date: Int = (System.currentTimeMillis()/1000).toInt()//Дата создания в формате Unixtime.
////    private val addingDate: Int = (System.currentTimeMillis()/1000).toInt()//Дата создания в формате Unixtime.
////    private val views: Int = 1 // Количество просмотров видеозаписи.
////    private val localViews: Int = 1 //Если видео внешнее, количество просмотров ВКонтакте.
////    private val comments: Int = 1 //Количество комментариев к видеозаписи. Поле не возвращается, если комментарии недоступны.
////    private val player: String = "URL страницы с плеером."
////    private val platform: String = "Название платформы ."
////    private val canAdd: Int = 1 //Может ли пользователь добавить видеозапись к себе.
////    private val isPrivate: Int = 1//Поле возвращается, если видеозапись приватная
////    private val accessKey: String = "Ключ доступа к объекту."
////    private val processing: Int = 1//Поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
////    private val isFavorite: Boolean = true//true, если объект добавлен в закладки у текущего пользователя.
////    private val canComment: Int = 1//Может ли пользователь комментировать видео.
////    private val canEdit: Int = 1//Может ли пользователь редактировать видео.
////    private val canLike: Int = 1//Может ли пользователь добавить видео в список <<Мне нравится>>.
////    private val canRepost: Int = 1//Может ли пользователь сделать репост видео.
////    private val canSubscribe: Int = 1//Может ли пользователь подписаться на автора видео.
////    private val canAddToFaves: Int = 1//Может ли пользователь добавить видео в избранное.
////    private val canAttachLink: Int = 1//Может ли пользователь прикрепить кнопку действия к видео.
////    private val width: Int = 200 //Ширина видео.
////    private val height: Int = 200// Высота видео.
////    private val userId: Int = 1//Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников.
////    private val converting: Int = 1//Конвертируется ли видео.
////    private val added: Int = 1//Добавлено ли видео в альбомы пользователя.
////    private val isSubscribed: Int = 1//Подписан ли пользователь на автора видео.
////    private val repeat: Int = 1//Поле возвращается в том случае, если видео зациклено, всегда содержит 1
////    private val type: String = "Тип видеозаписи. Может принимать значения: video, music_video, movie."
////    private val balance: Int = 1//Баланс донатов в прямой трансляции.
////    private val liveStatus: String = "Статус прямой трансляции. Может принимать значения: waiting, started, finished, failed, upcoming."
////    private val live: Int = 1//Поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1
////    private val upcoming: Int = 1//Поле свидетельствует о том, что трансляция скоро начнётся. Для live =1.
////    private val spectators: Int = 1//Количество зрителей прямой трансляции.
////    private val likes: VideoLikes = VideoLikes//object Содержит объект отметки «Мне нравится».
////    private val reposts: Reposts = Reposts//object Содержит объект репоста.
////
////}
//
////Видеозапись
////
////Объект, описывающий видеозапись, содержит следующие поля:
////
////
////id integer Идентификатор видеозаписи.
////owner_id integer Идентификатор владельца видеозаписи.
////title string Название видеозаписи.
////description string Текст описания видеозаписи.
////duration integer Длительность ролика в секундах.
////
////image array Изображение обложки. Содержит массив объектов с полями:
////• height (integer) — высота изображения.
////• url (string) — ссылка на изображение.
////• width (integer) — ширина изображения.
////• with_padding (integer) — поле возвращается, если изображение с отбивкой, всегда содержит 1.
////
////first_frame array Изображение первого кадра. Содержит массив объектов с полями:
////•height (integer) — высота изображения.
////•url (string) — ссылка на изображение.
////•width (integer) — ширина изображение.
//
////date integer Дата создания видеозаписи в формате Unixtime.
////adding_date integer Дата добавления видеозаписи пользователем или группой в формате Unixtime.
////views integer Количество просмотров видеозаписи.
////local_views  integer Если видео внешнее, количество просмотров ВКонтакте.
////comments integer Количество комментариев к видеозаписи. Поле не возвращается, если комментарии недоступны.
////player string URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и HTML5, плеер всегда масштабируется по размеру окна.
////platform string Название платформы (для видеозаписей, добавленных с внешних сайтов).
////can_add integer Может ли пользователь добавить видеозапись к себе.
////•0 — не может добавить.
////•1 — может добавить.
////is_private integer Поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение), всегда содержит 1.
////access_key string Ключ доступа к объекту. Подробнее см. Ключ доступа к данным access_key.
////processing integer Поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
////is_favorite boolean true, если объект добавлен в закладки у текущего пользователя.
////can_comment integer Может ли пользователь комментировать видео.
////•0 — не может комментировать.
////•1 — может комментировать.
////can_edit integer Может ли пользователь редактировать видео.
////•0 — не может редактировать.
////• 1 — может редактировать.
////can_like integer Может ли пользователь добавить видео в список <<Мне нравится>>.
////•0 — не может добавить.
////•1 — может добавить.
////can_repost integer Может ли пользователь сделать репост видео.
////• 0 — не может сделать репост.
////•1 — может сделать репост.
////can_subscribe integer Может ли пользователь подписаться на автора видео.
////•0 — не может подписаться.
////•1 — может подписаться.
////can_add_to_faves integer Может ли пользователь добавить видео в избранное.
////• 0 — не может добавить.
////•1 — может добавить.
////can_attach_link integer Может ли пользователь прикрепить кнопку действия к видео.
////•0 — не может прикрепить.
////•1 — может прикрепить.
////width integer Ширина видео.
////height integer Высота видео.
////user_id integer Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников.
////converting integer Конвертируется ли видео.
////•0 — не конвертируется.
////•1 — конвертируется.
////added integer Добавлено ли видео в альбомы пользователя.
////•0 — не добавлено.
////•1 — добавлено.
////is_subscribed integer Подписан ли пользователь на автора видео.
////•0 — не подписан.
////•1 — подписан.
////repeat integer Поле возвращается в том случае, если видео зациклено, всегда содержит 1
////type string Тип видеозаписи. Может принимать значения: video, music_video, movie.
////balance integer Баланс донатов в прямой трансляции.
////live_status string Статус прямой трансляции. Может принимать значения: waiting, started, finished, failed, upcoming.
////live integer Поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1. Обратите внимание, в этом случае в поле duration содержится значение 0.
////upcoming integer Поле свидетельствует о том, что трансляция скоро начнётся. Для live =1.
////spectators integer Количество зрителей прямой трансляции.
////likes object Содержит объект отметки «Мне нравится».
////• count (integer) — количество лайков.
////• user_likes (integer) — добавлено ли видео в список «Мне нравится» текущего пользователя.
////•0 — не добавлено.
////•1 — добавлено.
////reposts object Содержит объект репоста.
////• count (integer) — счетчик общего количества репостов. Содержит сумму репостов на стену и в личные сообщения.
////• wall_count (integer) — счетчик репостов на стену.
////•mail_count (integer) — счетчик репостов в личные сообщения.
////•user_reposted (integer) — информация о том, сделал ли текущий пользователь репост этого видео.