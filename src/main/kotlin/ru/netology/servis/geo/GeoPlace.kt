package ru.netology.servis.geo

object GeoPlace {

    private val id: Int = 1 //Идентификатор места.
    private val title: String = "название места."
    private val latitude: Int = 50 //Географическая широта, заданная в градусах (от -90 до 90).
    private val longitude: Int = 50 //Географическая широта, заданная в градусах (от -90 до 90).
    private val created: Int = (System.currentTimeMillis() / 1000).toInt()//Дата создания места в Unixtime.
    private val icon: String = "Иконка места, URL изображения.."
    private val checkins: Int = 1 //Число отметок в этом месте.
    private val  updated: Int = (System.currentTimeMillis() / 1000).toInt()//Дата обновления места в Unixtime.
    private val type: Int = 1 //Тип места.
    private val country: Int = 1 //Идентификатор страны.
    private val city: Int = 1 //Идентификатор города
    private val address: String = "Адрес места."

  }
//Место

//Объект, описывающий место, содержит следующие поля:
//
//
//id integer Идентификатор места.
//title string Иазвание места.
//latitude integer Географическая широта, заданная в градусах (от -90 до 90).
//longitude integer Географическая широта, заданная в градусах (от -90 до 90).
//created integer Дата создания места в Unixtime.
//icon string Иконка места, URL изображения.
//checkins integer Число отметок в этом месте.
//updated integer Дата обновления места в Unixtime.
//type integerТип места.
//country integer Идентификатор страны.
//city integer  Идентификатор города.
//address string Адрес места.