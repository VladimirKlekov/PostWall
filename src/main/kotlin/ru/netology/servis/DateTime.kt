package ru.netology.servis


import java.text.SimpleDateFormat
import java.util.*

object DateTime {
    val currentDataTime: String

       get() {
           val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            return dateFormat.format(Date())
        }



//   val timestamp: String
//       get(){
//           val formatter: DateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//           val date = formatter.parse(currentDataTime) as Date
//           return date.time.toString().dropLast(3) //it is returning
//
//}
}