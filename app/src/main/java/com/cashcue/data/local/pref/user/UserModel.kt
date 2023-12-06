package com.cashcue.data.local.pref.user

data class UserModel (
    val id: Int,
    val email: String,
    val nama: String,
    val fotoUrl: String,
    val mataUang: Int,
    val saldo: Int
)