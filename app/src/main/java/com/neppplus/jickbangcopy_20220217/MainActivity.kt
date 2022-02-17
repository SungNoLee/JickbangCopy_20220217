package com.neppplus.jickbangcopy_20220217

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.jickbangcopy_20220217.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20220217.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mAdapter: RoomAdapter
    var mRoomList = ArrayList<RoomData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000, "서울시 동대문구", 7, "1번째 방"))
        mRoomList.add(RoomData(8000, "서울시 종로구", 4, "7번째 방"))
        mRoomList.add(RoomData(8000, "서울시 강남구", 7, "4번째 방"))
        mRoomList.add(RoomData(8000, "서울시 동대문구", 3, "2번째 방"))
        mRoomList.add(RoomData(8000, "서울시 동대문구", -1, "4번째 방"))
        mRoomList.add(RoomData(8000, "서울시 동대문구", 2, "1번째 방"))
        mRoomList.add(RoomData(8000, "서울시 동대문구", 5, "2번째 방"))

        mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        lstRoomList.adapter = mAdapter;

//        test
    }
}