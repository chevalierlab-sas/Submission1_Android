package com.muhammadsadri.kalkulatorkotlinsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.muhammadsadri.kalkulatorkotlinsederhana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTambah.setOnClickListener{
            val input1 = binding.edtBilanganPertama.text.toString().trim()
            val input2 = binding.edtBilanganKedua.text.toString().trim()
            when {
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Pertama belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganPertama.requestFocus()
                }
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Kedua belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganKedua.requestFocus()
            }
                else -> {
                    val hasil = input1.toInt() + input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
        binding.btnKurang.setOnClickListener{
            val input1 = binding.edtBilanganPertama.text.toString().trim()
            val input2 = binding.edtBilanganKedua.text.toString().trim()
            when {
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Pertama belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganPertama.requestFocus()
                }
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Kedua belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toInt() - input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
        binding.btnKali.setOnClickListener{
            val input1 = binding.edtBilanganPertama.text.toString().trim()
            val input2 = binding.edtBilanganKedua.text.toString().trim()
            when {
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Pertama belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganPertama.requestFocus()
                }
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Kedua belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toInt() * input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
        binding.btnSisaBagi.setOnClickListener{
            val input1 = binding.edtBilanganPertama.text.toString().trim()
            val input2 = binding.edtBilanganKedua.text.toString().trim()
            when {
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Pertama belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganPertama.requestFocus()
                }
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Kedua belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toInt() % input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
        binding.btnBagi.setOnClickListener{
            val input1 = binding.edtBilanganPertama.text.toString().trim()
            val input2 = binding.edtBilanganKedua.text.toString().trim()
            when {
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Pertama belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganPertama.requestFocus()
                }
                TextUtils.isEmpty(input1)->{
                    Toast.makeText(this, "Input Kedua belum ada !", Toast.LENGTH_SHORT).show()
                    binding.edtBilanganKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toDouble() / input2.toDouble()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
    }
}