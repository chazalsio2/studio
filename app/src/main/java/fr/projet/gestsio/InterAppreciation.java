package fr.projet.gestsio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface InterAppreciation {
    /**
     * Appreciation pour recuperer les IDS dans la BDD de MySql au format Java
     */

    @GET("getEtudiant.php?")
    Call<List<Appreciation>> getAppreciation(@Query("idEtudiant") int idEtudiant);
}
