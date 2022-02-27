package com.triaaprilia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.triaaprilia.myapplication.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTambah.setOnClickListener{
            val inputSatu = binding.edtPertama.text.toString().trim()
            val inputDua = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(inputSatu) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(inputDua) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = inputSatu.toInt() + inputDua.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
        binding.btnKurang.setOnClickListener{
            val inputSatu = binding.edtPertama.text.toString().trim()
            val inputDua = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(inputSatu) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(inputDua) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = inputSatu.toInt() - inputDua.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
        binding.btnKali.setOnClickListener{
            val inputSatu = binding.edtPertama.text.toString().trim()
            val inputDua = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(inputSatu) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(inputDua) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = inputSatu.toInt() * inputDua.toInt()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
        binding.btnBagi.setOnClickListener{
            val inputSatu = binding.edtPertama.text.toString().trim()
            val inputDua = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(inputSatu) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(inputDua) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = inputSatu.toDouble() / inputDua.toDouble()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
        binding.btnModulus.setOnClickListener{
            val inputSatu = binding.edtPertama.text.toString().trim()
            val inputDua = binding.edtKedua.text.toString().trim()

            when{
                TextUtils.isEmpty(inputSatu) -> {
                    Toast.makeText(this, "Input Pertama Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtPertama.requestFocus()
                }
                TextUtils.isEmpty(inputDua) -> {
                    Toast.makeText(this, "Input Kedua Kosong", Toast.LENGTH_SHORT).show()
                    binding.edtKedua.requestFocus()
                }
                else -> {
                    val hasil = inputSatu.toLong() % inputDua.toLong()
                    binding.tvHasil.text = hasil.toString()
                }
            }
        }
    }
}