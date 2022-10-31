package com.example.fifitjobsheet16

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol1 = findViewById<Button>(R.id.tomboldialog1)
        val btn2 = findViewById<Button>(R.id.tomboldialog2)
        val biodata = arrayOf("FIFIT SHOLIKHATUL MUFALAH", "XI PPLG 1", "2989")

        tombol1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Biodata Diri")
                .setItems(biodata, DialogInterface.OnClickListener{ dialog,which ->})
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "tombol yes ditekan", Toast.LENGTH_SHORT).show()
                }).show()
        }

        btn2.setOnClickListener {
            val inflater = layoutInflater
            val dialog = inflater.inflate(R.layout.activity_dialog, null)
            val editText = dialog.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama Lengkap")
                .setView(dialog)
            .setPositiveButton("Benar",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(
                        this,
                        "Nama Kamu Adalah " + editText.getText().toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                })
            .setNegativeButton("Batal",
                DialogInterface.OnClickListener { dialogInterface, i ->
                }).show()
        }
    }
}