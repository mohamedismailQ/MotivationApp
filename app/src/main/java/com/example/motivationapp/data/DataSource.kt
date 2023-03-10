package com.example.motivationapp.data

import com.example.motivationapp.R

class DataSource(){
   fun loadData():List<DataModel>{
       return listOf<DataModel>(
           DataModel(R.string.string1,R.drawable.image1),
           DataModel(R.string.string2,R.drawable.image2),
           DataModel(R.string.string3,R.drawable.image3),
           DataModel(R.string.string4,R.drawable.image4),
           DataModel(R.string.string5,R.drawable.image5),
           DataModel(R.string.string6,R.drawable.image6),
           DataModel(R.string.string7,R.drawable.image7),
           DataModel(R.string.string8,R.drawable.image8),
           DataModel(R.string.string9,R.drawable.image9),
           DataModel(R.string.string10,R.drawable.image10),
           DataModel(R.string.string11,R.drawable.image11)
       )
   }
}
