package com.example.dessertclicker

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

data class DessertUiState(
    val DessertCurrentIndex: Int = 0,
    val CurrentDessertPrice: Int = dessertList[DessertCurrentIndex].price,
    val DessertSold: Int = 0,
    @DrawableRes val DesserImage: Int = dessertList[DessertCurrentIndex].imageId,
    val Revenue: Int = 0,
) {

}

