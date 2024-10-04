package com.example.movieapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movieapi.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}