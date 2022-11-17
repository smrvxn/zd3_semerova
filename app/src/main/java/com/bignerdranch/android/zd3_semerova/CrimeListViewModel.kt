package com.bignerdranch.android.zd3_semerova


import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel : ViewModel(){
    val crimes = mutableListOf<Crime>()
    var i:Int=1
    var dt = Date()
    init {
        while (i<=100){
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i%2==0
        }
    }
}