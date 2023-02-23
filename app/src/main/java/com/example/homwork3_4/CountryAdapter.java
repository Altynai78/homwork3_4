package com.example.homwork3_4;

public class CountryAdapter  extends RecyclerView.Adapter<CountriesViewHolder> {

    private ArrayList<Country> countriesList;

    public CountriesAdapter(ArrayList<Country> countriesList) {
        this.countriesList = countriesList;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesViewHolder(ItemCountriesBinding
                .inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.bind(countriesList.get(position));
    }

    @Override
    public int getItemCount() {
        return countriesList.size();
    }
}

class CountriesViewHolder extends RecyclerView.ViewHolder{

    private ItemCountriesBinding binding;

    public CountriesViewHolder(ItemCountriesBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    @SuppressLint("SetTextI18n")
    void bind(Country country){
        binding.tvCountryName.setText(country.getName());
        binding.tvCountryPopulation.setText(("Население: \n" + country.getPopulation()));
        Glide.with(binding.imgCountryFlag).load(country.getFlag()).into(binding.imgCountryFlag);
}
