package cst438.hw2.domain;

import cst438.hw2.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
  Country findByCode(String code);
}
