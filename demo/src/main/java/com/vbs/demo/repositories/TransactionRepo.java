package com.vbs.demo.repositories;

import com.vbs.demo.models.Transaction;
import org.hibernate.internal.util.type.PrimitiveWrapperHelper;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction,Integer> {

    List<Transaction> findAllByUserId(int id);
}
