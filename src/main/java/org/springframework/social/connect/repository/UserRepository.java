package org.springframework.social.connect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdriven.stateless.security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	User findById(Long id);

	User findByProviderIdAndProviderUserId(String providerId, String providerUserId);
}
