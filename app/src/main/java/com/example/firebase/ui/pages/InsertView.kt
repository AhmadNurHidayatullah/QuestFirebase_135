package com.example.firebase.ui.pages

import com.example.firebase.model.Mahasiswa
import com.example.firebase.ui.viewmodel.MahasiswaEvent

fun MahasiswaEvent.toMhsModel(): Mahasiswa = Mahasiswa(
    nim = nim,
    nama = nama,
    alamat = alamat,
    gender = gender,
    kelas = kelas,
    angkatan = angkatan
)