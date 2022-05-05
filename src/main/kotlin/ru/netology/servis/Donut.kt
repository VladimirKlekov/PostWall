package ru.netology.servis
import ru.netology.servis.plug.Placeholder

object Donut {

    private val isDonut: Boolean = true
    private val paidDuration: Int = 10_000
    private val placeholder: Placeholder = Placeholder
    private val canPublishFreeCopy: Boolean = true
    //val all //TODO что это?
    private val duration: Int = 20000

}
//Информация о записи VK Donut:
//is_donut (boolean) — запись доступна только платным подписчикам VK Donut;
//paid_duration (integer) — время, в течение которого запись будет доступна только платным подписчикам VK Donut;
//placeholder (object) — заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
//can_publish_free_copy (boolean) — можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
//edit_mode (string) — информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
//all — всю информацию о VK Donut.
//duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.