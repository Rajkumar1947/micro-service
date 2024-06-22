package com.banks.accounts.repository;

import com.banks.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(long customerId);

    void deleteByCustomerId(long customerId);
}
