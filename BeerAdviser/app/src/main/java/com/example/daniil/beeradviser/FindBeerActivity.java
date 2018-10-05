package com.example.daniil.beeradviser;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert beerExpert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        //Получить ссылку на TextView
        TextView brands = (TextView) findViewById(R.id.brands); //Получить ссылку на Spinner
        Spinner color = (Spinner) findViewById(R.id.color); //Получить вариант, выбранный в Spinner
        String beerType = String.valueOf(color.getSelectedItem()); //Вывести выбранный вариант
        List<String> brandList = beerExpert.getBrands(beerType);
        StringBuilder brand = new StringBuilder();
        for (String i : brandList){
            brand.append(i).append('\n');
        }
        brands.setText(brand.toString());



    }
}
