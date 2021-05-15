package com.nurozkaya.hamburking

import android.content.Context
import android.view.LayoutInflater
import android.view.Menu
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.nurozkaya.hamburking.databinding.MenuCardBinding

class MenuAdapter (var mContext: Context, var menuListesi:List<Menuler>) :RecyclerView.Adapter<MenuAdapter.CardTasarimTutucu> (){
    inner class CardTasarimTutucu(menuCardBinding: MenuCardBinding):RecyclerView.ViewHolder(menuCardBinding.root) {
        var tasarim:MenuCardBinding

        init {
            this.tasarim=menuCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
      //  val layoutInflater=LayoutInflater.from(mContext)
        val layoutInflater=LayoutInflater.from(mContext)
        val tasarim= MenuCardBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val menu = menuListesi.get(position)

        holder.tasarim.imageViewMenu.setImageResource(mContext.resources.getIdentifier(
            menu.menu_resim_adi, "drawable", mContext.packageName))

        holder.tasarim.textViewAd.text=menu.menu_adi

        holder.tasarim.menuCardview.setOnClickListener{
            val gecis=AnasayfaFragmentDirections.menuDetayaGecis(menu)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return menuListesi.size
    }
}