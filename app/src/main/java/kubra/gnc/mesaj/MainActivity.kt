package kubra.gnc.mesaj

import android.os.Bundle
import android.view.View.inflate
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.lang.StringBuilder
import inflate
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater())
        setContentView(binding.root)
        FirebaseDatabase.getInstance().reference

        binding.btnekle.SetOnclickListener
        run {
            val etno = binding.etno.text.toString().toInt()
            binding.etadsoyad.text.toString()
            binding.etmaas.text.toString().toInt()


            val database = null
            database.child(etno.toString()).setValue(Personel())
        }
        var getdata = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                var sb = StringBuilder()
                for (i in snapshot.children)
                    var adsoyad = i.child("padadsoyad").getValue()
                var maas = i.child("pmaas").getValue()
                sb.append("${i.key} $adsoyad $ \n")
            }
            binding.tvsonuc.setText(sb)
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        }
        val database
        database.addValueEventListener(getdata)
        database.addListenerForSingleValueEvent(getdata)

    }

    private fun Personel() {

    }

    private fun LayoutInflater() {

    }
}

class ActivityMainBinding {

}



