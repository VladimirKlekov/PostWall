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
import ru.netology.servis.attachment.videoAttachment.–°overImage


sealed class Attachment(val type: String) {



   var valueAttachment = emptyArray<Attachment>()

    fun smartCast(attachment: Attachment): Attachment {
        if (attachment is PhotoAttachment) {
            valueAttachment += PhotoAttachment()
            return valueAttachment.last()
        } else if (attachment is PostedPhotoAttachment) {
            valueAttachment += PostedPhotoAttachment()
            return valueAttachment.last()
        } else if (attachment is VideoAttachment) {
            valueAttachment += VideoAttachment()
            return valueAttachment.last()
        } else if (attachment is AudioAttachment) {
            valueAttachment += AudioAttachment()
            return valueAttachment.last()
        } else if (attachment is DocAttachment) {
            valueAttachment += DocAttachment()
            return valueAttachment.last()
        } else if (attachment is GraffitiAttachment) {
            valueAttachment += GraffitiAttachment()
            return valueAttachment.last()
        } else if (attachment is LinkAttachment) {
            valueAttachment += LinkAttachment()
            return valueAttachment.last()
        } else if (attachment is NoteAttachment) {
            valueAttachment += NoteAttachment()
            return valueAttachment.last()
        } else if (attachment is AppAttachment) {
            valueAttachment += AppAttachment()
            return valueAttachment.last()
        } else if (attachment is PollAttachment) {
            valueAttachment += PollAttachment()
            return valueAttachment.last()
        } else if (attachment is PageAttachment) {
            valueAttachment += PageAttachment()
            return valueAttachment.last()
        } else if (attachment is AlbumAttachment) {
            valueAttachment += AlbumAttachment()
            return valueAttachment.last()
        } else if (attachment is PhotosListAttachment) {
            valueAttachment += PhotosListAttachment()
            return valueAttachment.last()
        } else if (attachment is MarketAttachment) {
            valueAttachment += MarketAttachment()
            return valueAttachment.last()
        } else if (attachment is MaketAlbumAttachment) {
            valueAttachment += MaketAlbumAttachment()
            return valueAttachment.last()
        } else if (attachment is StickerAttachment) {
            valueAttachment += StickerAttachment()
            return valueAttachment.last()
        } else if (attachment is PrettyCardsAttachement) {
            valueAttachment += PrettyCardsAttachement()
            return valueAttachment.last()
        } else if (attachment is EventAttachment) {
            valueAttachment += EventAttachment()
            return valueAttachment.last()
        }
        return attachment
    }
}




