package dx.queen.networkandmap.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dx.queen.networkandmap.R
import dx.queen.networkandmap.repository.INetworkDataSource
import dx.queen.networkandmap.repository.NetworkDataSource
import dx.queen.networkandmap.repository.retrofit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val networkDataSource =
        NetworkDataSource(
            retrofit.create(
                INetworkDataSource::class.java
            )
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.IO) {
            val data = networkDataSource.getData()
            Log.d("dnbfk"," $data")
        }
    }
}