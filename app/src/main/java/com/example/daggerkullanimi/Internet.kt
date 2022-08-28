package com.example.daggerkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor (var adres:Adres)  {

    fun basvuruYap(){
        Log.e("Sonuç","İnternet başvurunuz ${adres.adresBilgisi} adresi için oluşturuldu")
    }
}