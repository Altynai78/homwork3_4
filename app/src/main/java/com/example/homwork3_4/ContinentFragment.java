package com.example.homwork3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick {

    private FragmentContintentsBinding binding;
    private ArrayList<Continent> continentsList;

    private ArrayList<Country> evrasiaList;
    private ArrayList<Country> africaList;
    private ArrayList<Country> southAmericaList;
    private ArrayList<Country> northAmericaList;

    private ContinentsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = adapter.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentsAdapter(continentsList, this);
        binding.rvContinents.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        binding.rvContinents.setAdapter(null);
        super.onDestroyView();
    }

    private void loadData() {
        continentsList = new ArrayList<>();
        loadDataCountries();
        continentsList.add(new Continents("Евразия", 54_000_000, "https://w7.pngwing.com/pngs/565/967/png-transparent-afro-eurasia-map-asia-blue-cloud-world-thumbnail.png",evrasiaList));
        continentsList.add(new Continents("Африка", 30_300_000, "https://w7.pngwing.com/pngs/173/363/png-transparent-africa-map-africa-orange-world-vector-map.png",africaList));
        continentsList.add(new Continents("Северная Америка", 24_250_000, "https://w7.pngwing.com/pngs/870/448/png-transparent-latin-america-united-states-south-america-map-latin-leaf-information-green.png",southAmericaList));
        continentsList.add(new Continents("Южная Америка", 17_800_000, "https://w7.pngwing.com/pngs/308/251/png-transparent-map-north-america-continent-rotated-silhouette-green.png",northAmericaList));
    }

    private void loadDataCountries() {
        evrasiaList = new ArrayList<>();
        evrasiaList.add(new Country("Германия",82175684,"https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/2560px-Flag_of_Germany.svg.png"));
        evrasiaList.add(new Country("Кыргызстан",7000000,"https://grs.gov.kg/uploads/state_symbols/flag_standart.png"));
        evrasiaList.add(new Country("Казахстан",19644067,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwnSbjtBB5XjB80KVxZwkiPQqlJCFDyrUZuU6rG2Yv&s"));
        evrasiaList.add(new Country("Россия",146424729,"https://www.pngmart.com/files/7/Russia-Flag-PNG-Picture.png"));
        evrasiaList.add(new Country("Италия",60640428,"https://w7.pngwing.com/pngs/907/428/png-transparent-flag-of-italy-italian-german-italia-flag-miscellaneous-angle-flag.png"));
        evrasiaList.add(new Country("Узбекистан",36001364,"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Flag_of_Uzbekistan.png/1200px-Flag_of_Uzbekistan.png"));
        evrasiaList.add(new Country("Китай",1411778724,"https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/1280px-Flag_of_the_People%27s_Republic_of_China.svg.png"));
        evrasiaList.add(new Country("Япония",125502000,"https://e7.pngegg.com/pngimages/402/646/png-clipart-flag-of-japan-microphone-vertical-flag-computer-wallpaper.png"));
        evrasiaList.add(new Country("Франция",66125880,"https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Flag_of_France.svg/1280px-Flag_of_France.svg.png"));
        evrasiaList.add(new Country("Израиль",9043625,"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Flag_of_Israel.svg/2560px-Flag_of_Israel.svg.png"));

        africaList = new ArrayList<>();
        africaList.add(new Country("Алжир",39666519,"https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/250px-Flag_of_Algeria.svg.png"));
        africaList.add(new Country("Амбазония",3521898,"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_the_Federal_Republic_of_Southern_Cameroons.svg/250px-Flag_of_the_Federal_Republic_of_Southern_Cameroons.svg.png"));
        africaList.add(new Country("Ангола",25021974,"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Flag_of_Angola.svg/250px-Flag_of_Angola.svg.png"));
        africaList.add(new Country("Бенин",10315244,"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Flag_of_Benin.svg/1200px-Flag_of_Benin.svg.png"));
        africaList.add(new Country("Ботсвана",2262485,"https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_Botswana.svg/2560px-Flag_of_Botswana.svg.png"));
        africaList.add(new Country("Буркина-Фасо",18450494,"https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Flag_of_Burkina_Faso.svg/250px-Flag_of_Burkina_Faso.svg.png"));
        africaList.add(new Country("Бурунди",11728921,"https://w1.pngwing.com/pngs/544/809/png-transparent-green-grass-flag-flag-of-burkina-faso-banner-rectangle-polyester-rope-textile-thumbnail.png"));
        africaList.add(new Country("Габон",1725292,"https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Flag_of_Gabon.svg/1280px-Flag_of_Gabon.svg.png"));
        africaList.add(new Country("Гана",27409893,"https://www.flagistrany.ru/data/flags/ultra/gh.png"));
        africaList.add(new Country("Гвинея",12608590,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Flag_of_Guinea.svg/250px-Flag_of_Guinea.svg.png"));

        southAmericaList = new ArrayList<>();
        southAmericaList.add(new Country("Аргентина",43417000,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2560px-Flag_of_Argentina.svg.png"));
        southAmericaList.add(new Country("Боливия",11254865,"https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_Bolivia_%28state%29.svg/1280px-Flag_of_Bolivia_%28state%29.svg.png"));
        southAmericaList.add(new Country("Бразилия",212804552,"https://www.flagistrany.ru/data/flags/ultra/br.png"));
        southAmericaList.add(new Country("Венесуэла",30152647,"https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1280px-Flag_of_Venezuela.svg.png"));
        southAmericaList.add(new Country("Гайана",773254,"https://w7.pngwing.com/pngs/382/218/png-transparent-gy-guyana-flag-icon.png"));
        southAmericaList.add(new Country("Колумбия",48625745,"https://www.flagistrany.ru/data/flags/ultra/co.png"));
        southAmericaList.add(new Country("Парагвай",70315562,"https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Paraguay.svg/2560px-Flag_of_Paraguay.svg.png"));
        southAmericaList.add(new Country("Перу",32162457,"https://www.flagistrany.ru/data/flags/ultra/pe.png"));
        southAmericaList.add(new Country("Суринам",585124,"https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Flag_of_Suriname.svg/1280px-Flag_of_Suriname.svg.png"));
        southAmericaList.add(new Country("Уругвай",3444628,"https://w7.pngwing.com/pngs/989/815/png-transparent-flag-of-uruguay-flag-of-chile-flag-miscellaneous-blue-flag.png"));

        northAmericaList = new ArrayList<>();
        northAmericaList.add(new Country("Антигуа и Барбуда",86564,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Flag_of_Antigua_and_Barbuda.svg/250px-Flag_of_Antigua_and_Barbuda.svg.png"));
        northAmericaList.add(new Country("Багамские острова",338254,"https://www.flagistrany.ru/data/flags/ultra/bs.png"));
        northAmericaList.add(new Country("Барбадос",284625,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Flag_of_Barbados.svg/800px-Flag_of_Barbados.svg.png?20221208002018"));
        northAmericaList.add(new Country("Гаити",10033265,"https://www.flagistrany.ru/data/flags/ultra/ht.png"));
        northAmericaList.add(new Country("Гватемала",11237542,"https://w7.pngwing.com/pngs/945/627/png-transparent-flag-of-guatemala-national-flag-flag-of-el-salvador-directorio-flag-text-rectangle.png"));
        northAmericaList.add(new Country("Гондурас",7854265,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Flag_of_Honduras.svg/2560px-Flag_of_Honduras.svg.png"));
        northAmericaList.add(new Country("Гренада",89502,"https://flagi.in.ua/images/tovari/527/flag-grenady_b1.jpg"));
        northAmericaList.add(new Country("Канада",34215945,"https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Canada.svg/1280px-Flag_of_Canada.svg.png"));
        northAmericaList.add(new Country("Куба",11451265,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/1280px-Flag_of_Cuba.svg.png"));
        northAmericaList.add(new Country("Мексика",111215245,"https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/2560px-Flag_of_Mexico.svg.png"));

    }

    @Override
    public void onClick(int position) {
        Continent continent = continentsList.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("continent", continent);
        CountriesFragment countriesFragment = new CountriesFragment();
        countriesFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, countriesFragment).addToBackStack(null).commit();
        {


        }