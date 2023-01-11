package com.fullstack.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.controller.entiry.Coupon;
import com.fullstack.exception.ClassNotFound;
import com.fullstack.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService{

	@Autowired
	private CouponRepository couponRepository;
	
	@Override
	public Coupon saveCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return couponRepository.save(coupon);
	}

	@Override
	public Coupon findCouponByCode(String code) throws ClassNotFound{
		// TODO Auto-generated method stub
		Optional<Coupon> coupons=couponRepository.findById(code);
		if(coupons.isPresent()) {
			return coupons.get();
		}
		throw new ClassNotFound();
	}

}
