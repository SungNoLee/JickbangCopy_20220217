package com.neppplus.jickbangcopy_20220217.datas

import android.accounts.AuthenticatorDescription
import java.io.Serializable
import java.text.NumberFormat
import java.util.*
import java.util.concurrent.Flow

class RoomData (
    val price: Int,
    val address: String,
    val flow: Int,
    val description: String,
) : Serializable {
    fun getFormattedPrice() : String {
        if (this.price < 10000) {
            return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
        }
        else {
            // 소수점 이하는 버린다
            val uk = this.price / 10000
            val rest = this.price % 10000

            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }
    }
    fun getFormattedFloor() : String {
        if (this.flow > 0) {
            return "${this.flow}층"
        }
        else if (this.flow == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.flow}층"
        }
    }
}