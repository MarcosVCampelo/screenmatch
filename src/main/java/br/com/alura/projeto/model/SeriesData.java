package br.com.alura.projeto.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)//ignorar as outras informacoes
public record SeriesData(@JsonAlias("Title") String title,
                         @JsonAlias("totalSeasons")Integer totalSeasons,
                         @JsonAlias("imdbRating") String rating,
                         @JsonProperty("imdbVotes")String votes) {
}
