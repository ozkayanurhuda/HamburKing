package com.nurozkaya.hamburking

import java.io.Serializable

data class Menuler(var menu_id:Int,
                   var menu_adi:String,
                   var menu_resim_adi:String,
                   var menu_fiyat:Double,
                   var menu_icindekiler:String):Serializable {
}