package com.ii.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ii.object.entity.RefreshToken;

import jakarta.transaction.Transactional;

public interface IRefreshTokenRepository extends JpaRepository<RefreshToken, UUID> {

	Boolean existsByToken(String token);
	
	@Transactional
	void deleteByToken(String token);

	RefreshToken findByuserUsername(String username);

	RefreshToken findByToken(String token);

	RefreshToken findByDeviceId(UUID deviceId);
	
}
