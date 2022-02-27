package com.example.rifki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.rifki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHitung.setOnClickListener{
            val input1 = binding.angka1.text.toString().trim()
            val input2 = binding.angka2.text.toString().trim()
            var hasil = 0
            when{
                TextUtils.isEmpty(input1) ->{
                    Toast.makeText(this, "input Pertama Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka1.requestFocus()
                }
                TextUtils.isEmpty(input2) ->{
                    Toast.makeText(this, "input Kedua Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka2.requestFocus()
                }
                else -> {
                    hasil = input1.toInt() * input2.toInt()
                    binding.Hasil.text = hasil.toString()
                }
            }
        }
        binding.tambah.setOnClickListener{
            val input1 = binding.angka1.text.toString().trim()
            val input2 = binding.angka2.text.toString().trim()
            var hasil = 0
            when{
                TextUtils.isEmpty(input1) ->{
                    Toast.makeText(this, "input Pertama Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka1.requestFocus()
                }
                TextUtils.isEmpty(input2) ->{
                    Toast.makeText(this, "input Kedua Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka2.requestFocus()
                }
                else -> {
                    hasil = input1.toInt() + input2.toInt()
                    binding.Hasil.text = hasil.toString()
                }
            }
        }
        binding.kurang.setOnClickListener{
            val input1 = binding.angka1.text.toString().trim()
            val input2 = binding.angka2.text.toString().trim()
            var hasil = 0
            when{
                TextUtils.isEmpty(input1) ->{
                    Toast.makeText(this, "input Pertama Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka1.requestFocus()
                }
                TextUtils.isEmpty(input2) ->{
                    Toast.makeText(this, "input Kedua Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka2.requestFocus()
                }
//                input1 < input2 ->{
//                    Toast.makeText(this, "Input Pertama Kurang dari inputan kedua", Toast.LENGTH_SHORT).show()
//                }
                else -> {
                    hasil = input1.toInt() - input2.toInt()
                    binding.Hasil.text = hasil.toString()
                }
            }
        }
        binding.bagi.setOnClickListener{
            val input1 = binding.angka1.text.toString().trim()
            val input2 = binding.angka2.text.toString().trim()
            var hasil = 0
            when{
                TextUtils.isEmpty(input1) ->{
                    Toast.makeText(this, "input Pertama Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka1.requestFocus()
                }
                TextUtils.isEmpty(input2) ->{
                    Toast.makeText(this, "input Kedua Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka2.requestFocus()
                }
                input1 < input2 ->{
                Toast.makeText(this, "Input Pertama Kurang dari inputan kedua", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    hasil = input1.toInt() / input2.toInt()
                    binding.Hasil.text = hasil.toString()
                }
            }
        }
        binding.modulus.setOnClickListener{
            val input1 = binding.angka1.text.toString().trim()
            val input2 = binding.angka2.text.toString().trim()
            var hasil = 0
            when{
                TextUtils.isEmpty(input1) ->{
                    Toast.makeText(this, "input Pertama Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka1.requestFocus()
                }
                TextUtils.isEmpty(input2) ->{
                    Toast.makeText(this, "input Kedua Belum Ada", Toast.LENGTH_SHORT).show()
                    binding.angka2.requestFocus()
                }
                else -> {
                    hasil = input1.toInt() % input2.toInt()
                    binding.Hasil.text = hasil.toString()
                }
            }
        }
    }
}