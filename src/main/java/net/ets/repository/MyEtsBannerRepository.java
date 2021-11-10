package net.ets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.ets.model.MyEtsBanner;

@Repository
public interface MyEtsBannerRepository extends JpaRepository<MyEtsBanner, Integer> {

	
}
