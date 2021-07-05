package solis.juan.sesiongoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle=intent.extras

        if(bundle!=null) {
            val nombre = bundle.getString("nombre")
            val email = bundle.getString("email")

            tvNombre.text = nombre
            tvEmail.text = email
        }

        btnLogout.setOnClickListener {
            finish()
        }
    }
}