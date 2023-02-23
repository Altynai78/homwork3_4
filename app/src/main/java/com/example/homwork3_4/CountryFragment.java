package com.example.homwork3_4;

import android.os.Bundle;

public class CountriesFragment extends Fragment {

    private FragmentCountriesBinding binding;

    private ArrayList<Country> countriesList;
    private CountriesAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountriesBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Continent continent = (Continent) getArguments().getSerializable("continent");
        loadData(continent);
        adapter = new CountriesAdapter(countriesList);
        binding.rvCountries.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        binding.rvCountries.setAdapter(null);
        super.onDestroyView();
    }

    private ArrayList<Country> loadData(Continent continent) {
        countriesList = new ArrayList<>();
        countriesList.addAll(continent.getListOfCountry());
        return countriesList;
    }


    }