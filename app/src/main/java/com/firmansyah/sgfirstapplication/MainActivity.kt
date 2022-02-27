package com.firmansyah.sgfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.firmansyah.sgfirstapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener{
            val input1 = binding.edtPertama.text.toString().trim()
            val input2 = binding.edtKedua.text.toString().trim()
            var hasil = 0

            when {
                TextUtils.isEmpty(input1)-> {
                    Toast.makeText(this, "Input Pertama Belum Ada!", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(input2)-> {
                    Toast.makeText(this, "Input Kedua Belum Ada!", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else-> {
                    hasil = input1.toInt()*input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }

        binding.btnTambah.setOnClickListener{
            val input1 = binding.edtPertama.text.toString().trim()
            val input2 = binding.edtKedua.text.toString().trim()
            var hasil = 0

            when {
                TextUtils.isEmpty(input1)-> {
                    Toast.makeText(this, "Input Pertama Belum Ada!", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(input2)-> {
                    Toast.makeText(this, "Input Kedua Belum Ada!", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else-> {
                    hasil = input1.toInt()+input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
            binding.btnKurang.setOnClickListener {
                val input1 = binding.edtPertama.text.toString().trim()
                val input2 = binding.edtKedua.text.toString().trim()
                var hasil = 0

                when {
                    TextUtils.isEmpty(input1) -> {
                        Toast.makeText(this, "Input Pertama Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtPertama.requestFocus()
                    }
                    TextUtils.isEmpty(input2) -> {
                        Toast.makeText(this, "Input Kedua Belum Ada!", Toast.LENGTH_SHORT).show()
                        binding.edtKedua.requestFocus()
                    }
                    else -> {
                        hasil = input1.toInt() - input2.toInt()
                        binding.tvHasil.text = hasil.toString()
                    }
                }
            }
        }

    }
}