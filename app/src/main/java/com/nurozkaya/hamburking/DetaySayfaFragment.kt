package com.nurozkaya.hamburking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.nurozkaya.hamburking.databinding.FragmentDetaySayfaBinding
import kotlinx.android.synthetic.main.fragment_kisisel_bilgi.view.*


class DetaySayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentDetaySayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_detay_sayfa, container, false)

        val bundle:DetaySayfaFragmentArgs by navArgs()
        val gelenMenu=bundle.menuNesne

        tasarim.toolbarDetaySayfa.title=gelenMenu.menu_adi + " Menü"
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarDetaySayfa)


        tasarim.imageViewMenuResim.setImageResource(resources.getIdentifier(gelenMenu.menu_resim_adi,
            "drawable",requireContext().packageName))

        tasarim.textViewMenuAdi.text=gelenMenu.menu_adi
        tasarim.textViewMenuFiyat.text=gelenMenu.menu_fiyat.toString() + "\u20BA"
        tasarim.textViewMenuIcindekiler.text=gelenMenu.menu_icindekiler

        tasarim.buttonSepeteEkle.setOnClickListener {
            Snackbar.make(it,"${gelenMenu.menu_adi} sepete eklendi", Snackbar.LENGTH_LONG).show()
        }

        return tasarim.root
    }
}