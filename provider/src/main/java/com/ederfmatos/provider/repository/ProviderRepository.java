package com.ederfmatos.provider.repository;

import com.ederfmatos.provider.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, String> {

    Optional<Provider> findByAddress_Uf(String uf);

}
