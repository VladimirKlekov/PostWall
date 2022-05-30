package ru.netology.servis


object Comments{
    private var count:Int  = 1
    private val canPost:Int = 1
    private val groupsCanPost:Int = 1
    private val canClose:Boolean = true
    private val canOpen:Boolean = true
}

//Информация о комментариях к записи, объект с полями:
//count (integer) — количество комментариев;
//can_post* (integer) — информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
//groups_can_post (integer) — информация о том, могут ли сообщества комментировать запись;
//can_close(boolean) — может ли текущий пользователь закрыть комментарии к записи;
//can_open(boolean) — может ли текущий пользователь открыть комментарии к записи.