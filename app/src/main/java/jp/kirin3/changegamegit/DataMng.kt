package jp.kirin3.changegamegit

import android.content.Context
import android.content.SharedPreferences
import android.widget.ListView
import java.util.ArrayList

class DataMng {

    internal var mContext: Context
    internal val sSharedData: SharedPreferences


    internal val USER_ID = "UserId"
    internal val USER_NAME = "UserName"
    internal val FB_START = arrayOf("", "star1", "star2", "star3", "star4", "star5")
    internal val CLEAR_NAME = arrayOf("", "ClearStar1", "ClearStar2", "ClearStar3", "ClearStar4", "ClearStar5")
    internal val CLEAR_GAME_TIME = arrayOf("", "VestGameTime1", "VestGameTime2", "VestGameTime3", "VestGameTime4", "VestGameTime5")

    internal val TARMINAL = "tarminal"

    // ランキングの最大表示数
    internal val OUTPUT_RANKING_NUM = 1000
    // 標準のユーザー名
    internal val DEFAULT_USER_NAME = "名無しさん"

    private val user: User? = null
    private var rankNo: Int = 0

    constructor(context: Context) {
        mContext = context
        sSharedData = context.getSharedPreferences("DataSave", Context.MODE_PRIVATE)

        rankNo = 0
    }





}