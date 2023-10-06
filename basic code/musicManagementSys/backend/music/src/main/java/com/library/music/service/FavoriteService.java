// package com.library.music.service;

// import com.library.music.entity.Favorite;
// import com.library.music.repository.FavoriteRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

 

// @Service
// public class FavoriteService {

 

//     private final FavoriteRepository favoriteRepository;

 

//     @Autowired
//     public FavoriteService(FavoriteRepository favoriteRepository) {
//         this.favoriteRepository = favoriteRepository;
//     }

 

//     public void addToFavorites(Long songId) {
//         // Check if the song is already in favorites
//         if (!isSongInFavorites(songId)) {
//             Favorite favorite = new Favorite(songId);
//             favoriteRepository.save(favorite);
//         }
//     }

 

//     public void removeFromFavorites(Long favoriteId) {
//         favoriteRepository.deleteById(favoriteId);
//     }

 

//     public boolean isSongInFavorites(Long songId) {
//         return favoriteRepository.existsById(songId);
//     }



//     public void addToFavorites(Long userId, Long songId) {
//     }
// }
