package com.neppplus.jickbangcopy_20220217.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jickbangcopy_20220217.R
import com.neppplus.jickbangcopy_20220217.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tRow = convertView

        if (tRow == null) {
            tRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item,null)
        }

        val row = tRow!!

        val data = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddressAndFloow)
        val txtDescriptor = row.findViewById<TextView>(R.id.txtDescription)

        txtDescriptor.text = data.description
        txtAddress.text = "${data.address}, ${data.getFormattedFloor()}"
        return row
    }
}