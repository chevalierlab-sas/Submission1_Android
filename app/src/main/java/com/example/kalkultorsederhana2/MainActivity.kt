package com.example.kalkultorsederhana2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.kalkultorsederhana2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKali.setOnClickListener {
            val input1 = binding.edtNilai1.text.toString().trim()
            val input2 = binding.edtNilai2.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this,"Input Pertama Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this,"Input Kedua Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                else  ->{
                    val kali = input1.toInt() * input2.toInt()
                    binding.edtHasil.setText(kali.toString())
                }

            }

        }

        binding.btnBagi.setOnClickListener {
            val input1 = binding.edtNilai1.text.toString().trim()
            val input2 = binding.edtNilai2.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this,"Input Pertama Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this,"Input Kedua Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                else  ->{
                    val bagi = input1.toInt() / input2.toInt()
                    binding.edtHasil.setText(bagi.toString())
                }

            }

        }

        binding.btnTambah.setOnClickListener {
            val input1 = binding.edtNilai1.text.toString().trim()
            val input2 = binding.edtNilai2.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this,"Input Pertama Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this,"Input Kedua Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                else  ->{
                    val tambah = input1.toInt() + input2.toInt()
                    binding.edtHasil.setText(tambah.toString())
                }

            }

        }

        binding.btnKurang.setOnClickListener {
            val input1 = binding.edtNilai1.text.toString().trim()
            val input2 = binding.edtNilai2.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this,"Input Pertama Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this,"Input Kedua Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                else ->{
                    val kurang = input1.toInt() - input2.toInt()
                    binding.edtHasil.setText(kurang.toString())
                }

            }

        }

        binding.btnSisaBagi.setOnClickListener {
            val input1 = binding.edtNilai1.text.toString().trim()
            val input2 = binding.edtNilai2.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this,"Input Pertama Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this,"Input Kedua Belum Ada!",Toast.LENGTH_SHORT).show()
                }
                else  ->{
                    val sisaBagi = input1.toInt() % input2.toInt()
                    binding.edtHasil.setText(sisaBagi.toString())
                }

            }

        }
    }
}