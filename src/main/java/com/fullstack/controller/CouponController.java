package com.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.controller.entiry.Coupon;
import com.fullstack.service.CouponService;

@RequestMapping("/coupon")
@RestController
public class CouponController {

	@Autowired
	private CouponService couponService;
	
	@PostMapping
	Coupon saveCoupon(@RequestBody Coupon coupon) {
		return couponService.saveCoupon(coupon);
		
	}
	
	@GetMapping("/{code}")
	Coupon findCouponByCode(@PathVariable("code") String code) {
		return couponService.findCouponByCode(code);
		
	}
}
