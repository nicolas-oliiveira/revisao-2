package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val edtResultado: EditText = findViewById(R.id.edtResultado)
        val edtEndereco: EditText = findViewById(R.id.edtEndereco)
        val edtBairro: EditText = findViewById(R.id.edtBairro)
        val edtCep: EditText = findViewById(R.id.edtCep)
        val edtCidade: EditText = findViewById(R.id.edtCidade)

        val intent = intent

        val inputNome = intent.getStringExtra("nome")
        val inputEndereco = intent.getStringExtra("endereco")
        val inputBairro = intent.getStringExtra("bairro")
        val inputCep = intent.getStringExtra("cep")
        val inputCidade = intent.getStringExtra("cidade")

        edtResultado.setText("Nome:  " + inputNome.toString())
        edtEndereco.setText("Endereço:  " + inputEndereco.toString())
        edtCidade.setText("Cidade:  " + inputCidade.toString())
        edtCep.setText("CEP  :" + inputCep.toString())
        edtBairro.setText("Bairro:  " + inputBairro.toString())

        val btnVoltar: Button = findViewById(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            //Toast.makeText(this, "Nome: " + txtNome.text.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}