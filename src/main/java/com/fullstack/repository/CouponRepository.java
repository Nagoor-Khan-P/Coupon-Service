package com.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fullstack.controller.entiry.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, String>{

}
