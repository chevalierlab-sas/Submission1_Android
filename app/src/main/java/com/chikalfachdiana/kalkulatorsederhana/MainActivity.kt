package com.chikalfachdiana.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.chikalfachdiana.kalkulatorsederhana.databinding.ActivityMainBinding
import java.text.DecimalFormat



class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.button.setOnClickListener {
                val input1 = binding.edtNilai1.text.toString().trim()
                val input2 = binding.edtNilai2.text.toString().trim()
                var hasil = 0
                when {
                    TextUtils.isEmpty(input1) -> {
                        Toast.makeText(this, "Input Pertama Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtNilai1.requestFocus()
                    }
                    TextUtils.isEmpty(input2) -> {
                        Toast.makeText(this, "Input Kedua Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtNilai2.requestFocus()
                    }
                    else -> {
                        hasil = input1.toInt() * input2.toInt()
                        binding.tvHasil.text = hasil.toString()
                    }
                }
            }
            binding.button2.setOnClickListener {
                val input1 = binding.edtNilai1.text.toString().trim()
                val input2 = binding.edtNilai2.text.toString().trim()
                var hasil = 0.0
                when {
                    TextUtils.isEmpty(input1) -> {
                        Toast.makeText(this, "Input Pertama Belum Ada!",
                            Toast.LENGTH_SHORT).show()
                        binding.edtNilai1.requestFocus()
                    }
                    TextUtils.isEmpty(input2) -> {
                        Toast.makeText(this, "Input Kedua Belum Ada!",
                            Toast.LENGTH_SHORT).show()
                        binding.edtNilai2.requestFocus()
                    }
                    else -> {
                        hasil = input1.toDouble() / input2.toDouble()
                        binding.tvHasil.text = hasil.toString()
                    }
                }
            }
            binding.button3.setOnClickListener {
                val input1 = binding.edtNilai1.text.toString().trim()
                val input2 = binding.edtNilai2.text.toString().trim()
                var hasil = 0
                when {
                    TextUtils.isEmpty(input1) -> {
                        Toast.makeText(this, "Input Pertama Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtNilai1.requestFocus()
                    }
                    TextUtils.isEmpty(input2) -> {
                        Toast.makeText(this, "Input Kedua Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtNilai2.requestFocus()
                    }
                    else -> {
                        hasil = input1.toInt() + input2.toInt()
                        binding.tvHasil.text = hasil.toString()
                    }
                }
            }
            binding.button4.setOnClickListener {
                val input1 = binding.edtNilai1.text.toString().trim()
                val input2 = binding.edtNilai2.text.toString().trim()
                var hasil = 0
                when {
                    TextUtils.isEmpty(input1) -> {
                        Toast.makeText(this, "Input Pertama Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtNilai1.requestFocus()
                    }
                    TextUtils.isEmpty(input2) -> {
                        Toast.makeText(this, "Input Kedua Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtNilai2.requestFocus()
                    }
                    else -> {
                        hasil = input1.toInt() - input2.toInt()
                        binding.tvHasil.text = hasil.toString()
                    }
                }
            }
            binding.button5.setOnClickListener {
                val input1 = binding.edtNilai1.text.toString().trim()
                val input2 = binding.edtNilai2.text.toString().trim()
                var hasil = 0
                when {
                    TextUtils.isEmpty(input1) -> {
                        Toast.makeText(this, "Input Pertama Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtNilai1.requestFocus()
                    }
                    TextUtils.isEmpty(input2) -> {
                        Toast.makeText(this, "Input Kedua Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtNilai2.requestFocus()
                    }
                    else -> {
                        hasil = input1.toInt() % input2.toInt()
                        binding.tvHasil.text = hasil.toString()
                    }
                }
            }
        }
}