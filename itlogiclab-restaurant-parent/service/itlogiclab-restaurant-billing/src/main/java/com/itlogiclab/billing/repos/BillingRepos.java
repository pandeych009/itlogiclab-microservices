package com.itlogiclab.billing.repos;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itlogiclab.billing.entity.BillEntity;

@Repository
@Transactional
public interface BillingRepos extends CrudRepository<BillEntity, Long> {

}
