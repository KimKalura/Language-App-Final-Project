package com.spring.languageapp.repository;

import com.spring.languageapp.model.FavoriteUserLiteraryWorkPost;
import com.spring.languageapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteLiteraryWorkListRepository extends JpaRepository<FavoriteUserLiteraryWorkPost, Long> {

    List<FavoriteUserLiteraryWorkPost> findAllByUserOrderByLiteraryWorkPost(User user);
}
