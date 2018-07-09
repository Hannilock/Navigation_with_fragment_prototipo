package com.example.dc.navigation.fragments;

import android.content.Context;

import com.example.dc.navigation.R;
import com.example.dc.navigation.models.Category;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeData {

    private Context context;
    private List<Category> categories = new ArrayList<>();

    FakeData(Context context ) {
        this.context = context;
    }

    public List<Category> selectType(String typeRequested) throws MalformedURLException {
        List<String> names = new ArrayList<>();
        List<String> urls = new ArrayList<>();
        switch(typeRequested){
            case "0":
                names = Arrays.asList(this.context.getResources().getStringArray(R.array.tour_list));
                urls.add("http://www.brasil-turismo.com/rio-grande-sul/imagens-arquivos/praia-atlantida-osorio.jpg");
                urls.add("http://www.osorio.rs.gov.br/uploads/pontoturistico/20918/maior_DSC_0353.jpg");
                urls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdnkhy97XV3b1Q3d4ae6NuB5I_8lOVezdCoFb7HSMWQbQfUqUc");
                urls.add("http://www.osorio.rs.gov.br/uploads/pontoturistico/15385/maior_3.jpg");
                urls.add("http://www.litoralmania.com.br/wp-content/uploads/2018/03/O-caminho-percorrido-por-Jesus.jpg");
                urls.add("http://www.osorio.rs.gov.br/uploads/pontoturistico/15408/maior_2.jpg");
                urls.add("https://caminhosdalu.files.wordpress.com/2010/03/cimg0439.jpg");
                urls.add("http://www.litoralmania.com.br/wp-content/uploads/2015/06/11329932_988436341190752_8783382531801142755_n.jpg");
                break;
            case "1":
                // toolbar.setTitle(this.getString(R.string.lodging_label));
                names = Arrays.asList(this.context.getResources().getStringArray(R.array.lodge_list));
                urls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6i1Sju7nMbLTzuznLm-Ru04PpBWVGgqzz_B8tRcE_QcZ-h-dT");
                urls.add("http://www.osorio.rs.gov.br/uploads/servico/20715/maior_POUSADA_ENCANTOS_DO_SUL_2.jpg");
                urls.add("http://www.osorio.rs.gov.br/uploads/servico/20732/maior_POUSADA_STIO_DA_ESPERANA.jpg");
                urls.add("https://www.guiademoteis.com.br/Images/moteis/4157-Alibi-Motel/suites/12657-Suite/fotos/foto2-suites.jpg");
                urls.add("https://d2w37xmlstewpv.cloudfront.net/uploads/2017/09/4b94b80-pedroosorio20170919-18321-1v80l3c.jpg");
                break;
            case "2":
                //toolbar.setTitle(this.getString(R.string.eat_label));
                names = Arrays.asList(this.context.getResources().getStringArray(R.array.eat_list));
                urls.add("https://media-cdn.tripadvisor.com/media/photo-s/07/47/cc/a8/luzardo-restaurante-e.jpg");
                urls.add("https://media-cdn.tripadvisor.com/media/photo-s/0c/b0/53/00/20160811-171859-largejpg.jpg");
                urls.add("https://destemperados.s3.amazonaws.com/arquivos/ckeditor/C4whh6QJk6tz4dpw2RJ/a-lenha-osorio-(3).jpg");
                urls.add("https://www.cafeviagem.com/wp-content/uploads/2015/04/Morro-da-Borussia-Osorio-6.jpg");
                urls.add("https://destemperados.s3.amazonaws.com/arquivos/ckeditor/C53x1dQ7GWc3NqcFjf7/1a-lenha-trattoria-fachada.jpg");
                urls.add("http://www.xisdoleco.com.br/wp-content/gallery/ambiente/XisepizzariadoLeco_03.JPG");
                urls.add("https://media-cdn.tripadvisor.com/media/photo-s/06/38/d4/50/entrada-principal.jpg");
                urls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSy7H-ncxa6HGLNrtQEDK0RHHb6uCcl_u7GQxNRQx7yIia0s6U2Bw");
                break;
            case "3":
                // toolbar.setTitle(this.getString(R.string.services_label));
                names = Arrays.asList(this.context.getResources().getStringArray(R.array.services_list));
                urls.add("https://segurancaecienciasforenses.files.wordpress.com/2014/09/policia.jpg");
                urls.add("https://gastao30.files.wordpress.com/2012/02/hospital.jpg");
                urls.add("http://gvonibus.com.br/fotos/albums/userpics/10001/Rodoviaria_de_Osoriox.jpg");
                break;
        }
        for(int i = 0; i < names.size(); i++){
//            Log.e("Loop says: ",i+" and "+names.get(i));
            categories.add(new Category(names.get(i),urls.get(i)));
        }
        return categories;
    }

}
