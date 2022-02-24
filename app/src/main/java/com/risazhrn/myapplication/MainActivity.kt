package com.risazhrn.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.risazhrn.myapplication.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


                binding.btnKali.setOnClickListener{
                    val input1 = binding.edtPertama.text.toString().trim()
                    val input2 = binding.edtKedua.text.toString().trim()
                    var hasil1 = 0
                    when {
                        TextUtils.isEmpty(input1)->{
                            Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                            binding.edtPertama.requestFocus()
                        }
                        TextUtils.isEmpty(input2)->{
                            Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                            binding.edtKedua.requestFocus()
                        }
                        else ->{
                            hasil1 = input1.toInt() * input2.toInt()
                            binding.tvHasil.text = hasil1.toString()
                        }
                    }
                }


                binding.btnTambah.setOnClickListener{
                    val input1 = binding.edtPertama.text.toString().trim()
                    val input2 = binding.edtKedua.text.toString().trim()
                    var hasil2 = 0
                    when {
                        TextUtils.isEmpty(input1)->{
                            Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                            binding.edtPertama.requestFocus()
                        }
                        TextUtils.isEmpty(input2)->{
                            Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                            binding.edtKedua.requestFocus()
                        }
                        else ->{
                            hasil2 = input1.toInt() + input2.toInt()
                            binding.tvHasil.text = hasil2.toString()
                        }
                    }
                }

                 binding.btnKurang.setOnClickListener{
                     val input1 = binding.edtPertama.text.toString().trim()
                     val input2 = binding.edtKedua.text.toString().trim()
                     var hasil3 = 0
                     when {
                         TextUtils.isEmpty(input1)->{
                             Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                             binding.edtPertama.requestFocus()
                         }
                         TextUtils.isEmpty(input2)->{
                             Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                             binding.edtKedua.requestFocus()
                         }
                         else ->{
                             hasil3 = input1.toInt() - input2.toInt()
                             binding.tvHasil.text = hasil3.toString()
                         }
                     }
                 }

                binding.btnBagi.setOnClickListener{
                    val input1 = binding.edtPertama.text.toString().trim()
                    val input2 = binding.edtKedua.text.toString().trim()
                    var hasil4 = 0.0
                    when {
                        TextUtils.isEmpty(input1)->{
                            Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                            binding.edtPertama.requestFocus()
                        }
                        TextUtils.isEmpty(input2)->{
                            Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                            binding.edtKedua.requestFocus()
                        }
                        else ->{
                            hasil4 = input1.toDouble() / input2.toDouble()
                            binding.tvHasil.text = hasil4.toString()
                        }
                    }
                }

                binding.btnSisaBagi.setOnClickListener{
                    val input1 = binding.edtPertama.text.toString().trim()
                    val input2 = binding.edtKedua.text.toString().trim()
                    var hasil5 = 0
                    when {
                        TextUtils.isEmpty(input1)->{
                            Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                            binding.edtPertama.requestFocus()
                        }
                        TextUtils.isEmpty(input2)->{
                            Toast.makeText(this,"Masukan Angka", Toast.LENGTH_SHORT).show()
                            binding.edtKedua.requestFocus()
                        }
                        else ->{
                            hasil5 = input1.toInt() % input2.toInt()
                            binding.tvHasil.text = hasil5.toString()
                        }
                    }
                 }

    }
}