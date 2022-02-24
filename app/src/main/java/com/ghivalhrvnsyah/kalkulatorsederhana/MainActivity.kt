package com.ghivalhrvnsyah.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.ghivalhrvnsyah.kalkulatorsederhana.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate (layoutInflater)
        setContentView(binding.root)



        binding.btnKali.setOnClickListener {
            binding.edtButtonClick.setOnClickListener {
                val inPertama = binding.edtNumber1.text.toString().trim()
                val inKedua = binding.edtNumber2.text.toString().trim()
                when {
                    TextUtils.isEmpty(inPertama) -> {
                        Toast.makeText(this, "Please insert the number!", Toast.LENGTH_SHORT).show()
                        binding.edtNumber1.requestFocus()
                    }
                    TextUtils.isEmpty(inKedua) -> {
                        Toast.makeText(this, "Please insert the number!", Toast.LENGTH_SHORT).show()
                        binding.edtNumber2.requestFocus()
                    }
                    else -> {
                        val kali = inPertama.toInt() * inKedua.toInt()
                        binding.edtHasil.text = kali.toString()
                    }
                }

            }

        }
        binding.btnBagi.setOnClickListener {
            binding.edtButtonClick.setOnClickListener {
                val inPertama = binding.edtNumber1.text.toString().trim()
                val inKedua = binding.edtNumber2.text.toString().trim()
                when {
                    TextUtils.isEmpty(inPertama) -> {
                        Toast.makeText(this, "Please insert the number!", Toast.LENGTH_SHORT).show()
                        binding.edtNumber1.requestFocus()
                    }
                    TextUtils.isEmpty(inKedua) -> {
                        Toast.makeText(this, "Please insert the number!", Toast.LENGTH_SHORT).show()
                        binding.edtNumber2.requestFocus()
                    }
                    else -> {
                        val kali = inPertama.toDouble() / inKedua.toDouble()
                        binding.edtHasil.text = kali.toString()
                    }
                }

            }

        }
        binding.btnTambah.setOnClickListener {
            binding.edtButtonClick.setOnClickListener {
                val inPertama = binding.edtNumber1.text.toString().trim()
                val inKedua = binding.edtNumber2.text.toString().trim()
                when {
                    TextUtils.isEmpty(inPertama) -> {
                        Toast.makeText(this, "Please insert the number!", Toast.LENGTH_SHORT).show()
                        binding.edtNumber1.requestFocus()
                    }
                    TextUtils.isEmpty(inKedua) -> {
                        Toast.makeText(this, "Please insert the number!", Toast.LENGTH_SHORT).show()
                        binding.edtNumber2.requestFocus()
                    }
                    else -> {
                        val kali = inPertama.toInt() + inKedua.toInt()
                        binding.edtHasil.text = kali.toString()
                    }
                }

            }

        }
        binding.btnKurang.setOnClickListener {
            binding.edtButtonClick.setOnClickListener {
                val inPertama = binding.edtNumber1.text.toString().trim()
                val inKedua = binding.edtNumber2.text.toString().trim()
                when {
                    TextUtils.isEmpty(inPertama) -> {
                        Toast.makeText(this, "Please insert the number!", Toast.LENGTH_SHORT).show()
                        binding.edtNumber1.requestFocus()
                    }
                    TextUtils.isEmpty(inKedua) -> {
                        Toast.makeText(this, "Please insert the number!", Toast.LENGTH_SHORT).show()
                        binding.edtNumber2.requestFocus()
                    }
                    else -> {
                        val kali = inPertama.toInt() - inKedua.toInt()
                        binding.edtHasil.text = kali.toString()
                    }
                }

            }

        }


    }
}