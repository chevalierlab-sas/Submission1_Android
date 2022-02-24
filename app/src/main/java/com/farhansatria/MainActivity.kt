package com.farhansatria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.farhansatria.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val input1 = binding.edtPertama.text.toString().trim()
        val input2 = binding.edtKedua.text.toString().trim()
        val dec = DecimalFormat ("#,###.###")

        binding.btnTambah.setOnClickListener{
            val input1 = binding.edtPertama.text.toString().trim()
            val input2 = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toInt() + input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }

        binding.btnKurang.setOnClickListener{
            val input1 = binding.edtPertama.text.toString().trim()
            val input2 = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toInt() - input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }

        binding.btnKali.setOnClickListener{
            val input1 = binding.edtPertama.text.toString().trim()
            val input2 = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toInt() * input2.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }

        binding.btnBagi.setOnClickListener{
            val input1 = binding.edtPertama.text.toString().trim()
            val input2 = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toDouble() / input2.toDouble()
                    binding.tvHasil.text = dec.format(hasil).toString()
                }
            }
        }

        binding.btnModulus.setOnClickListener{
            val input1 = binding.edtPertama.text.toString().trim()
            val input2 = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(input1) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(input2) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = input1.toLong() % input2.toLong()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
    }
}