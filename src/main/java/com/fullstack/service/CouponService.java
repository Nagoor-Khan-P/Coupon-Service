package com.fullstack.service;

import com.fullstack.controller.entiry.Coupon;

public interface CouponService {
	Coupon saveCoupon(Coupon coupon);
	Coupon findCouponByCode(String code);
}
