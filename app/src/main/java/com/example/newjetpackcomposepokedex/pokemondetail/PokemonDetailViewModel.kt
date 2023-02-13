package com.example.newjetpackcomposepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.newjetpackcomposepokedex.data.PokemonRepository
import com.example.newjetpackcomposepokedex.data.remote.responses.Pokemon
import com.example.newjetpackcomposepokedex.utils.Resource

class PokemonDetailViewModel (
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}