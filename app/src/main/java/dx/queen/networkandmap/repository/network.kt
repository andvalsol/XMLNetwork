package dx.queen.networkandmap.repository

import dx.queen.networkandmap.model.TestExampleData
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

val retrofit: Retrofit by lazy {

    Retrofit.Builder()
        .baseUrl("http://18.185.116.182:1099/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()

}


interface INetworkDataSource {

    @GET("WebQlikViewXml.hal")
    suspend fun getTestTask(@Query("function") key : String): TestExampleData

}


class NetworkDataSource(private val retrofit: INetworkDataSource) {

    suspend fun getData() = retrofit.getTestTask("TestExample")


}