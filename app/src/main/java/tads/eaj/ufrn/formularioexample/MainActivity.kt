package tads.eaj.ufrn.formularioexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox.setOnClickListener {
            if (!checkBox.isChecked){
                Toast.makeText(this,"Mermão, as promo são boa!", Toast.LENGTH_SHORT).show()
            }
        }

        button.setOnClickListener {
            when(radiogroup.checkedRadioButtonId){
                radioSim.id->{
                    if (editText.text.isNotEmpty()){
                        Toast.makeText(this, "Cadastrou", Toast.LENGTH_SHORT).show()
                        editText.setText("")
                    }else{
                        Toast.makeText(this, "Você precisa dizer seu nome.", Toast.LENGTH_SHORT).show()
                    }
                }
                else->{
                    Toast.makeText(this, "Você precisa concordar com os termos.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
