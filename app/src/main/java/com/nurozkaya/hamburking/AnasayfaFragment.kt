package com.nurozkaya.hamburking
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.nurozkaya.hamburking.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding
    private lateinit var menuListesi:ArrayList<Menuler>
    private lateinit var adapter:MenuAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //for toolbar--------
        tasarim= DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false)
        tasarim.toolbarAnasayfa.title = ""
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)

        //for rv---------
        tasarim.rvmenu.layoutManager= StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val m1= Menuler(1,"Big Royale","big_royale",44.99,"Big King® + Chicken Royale® + Büyük Boy Patates + 4’lü Soğan Halkası + 1 L. İçecek")
        val m2=Menuler(2,"Etli Tavuklu","etli_tavuklu_burger",33.50,"Mantar Sever Gurmelere Etli ve Tavuklu Master Burger Menü + Büyük Boy Patates + Kutu İçecek")
        val m3=Menuler(3,"Izgara Tavuk","izgara_tavuk",27.95,"Mangalda Izgara Tavuk + Büyük Boy Patates + Kutu İçecek")
        val m4=Menuler(4,"King Delight","king_delight",21.99,"Seçenekler: Izgara Tavuklu Salata, Akdeniz Salata, Ton Balıklı Salata, Hot Wrap (Fiyatlar farklılık gösterebilir)")
        val m5=Menuler(5,"Gurme Tavuk","gurme_tavuk",25.50,"Ağzının tadını bilenlere dışı çıtır çıtır, içi yumuşacık tavuk göğüs fileto ve doyurucu özel ekmeğiyle Klasik Gurme Tavuk Menü + Büyük Boy Patates + Kutu Kola")
        val m6=Menuler(6,"Texas Smokehouse","texas_smokehouse",40.90,"Barbekü sos ve füme etin efsanevi buluşması; Texas Smokehouse Burger")
        val m7=Menuler(7,"Pastırmalı Whopper","pastirmali_whopper",35.50,"Pastırmalı Whopper® Menü + Büyük Boy Patates + Kutu Kola")
        val m8=Menuler(8,"Lezzet Kovası","lezzet_kovasi",19.90,"4’lü BK King Nugget® + 8’li Soğan Halkası + 4’lü Chicken Tenders® + Orta Boy Patates")
        val m9=Menuler(9,"Barbeko Burger","barbeko_burger",26.99,"Nefis Barbekü Soslu Barbeko Burger + Büyük Boy Patates + Kutu İçecek")
        val m10=Menuler(10,"Kral İkili","kral_ikili",39.99,"Big King® + King Chicken® + Büyük Boy Patates + 1 L. İçecek")
        val m11=Menuler(11,"Fish & Fries","fish_fries_menu",31.99,"Fish Burger eti, yanında çıtır çıtır büyük boy patatesi ve buz gibi Coca-Cola")
        val m12= Menuler(12,"Lezzet Kovası","karisik_lezzet_kovasi",29.99,"6’lı BK King Nugget® + 8’li Soğan Halkası + 4’lü Chicken Tenders® + Büyük Boy Patates + 1 L. İçecek")

        menuListesi= ArrayList()

        menuListesi.add(m1)
        menuListesi.add(m2)
        menuListesi.add(m3)
        menuListesi.add(m4)
        menuListesi.add(m5)
        menuListesi.add(m6)
        menuListesi.add(m7)
        menuListesi.add(m8)
        menuListesi.add(m9)
        menuListesi.add(m10)
        menuListesi.add(m11)
        menuListesi.add(m12)

        adapter= MenuAdapter(requireContext(),menuListesi)
        tasarim.rvmenu.adapter=adapter

        return tasarim.root
    }
}