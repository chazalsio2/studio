package fr.rb.gestsio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterAppretiation {

    @GET("getEtudiant.php")
    Call<List<Apretiation>> getAppretiation();


}