class PhotoAttachment() : Attachment("photo") {
    private val id: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł–ł
    private val albumId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –į–Ľ—Ć–Ī–ĺ–ľ–į, –≤ –ļ–ĺ—ā–ĺ—Ä–ĺ–ľ –Ĺ–į—Ö–ĺ–ī–ł—ā—Ā—Ź —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł—Ź.
    private val ownerId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł–ł.
    private val userId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –į–Ľ—Ć–Ī–ĺ–ľ–į, –≤ –ļ–ĺ—ā–ĺ—Ä–ĺ–ľ –Ĺ–į—Ö–ĺ–ī–ł—ā—Ā—Ź —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł—Ź.
    private val text: String = "–Ę–Ķ–ļ—Ā—ā –ĺ–Ņ–ł—Ā–į–Ĺ–ł—Ź —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł–ł"
    private val date: Int = (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į –ī–ĺ–Ī–į–≤–Ľ–Ķ–Ĺ–ł—Ź –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private var sizes = emptyArray<SizesCopyImage>()

}

class PostedPhotoAttachment() : Attachment("postedPhoto") {
    private val id: Int = 1
    private val owner_id: Int = 1
    private val photo130: String = "URL –ł–∑–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź –ī–Ľ—Ź –Ņ—Ä–Ķ–ī–Ņ—Ä–ĺ—Ā–ľ–ĺ—ā—Ä–į"
    private val photo604: String = "URL –Ņ–ĺ–Ľ–Ĺ–ĺ—Ä–į–∑–ľ–Ķ—Ä–Ĺ–ĺ–≥–ĺ –ł–∑–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź"
}

class VideoAttachment() : Attachment("video") {
    private val id: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā–ł.
    private val ownerId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā–ł.
    private val title: String = "–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā–ł."
    private val description: String = "–Ę–Ķ–ļ—Ā—ā –ĺ–Ņ–ł—Ā–į–Ĺ–ł—Ź –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā–ł."
    private val duration: Int = 10 //–Ē–Ľ–ł—ā–Ķ–Ľ—Ć–Ĺ–ĺ—Ā—ā—Ć —Ä–ĺ–Ľ–ł–ļ–į –≤ —Ā–Ķ–ļ—É–Ĺ–ī–į—Ö.
    private var image = emptyArray<–°overImage>()
    private var firstFrame = emptyArray<FirstFrame>()
    private val date: Int = (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į —Ā–ĺ–∑–ī–į–Ĺ–ł—Ź –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val addingDate: Int = (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į —Ā–ĺ–∑–ī–į–Ĺ–ł—Ź –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val views: Int = 1 // –ö–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ –Ņ—Ä–ĺ—Ā–ľ–ĺ—ā—Ä–ĺ–≤ –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā–ł.
    private val localViews: Int = 1 //–ē—Ā–Ľ–ł –≤–ł–ī–Ķ–ĺ –≤–Ĺ–Ķ—ą–Ĺ–Ķ–Ķ, –ļ–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ –Ņ—Ä–ĺ—Ā–ľ–ĺ—ā—Ä–ĺ–≤ –í–ö–ĺ–Ĺ—ā–į–ļ—ā–Ķ.
    private val comments: Int =
        1 //–ö–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–į—Ä–ł–Ķ–≤ –ļ –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā–ł. –ü–ĺ–Ľ–Ķ –Ĺ–Ķ –≤–ĺ–∑–≤—Ä–į—Č–į–Ķ—ā—Ā—Ź, –Ķ—Ā–Ľ–ł –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–į—Ä–ł–ł –Ĺ–Ķ–ī–ĺ—Ā—ā—É–Ņ–Ĺ—č.
    private val player: String = "URL —Ā—ā—Ä–į–Ĺ–ł—Ü—č —Ā –Ņ–Ľ–Ķ–Ķ—Ä–ĺ–ľ."
    private val platform: String = "–Ě–į–∑–≤–į–Ĺ–ł–Ķ –Ņ–Ľ–į—ā—Ą–ĺ—Ä–ľ—č ."
    private val canAdd: Int = 1 //–ú–ĺ–∂–Ķ—ā –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –ī–ĺ–Ī–į–≤–ł—ā—Ć –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā—Ć –ļ —Ā–Ķ–Ī–Ķ.
    private val isPrivate: Int = 1//–ü–ĺ–Ľ–Ķ –≤–ĺ–∑–≤—Ä–į—Č–į–Ķ—ā—Ā—Ź, –Ķ—Ā–Ľ–ł –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā—Ć –Ņ—Ä–ł–≤–į—ā–Ĺ–į—Ź
    private val accessKey: String = "–ö–Ľ—é—á –ī–ĺ—Ā—ā—É–Ņ–į –ļ –ĺ–Ī—ä–Ķ–ļ—ā—É."
    private val processing: Int =
        1//–ü–ĺ–Ľ–Ķ –≤–ĺ–∑–≤—Ä–į—Č–į–Ķ—ā—Ā—Ź –≤ —ā–ĺ–ľ —Ā–Ľ—É—á–į–Ķ, –Ķ—Ā–Ľ–ł –≤–ł–ī–Ķ–ĺ—Ä–ĺ–Ľ–ł–ļ –Ĺ–į—Ö–ĺ–ī–ł—ā—Ā—Ź –≤ –Ņ—Ä–ĺ—Ü–Ķ—Ā—Ā–Ķ –ĺ–Ī—Ä–į–Ī–ĺ—ā–ļ–ł, –≤—Ā–Ķ–≥–ī–į —Ā–ĺ–ī–Ķ—Ä–∂–ł—ā 1.
    private val isFavorite: Boolean = true//true, –Ķ—Ā–Ľ–ł –ĺ–Ī—ä–Ķ–ļ—ā –ī–ĺ–Ī–į–≤–Ľ–Ķ–Ĺ –≤ –∑–į–ļ–Ľ–į–ī–ļ–ł —É —ā–Ķ–ļ—É—Č–Ķ–≥–ĺ –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ź.
    private val canComment: Int = 1//–ú–ĺ–∂–Ķ—ā –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–ł—Ä–ĺ–≤–į—ā—Ć –≤–ł–ī–Ķ–ĺ.
    private val canEdit: Int = 1//–ú–ĺ–∂–Ķ—ā –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć —Ä–Ķ–ī–į–ļ—ā–ł—Ä–ĺ–≤–į—ā—Ć –≤–ł–ī–Ķ–ĺ.
    private val canLike: Int = 1//–ú–ĺ–∂–Ķ—ā –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –ī–ĺ–Ī–į–≤–ł—ā—Ć –≤–ł–ī–Ķ–ĺ –≤ —Ā–Ņ–ł—Ā–ĺ–ļ <<–ú–Ĺ–Ķ –Ĺ—Ä–į–≤–ł—ā—Ā—Ź>>.
    private val canRepost: Int = 1//–ú–ĺ–∂–Ķ—ā –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć —Ā–ī–Ķ–Ľ–į—ā—Ć —Ä–Ķ–Ņ–ĺ—Ā—ā –≤–ł–ī–Ķ–ĺ.
    private val canSubscribe: Int = 1//–ú–ĺ–∂–Ķ—ā –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –Ņ–ĺ–ī–Ņ–ł—Ā–į—ā—Ć—Ā—Ź –Ĺ–į –į–≤—ā–ĺ—Ä–į –≤–ł–ī–Ķ–ĺ.
    private val canAddToFaves: Int = 1//–ú–ĺ–∂–Ķ—ā –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –ī–ĺ–Ī–į–≤–ł—ā—Ć –≤–ł–ī–Ķ–ĺ –≤ –ł–∑–Ī—Ä–į–Ĺ–Ĺ–ĺ–Ķ.
    private val canAttachLink: Int = 1//–ú–ĺ–∂–Ķ—ā –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –Ņ—Ä–ł–ļ—Ä–Ķ–Ņ–ł—ā—Ć –ļ–Ĺ–ĺ–Ņ–ļ—É –ī–Ķ–Ļ—Ā—ā–≤–ł—Ź –ļ –≤–ł–ī–Ķ–ĺ.
    private val width: Int = 200 //–®–ł—Ä–ł–Ĺ–į –≤–ł–ī–Ķ–ĺ.
    private val height: Int = 200// –í—č—Ā–ĺ—ā–į –≤–ł–ī–Ķ–ĺ.
    private val userId: Int =
        1//–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ź, –∑–į–≥—Ä—É–∑–ł–≤—ą–Ķ–≥–ĺ –≤–ł–ī–Ķ–ĺ, –Ķ—Ā–Ľ–ł –ĺ–Ĺ–ĺ –Ī—č–Ľ–ĺ –∑–į–≥—Ä—É–∂–Ķ–Ĺ–ĺ –≤ –≥—Ä—É–Ņ–Ņ—É –ĺ–ī–Ĺ–ł–ľ –ł–∑ —É—á–į—Ā—ā–Ĺ–ł–ļ–ĺ–≤.
    private val converting: Int = 1//–ö–ĺ–Ĺ–≤–Ķ—Ä—ā–ł—Ä—É–Ķ—ā—Ā—Ź –Ľ–ł –≤–ł–ī–Ķ–ĺ.
    private val added: Int = 1//–Ē–ĺ–Ī–į–≤–Ľ–Ķ–Ĺ–ĺ –Ľ–ł –≤–ł–ī–Ķ–ĺ –≤ –į–Ľ—Ć–Ī–ĺ–ľ—č –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ź.
    private val isSubscribed: Int = 1//–ü–ĺ–ī–Ņ–ł—Ā–į–Ĺ –Ľ–ł –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –Ĺ–į –į–≤—ā–ĺ—Ä–į –≤–ł–ī–Ķ–ĺ.
    private val repeat: Int = 1//–ü–ĺ–Ľ–Ķ –≤–ĺ–∑–≤—Ä–į—Č–į–Ķ—ā—Ā—Ź –≤ —ā–ĺ–ľ —Ā–Ľ—É—á–į–Ķ, –Ķ—Ā–Ľ–ł –≤–ł–ī–Ķ–ĺ –∑–į—Ü–ł–ļ–Ľ–Ķ–Ĺ–ĺ, –≤—Ā–Ķ–≥–ī–į —Ā–ĺ–ī–Ķ—Ä–∂–ł—ā 1
    private val typeVideo: String = "–Ę–ł–Ņ –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā–ł. –ú–ĺ–∂–Ķ—ā –Ņ—Ä–ł–Ĺ–ł–ľ–į—ā—Ć –∑–Ĺ–į—á–Ķ–Ĺ–ł—Ź: video, music_video, movie."
    private val balance: Int = 1//–Ď–į–Ľ–į–Ĺ—Ā –ī–ĺ–Ĺ–į—ā–ĺ–≤ –≤ –Ņ—Ä—Ź–ľ–ĺ–Ļ —ā—Ä–į–Ĺ—Ā–Ľ—Ź—Ü–ł–ł.
    private val liveStatus: String =
        "–°—ā–į—ā—É—Ā –Ņ—Ä—Ź–ľ–ĺ–Ļ —ā—Ä–į–Ĺ—Ā–Ľ—Ź—Ü–ł–ł. –ú–ĺ–∂–Ķ—ā –Ņ—Ä–ł–Ĺ–ł–ľ–į—ā—Ć –∑–Ĺ–į—á–Ķ–Ĺ–ł—Ź: waiting, started, finished, failed, upcoming."
    private val live: Int =
        1//–ü–ĺ–Ľ–Ķ –≤–ĺ–∑–≤—Ä–į—Č–į–Ķ—ā—Ā—Ź –≤ —ā–ĺ–ľ —Ā–Ľ—É—á–į–Ķ, –Ķ—Ā–Ľ–ł –≤–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā—Ć —Ź–≤–Ľ—Ź–Ķ—ā—Ā—Ź –Ņ—Ä—Ź–ľ–ĺ–Ļ —ā—Ä–į–Ĺ—Ā–Ľ—Ź—Ü–ł–Ķ–Ļ, –≤—Ā–Ķ–≥–ī–į —Ā–ĺ–ī–Ķ—Ä–∂–ł—ā 1
    private val upcoming: Int = 1//–ü–ĺ–Ľ–Ķ —Ā–≤–ł–ī–Ķ—ā–Ķ–Ľ—Ć—Ā—ā–≤—É–Ķ—ā –ĺ —ā–ĺ–ľ, —á—ā–ĺ —ā—Ä–į–Ĺ—Ā–Ľ—Ź—Ü–ł—Ź —Ā–ļ–ĺ—Ä–ĺ –Ĺ–į—á–Ĺ—Ď—ā—Ā—Ź. –Ē–Ľ—Ź live =1.
    private val spectators: Int = 1//–ö–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ –∑—Ä–ł—ā–Ķ–Ľ–Ķ–Ļ –Ņ—Ä—Ź–ľ–ĺ–Ļ —ā—Ä–į–Ĺ—Ā–Ľ—Ź—Ü–ł–ł.
    private val likes: VideoLikes = VideoLikes//object –°–ĺ–ī–Ķ—Ä–∂–ł—ā –ĺ–Ī—ä–Ķ–ļ—ā –ĺ—ā–ľ–Ķ—ā–ļ–ł ¬ę–ú–Ĺ–Ķ –Ĺ—Ä–į–≤–ł—ā—Ā—Ź¬Ľ.
    private val reposts: Reposts = Reposts//object –°–ĺ–ī–Ķ—Ä–∂–ł—ā –ĺ–Ī—ä–Ķ–ļ—ā —Ä–Ķ–Ņ–ĺ—Ā—ā–į.
}

class AudioAttachment() : Attachment("audio") {
    private val idAudio: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –į—É–ī–ł–ĺ–∑–į–Ņ–ł—Ā–ł.
    private val ownerId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į –į—É–ī–ł–ĺ–∑–į–Ņ–ł—Ā–ł.
    private val artist: String = "–ė—Ā–Ņ–ĺ–Ľ–Ĺ–ł—ā–Ķ–Ľ—Ć."
    private val title: String = "–Ě–į–∑–≤–į–Ĺ–ł–Ķ –ļ–ĺ–ľ–Ņ–ĺ–∑–ł—Ü–ł–ł."
    private val duration: Int = 10 // –Ē–Ľ–ł—ā–Ķ–Ľ—Ć–Ĺ–ĺ—Ā—ā—Ć –į—É–ī–ł–ĺ–∑–į–Ņ–ł—Ā–ł –≤ —Ā–Ķ–ļ—É–Ĺ–ī–į—Ö.
    private val urlAudio: String = "www.–°—Ā—č–Ľ–ļ–į –Ĺ–į mp3"
    private val lyrics: Int = 1 // –ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä —ā–Ķ–ļ—Ā—ā–į –į—É–ī–ł–ĺ–∑–į–Ņ–ł—Ā–ł (–Ķ—Ā–Ľ–ł –ī–ĺ—Ā—ā—É–Ņ–Ĺ–ĺ).
    private val albumId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –į–Ľ—Ć–Ī–ĺ–ľ–į, –≤ –ļ–ĺ—ā–ĺ—Ä–ĺ–ľ –Ĺ–į—Ö–ĺ–ī–ł—ā—Ā—Ź –į—É–ī–ł–ĺ–∑–į–Ņ–ł—Ā—Ć (–Ķ—Ā–Ľ–ł –Ņ—Ä–ł—Ā–≤–ĺ–Ķ–Ĺ).
    private val genreId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –∂–į–Ĺ—Ä–į –ł–∑ —Ā–Ņ–ł—Ā–ļ–į –į—É–ī–ł–ĺ –∂–į–Ĺ—Ä–ĺ–≤.
    private val date: Int = 1 //–Ē–į—ā–į –ī–ĺ–Ī–į–≤–Ľ–Ķ–Ĺ–ł—Ź.
    private val noSearch: Int =
        1 // 1, –Ķ—Ā–Ľ–ł –≤–ļ–Ľ—é—á–Ķ–Ĺ–į –ĺ–Ņ—Ü–ł—Ź ¬ę–Ě–Ķ –≤—č–≤–ĺ–ī–ł—ā—Ć –Ņ—Ä–ł –Ņ–ĺ–ł—Ā–ļ–Ķ¬Ľ. –ē—Ā–Ľ–ł –ĺ–Ņ—Ü–ł—Ź –ĺ—ā–ļ–Ľ—é—á–Ķ–Ĺ–į, –Ņ–ĺ–Ľ–Ķ –Ĺ–Ķ –≤–ĺ–∑–≤—Ä–į—Č–į–Ķ—ā—Ā—Ź.
    private val isHq: Int = 1 // 1, –Ķ—Ā–Ľ–ł –į—É–ī–ł–ĺ –≤ –≤—č—Ā–ĺ–ļ–ĺ–ľ –ļ–į—á–Ķ—Ā—ā–≤–Ķ.
}

class DocAttachment() : Attachment("doc") {
    private val idDoc: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä —Ą–į–Ļ–Ľ–į.
    private val ownerId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ź, –∑–į–≥—Ä—É–∑–ł–≤—ą–Ķ–≥–ĺ —Ą–į–Ļ–Ľ.
    private val title: String = "–Ě–į–∑–≤–į–Ĺ–ł–Ķ —Ą–į–Ļ–Ľ–į."
    private val size: Int = 1 //–†–į–∑–ľ–Ķ—Ä —Ą–į–Ļ–Ľ–į –≤ –Ī–į–Ļ—ā–į—Ö.
    private val ext: String = "–†–į—Ā—ą–ł—Ä–Ķ–Ĺ–ł–Ķ —Ą–į–Ļ–Ľ–į."
    private val urlDoc: String = "–ź–ī—Ä–Ķ—Ā —Ą–į–Ļ–Ľ–į, –Ņ–ĺ –ļ–ĺ—ā–ĺ—Ä–ĺ–ľ—É –Ķ–≥–ĺ –ľ–ĺ–∂–Ĺ–ĺ –∑–į–≥—Ä—É–∑–ł—ā—Ć."
    private val date: Int = (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į —Ā–ĺ–∑–ī–į–Ĺ–ł—Ź –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val typeDoc: Int = 1 //–Ę–ł–Ņ —Ą–į–Ļ–Ľ–į.  –í–ĺ–∑–ľ–ĺ–∂–Ĺ—č–Ķ –∑–Ĺ–į—á–Ķ–Ĺ–ł—Ź:
    private val preview: Preview = Preview //–Ę–ł–Ņ —Ą–į–Ļ–Ľ–į.  –í–ĺ–∑–ľ–ĺ–∂–Ĺ—č–Ķ –∑–Ĺ–į—á–Ķ–Ĺ–ł—Ź:
}

class GraffitiAttachment() : Attachment("graffiti") {
    private val id: Int = 1 //–ł–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≥—Ä–į—Ą—Ą–ł—ā–ł
    private val ownerId: Int = 1 //–ł–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –į–≤—ā–ĺ—Ä–į –≥—Ä–į—Ą—Ą–ł—ā–ł.
    private val photo130: String = "URL –ł–∑–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź –ī–Ľ—Ź –Ņ—Ä–Ķ–ī–Ņ—Ä–ĺ—Ā–ľ–ĺ—ā—Ä–į"
    private val photo604: String = "URL –Ņ–ĺ–Ľ–Ĺ–ĺ—Ä–į–∑–ľ–Ķ—Ä–Ĺ–ĺ–≥–ĺ –ł–∑–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź."
}

class LinkAttachment() : Attachment("link") {
    private val urlLink: String = "URL —Ā—Ā—č–Ľ–ļ–ł"
    private val title: String = "–ó–į–≥–ĺ–Ľ–ĺ–≤–ĺ–ļ —Ā—Ā—č–Ľ–ļ–ł"
    private val caption: String = "–ü–ĺ–ī–Ņ–ł—Ā—Ć —Ā—Ā—č–Ľ–ļ–ł (–Ķ—Ā–Ľ–ł –ł–ľ–Ķ–Ķ—ā—Ā—Ź)."
    private val description: String = "–ě–Ņ–ł—Ā–į–Ĺ–ł–Ķ —Ā—Ā—č–Ľ–ļ–ł."
    private val photo: PhotoLinkAttachment = PhotoLinkAttachment
    private val product: ProductLinkAttachment = ProductLinkAttachment
    private val button: ButtonLinkAttachment = ButtonLinkAttachment
    private val previewPage: String = "–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č —Ā –ļ–ĺ–Ĺ—ā–Ķ–Ĺ—ā–ĺ–ľ"
    private val previewUrl: String = "URL —Ā—ā—Ä–į–Ĺ–ł—Ü—č —Ā –ļ–ĺ–Ĺ—ā–Ķ–Ĺ—ā–ĺ–ľ –ī–Ľ—Ź –Ņ—Ä–Ķ–ī–Ņ—Ä–ĺ—Ā–ľ–ĺ—ā—Ä–į —Ā–ĺ–ī–Ķ—Ä–∂–ł–ľ–ĺ–≥–ĺ —Ā—ā—Ä–į–Ĺ–ł—Ü—č"
}

class NoteAttachment() : Attachment("note") {
    private val idNote: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –∑–į–ľ–Ķ—ā–ļ–ł.
    private val ownerIdNote: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į –∑–į–ľ–Ķ—ā–ļ–ł.
    private val title: String = "–ó–į–≥–ĺ–Ľ–ĺ–≤–ĺ–ļ –∑–į–ľ–Ķ—ā–ļ–ł."
    private val text: String = "–Ę–Ķ–ļ—Ā—ā –∑–į–ľ–Ķ—ā–ļ–ł."
    private val date: Int = (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į —Ā–ĺ–∑–ī–į–Ĺ–ł—Ź –∑–į–ľ–Ķ—ā–ļ–ł –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val comments: Int = 1 //–ö–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–į—Ä–ł–Ķ–≤.
    private val readComments: Int =
        1 //–ö–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ –Ņ—Ä–ĺ—á–ł—ā–į–Ĺ–Ĺ—č—Ö –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–į—Ä–ł–Ķ–≤ (—ā–ĺ–Ľ—Ć–ļ–ĺ –Ņ—Ä–ł –∑–į–Ņ—Ä–ĺ—Ā–Ķ –ł–Ĺ—Ą–ĺ—Ä–ľ–į—Ü–ł–ł –ĺ –∑–į–ľ–Ķ—ā–ļ–Ķ —ā–Ķ–ļ—É—Č–Ķ–≥–ĺ –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ź).
    private val viewUrl: String = "URL —Ā—ā—Ä–į–Ĺ–ł—Ü—č –ī–Ľ—Ź –ĺ—ā–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź –∑–į–ľ–Ķ—ā–ļ–ł."
    private val privacyView: String = "–Ě–į—Ā—ā—Ä–ĺ–Ļ–ļ–ł –Ņ—Ä–ł–≤–į—ā–Ĺ–ĺ—Ā—ā–ł –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–ł—Ä–ĺ–≤–į–Ĺ–ł—Ź –∑–į–ľ–Ķ—ā–ļ–ł."
    private val canComment: Int = 1 //–ē—Ā—ā—Ć –Ľ–ł –≤–ĺ–∑–ľ–ĺ–∂–Ĺ–ĺ—Ā—ā—Ć –ĺ—Ā—ā–į–≤–Ľ—Ź—ā—Ć –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–į—Ä–ł–ł.
    private val textWiki: String = "—ć–≥–ł —Ā—Ā—č–Ľ–ĺ–ļ –Ĺ–į wiki."
}

class AppAttachment() : Attachment("app") {
    private val idApp: Int = 1 //–ł–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –Ņ—Ä–ł–Ľ–ĺ–∂–Ķ–Ĺ–ł—Ź.
    private val ownerId: Int = 1 //–ł–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –Ņ—Ä–ł–Ľ–ĺ–∂–Ķ–Ĺ–ł—Ź.
    private val photo130: String = "URL –ł–∑–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź –ī–Ľ—Ź –Ņ—Ä–Ķ–ī–Ņ—Ä–ĺ—Ā–ľ–ĺ—ā—Ä–į."
    private val photo604: String = "URL –Ņ–ĺ–Ľ–Ĺ–ĺ—Ä–į–∑–ľ–Ķ—Ä–Ĺ–ĺ–≥–ĺ –ł–∑–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź."
}

class PollAttachment() : Attachment("poll") {
    private val id: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –ĺ–Ņ—Ä–ĺ—Ā–į –ī–Ľ—Ź –Ņ–ĺ–Ľ—É—á–Ķ–Ĺ–ł—Ź –ł–Ĺ—Ą–ĺ—Ä–ľ–į—Ü–ł–ł.
    private val ownerId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į –ĺ–Ņ—Ä–ĺ—Ā–į.
    private val created: Int = (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į —Ā–ĺ–∑–ī–į–Ĺ–ł—Ź –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val question: String = "–Ę–Ķ–ļ—Ā—ā –≤–ĺ–Ņ—Ä–ĺ—Ā–į."
    private val votes: Int = 1 //–ö–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ –≥–ĺ–Ľ–ĺ—Ā–ĺ–≤
    private var answers = emptyArray<AnswerPollAttachment>()
    private val anonymous: Boolean = true//–Į–≤–Ľ—Ź–Ķ—ā—Ā—Ź –Ľ–ł –ĺ–Ņ—Ä–ĺ—Ā –į–Ĺ–ĺ–Ĺ–ł–ľ–Ĺ—č–ľ
    private val multiple: Boolean = true//–Ē–ĺ–Ņ—É—Ā–ļ–į–Ķ—ā –Ľ–ł –ĺ–Ņ—Ä–ĺ—Ā –≤—č–Ī–ĺ—Ä –Ĺ–Ķ—Ā–ļ–ĺ–Ľ—Ć–ļ–ł—Ö –≤–į—Ä–ł–į–Ĺ—ā–ĺ–≤ –ĺ—ā–≤–Ķ—ā–į.
    private var answerIds =
        emptyArray<AnswerIdPollAttachment>() //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä—č –≤–į—Ä–ł–į–Ĺ—ā–ĺ–≤ –ĺ—ā–≤–Ķ—ā–į, –≤—č–Ī—Ä–į–Ĺ–Ĺ—č—Ö —ā–Ķ–ļ—É—Č–ł–ľ –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ–Ķ–ľ.
    private val endDate: Int =
        (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į –∑–į–≤–Ķ—Ä—ą–Ķ–Ĺ–ł—Ź –ĺ–Ņ—Ä–ĺ—Ā–į –≤ Unixtime. 0, –Ķ—Ā–Ľ–ł –ĺ–Ņ—Ä–ĺ—Ā –Ī–Ķ—Ā—Ā—Ä–ĺ—á–Ĺ—č–Ļ.
    private val closed: Boolean = true//–Į–≤–Ľ—Ź–Ķ—ā—Ā—Ź –Ľ–ł –ĺ–Ņ—Ä–ĺ—Ā –∑–į–≤–Ķ—Ä—ą–Ķ–Ĺ–Ĺ—č–ľ
    private val isBoard: Boolean = true//–ü—Ä–ł–ļ—Ä–Ķ–Ņ–Ľ—Ď–Ĺ –Ľ–ł –ĺ–Ņ—Ä–ĺ—Ā –ļ –ĺ–Ī—Ā—É–∂–ī–Ķ–Ĺ–ł—é
    private val canEdit: Boolean = true//–ú–ĺ–∂–Ĺ–ĺ –Ľ–ł –ĺ—ā—Ä–Ķ–ī–į–ļ—ā–ł—Ä–ĺ–≤–į—ā—Ć –ĺ–Ņ—Ä–ĺ—Ā.
    private val canVote: Boolean = true//–ú–ĺ–∂–Ĺ–ĺ –Ľ–ł –Ņ—Ä–ĺ–≥–ĺ–Ľ–ĺ—Ā–ĺ–≤–į—ā—Ć –≤ –ĺ–Ņ—Ä–ĺ—Ā–Ķ.
    private val canReport: Boolean = true//–ú–ĺ–∂–Ĺ–ĺ –Ľ–ł –Ņ–ĺ–∂–į–Ľ–ĺ–≤–į—ā—Ć—Ā—Ź –Ĺ–į –ĺ–Ņ—Ä–ĺ—Ā
    private val canShare: Boolean = true//–ú–ĺ–∂–Ĺ–ĺ –Ľ–ł –Ņ–ĺ–ī–Ķ–Ľ–ł—ā—Ć—Ā—Ź –ĺ–Ņ—Ä–ĺ—Ā–ĺ–ľ.
    private val authorId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –į–≤—ā–ĺ—Ä–į –ĺ–Ņ—Ä–ĺ—Ā–į
    private val photo: PhotoPollAttachment = PhotoPollAttachment //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –į–≤—ā–ĺ—Ä–į –ĺ–Ņ—Ä–ĺ—Ā–į
    private val background: BackgroundPollAttachment =
        BackgroundPollAttachment //–§–ĺ–Ĺ —Ā–Ĺ–ł–Ņ–Ņ–Ķ—ā–į –ĺ–Ņ—Ä–ĺ—Ā–į. –ě–Ī—ä–Ķ–ļ—ā, –ļ–ĺ—ā–ĺ—Ä—č–Ļ —Ā–ĺ–ī–Ķ—Ä–∂–ł—ā –Ņ–ĺ–Ľ—Ź:
    private var friends =
        emptyArray<FriendsPollAttachment>() //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä—č 3 –ī—Ä—É–∑–Ķ–Ļ, –ļ–ĺ—ā–ĺ—Ä—č–Ķ –Ņ—Ä–ĺ–≥–ĺ–Ľ–ĺ—Ā–ĺ–≤–į–Ľ–ł –≤ –ĺ–Ņ—Ä–ĺ—Ā–Ķ.
}

class PageAttachment() : Attachment("page") {
    private val id: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č
    private val groupId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä —Ā–ĺ–ĺ–Ī—Č–Ķ—Ā—ā–≤–į.
    private val creatorId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä —Ā–ĺ–∑–ī–į—ā–Ķ–Ľ—Ź –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č.
    private val title: String = "–Ě–į–∑–≤–į–Ĺ–ł–Ķ –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č."
    private val currentUserCanEdit: Int =
        1 //–Ķ—Ā–Ľ–ł —ā–Ķ–ļ—É—Č–ł–Ļ –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –ľ–ĺ–∂–Ķ—ā —Ä–Ķ–ī–į–ļ—ā–ł—Ä–ĺ–≤–į—ā—Ć —ā–Ķ–ļ—Ā—ā –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č, –ł–Ĺ–į—á–Ķ ‚ÄĒ 0.
    private val currentUserCanAccess: Int =
        1 //1, –Ķ—Ā–Ľ–ł —ā–Ķ–ļ—É—Č–ł–Ļ –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –ľ–ĺ–∂–Ķ—ā –ł–∑–ľ–Ķ–Ĺ—Ź—ā—Ć –Ņ—Ä–į–≤–į –ī–ĺ—Ā—ā—É–Ņ–į –Ĺ–į –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—É, –ł–Ĺ–į—á–Ķ ‚ÄĒ 0.
    private val whoCanView: Int = 1 //–ė–Ĺ—Ą–ĺ—Ä–ľ–į—Ü–ł—Ź –ĺ —ā–ĺ–ľ, –ļ—ā–ĺ –ľ–ĺ–∂–Ķ—ā –Ņ—Ä–ĺ—Ā–ľ–į—ā—Ä–ł–≤–į—ā—Ć –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—É:
    private val whoCanEdit: Int = 1 //–ė–Ĺ—Ą–ĺ—Ä–ľ–į—Ü–ł—Ź –ĺ —ā–ĺ–ľ, –ļ—ā–ĺ –ľ–ĺ–∂–Ķ—ā –Ņ—Ä–ĺ—Ā–ľ–į—ā—Ä–ł–≤–į—ā—Ć –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—É:
    private val edited: Int =
        (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į –Ņ–ĺ—Ā–Ľ–Ķ–ī–Ĺ–Ķ–≥–ĺ –ł–∑–ľ–Ķ–Ĺ–Ķ–Ĺ–ł—Ź –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime
    private val created: Int =
        (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į —Ā–ĺ–∑–ī–į–Ĺ–ł—Ź –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val editorId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ź, –ļ–ĺ—ā–ĺ—Ä—č–Ļ —Ä–Ķ–ī–į–ļ—ā–ł—Ä–ĺ–≤–į–Ľ –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—É –Ņ–ĺ—Ā–Ľ–Ķ–ī–Ĺ–ł–ľ.
    private val views: Int = 1 //–ö–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ –Ņ—Ä–ĺ—Ā–ľ–ĺ—ā—Ä–ĺ–≤ –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č.
    private val parent: String = "–į–≥–ĺ–Ľ–ĺ–≤–ĺ–ļ —Ä–ĺ–ī–ł—ā–Ķ–Ľ—Ć—Ā–ļ–ĺ–Ļ —Ā—ā—Ä–į–Ĺ–ł—Ü—č –ī–Ľ—Ź –Ĺ–į–≤–ł–≥–į—Ü–ł–ł, –Ķ—Ā–Ľ–ł –Ķ—Ā—ā—Ć."
    private val parent2: String = "–ó–į–≥–ĺ–Ľ–ĺ–≤–ĺ–ļ –≤—ā–ĺ—Ä–ĺ–Ļ —Ä–ĺ–ī–ł—ā–Ķ–Ľ—Ć—Ā–ļ–ĺ–Ļ —Ā—ā—Ä–į–Ĺ–ł—Ü—č –ī–Ľ—Ź –Ĺ–į–≤–ł–≥–į—Ü–ł–ł, –Ķ—Ā–Ľ–ł –Ķ—Ā—ā—Ć."
    private val source: String = "–Ę–Ķ–ļ—Ā—ā —Ā—ā—Ä–į–Ĺ–ł—Ü—č –≤ –≤–ł–ļ–ł-—Ą–ĺ—Ä–ľ–į—ā–Ķ, –Ķ—Ā–Ľ–ł –Ī—č–Ľ –∑–į–Ņ—Ä–ĺ—ą–Ķ–Ĺ."
    private val html: String = "–Ę–Ķ–ļ—Ā—ā —Ā—ā—Ä–į–Ĺ–ł—Ü—č –≤ html-—Ą–ĺ—Ä–ľ–į—ā–Ķ, –Ķ—Ā–Ľ–ł –Ī—č–Ľ –∑–į–Ņ—Ä–ĺ—ą–Ķ–Ĺ."
    private val viewUrl: String = "–ź–ī—Ä–Ķ—Ā —Ā—ā—Ä–į–Ĺ–ł—Ü—č –ī–Ľ—Ź –ĺ—ā–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź –≤–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü—č."
}

class AlbumAttachment() : Attachment("album") {
    private val id: Int = 1 //–ł–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –į–Ľ—Ć–Ī–ĺ–ľ–į
    private val thumb: ThumbAlbumAttachment = ThumbAlbumAttachment //–ĺ–Ī–Ľ–ĺ–∂–ļ–į –į–Ľ—Ć–Ī–ĺ–ľ–į, –ĺ–Ī—ä–Ķ–ļ—ā photo.
    private val ownerId: Int = 1 //–ł–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į –į–Ľ—Ć–Ī–ĺ–ľ–į
    private val title: String = "–Ĺ–į–∑–≤–į–Ĺ–ł–Ķ –į–Ľ—Ć–Ī–ĺ–ľ–į."
    private val description: String = "–ĺ–Ņ–ł—Ā–į–Ĺ–ł–Ķ –į–Ľ—Ć–Ī–ĺ–ľ–į."
    private val created: Int = (System.currentTimeMillis() / 1000).toInt()//–ī–į—ā–į —Ā–ĺ–∑–ī–į–Ĺ–ł—Ź –į–Ľ—Ć–Ī–ĺ–ľ–į –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val updated: Int =
        (System.currentTimeMillis() / 1000).toInt()//–ī–į—ā–į –Ņ–ĺ—Ā–Ľ–Ķ–ī–Ĺ–Ķ–≥–ĺ –ĺ–Ī–Ĺ–ĺ–≤–Ľ–Ķ–Ĺ–ł—Ź –į–Ľ—Ć–Ī–ĺ–ľ–į –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val size: Int = 1 //–ļ–ĺ–Ľ–ł—á–Ķ—Ā—ā–≤–ĺ —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł–Ļ –≤ –į–Ľ—Ć–Ī–ĺ–ľ–Ķ.
}

class PhotosListAttachment() : Attachment("photosList") {
}

class MarketAttachment() : Attachment("market") {
    private val id: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä —ā–ĺ–≤–į—Ä–į
    private val ownerId: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į —ā–ĺ–≤–į—Ä–į.
    private val title: String = "–Ě–į–∑–≤–į–Ĺ–ł–Ķ —ā–ĺ–≤–į—Ä–į."
    private val description: String = "–Ę–Ķ–ļ—Ā—ā –ĺ–Ņ–ł—Ā–į–Ĺ–ł—Ź —ā–ĺ–≤–į—Ä–į."
    private val price: PriceMarketAttachment = PriceMarketAttachment
    private val dimensions: DimensionsMarketAttachment = DimensionsMarketAttachment
    private val weight: Int = 100 //–í–Ķ—Ā –≤ –≥—Ä–į–ľ–ľ–į—Ö.
    private val category: CategoryMarketAttachment = CategoryMarketAttachment
    private val date: String = "URL –ł–∑–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź-–ĺ–Ī–Ľ–ĺ–∂–ļ–ł —ā–ĺ–≤–į—Ä–į."
    private val edited: Int =
        (System.currentTimeMillis() / 1000).toInt()//–Ē–į—ā–į —Ā–ĺ–∑–ī–į–Ĺ–ł—Ź —ā–ĺ–≤–į—Ä–į –≤ —Ą–ĺ—Ä–ľ–į—ā–Ķ Unixtime.
    private val availability: Int = 1 //–°—ā–į—ā—É—Ā –ī–ĺ—Ā—ā—É–Ņ–Ĺ–ĺ—Ā—ā–ł —ā–ĺ–≤–į—Ä–į. –í–ĺ–∑–ľ–ĺ–∂–Ĺ—č–Ķ –∑–Ĺ–į—á–Ķ–Ĺ–ł—Ź:
    private val isFavorite: Boolean = true//rue, –Ķ—Ā–Ľ–ł –ĺ–Ī—ä–Ķ–ļ—ā –ī–ĺ–Ī–į–≤–Ľ–Ķ–Ĺ –≤ –∑–į–ļ–Ľ–į–ī–ļ–ł —É —ā–Ķ–ļ—É—Č–Ķ–≥–ĺ –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ź.
    private val sku: String = "–ź—Ä—ā–ł–ļ—É–Ľ —ā–ĺ–≤–į—Ä–į, –Ņ—Ä–ĺ–ł–∑–≤–ĺ–Ľ—Ć–Ĺ–į—Ź —Ā—ā—Ä–ĺ–ļ–į –ī–Ľ–ł–Ĺ–ĺ–Ļ –ī–ĺ 50 —Ā–ł–ľ–≤–ĺ–Ľ–ĺ–≤"
}

class MaketAlbumAttachment() : Attachment("marketAlbum") {
    private val id: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –Ņ–ĺ–ī–Ī–ĺ—Ä–ļ–ł
    private val ownerId: Int = 1 // –ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤–Ľ–į–ī–Ķ–Ľ—Ć—Ü–į –Ņ–ĺ–ī–Ī–ĺ—Ä–ļ–ł
    private val title: String = "–Ě–į–∑–≤–į–Ĺ–ł–Ķ –Ņ–ĺ–ī–Ī–ĺ—Ä–ļ–ł."
    private val isMain: Boolean = true//–Į–≤–Ľ—Ź–Ķ—ā—Ā—Ź –Ľ–ł –Ņ–ĺ–ī–Ī–ĺ—Ä–ļ–į –ĺ—Ā–Ĺ–ĺ–≤–Ĺ–ĺ–Ļ.
    private val isHidden: Boolean = true//–Į–≤–Ľ—Ź–Ķ—ā—Ā—Ź –Ľ–ł –Ņ–ĺ–ī–Ī–ĺ—Ä–ļ–į —Ā–ļ—Ä—č—ā–ĺ–Ļ.
    private val photo: PhotoMaketAlbumAttachment = PhotoMaketAlbumAttachment//–Ņ–ĺ–ī–Ī–ĺ—Ä–ļ–ł, –ĺ–Ī—ä–Ķ–ļ—ā, –ĺ–Ņ–ł—Ā—č–≤–į—é—Č–ł–Ļ —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł—é.
    private val count: Int = 1 //–ß–ł—Ā–Ľ–ĺ —ā–ĺ–≤–į—Ä–ĺ–≤ –≤ –Ņ–ĺ–ī–Ī–ĺ—Ä–ļ–Ķ.
}

class StickerAttachment() : Attachment("sticker") {
    private val id: Int = 1 //–ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –Ĺ–į–Ī–ĺ—Ä–į
    private val stickerId: Int = 1 // –ė–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä —Ā—ā–ł–ļ–Ķ—Ä–į.
    private val title: String = "–Ě–į–∑–≤–į–Ĺ–ł–Ķ –Ņ–ĺ–ī–Ī–ĺ—Ä–ļ–ł."
    private var images = emptyArray<ImagesStickerAttachment>()
    private var imagesWithBackground = emptyArray<ImageWithBackgroundStickerAttachment>()
    private val animationUrl: String = "URL –į–Ĺ–ł–ľ–į—Ü–ł–ł —Ā—ā–ł–ļ–Ķ—Ä–į."
    private val isAllowed: Boolean = true//–ė–Ĺ—Ą–ĺ—Ä–ľ–į—Ü–ł—Ź –ĺ —ā–ĺ–ľ, –ī–ĺ—Ā—ā—É–Ņ–Ķ–Ĺ –Ľ–ł —Ā—ā–ł–ļ–Ķ—Ä.
}

class PrettyCardsAttachement() : Attachment("prettyCards") {
    private val cardId: String = "–ł–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –ļ–į—Ä—ā–ĺ—á–ļ–ł."
    private val clinkUrl: String = "URL –ļ–į—Ä—ā–ĺ—á–ļ–ł."
    private val title: String = "–Ņ–ĺ–ī–Ņ–ł—Ā—Ć –ļ–į—Ä—ā–ĺ—á–ļ–ł."
    private var images = emptyArray<ImagesPrettyCardsAttachement>()
}

class EventAttachment() : Attachment("event") {
    private val id: Int = 1 //–ł–ī–Ķ–Ĺ—ā–ł—Ą–ł–ļ–į—ā–ĺ—Ä –≤—Ā—ā—Ä–Ķ—á–ł
    private val time: Int = (System.currentTimeMillis() / 1000).toInt()//–≤—Ä–Ķ–ľ—Ź –Ĺ–į—á–į–Ľ–į –≤—Ā—ā—Ä–Ķ—á–ł –≤ Unixtime
    private val memberStatus: Int = 1 //–ī—Ď—ā –Ľ–ł —ā–Ķ–ļ—É—Č–ł–Ļ –Ņ–ĺ–Ľ—Ć–∑–ĺ–≤–į—ā–Ķ–Ľ—Ć –Ĺ–į –≤—Ā—ā—Ä–Ķ—á—É. –í–ĺ–∑–ľ–ĺ–∂–Ĺ—č–Ķ –∑–Ĺ–į—á–Ķ–Ĺ–ł—Ź:
    private val isFavorite: Boolean = true//–ī–ĺ–Ī–į–≤–Ľ–Ķ–Ĺ–į –Ľ–ł –≤—Ā—ā—Ä–Ķ—á–į –≤ –∑–į–ļ–Ľ–į–ī–ļ–ł.
    private val address: String = "–ľ–Ķ—Ā—ā–ĺ –Ņ—Ä–ĺ–≤–Ķ–ī–Ķ–Ĺ–ł—Ź –≤—Ā—ā—Ä–Ķ—á–ł."
    private val text: String = "—ā–Ķ–ļ—Ā—ā –ī–Ľ—Ź –ĺ—ā–ĺ–Ī—Ä–į–∂–Ķ–Ĺ–ł—Ź —Ā–Ĺ–ł–Ņ–Ņ–Ķ—ā–į."
    private val buttonText: String = "—ā–Ķ–ļ—Ā—ā –Ĺ–į –ļ–Ĺ–ĺ–Ņ–ļ–Ķ —Ā–Ĺ–ł–Ņ–Ņ–Ķ—ā–į."
    private var friends = emptyArray<FriendsEventAttachment>()
}


//            –ó–į–ī–į—á–į:
//    –Ķ—Ā—ā—Ć:
//    1.–ĺ–Ī—ä–Ķ–ļ—ā —ā–ł–Ņ–į Attachment,
//    2.–≤ –ļ–ĺ—ā–ĺ—Ä–ĺ–ľ –Ķ—Ā—ā—Ć –Ņ–ĺ–Ľ–Ķ type,
//    3.–į –≤–ĺ—ā –ļ–į–ļ–ĺ–Ķ –≤—ā–ĺ—Ä–ĺ–Ķ –Ņ–ĺ–Ľ–Ķ —É –Ĺ–Ķ–≥–ĺ –Ķ—Ā—ā—Ć - –ľ—č –Ĺ–Ķ –∑–Ĺ–į–Ķ–ľ (–ĺ–Ĺ–ĺ –ĺ–Ņ—Ä–Ķ–ī–Ķ–Ľ—Ź–Ķ—ā—Ā—Ź –Ĺ–į –Ī–į–∑–Ķ –∑–Ĺ–į—á–Ķ–Ĺ–ł—Ź –Ņ–ĺ–Ľ—Ź type).
//    4.–°–ī–Ķ–Ľ–į—ā—Ć Attachment –į–Ī—Ā—ā—Ä–į–ļ—ā–Ĺ—č–ľ –ļ–Ľ–į—Ā—Ā–ĺ–ľ.
//    –í—č–Ņ–ĺ–Ľ–Ĺ–ł—ā—Ć:
//   –ė–Ĺ—Ą–ĺ—Ä–ľ–į—Ü–ł—Ź –ĺ –ľ–Ķ–ī–ł–į–≤–Ľ–ĺ–∂–Ķ–Ĺ–ł—Ź—Ö –≤ –∑–į–Ņ–ł—Ā—Ź—Ö –ł –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–į—Ä–ł—Ź—Ö –Ĺ–į —Ā—ā–Ķ–Ĺ–Ķ –≤–ĺ–∑–≤—Ä–į—Č–į–Ķ—ā—Ā—Ź –≤ –≤–ł–ī–Ķ –ľ–į—Ā—Ā–ł–≤–į attachments.
//    - –ö–į–∂–ī—č–Ļ —ć–Ľ–Ķ–ľ–Ķ–Ĺ—ā –ľ–į—Ā—Ā–ł–≤–į –Ņ—Ä–Ķ–ī—Ā—ā–į–≤–Ľ—Ź–Ķ—ā —Ā–ĺ–Ī–ĺ–Ļ –ĺ–Ī—ä–Ķ–ļ—ā —Ā –ī–≤—É–ľ—Ź –Ņ–ĺ–Ľ—Ź–ľ–ł. –ü–Ķ—Ä–≤–ĺ–Ķ –Ņ–ĺ–Ľ–Ķ ‚ÄĒ type
////    (string) —Ā–ĺ–ī–Ķ—Ä–∂–ł—ā —ā–ł–Ņ –≤–Ľ–ĺ–∂–Ķ–Ĺ–ł—Ź (photo,note,audio –ł —ā.–ī.)
//    - –í—ā–ĺ—Ä–ĺ–Ķ –Ņ–ĺ–Ľ–Ķ —Ā–ĺ–ī–Ķ—Ä–∂–ł—ā –ĺ–Ī—ä–Ķ–ļ—ā, –Ņ—Ä–Ķ–ī—Ā—ā–į–≤–Ľ—Ź—é—Č–ł–Ļ –ľ–Ķ–ī–ł–į–≤–Ľ–ĺ–∂–Ķ–Ĺ–ł–Ķ. –°—ā—Ä—É–ļ—ā—É—Ä–į –ĺ–Ī—ä–Ķ–ļ—ā–į –≤
////    —ć—ā–ĺ–ľ –Ņ–ĺ–Ľ–Ķ –∑–į–≤–ł—Ā–ł—ā –ĺ—ā –Ķ–≥–ĺ —ā–ł–Ņ–į.

//


//    1. –§–ĺ—ā–ĺ–≥—Ä–į—Ą–ł—Ź (type = photo)
//    2. –§–ĺ—ā–ĺ–≥—Ä–į—Ą–ł—Ź, –∑–į–≥—Ä—É–∂–Ķ–Ĺ–Ĺ–į—Ź –Ĺ–į–Ņ—Ä—Ź–ľ—É—é (type = posted_photo)
//    3. –í–ł–ī–Ķ–ĺ–∑–į–Ņ–ł—Ā—Ć (type = video)
//    4. –ź—É–ī–ł–ĺ–∑–į–Ņ–ł—Ā—Ć (type = audio)
//    5. –Ē–ĺ–ļ—É–ľ–Ķ–Ĺ—ā (type = doc)
//    6. –ď—Ä–į—Ą—Ą–ł—ā–ł (type = graffiti)
//    7. –°—Ā—č–Ľ–ļ–į (type = link)
//    8. –ó–į–ľ–Ķ—ā–ļ–į (type = note)
//    9. –ö–ĺ–Ĺ—ā–Ķ–Ĺ—ā –Ņ—Ä–ł–Ľ–ĺ–∂–Ķ–Ĺ–ł—Ź (type = app)
//    10. –ě–Ņ—Ä–ĺ—Ā (type = poll)
//    11. –í–ł–ļ–ł-—Ā—ā—Ä–į–Ĺ–ł—Ü–į (type = page)
//    12. –ź–Ľ—Ć–Ī–ĺ–ľ —Ā —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł—Ź–ľ–ł (type=album)
//    13. –°–Ņ–ł—Ā–ĺ–ļ —Ą–ĺ—ā–ĺ–≥—Ä–į—Ą–ł–Ļ (type=photos_list)
//    14. –Ę–ĺ–≤–į—Ä (type = market)
//    15. –ü–ĺ–ī–Ī–ĺ—Ä–ļ–į —ā–ĺ–≤–į—Ä–ĺ–≤ (type = market_album)
//    16. –°—ā–ł–ļ–Ķ—Ä (type = sticker)
//    17. –ö–į—Ä—ā–ĺ—á–ļ–ł (type = pretty_cards)
//    18. –í—Ā—ā—Ä–Ķ—á–į (type = event)
//
//    –ė–Ĺ—Ą–ĺ—Ä–ľ–į—Ü–ł—Ź –ĺ –ľ–Ķ–ī–ł–į–≤–Ľ–ĺ–∂–Ķ–Ĺ–ł—Ź—Ö –≤ –∑–į–Ņ–ł—Ā—Ź—Ö –ł –ļ–ĺ–ľ–ľ–Ķ–Ĺ—ā–į—Ä–ł—Ź—Ö –Ĺ–į —Ā—ā–Ķ–Ĺ–Ķ –≤–ĺ–∑–≤—Ä–į—Č–į–Ķ—ā—Ā—Ź –≤ –≤–ł–ī–Ķ –ľ–į—Ā—Ā–ł–≤–į
//    attachments. –ö–į–∂–ī—č–Ļ —ć–Ľ–Ķ–ľ–Ķ–Ĺ—ā –ľ–į—Ā—Ā–ł–≤–į –Ņ—Ä–Ķ–ī—Ā—ā–į–≤–Ľ—Ź–Ķ—ā —Ā–ĺ–Ī–ĺ–Ļ –ĺ–Ī—ä–Ķ–ļ—ā —Ā –ī–≤—É–ľ—Ź –Ņ–ĺ–Ľ—Ź–ľ–ł. –ü–Ķ—Ä–≤–ĺ–Ķ –Ņ–ĺ–Ľ–Ķ ‚ÄĒ type
//    (string) —Ā–ĺ–ī–Ķ—Ä–∂–ł—ā —ā–ł–Ņ –≤–Ľ–ĺ–∂–Ķ–Ĺ–ł—Ź (photo,note,audio –ł —ā.–ī.). –Ě–į–∑–≤–į–Ĺ–ł–Ķ –≤—ā–ĺ—Ä–ĺ–≥–ĺ –Ņ–ĺ–Ľ—Ź —Ā–ĺ–≤–Ņ–į–ī–į–Ķ—ā —Ā–ĺ –∑–Ĺ–į—á–Ķ–Ĺ–ł–Ķ–ľ,
//    –Ņ–Ķ—Ä–Ķ–ī–į–Ĺ–Ĺ—č–ľ –≤ type. –í—ā–ĺ—Ä–ĺ–Ķ –Ņ–ĺ–Ľ–Ķ —Ā–ĺ–ī–Ķ—Ä–∂–ł—ā –ĺ–Ī—ä–Ķ–ļ—ā, –Ņ—Ä–Ķ–ī—Ā—ā–į–≤–Ľ—Ź—é—Č–ł–Ļ –ľ–Ķ–ī–ł–į–≤–Ľ–ĺ–∂–Ķ–Ĺ–ł–Ķ. –°—ā—Ä—É–ļ—ā—É—Ä–į –ĺ–Ī—ä–Ķ–ļ—ā–į –≤
//    —ć—ā–ĺ–ľ –Ņ–ĺ–Ľ–Ķ –∑–į–≤–ł—Ā–ł—ā –ĺ—ā –Ķ–≥–ĺ —ā–ł–Ņ–į.
//    –°—Ö–Ķ–ľ–į—ā–ł—á–Ĺ–ĺ–Ķ –Ņ—Ä–Ķ–ī—Ā—ā–į–≤–Ľ–Ķ–Ĺ–ł–Ķ –ĺ–Ī—ä–Ķ–ļ—ā–į attachments –ī–Ľ—Ź –ī–≤—É—Ö –≤–Ľ–ĺ–∂–Ķ–Ĺ–ł–Ļ (—Ą–ĺ—ā–ĺ –ł –į—É–ī–ł–ĺ):
//    [{"type": "photo", "photo": {photo}}, {"type": "audio", "audio": {audio}}]
//    –ö–į–∂–ī—č–Ļ –ĺ–Ī—ä–Ķ–ļ—ā –ľ–ĺ–∂–Ķ—ā —Ā–ĺ–ī–Ķ—Ä–∂–į—ā—Ć –ī–ĺ–Ņ–ĺ–Ľ–Ĺ–ł—ā–Ķ–Ľ—Ć–Ĺ–ĺ–Ķ –Ņ–ĺ–Ľ–Ķ access_key ‚ÄĒ –ļ–Ľ—é—á –ī–ĺ—Ā—ā—É–Ņ–į –ļ –ļ–ĺ–Ĺ—ā–Ķ–Ĺ—ā—É. –ě–Ņ–ł—Ā–į–Ĺ–ł–Ķ
//    –Ņ–ĺ–Ľ—Ź access_key –í—č –ľ–ĺ–∂–Ķ—ā–Ķ –Ĺ–į–Ļ—ā–ł –Ĺ–į

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